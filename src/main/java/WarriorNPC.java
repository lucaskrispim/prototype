public class WarriorNPC implements Cloneable {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public WarriorNPC(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public WarriorNPC clone() throws CloneNotSupportedException {
        WarriorNPC warriorNPCClone = (WarriorNPC) super.clone();
        warriorNPCClone.weapon = (Weapon) warriorNPCClone.weapon.clone();
        return warriorNPCClone;
    }

}
