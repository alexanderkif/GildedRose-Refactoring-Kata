package Gilded.Rose;

public class GildedRoseBackstage extends GildedRose {

	@Override
	public void updateItem(Item item)
    {
		if (item.getSellIn() < 0) {
			item.setQuality(0);
		}
		else
		{
			increaseLess50(item);
			
			if (item.getSellIn() < 11){
	            increaseLess50(item);
	        }
	        if (item.getSellIn() < 6){
	            increaseLess50(item);
	        }
		}
        
		item.setSellIn(item.getSellIn() - 1);
    }

	private void increaseLess50(Item item) {
		if (item.getQuality() < 50){
		    item.setQuality(item.getQuality() + 1);
		}
	}
}
