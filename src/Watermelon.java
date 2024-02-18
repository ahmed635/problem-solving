import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilosOfWatermelon;
        if(scanner.hasNextInt()){
            kilosOfWatermelon = scanner.nextInt();
            if ((kilosOfWatermelon >=1) && (kilosOfWatermelon <= 100)){
                if(kilosOfWatermelon == 2) {
                    System.out.println("NO");
                    return;
                }
                if(kilosOfWatermelon % 2 == 0){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("Enter a valid number.");
            }
        }
        scanner.close();
    }
}
