import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 0;
        if (N<2){
            System.out.println(1);
        }
        else{
            for (int i = 3; i <= N; ++i){
                c = a + b;
                a = b;
                b = c;}
            System.out.println(c);}
    }
}