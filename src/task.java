import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //числитель первой дроби
        int b = sc.nextInt(); //знаменатель первой дроби
        int c = sc.nextInt(); //числитель второй дроби
        int d = sc.nextInt(); //знаменатель второй дроби

        Fraction fraction1 = new Fraction(a, b);
        Fraction fraction2 = new Fraction(c, d);

        public void sum(fraction1, fraction2) { // что надо написать в скобках?
            Fraction fraction_sum = new Fraction(a*d+b*c, b*d);


        }
        public void mult(fraction1, fraction2) { // -||-
            Fraction fraction_mult = new Fraction(a*c, b*d);
        }
        System.out.println(sum(fraction1, fraction2));
        System.out.println(mult(fraction1, fraction2));
    }
}