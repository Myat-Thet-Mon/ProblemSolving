package ch2Project;

/*
pricipal
 */
public class Exercise3 {
    public static void main(String[] args) {
        double total = 150000;
        double rate = 7.49 / 100;
        double SI = (total * (7.9 / 100)) * 12;
        double principal = total - SI;
        System.out.println("Original mount " + principal);
        System.out.println("Simple interest " + SI);
    }

}

