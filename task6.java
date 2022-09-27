import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x<-2) || (x>Math.sqrt(2))){
            System.out.println("NO");
        }
        else if((y<-2) || (y>2)){
            System.out.println("NO");
        }
        else if((y<=(2-x*x)) && (y>=x)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}