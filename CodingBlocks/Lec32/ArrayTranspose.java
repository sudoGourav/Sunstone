public class ArrayTranspose {
    public static void main(String[] args){
        int[][] arr= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = 3, col = 3;
        for(int i = 0; i<col; i++){
            if(i%2==0){
                for(int j=0; j<row; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }else {
                for(int j = row-1; j>=0; j--){
                    System.out.print(arr[j][i]+ " ");
                }
            }
        }
    }
}
