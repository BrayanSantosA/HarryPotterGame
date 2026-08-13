package magician;

import spellbehaviour.SpellBehaviour;

public abstract class Magician {

    protected String name;
    protected SpellBehaviour spellBehaviour;

    public Magician(String name, SpellBehaviour spellBehaviour) {
        this.name = name;
        this.spellBehaviour = spellBehaviour;
    }

    public void setSpellBehaviour(SpellBehaviour spellBehaviour) {
        this.spellBehaviour = spellBehaviour;
    }

    public SpellBehaviour getSpellBehaviour() {
        return spellBehaviour;
    }

    public void performSpell() {
        System.out.print(name + " casts: ");
        spellBehaviour.spell();
    }
}