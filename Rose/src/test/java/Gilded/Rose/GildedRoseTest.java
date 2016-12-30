package Gilded.Rose;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest {

    public void doTestBody(String name, int day, int qual, int expDay, int expQual) {
        GildedRose.items = new ArrayList<Item>();
        GildedRose.items.add(new Item(name, day, qual));
        GildedRose.updateQuality();
        assertEquals(expDay, GildedRose.items.get(0).getSellIn());	
		assertEquals(expQual, GildedRose.items.get(0).getQuality());
		System.out.println(name + " - sellIn expected " + expDay + ", actual " + GildedRose.items.get(0).getSellIn()+ " ||| quality expected " + expQual + ", actual " + GildedRose.items.get(0).getQuality());
	}
	
	@Test
    public void testDexterity(){
		doTestBody("+5 Dexterity Vest", -1, 3, -2, 1);
	}
	
	@Test
    public void testAgedBrie(){
		doTestBody("Aged Brie", 2, 49, 1, 50);
	}
	
	@Test
    public void testElixir(){
		doTestBody("Elixir of the Mongoose", 5, 7, 4, 6);
	}
	
	@Test
    public void testSulfuras0(){
		doTestBody("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80);
	}
	
	@Test
    public void testSulfuras1(){
		doTestBody("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80);
	}
	
	@Test
    public void testBackstage(){
		doTestBody("Backstage passes to a TAFKAL80ETC concert", -1, 4, -2, 0);
	}
	
	@Test
	public void testItems() {
		GildedRose.items = new ArrayList<Item>();		
		GildedRose.items.add(new Item("+5 Dexterity Vest", 10, 20));
		GildedRose.items.add(new Item("Aged Brie", 2, 0));
		GildedRose.items.add(new Item("Elixir of the Mongoose", 5, 7));
		GildedRose.items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		GildedRose.items.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
		GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
		GildedRose.items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
		
		GildedRose.updateQuality();
		
		assertEquals(9, GildedRose.items.get(0).getSellIn());	
		assertEquals(1, GildedRose.items.get(1).getSellIn());
		assertEquals(4, GildedRose.items.get(2).getSellIn());
		assertEquals(0, GildedRose.items.get(3).getSellIn());
		assertEquals(-1, GildedRose.items.get(4).getSellIn());
		assertEquals(14, GildedRose.items.get(5).getSellIn());
		assertEquals(9, GildedRose.items.get(6).getSellIn());
		assertEquals(4, GildedRose.items.get(7).getSellIn());
		
		assertEquals(19, GildedRose.items.get(0).getQuality());	
		assertEquals(1, GildedRose.items.get(1).getQuality());	
		assertEquals(6, GildedRose.items.get(2).getQuality());	
		assertEquals(80, GildedRose.items.get(3).getQuality());	
		assertEquals(80, GildedRose.items.get(4).getQuality());
		assertEquals(21, GildedRose.items.get(5).getQuality());	
		assertEquals(50, GildedRose.items.get(6).getQuality());	
		assertEquals(50, GildedRose.items.get(7).getQuality());	
		
		System.out.println("Complex test");
	}
}
