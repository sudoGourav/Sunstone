import time
import random
from concurrent.futures import ThreadPoolExexutor

class ParallelSortSimulation:
    def __init__(self, data_size=100000, num_workers = 4):
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

        #step one > mujhe data ko split krna h chunks main
        chunk_size = len(self.data) // self.num_workers
        chunks = []
        for i in range(self.num_workers):
            start_idx = i * chunk_size
            end_idx = start_idx + chunk_size if i < self.num_workers - 1 else len(self.data)
            chunks.append(self.data[start_idx:end_idx])
        print(f"Split {len(self.data)} items into {len(chunks)} chunks")