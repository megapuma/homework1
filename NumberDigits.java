import java.util.Scanner;
public class NumberDigits {
    static int sumOfSeven(int a, int b){
        int sum = 0;
        for (int i = a; i < b + 1; i++) {
            if (i % 7 == 0 && i >= 10 && i < 100) {
                sum += i % 10 + i / 10;}
            }
            return sum;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfSeven(a, b));}
}