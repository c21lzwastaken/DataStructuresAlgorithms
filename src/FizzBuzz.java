public class FizzBuzz {

    public static String FizzBuzz (int length){
        for(int i=1; i<=length; i++) {
            int three = i%3;
            int five = i%5;

            if(three == 0 && five == 0){
                System.out.println("FizzBuzz");
            }
            else if(three == 0){
                System.out.println("Fizz");
            }
            else if(five == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        return "Done";
    }

    public static void main(String[] args) {
        FizzBuzz(1000);
    }
}