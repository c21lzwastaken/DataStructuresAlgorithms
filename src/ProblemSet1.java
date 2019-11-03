import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class ProblemSet1 {
    public static int linearSearch(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch1(int[] a, int b) {
        int c = 0;
        int d = a.length-1;

        return binarySearch(a,b,c,d);
    }

    public static int binarySearch(int[] a, int b, int c, int d){
        int m = (int) floor((c+d)/2);

        if (c==d && a[m]!=b){
            return -1;
        }
        else if (a[m]>b){
            return binarySearch(a, b, c, m-1);
        }
        else if (a[m]<b){
            return binarySearch(a, b, m+1, d);
        }
        else {
            return m;
        }
    }

    public static int binarySearch2(int[] a, int b) {
        int c = 0;
        int d = a.length-1;
        int m;

        while (c <= d) {
            m = (int) floor((c+d)/2);

            if (a[m]<b){
                c=m+1;
            }
            else if (a[m]>b){
                d=m-1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
}