import java.util.Scanner;

public class task1 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int i = 0;
        int j = 0;
        for (int k = 0; k < n*m; ++k, ++j ) {
            if (k!=0 && k%m == 0 ) {
                ++i;
                j=0;}
            a[i][j]=i*j;}
    }
}