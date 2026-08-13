package magician;

import spellbehaviour.SpellBehaviour;

public abstract class Magician {

    protected SpellBehaviour spellBehaviour;

    public Magician(SpellBehaviour spellBehaviour) {
        this.spellBehaviour = spellBehaviour;
    }

    public void setSpellBehaviour(SpellBehaviour spellBehaviour) {
        this.spellBehaviour = spellBehaviour;
    }

    public SpellBehaviour getSpellBehaviour() {
        return spellBehaviour;
    }

    public void performSpell() {
        spellBehaviour.spell();
    }
}