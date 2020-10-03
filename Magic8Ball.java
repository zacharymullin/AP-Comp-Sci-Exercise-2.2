import java.util.Scanner;

public class Magic8Ball
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input = new String("");
       int random;
       String[] answers = { "It is certain.",
                            "It is decidedly so.",
                            "Without a doubt.",
                            "Yes – definitely.",
                            "You may rely on it.",
                            "As I see it, yes.",
                            "Most likely.",
                            "Outlook good.",
                            "Yes.",
                            "Signs point to yes.",
                            "Reply hazy, try again.",
                            "Ask again later.",
                            "Better not tell you now.",
                            "Cannot predict now.",
                            "Concentrate and ask again.",
                            "Don't count on it.",
                            "My reply is no.",
                            "My sources say no.",
                            "Outlook not so good.",
                            "Very doubtful."};
        while(true){
            System.out.println("Ask a yes or no question:...");
            input = sc.nextLine();
            if (input.equals("exit")) break;    //type "exit" to kill the loop
            random = (int) (Math.random() * 20);
            System.out.println(answers[random]);
        }       
   }
}
