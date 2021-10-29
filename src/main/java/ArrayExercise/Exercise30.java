package ArrayExercise;

public class Exercise30 {
    public static void main(String[] args) {
        int[] num = {9, 3, 2, 5, -1, 7};
        boolean result = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0 && num[i] != -1) {
                result = true;
            } else {
                result = false;
                System.out.println("This array included 0 or 1");
                break;
            }
        }
        if (result == true) {
            System.out.println("There is no 0 or -1");
        }
    }
}
