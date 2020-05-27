public class AtomApp {
    public static void main(String[] args) {
        Atom Carbon1 = new Atom("C", 4);
        Atom Carbon2 = new Atom("C", 4);
        Atom Hydrogen1 = new Atom("H", 1);
        Atom Hydrogen2 = new Atom("H", 1);
        Atom Hydrogen3 = new Atom("H", 1);
        Atom Helium = new Atom("H", 2);

        Carbon1.bondWith(Hydrogen1);
        Carbon1.bondWith(Hydrogen2);
        Carbon1.bondWith(Hydrogen3);
        Carbon1.bondWith(Carbon2);
        Carbon1.bondWith(Helium);

        for (int i = -1; i < Carbon1.getBondsSize(); i++) {
            if(i==-1){
                System.out.print(Carbon1.getSymbol());
            }
            else{
                System.out.print("-" + Carbon1.getBonds(i));
            }

        }
        System.out.println();
        System.out.println(Atom.showBonds(Carbon1));
    }
}
