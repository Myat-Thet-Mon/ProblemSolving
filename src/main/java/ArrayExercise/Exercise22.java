package ArrayExercise;

public class Exercise22 {
    public static void main(String[] args) {
        int[]num={1,2,3,4,5};
        int specifiedNum=5;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==specifiedNum){
                    System.out.println(num[i]+"+"+num[j]+" is equal with specified number");
                }
            }
        }
    }
}
