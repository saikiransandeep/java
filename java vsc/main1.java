import java.util.Scanner;
public class main1 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter wins:");
    int wins=sc.nextInt();
    int ties=sc.nextInt();
    double totalpoints=wins*1+ties*0.5;
    System.out.println(totalpoints);
    sc.close();
    }
}