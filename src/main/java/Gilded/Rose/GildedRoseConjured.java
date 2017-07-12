package Gilded.Rose;

public class GildedRoseConjured extends GildedRose {

	@Override
	public void updateItem(Item item)
    {
		decrementMore0Twice(item);
		if (item.getSellIn() < 0) {
			decrementMore0Twice(item);
		}
		item.setSellIn(item.getSellIn() - 1);
    }

	private void decrementMore0Twice(Item item) {
		if (item.getQuality() > 0){
			item.setQuality(item.getQuality() - 1);
			if (item.getQuality() > 0){
				item.setQuality(item.getQuality() - 1);
			}
        }
	}
}
