package ch6Project;

import java.util.Scanner;

enum Grade {
    A, A_Plus, A_Minus, B, B_Plus, B_Minus, C, C_Plus, C_Minus, D, D_Plus, D_Minus, F, F_Plus, F_Minus;
}
class GradeMethod{
    private boolean gradeIsPassing;
    private Grade gradeVariable;

    public GradeMethod(boolean isPassed,Grade grade){
        this.gradeIsPassing=isPassed;
            if (grade == Grade.A) {
                this.gradeVariable = Grade.A;
            } else if (grade == Grade.A_Plus) {
                this.gradeVariable = Grade.A_Plus;
            } else if (grade == Grade.A_Minus) {
                this.gradeVariable = Grade.A_Minus;
            }
            else if (grade == Grade.B) {
                this.gradeVariable = Grade.B;
            } else if (grade == Grade.B_Plus) {
                this.gradeVariable = Grade.B_Plus;
            }else if(grade==Grade.B_Minus){
                this.gradeVariable=Grade.B_Minus;
            }
            else if (grade == Grade.C) {
                this.gradeVariable = Grade.C;
            } else if (grade == Grade.C_Plus) {
                this.gradeVariable = Grade.C_Plus;
            }else if(grade==Grade.C_Minus){
                this.gradeVariable=Grade.C_Minus;
            } else if (grade == Grade.D) {
                this.gradeVariable = Grade.D;
            } else if (grade == Grade.D_Plus) {
                this.gradeVariable = Grade.D_Plus;
            }else if(grade==Grade.D_Minus){
                this.gradeVariable=Grade.D_Minus;
            } else if (grade == Grade.F) {
                this.gradeVariable = Grade.F;
            } else if (grade == Grade.F_Plus) {
                this.gradeVariable = Grade.F_Plus;
            }else if(grade==Grade.F_Minus){
                this.gradeVariable=Grade.F_Minus;
            }
    }
    public boolean hasPassed() {
        return this.gradeIsPassing;
    }
    public String toString() {
        String ans=this.gradeVariable.toString();
        return ans;
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter passing or not to true or false");
        boolean isPassed=input.nextBoolean();
        System.out.println("enter your grade");
       // Grade grade=n
   // GradeMethod gradeMethod=new GradeMethod()
    }
}
