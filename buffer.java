import java.util.Scanner;

public class buffer{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String  word = sc.nextLine();
        char[] letters = word.toCharArray();

        for (int i = letters.length-1; i>=0; i--) 
        System.out.print(letters[i]);
    }
}