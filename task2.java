import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = 2;
        int K = 11;
        int e = 0;
        for (int i = 1; i <= N; ++i) {
            if(i % 2 == 1){
                K *= 3;}
            else{
                K-=(10*V);
                e+=10*V;
                V+=e/70;}
        }
        System.out.println(K + "кроликов и " + V + " волков " + "в месяц под номером " + N);
    }
}