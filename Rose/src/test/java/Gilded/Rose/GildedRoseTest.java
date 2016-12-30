package Gilded.Rose;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        GildedRose.items = new ArrayList<Item>();
        GildedRose.items.add(new Item("Aged Brie", 2, 0));
        GildedRose.gildedRose.updateQuality();
        assertEquals(1, GildedRose.items.get(0).getQuality());
    }

}
