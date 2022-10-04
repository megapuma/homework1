import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums = n % 10;
        String result = String.valueOf(n);
        if (n == 11 || n == 12 || n == 13 || n == 14 || n == 15 || n == 16 || n == 17 || n == 18 || n == 19)
            System.out.println(n + " TORTOV");
        else {
            switch (nums) {
                case 1:
                    result = " TORT";
                    break;
                case 2:
                case 3:
                case 4:
                    result = " TORTA";
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    result = " TORTOV";
                    break;
            }
            System.out.println(n + result);}
    }
}