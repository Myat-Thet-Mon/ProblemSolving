package ArrayExercise;

import java.util.Arrays;

public class Exercise19 {
    public static void main(String[] args) {
        int[]one={1,5,7};
        int[]two={2,4,6};
        int[]three=new int[one.length];
        for(int i=0;i<one.length;i++){
          three[i]=one[i]+two[i];
        }
        System.out.println(Arrays.toString(three));
    }
}
