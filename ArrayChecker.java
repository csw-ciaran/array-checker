import java.util.Scanner;

public class ArrayChecker {
    public static void main(String args[]) {
        int [] num = {1, 3, 2, 3, 4, 5}; // Array of numbers
        int target;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Target: ");
        target = sc.nextInt();
        sc.close();

        for(int i = 0; i < num.length; i++) {
            if(num[i] == target) {
                count++;
            }
        }
        System.out.println(target + " was present " + count + " time(s)");
    }
}
