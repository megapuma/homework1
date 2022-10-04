import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int min = sc.nextInt();
            for(int i=0; i<n-1; ++i){
                int a = sc.nextInt();
                if (a>0 && a<=min) min = a;
                if (min<=0 && a>0) min = a;
            }
        System.out.println(min);}
}