public class MathTool {
    public static int getGreater(int a, int b){
        if (a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            return 0;
        }
    }
    public static String isEven(int a){
        if (a%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static int arraySum(int[] a){
        int b=0;
        for (int i = 0; i < a.length; i++) {
            b=a[i]+b;
        }
        return b;
    }
    public static int power(int a, int b){
        if (a==1) {
            return b;
        }
        else {
            return b*power(a-1,b);
        }
    }
    public static int fibonaci(int a){
        if (a==1) {
            return 1;
        }
        if (a==2) {
            return 1;
        }
        else {
            return fibonaci(a-1) + fibonaci(a-2);
        }
    }
}