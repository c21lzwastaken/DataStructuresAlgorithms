public class ArraysPairs {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int i = 0; i<5; i++) {
            System.out.println(numbers[i]*2);
        }
    }
    public static void arrays(int num){
        int[] num2 = new int [10000];
        for (int i = 0; i < num; i++) {
            num2[i] = i+1;
        }
    }
}
