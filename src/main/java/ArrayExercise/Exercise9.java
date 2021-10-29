package ArrayExercise;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {

        int[] num = {3, 5, 7, 8, 9};
        int[]newNum=new int[num.length+1];
        int specifiedNum = 4;
        int specifiedPosition=1;
        int index=0;
        for(int i=0;i<num.length;i++){
            if(i==specifiedPosition){

                newNum[i]=specifiedNum;

                index=1;
            }else{
                newNum[i+index]=num[i];

            }
        }
        System.out.println(Arrays.toString(newNum));

//        int[]num={3,5,7,8,9};
//      //  int[]newNum=new int[num.length];
//        int special=6;
//        for (int i=0;i<num.length+1;i++){
//            if(special>num[i]){
//                if(i+1==num.length+1){
//                    break;
//                }
//                num[i+1]=special;
//            }
//        }
    }
}
