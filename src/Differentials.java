import java.util.Random;
import java.lang.Math;

public class Differentials {
    public static void main(String[] args) {
        int infectedtotal=1;
        int infectedround=0;
        int days=1;
        Random rand = new Random();
        while (infectedtotal < 11){
            infectedround=0;
            for (int i = 0; i < 11-infectedtotal; i++) {
                if(rand.nextInt(36)==0){
                    infectedround++;
                }
            }
            infectedtotal=infectedtotal+infectedround;
            if (infectedtotal>11){
                infectedtotal=11;
            }
            System.out.println("Day " + days + ": " + infectedtotal + " Infected");
            days++;

        }
    }
}
