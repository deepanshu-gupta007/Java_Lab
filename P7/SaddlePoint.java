import java.util.Scanner;
public class SaddlePoint {
    public static void main(String[] args) {
        int[][] matrix={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m=3, min=0, max=0, k;
        int[][] pos=new int[2][2]; 
        int i, j;
        for (i=0; i<m; i++) {
            for (j=0; j<m; j++)
                System.out.print(matrix[i][j]+" " );
            System.out.println();
        }
        for (i=0; i<m; i++) {
            min=matrix[i][0];
            for (j=0; j<m; j++) {
                if (min >= matrix[i][j]) {
                    min=matrix[i][j]; 
                    pos[0][0]=i;
                    pos[0][1]=j;
                }
            }
            j=pos[0][1];
            max=matrix[0][j];
            for (k=0; k<m; k++) {
                if (max <= matrix[k][j]) {
                    max=matrix[i][j]; 
                    pos[1][0]=k;    
                    pos[1][1]=j;
                }
            }
            if (min==max) {
                if (pos[0][0]==pos[1][0] && pos[0][1]==pos[1][1])
                    System.out.print("Saddle point("+pos[0][0]+","+pos[0][1]+"):"+max);
            }
        }
    }
}