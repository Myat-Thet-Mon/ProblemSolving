package ArrayExercise;

public class Exercise17 {
    public static void main(String[] args) {
        int[] num = {2, 6, 8, 8, 2, 1,7};
        for(int i=1;i<num.length;i++){
            for(int j=0;j<num.length-i;j++){
                if(num[j]>num[j+1]){
                    int tem=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tem;
                }
            }
        }
        for(int i=1;i<num.length-1;i++){
            if(num[num.length-1]>num[num.length-i-1]) {
                System.out.println("second largest is " + num[num.length - i-1]);
                break;
            }
        }
    }
}
