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

			default:
				gildedRose = new GildedRose();
				break;
			}
        	gildedRose.updateItem(items.get(i));
        }
    }

	public void updateItem(Item item) {
		if (!item.name.equals("Aged Brie")
		        && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
		    if (item.quality > 0) {
		            item.quality = item.quality - 1;
		    }
		} else {
		    if (item.quality < 50) {
		        item.quality = item.quality + 1;

		        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
		            if (item.sellIn < 11) {
		                if (item.quality < 50) {
		                    item.quality = item.quality + 1;
		                }
		            }

		            if (item.sellIn < 6) {
		                if (item.quality < 50) {
		                    item.quality = item.quality + 1;
		                }
		            }
		        }
		    }
		}

		item.sellIn = item.sellIn - 1;

		if (item.sellIn < 0) {
		    if (!item.name.equals("Aged Brie")) {
		        if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
		            if (item.quality > 0) {
		                    item.quality = item.quality - 1;
		            }
		        } else {
		            item.quality = item.quality - item.quality;
		        }
		    } else {
		        if (item.quality < 50) {
		            item.quality = item.quality + 1;
		        }
		    }
		}
	}
}