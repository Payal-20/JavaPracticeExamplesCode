public class reshapeMatrix {
    public static int[][] reshapeMatrix(int [][] mat,int r,int c){
        int res[][] =new int[r][c];
        int m=mat.length;//row
        int n=mat[0].length;//column

        if(m*n!=r*c){
            return mat;
        }
        int row=0;
        int col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[row][col]=mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col=0;
                }
            }
        }return res;
    }
    public static void main(String[] args) {
        int mat[][]={{1,2},{3,4}};
        int r=4;
        int c=1;
        System.out.println(reshapeMatrix(mat, r, c));
    }
}
