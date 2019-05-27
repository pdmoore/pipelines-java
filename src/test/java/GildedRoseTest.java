import static org.junit.Assert.*;

import com.microsoft.demo.GildedRose;
import com.microsoft.demo.Item;
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

    @Test
    public void LegendaryQuality_does_not_change() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 25, 80) };
        GildedRose sut = new GildedRose(items);
        sut.updateQuality();
        assertEquals(80, items[0].quality);
    }
}
