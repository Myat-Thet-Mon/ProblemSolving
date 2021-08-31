
/*
1998 to Digit
8SJUFBQSPHSBNUIBUSFBETBGPVSEJHJUJOUFHFS TVDIBT BOEUIFO
displays it, one digit per line, like so:
8SJUFBQSPHSBNUIBUSFBETBGPVSEJHJUJOUFHFS TVDIBT BOEUIFO
displays it, one digit per line, like so:
8SJUFBQSPHSBN UIBU SFBETB GPVSEJHJUJOUFHFSTVDIBTBOE UIFO
displays it, one digit per line, like so
 */
public class Exercise3 {
    public static void main(String[] args) {
        int num=1998;
        int newOne=num;
        int a=newOne/1000;
        System.outprintln(a);
        newOne=newOne%1000;
        int b=newOne/100;
        System.outprintln(b);
        newOne=newOne%100;
        int c=newOne/10;
        System.outprintln(c);
        newOne=newOne%10;
        int d=newOne/1;
        System.out.println("Original number is "+num);
        
    }
}

