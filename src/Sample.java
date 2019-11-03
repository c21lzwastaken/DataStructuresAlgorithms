public class Sample {

    public static void main(String[] args) {
        int unit = 2;
        int[] nums = {1,2,3,4,5,5,5,5};
        doubleAllVals(nums, unit);
        printArray(nums);
        indexOf(nums, 10);
    }

    public static int[] doubleAllVals(int[] vals, int units){
        for (int i = 0; i < vals.length; i++) {
            vals[i] = vals[i] * units;
        }
        return vals;
    }
    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int indexOf(int[] vals, int nums){
        for (int i = 0; i < vals.length; i++) {
            if(vals[i] == nums){
                return i;
            }
        }
        return -1;
    }
    public static int[] copyArray(int [] vals){
        int [] copy = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            copy[i] = vals[i];
        }
        return copy;
    }
    public static int myMethod(){
        return 0;
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int abs(int c){
        if (c<0){
            return c*(-1);
        }
        else{
            return c;
        }
    }
}