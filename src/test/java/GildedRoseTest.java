import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void itemQuality_should_decreaseByOne() {
        Item[] items = new Item[] { new Item("foo", 10, 20) };
        GildedRose sut = new GildedRose(items);
        sut.updateQuality();
        assertEquals(19, sut.items[0].quality);
    }

    @Test
    public void agedBrieQuality_should_increaseByOne() {
        Item[] items = new Item[] { new Item("Aged Brie", 10, 20) };
        GildedRose sut = new GildedRose(items);
        sut.updateQuality();
        assertEquals(21, items[0].quality);
    }
}
