package ArrayExercise;

public class Exercise18 {
    public static void main(String[] args) {
        int[] num = {2, 6, 8, 8, 2, 1, 7};
        for (int i = 1; i < num.length; i++) {
            for (int j = 0; j < num.length - i; j++) {
                if (num[j] > num[j + 1]) {
                    int tem = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tem;
                }
            }
        }

        for (int i = 1; i < num.length ; i++) {
            if (num[0] < num[i]) {
                System.out.println("second smallest is " + num[ i]);
                break;
            }
        }
    }
}