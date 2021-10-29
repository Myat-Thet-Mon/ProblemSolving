package ArrayExercise;

public class Exercise24 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,6,7};
        int[]newNum=new int[num.length+1];
        for (int i=0;i<=num.length;i++){
            if(num[i]+1==num[i+1]){
                newNum[i]=newNum[i];
            }else if(num[i]+1!=num[i+1]){
                //newNum
            }
        }
    }
}
