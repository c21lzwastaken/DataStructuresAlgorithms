import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LiveCode1 {
    public static String[] filter(String[] names, int[] grades, int threshold) {
        int index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > threshold) {
                index++;
            }
        }
        String[] newnames = new String[index]; //Making the length of the new array exactly the number of names needed so that no empty space will be returned
        index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > threshold) {
                newnames[index] = names[i]; //Actually adding the names
                index++;
            }
        }
        return newnames;
    }
}