/*
Output-

* * * * *
*       *
*       *
*       *
* * * * * 

*/

import java.util.*;

class pattern05 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, nst, cst;
        row = 1;
        nst = n;
        while (row <= n) {
            cst = 1;
            while (cst <= nst) {
                if (cst == 1 || cst == n || row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                cst++;
            }
            System.out.println("");
            row++;
        }

    }
}
