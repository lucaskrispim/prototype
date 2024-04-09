import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorNPCTest {

    @Test
    void testCloneIsDifferentInstance() throws CloneNotSupportedException {
        Weapon weapon = new Weapon("Sword",10.0);
        WarriorNPC originalWarrior = new WarriorNPC(weapon);

        WarriorNPC clonedWarrior = originalWarrior.clone();

        assertNotSame(originalWarrior, clonedWarrior);
    }

    @Test
    void testCloneHasDeepCopyOfWeapon() throws CloneNotSupportedException {
        Weapon weapon = new Weapon("Sword",10.0);
        WarriorNPC originalWarrior = new WarriorNPC(weapon);

        WarriorNPC clonedWarrior = originalWarrior.clone();

        assertNotSame(originalWarrior.getWeapon(), clonedWarrior.getWeapon());
        assertEquals(originalWarrior.getWeapon().getType(), clonedWarrior.getWeapon().getType());
        assertEquals(originalWarrior.getWeapon().getDamage(), clonedWarrior.getWeapon().getDamage());
    }
}
