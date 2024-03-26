

public class MageNPC implements NPCPrototype {
    private String spell;

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public MageNPC(String spell) {
        this.spell = spell;
    }

    @Override
    public NPCPrototype clone() {
        return new MageNPC(this.spell);
    }

    @Override
    public void displayInfo() {
        System.out.println("Mage with spell: " + spell);
    }
}