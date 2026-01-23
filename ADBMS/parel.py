import time
import random

from concurrent.futures import ThreadPoolExecutor

class ParallelSortSimulation:
#sf
    def __init__(self, data_size=10000, num_workers = 4):
        self.data_size = data_size
        self.num_workers = num_workers
        self.data = [random.randint(1, 10000) for _ in range(data_size)]
        self.chunks = []

    def sequential_sort(self):
        start = time.time()
        sorted_data = sorted(self.data.copy())
        elapsed = time.time() - start
        return sorted_data, elapsed

    def parallel_sort(self):
        start = time.time()

        # step one > mujhe data ko split krna h chunks mai
        chunk_size = len(self.data) // self.num_workers
        chunks = []
        for i in range(self.num_workers):
            start_idx = i * chunk_size
            end_idx = start_idx + chunk_size if  i < self.num_workers - 1 else len(self.data)
            chunks.append(self.data[start_idx:end_idx])

        print(f"Split {len(self.data)} items into {len(chunks)} chunks")

        # step 2 > hume sort krna h ek ek chunk ko parallel mai
        with ThreadPoolExecutor(max_workers=self.num_workers) as executor:
            sorted_chunks = list(executor.map(sorted, chunks))

        # step 3> hume jo sorted chunk h unko merge krna h
        merged = self.merge_k_sorted(sorted_chunks)

        elapsed = time.time() - start
        return merged, elapsed, sorted_chunks

    def merge_k_sorted(self, sorted_arrays):
        result = []
        pointers = [0] * len(sorted_arrays)

        while any(pointers[i] < len(sorted_arrays[i]) for i in range(len(sorted_arrays))):
            min_val = float('inf')
            min_idx = -1

            for i in range(len(sorted_arrays)):
                if pointers[i] < len(sorted_arrays[i]) and sorted_arrays[i][pointers[i]] < min_val:
                    min_val = sorted_arrays[i][pointers[i]]
                    min_idx = i

            result.append(min_val)
            pointers[min_idx] += 1

        return result

print(" ---intra query simultion ---")
sim = ParallelSortSimulation(data_size = 100000, num_workers = 4)

    # se1uential sort
seq_result, seq_time = sim.sequential_sort()
print(f" Sequential sort time : {seq_time:.4f} seconds") 

#parallel sort
par_result, par_time, chunks = sim.parallel_sort()
print(f"Parallel sort time : {par_time:.4f} seconds")
print(f"SpeedUp: {seq_time/par_time:.2f}x")
print(f"Efficiencc: {(seq_time/par_time)/sim.num_workers*100:.1f}%")

#verify correctness in result
print(f"Result match: {seq_result == par_result}")