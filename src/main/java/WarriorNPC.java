public class WarriorNPC implements NPCPrototype {
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public WarriorNPC(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public NPCPrototype clone() {
        return new WarriorNPC(this.weapon);
    }

    @Override
    public void displayInfo() {
        System.out.println("Warrior with weapon: " + weapon);
    }
}
