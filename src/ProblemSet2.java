public class ProblemSet2 {

    public static int[] selectionSort(int[]a){
        for (int j = 0; j < a.length; j++) {
            int minIndex=j;
            for (int i = j; i < a.length; i++) {
                if(a[i]<a[minIndex]){
                    minIndex=i;
                }
            }
            int min=a[minIndex];
            a[minIndex]=a[j];
            a[j]=min;
        }
        return a;
    }

    public static int[] quickSort(int[]a){ //I really don't like having inputs other than the original array so the algorithm actually starts at the second method
        int min = 0;
        int max = a.length-1;

        return divide(a,min,max);
    }
    public static int[] divide(int[]a, int min, int max){ //Just need to set up some constants for the first run with the first method. This one handles the recursion
        if (min<=max){
            int pivot = partitionSet(a, min, max);
            divide(a,min,pivot-1);
            divide(a,pivot+1,max);
        }
        return a;
    }
    public static int partitionSet(int[]a, int min, int max){ // This one does the actual sorting
        int pivot = max;

        for (int i = max; i >= min; i--) {
            if(a[i]>a[pivot]){
                int num1 = a[i];
                a[i]=a[pivot-1];
                int num2 = a[pivot];
                a[pivot]=num1;
                a[pivot-1]=num2;
            }
        }
        return pivot;
    }

    public static int[] bubbleSort1(int[]a){ //Recursive version which calls it every time you make a switch. Variable names are very often reused between methods
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                int num1 = a[i];
                a[i] = a[i+1];
                a[i+1] = num1;
                return bubbleSort1(a);
            }
        }
        return a;
    }
    public static int[] bubbleSort2(int[]a){ //Non-Recursive version because calling it every time you make a switch seemed really wasteful but it's about the same speed
        int changes = 0;
        while (true) {
            changes=0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int num1 = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = num1;
                    changes ++;
                }
            }
            if (changes==0){
                return a;
            }
        }
    }

}
