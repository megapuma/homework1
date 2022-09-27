import java.util.Scanner;
import static java.lang.System.in;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((a*n+(b*n)/100) + " " +(b*n)%100);
    }
}
