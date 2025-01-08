package leetcode;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[num];
        for(int i=0; i<num; i++) {
            str[i] = scanner.nextLine();
            if(str[i].length() > 10){
                int len = str[i].length()-2;
                str[i] = str[i].charAt(0) + Integer.toString(len) + str[i].charAt(str[i].length()-1);
            }
        }
        for(String s: str){
            System.out.println(s);
        }
    }
}
