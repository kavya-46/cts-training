import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10, b = 20, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
            a = sc.nextInt();
            b = sc.nextInt();
        }
        else {
            System.out.println(c);
        }

        if(b>a) {
            if(b>c) {
                System.out.println(b);
            } else{
                System.out.println(c);
            }
        }

        if(c>a) {
            if(c>b) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        }
    }
}
