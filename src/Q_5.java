import java.util.Scanner;

public class Q_5 {
    public static int smallest(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(smallest(p,q,r));
    }
}
