import java.util.*;

class pattern02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        int cst;
        while (row <= n) {
            cst = 1;
            while (cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println("");
            row++;
            nst--;
        }

    }
}