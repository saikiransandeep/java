import java.util.*;
public class addingnum {
    public static void main(String[] args) {
        // int num = 1234;
        // int sum = 0;
        // while (num != 0) {
        //     sum += num % 10;
        //     num /= 10;  
        // }
        // System.out.println(sum);


        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;  
        }
        System.out.println("Sum of digits: " +sum);
        sc.close();
        }

    }
