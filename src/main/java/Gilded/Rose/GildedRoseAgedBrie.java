package Gilded.Rose;

public class GildedRoseAgedBrie extends GildedRose {

	@Override
	public void updateItem(Item item)
    {
		if (item.getQuality() < 50){
			item.setQuality(item.getQuality() + 1);
        }
		item.setSellIn(item.getSellIn() - 1);
    }
}
