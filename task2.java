import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a = 0;
            while (n !=0){
             int b = n % 10;
             a = a * 10 + b;
             n /= 10;}
        System.out.println(a);}
}
