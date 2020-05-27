import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.util.Scanner;

public class BacheloretteApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("bac_season13_rachel.csv"));

        scanner.nextLine(); // skip header

        // start a list of Contestants
        Contestant c = new Contestant();
        Contestant first = c; // keep track of the first for future reference.
        Contestant last;

        // read in all the contestants from the file
        while (scanner.hasNextLine()) {
            // read the line and split into an array
            String[] info = scanner.nextLine().split(",", -1);

            // assign the 'name', 'roses', and 'dates' attributes
            c.name = info[0];
            System.arraycopy(info, 1, c.roses, 0, 10);
            // TODO 4: Use the example above to fill the c.dates array. HINT: info is an array. at what index do the dates start?

            // TODO 1: Assign c's 'next' attribute to a new Contestant and make c equal to next.
            c.setNext(new Contestant());
            c = c.next;
            last=c;
        }

        // Print all the contestants
        c = first; // point c  back to the first contestant
        // TODO 2: use a while loop to print all the contestant names. HINT: print c's name then set c equal to next.
        //while (c){
            System.out.println(c.name);
            c=c.next;
        }
        // TODO 3: after each name, print his or her rose ceremony results. HINT: See the TODO in Contestant
        // TODO 5: after the rose ceremony results print date history. HINT: See the TODO in Contestant

    }
//}