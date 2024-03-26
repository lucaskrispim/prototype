import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorNPCTest {

    @Test
    public void testCloneNotSameObject() {
        WarriorNPC original = new WarriorNPC("Espada Longa");
        WarriorNPC clone = (WarriorNPC) original.clone();

        // Verifica se o objeto clonado não é o mesmo objeto que o original
        assertNotSame(original, clone, "O objeto clonado não deve ser o mesmo que o original");
    }

    @Test
    public void testCloneSameWeapon() {
        WarriorNPC original = new WarriorNPC("Espada Longa");
        WarriorNPC clone = (WarriorNPC) original.clone();

        // Verifica se o objeto clonado tem o mesmo valor de arma que o original
        assertEquals(original.getWeapon(), clone.getWeapon());
    }

    @Test
    public void testConstructorInitialization() {
        String weapon = "Espada Longa";
        WarriorNPC warriorNPC = new WarriorNPC(weapon);

        // Verifica se o construtor inicializa corretamente o atributo weapon
        assertEquals( weapon, warriorNPC.getWeapon());
    }
}