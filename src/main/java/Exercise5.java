import javax.security.sasl.SaslClient;
import java.util.Scanner;

/*
read int to string
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer");
        int num=input.nextInt();
        System.out.println("String is "+Integer.toString(num));
    }
}
