import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MageNPCTest {

    @Test
    public void testCloneNotSameObject() {
        MageNPC original = new MageNPC("Bola de Fogo");
        MageNPC clone = (MageNPC) original.clone();

        // Verifica se o objeto clonado não é o mesmo objeto que o original
        assertNotSame(original, clone);
    }

    @Test
    public void testCloneSameSpell() {
        MageNPC original = new MageNPC("Bola de Fogo");
        MageNPC clone = (MageNPC) original.clone();

        // Verifica se o objeto clonado tem o mesmo feitiço que o original
        assertEquals(original.getSpell(), clone.getSpell());
    }

    @Test
    public void testConstructorInitialization() {
        String spell = "Bola de Fogo";
        MageNPC mageNPC = new MageNPC(spell);

        // Verifica se o construtor inicializa corretamente o atributo spell
        assertEquals(spell, mageNPC.getSpell());
    }
}