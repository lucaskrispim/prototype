public class Game {
    public static void main(String[] args) {
        NPCPrototype warriorPrototype = new WarriorNPC("Espada Longa");
        NPCPrototype magePrototype = new MageNPC("Bola de Fogo");

        // Clonando e personalizando NPCs
        NPCPrototype newWarrior = warriorPrototype.clone();
        newWarrior.displayInfo(); // Exibe: Warrior with weapon: Espada Longa

        NPCPrototype newMage = magePrototype.clone();
        newMage.displayInfo(); // Exibe: Mage with spell: Bola de Fogo

        // Aqui você pode personalizar os novos NPCs conforme necessário
    }
}
