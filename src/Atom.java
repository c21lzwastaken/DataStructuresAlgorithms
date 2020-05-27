import java.util.ArrayList;

public class Atom {
    private String symbol;
    private int availableElectrons;
    private ArrayList bonds;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAvailableElectrons() {
        return availableElectrons;
    }

    public void setAvailableElectrons(int availableElectrons) {
        this.availableElectrons = availableElectrons;
    }

    public Object getBonds(int get) {
        return bonds.get(get);
    }

    public int getBondsSize() {
        return bonds.size();
    }

    public void setBonds(ArrayList bonds) {
        this.bonds = bonds;
    }

    public Atom(String symbol, int availableElectrons){
        this.symbol=symbol;
        this.availableElectrons=availableElectrons;
        this.bonds=new ArrayList<String>();
    }

    public void bondWith(Atom atom){
        if(this.availableElectrons>0&&atom.availableElectrons>0){
            this.bonds.add(atom.symbol);
            atom.bonds.add(symbol);
            this.availableElectrons--;
            atom.availableElectrons--;
        }
        else{
            System.out.println("Not enough electrons");
        }
    }

    public static String showBonds(Atom atom){
        String bonds = new String();
        for (int i = -1; i < atom.getBondsSize(); i++) {
            if(i==-1){
                bonds = atom.getSymbol();
            }
            else{
                bonds = bonds+"-"+atom.getBonds(i);
            }
        }
        return bonds;
    }

}