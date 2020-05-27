public class Oven {
    int maxTemp;
    int currentTemp;
    int volume;
    String color;
    String type;
    String name;
    String owner;
    Oven nemesis;

    public void bake() {
        currentTemp = 400;
    }

    public void talk() {
        System.out.println("Hi! I am a " + type + " oven. My name is " + name + ". I am colored " + color + " and my temperature is " + currentTemp + " degrees.");
    }
}
