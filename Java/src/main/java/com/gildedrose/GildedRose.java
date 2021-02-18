package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (!item.name.equals("Sulfuras")) {

                item.sellIn--;

                if (!item.name.equals("Aged Brie")) {

                    if (item.name.equals("Backstage passes")) {
                        if (item.sellIn <= 10 && item.sellIn > 5) {
                            item.quality += 2;
                        }
                        else if (item.sellIn <= 5 && item.sellIn > 0) {
                            item.quality += 3;
                        }
                        else if (item.sellIn <= 0) {
                            item.quality = 0;
                        }
                    } else {
                        if (item.sellIn < 0 && item.quality >= 2) {
                            item.quality -= 2;
                            if (item.name.equals("Conjured") && item.quality >=2) {
                                item.quality -= 2;
                            }
                        } else if (item.quality >= 1) {
                            item.quality--;
                            if (item.name.equals("Conjured") && item.quality >= 1) {
                                item.quality--;
                            }
                        }
                    }
                } else if (item.quality < 50) {
                    item.quality++;
                    if (item.sellIn < 0) {
                        item.quality++;
                    }
                }
            }
        }
    }
}