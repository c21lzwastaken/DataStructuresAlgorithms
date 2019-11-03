/*
Methods: Block of code inside a class that has a name

Can have inputs/parameters/arguments and outputs

Scope: A variable only exists within the closest brackets
Literal: Not a variable/raw value

Memory:

Variables are stored in the Stack
Always stays as small as possible

|
| etc etc etc
| _________________ (new method)
| String [] args = null
| int sum = pending
| int j =6
| Main
| Return to: null
 */

public class Methods {

    public static void printTime(int hour, int minute, int second, boolean Afternoon){
        if (Afternoon) System.out.println("The time is " + hour + ":" + minute + ":" + second + " PM");
        if (!Afternoon) System.out.println("The time is " + hour + ":" + minute + ":" + second + " AM");
    }
    public static void Kilos(double pounds) {
        System.out.println("You weigh " + Math.round(pounds/2.20462) + " Kilogrammes");
    }
    public static void Random(int upbound, int lowbound) {
        System.out.println((Math.random()*(upbound-lowbound))+lowbound);;
    }

    public static int GetDouble(int dub) {
        return (dub*2);
    }
    public static int GetCelcius(int fah){
        return (fah-32)*5/9;
    }


    public static void Plurals(String word){
        char [] plural = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            plural[i] = word.charAt(i);
        }
        if (String.valueOf(plural[word.length()]).contentEquals("s")) {

        }
    }
    public static void main(String[] args) {
        printTime(10, 46, 31, true);
        Kilos(105);
        Random(20, 50);
        System.out.println(GetDouble(5));
        System.out.println(GetCelcius(104));
    }
}