import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 10;
        int y = 2_000_000_000;
        if (n==0) System.out.println(0);
        while (n > 0) {
            if (n%10 < a && n%10!=0) {a = n%10;}
            n /= 10;}
        System.out.println(a);
    }
}