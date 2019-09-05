import java.util.Scanner;

public class stringRepeat{

    public static void main(String[] args) {
        System.out.println("Enter the string which you want to repeat: ");
        Scanner sc = new Scanner(System.in);
        String  word = sc.nextLine();
        System.out.println("Enter number of time to repeat: ");
        int num = sc.nextInt();

        for (int i=0 ;i < num; i++)
        {
            System.out.print(word);
        }
    }
}