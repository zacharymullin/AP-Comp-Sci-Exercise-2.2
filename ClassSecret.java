import java.util.Scanner;

public class ClassSecret
{
    public static void main (String[] args){
        final String password = new String("dragon");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password:");
        String input = sc.nextLine();
        if(input.equals(password)){
            System.out.println("Correct! The secret is that there is no secret...");
        }
        else 
            System.out.println("WRONG!");
    }
}
