import java.util.Scanner;

public class permutation_cyclique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 4 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int tmp = d;
        d = c;
        c = b;
        b = a;
        a = tmp;
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
