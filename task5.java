import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (((a<1000) && (b<1000) && (a>=100) && (b>=100) && (a%5==0) && (b%5==0)) || ((a<1000) && (c<1000) && (a>=100) && (c>=100) && (a%5==0) && (c%5==0) )|| ((b<1000) && (c<1000) && (b>=100) && (c>=100) && (b%5==0) && (c%5==0))) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}