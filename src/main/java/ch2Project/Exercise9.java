package ch2Project;

import java.util.Scanner;

/*
I had a dream that Name ate a Color Animal
and said it tasted like Food!
to
I had a dream that Jake ate a blue dog
and said it tasted like hamburger!
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String line=null;
        line="I had a dream that Name ate a Color Animal\n" +
                "and said it tasted like Food!";
        System.out.println("Enter color");
        String C=input.next();
        System.out.println("Enter food");
        String F=input.next();
        System.out.println("Enter animal");
        String A=input.next();
        System.out.println("Enter name");
        String N=input.next();

        String a=line.replace("Color",C);
        String b=a.replace("Food",F);
        String c=b.replace("Animal",A);
        String d=c.replace("Name",N);
        System.out.println(d);

    }
}
