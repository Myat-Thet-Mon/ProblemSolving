package ArrayExercise;

import java.util.Arrays;

public class Exercise16 {
    public static void main(String[] args) {
        int[] num = {2, 6, 8, 8, 2, 1, 7};
        int count=0;

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    count++;
                }
            }
        }

        int[]newNum=new int[num.length-count];
        System.out.println(newNum.length);
        int index=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]!=num[j]){
                    newNum[index]=num[i];
                    index++;
                }
            }
        }

        System.out.println(Arrays.toString(newNum));


    }
}
