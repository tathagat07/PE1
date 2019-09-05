import java.util.Scanner;

public class guessNumber{
    public static void main(String[] args) {
        int orig = 31;
        System.out.println("Enter a number :");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        while (num!= orig)
        {
            if (num > orig)
            {
                System.out.println("Number guessed is more than original number");
                num = sc.nextInt();
            }
            else{
                System.out.println("Number guessed is less than original number");
                num = sc.nextInt();
            }
        }
        System.out.println("Number guessed matches the original number.");
    }
}