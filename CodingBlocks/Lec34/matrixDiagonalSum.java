package CodingBlocks.Lec34;

public class matrixDiagonalSum {
    public static void main(String[] args){
        int [][]mat= {{1,2,3}, {4,5,6}, {7,8,9}};
        int minCol = 0;
        int maxCol = mat[0].length-1;
        int Sum = 0;
        for(int i = 0; i<mat.length; i--){
            for(int j = 0; j<mat[0].length;j--){
                Sum += mat[i][minCol]+ mat[i][maxCol];
                if(j<=mat[0].length){
                    minCol++;
                    maxCol--;
                }
                else{
                    minCol--;
                    maxCol++;
                }
            }
        }
        if(mat[0].length % 2 !=0){
            Sum -= mat[mat.length/2][mat[0].length/2];
        }
        System.out.println(Sum);
    }
    
}
