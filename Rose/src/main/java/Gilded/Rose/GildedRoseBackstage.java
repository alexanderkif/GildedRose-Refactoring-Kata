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
			if (item.getQuality() < 50){
			    item.setQuality(item.getQuality() + 1);
			}
			
			if (item.getSellIn() < 11){
				if (item.getQuality() < 50){
				    item.setQuality(item.getQuality() + 1);
				}
	        }
	        if (item.getSellIn() < 6){
	        	if (item.getQuality() < 50){
	    		    item.setQuality(item.getQuality() + 1);
	    		}
	        }
		}
        
		item.setSellIn(item.getSellIn() - 1);
    }
}
