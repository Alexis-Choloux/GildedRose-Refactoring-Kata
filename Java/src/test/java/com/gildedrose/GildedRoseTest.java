package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void lowerSellIn() {
        Item[] items = new Item[] { new Item("item", 5, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
    }
    @Test
    void lowerQuality() {
        Item[] items = new Item[] { new Item("item", 3, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].quality);
    }
    @Test
    void lowerQualityTwice() {
        Item[] items = new Item[] { new Item("item", -1, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }
    @Test
    void qualityCantBeNegative() {
        Item[] items = new Item[] { new Item("item", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    @Test
    void agedBrieIncreaseQuality() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
    }
    @Test
    void agedBrieIncreaseTwice() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(7, app.items[0].quality);
    }
    @Test
    void qualityCantBeMoreThanFifty() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }
    @Test
    void sulfurasQualityNeverChange() {
        Item[] items = new Item[] { new Item("Sulfuras", 0, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }
    @Test
    void sulfurasSellInNeverChange() {
        Item[] items = new Item[] { new Item("Sulfuras", 5, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].sellIn);
    }
    @Test
    void backstageIncreaseByTwo() {
        Item[] items = new Item[] { new Item("Backstage passes", 10, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }
    @Test
    void backstageIncreaseByThree() {
        Item[] items = new Item[] { new Item("Backstage passes", 5, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }
    @Test
    void backstageIncreaseEqualZero() {
        Item[] items = new Item[] { new Item("Backstage passes", 0, 3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    @Test
    void conjuredQualityDecreaseByTwo() {
        Item[] items = new Item[] { new Item("Conjured", 2, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }
    @Test
    void conjuredQualityDecreaseByFour() {
        Item[] items = new Item[] { new Item("Conjured", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }
    @Test
    void conjuredQualityCantBeNegative() {
        Item[] items = new Item[] { new Item("Conjured", 0, 2)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}
