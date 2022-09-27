import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n/3600;
        int m = n%3600/60;
        int s = n%60;
        if((m<10) && (s<10)) {
            System.out.println(h + ":" + "0" + m + ":" + "0" + s);
        }
        else if(m<10){
                System.out.println(h + ":" + "0" + m + ":" + s);
            }
        else if (s<10) {
                System.out.println(h + ":" + m + ":" + "0" + s);
            }
        else if((m>=10) && (s>=10)) {
        System.out.println(s);
    }
}}