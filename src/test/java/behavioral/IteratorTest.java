package behavioral;

import org.example.behavioral.Iterator.Item;
import org.example.behavioral.Iterator.ItemType;
import org.example.behavioral.Iterator.Iterator;
import org.example.behavioral.Iterator.TreasureChest;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    public void test() {
        TreasureChest treasureChest = new TreasureChest();
        Iterator<Item> itemIterator = treasureChest.iterator(ItemType.WEAPON);

        while (itemIterator.hasNext()) {
            Item item = itemIterator.next();
            System.out.println(item.toString());
        }
    }
}
