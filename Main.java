import magician.Magician;
import magician.HarryPotter;
import magician.RonWeasley;
import magician.HermioneGranger;
import spellbehaviour.OculusSpell;
import spellbehaviour.WingardiumSpell;

public class Main {
    public static void main(String[] args) {

        Magician harry = new HarryPotter();
        Magician ron = new RonWeasley();
        Magician hermione = new HermioneGranger();

        System.out.println("Hechizos iniciales");
        harry.performSpell();     
        ron.performSpell();       
        hermione.performSpell();  

        System.out.println("\n Hermione cambia de hechizo para arreglar las gafas de Harry");
        hermione.setSpellBehaviour(new OculusSpell());
        hermione.performSpell();  

        System.out.println("\n Hermione vuelve a su anterior hechizo");
        hermione.setSpellBehaviour(new WingardiumSpell());
        hermione.performSpell();  
    }
}