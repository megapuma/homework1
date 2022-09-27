import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        if (((x>=-2) && (x<=3)) || ((x>=6) && (x<=9))) {
        System.out.println("False");}
        else {
        System.out.println("True");
    }
}
}