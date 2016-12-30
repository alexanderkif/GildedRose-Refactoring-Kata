package Gilded.Rose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        GildedRose.items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose.gildedRose.updateQuality();
        assertEquals(1, GildedRose.items[0].getQuality());
    }

}
