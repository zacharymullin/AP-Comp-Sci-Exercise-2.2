import java.util.Scanner;

public class GradeBot
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What was your test out of?");
        int denom = sc.nextInt();
        if(denom <= 0) System.out.println("Invalid entry.");
        else{
            System.out.println("What mark did you get?");
            int num = sc.nextInt();
            if(num > denom || num < 0) System.out.println("Invalid entry.");
            else{
                double percentRaw = ((double) num / (double) denom) * 100;
                int percent = (int) Math.round(percentRaw);
                if (percent >= 86) System.out.println(percent + "%" + " A. Congratulations!");
                else if (percent >= 73) System.out.println(percent + "%" + " B. Good work.");
                else if (percent >= 67) System.out.println(percent + "%" + " C+. Keep studying!");
                else if (percent >= 67) System.out.println(percent + "%" + " C+. Keep studying!");
                else if (percent >= 60) System.out.println(percent + "%" + " C. Keep your head up and work hard!");
                else if (percent >= 50) System.out.println(percent + "%" + " C-. Work hard and you will improve before you know it!");
                else if (percent > 0) System.out.println(percent + "%" + " F. Learn from your mistakes and stay positive.");
            }
        }
    }
}
