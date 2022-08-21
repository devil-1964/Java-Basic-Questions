import java.util.*;

class pattern06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1, nst = n, nsp = n - 1, cst, csp;
        while (row <= n) {
            csp = 1;
            while (csp <= nsp) {
                System.out.print(" ");
                csp++;
            }
            cst = 1;
            while (cst <= nst) {
                if (cst == 1 || cst == n||row==1||row==n ) {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");

                }
                cst++;
            }
            nsp--;
            row++;
            System.out.println("");
        }

    }
}