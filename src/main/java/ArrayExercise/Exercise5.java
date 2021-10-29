package ArrayExercise;

public class Exercise5 {
    public static void main(String[] args) {
        int[]num={3,5,7,8,9};
        int specifiedNum=2;
        for(int i=0;i<num.length;i++){
            if(num[i]==specifiedNum){
                System.out.println("This array contained specified number");
            }
        }
    }
}
