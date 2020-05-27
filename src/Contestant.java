public class Contestant {
    String name;
    String[] roses;
    String[] dates;
    Contestant next;

    public Contestant() {
        this.roses = new String[10];
        this.dates = new String[10];
        this.next = null;
    }

    public String getRoseCeremonies() {
        String roseCeremonies = "";

        for (int i = 0; i < roses.length; i++) {
            // TODO 1: Update to include the first impression rose (R1) and the final rose (W)
            if (roses[i].startsWith("E")) {
                roseCeremonies += "eliminated";
                break;
            } else roseCeremonies += "rose";

            roseCeremonies += "\t";
        }

        return roseCeremonies;
    }

    public String getDateHistory() {
        String dateHistory = "";

        // TODO 2: Update to include the dates this contentent went on.
        // TODO 3: Specify if the date was a one-on-one (D1) or a group date.

        return dateHistory;
    }

    public void setNext(Contestant a) {
        this.next = a;
    }
}