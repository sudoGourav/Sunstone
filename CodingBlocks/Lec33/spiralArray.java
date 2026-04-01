public class spiralArray {
    public static void main(String []args){
        int [][] arr = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int minRow = 0, maxRow = arr.length-1;
        int minCol = 0, maxCol = arr[0].length-1;
        while(minRow <= maxRow/2 && minCol <=maxCol/2){
            for(int i = minCol; i<maxCol; i++){
                System.out.print(arr[minRow][i]+" ");
            }
            minRow++;
            for(int i = minRow; i<=maxRow; i++){
               System.out.print(arr[i][maxCol]+" ");
            }
            maxCol--;
            for(int i = maxCol; i>=minCol;i--){
            System.out.print(arr[maxRow][i]+" ");
            }
            maxRow--;
            for(int i = maxCol; i>=minCol;i--){
                System.out.print(arr[minRow][i]+" ");
            }
            minRow--;
            System.out.println();
        }

    }
}
