package leetcode;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int solvedProblems = 0;
        int[][] solutions = new int[n][3];
        for(int i=0; i<n; i++) {
            int results = 0;
            solutions[i][0] = scanner.nextInt();
            solutions[i][1] = scanner.nextInt();
            solutions[i][2] = scanner.nextInt();

            results = solutions[i][0] + solutions[i][1] + solutions[i][2];
            if(results >= 2) {
                solvedProblems++;
            }
        }
        System.out.println(solvedProblems);
    }
}
