public class Weapon implements Cloneable {
    private String type;

    private double damage;

    public Weapon(String type,double damage){
        this.damage = damage;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
