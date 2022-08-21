/*
Output-

      *
    * * *
  * * * * *
    * * *
      *

*/

import java.util.*;

class pattern03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int row, nst, cst, nsp, csp;
        row = 1;
        nst = 1;
        nsp = nr/2;
        while (row <= nr) {
            csp = 1;
            while (csp <= nsp ) {
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            if (row <= nr / 2) {
                nst+=2;
                nsp--;
            } else {
                nst-=2;
                nsp++;
            }
            System.out.println("");
            row++;
        }

    }
}
