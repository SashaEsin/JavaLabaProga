package org.example.behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();

        System.out.println("All items:");
        printItems(chest.iterator(ItemType.ANY));

        System.out.println("\nWeapon items:");
        printItems(chest.iterator(ItemType.WEAPON));

        System.out.println("\nRing items:");
        printItems(chest.iterator(ItemType.RING));

        System.out.println("\nPotion items:");
        printItems(chest.iterator(ItemType.POTION));
    }

    private static void printItems(Iterator<Item> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}