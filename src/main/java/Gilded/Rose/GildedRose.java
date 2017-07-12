package Gilded.Rose;

import java.util.List;

class GildedRose {
	
    public static List<Item> items;
    public static GildedRose gildedRose;

    public static void updateQuality() {
        for (int i = 0; i < items.size(); i++) {
        	switch (items.get(i).name) {
			case "Sulfuras, Hand of Ragnaros":
				gildedRose = new GildedRoseSulfuras();
				break;
			case "Aged Brie":
    			gildedRose = new GildedRoseAgedBrie();
    			break;
    		case "Backstage passes to a TAFKAL80ETC concert":
    			gildedRose = new GildedRoseBackstage();
    			break;
    		case "Conjured Mana Cake":
    			gildedRose = new GildedRoseConjured();
    			break;

			default:
				gildedRose = new GildedRose();
				break;
			}
        	gildedRose.updateItem(items.get(i));
        }
    }

	public void updateItem(Item item) {
		
	    if (item.quality > 0) {
            item.quality = item.quality - 1;
	    }

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0) {
            if (item.quality > 0) {
                    item.quality = item.quality - 1;
            }
		}
	}
}