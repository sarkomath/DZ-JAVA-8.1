import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    // увеличение громкости
    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.volumeUp();
        int actual = radio.getVolume();
        int expected = 11;
        assertEquals(actual, expected);
    }

    // уменьшение громкости
    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.volumeDown();
        int actual = radio.getVolume();
        int expected = 9;
        assertEquals(actual, expected);
    }

    // увеличение громкости больше максимума
    @Test
    public void volumeUpOverMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.volumeUp();
        int actual = radio.getVolume();
        int expected = 100;
        assertEquals(actual, expected);
    }

    // увеличение громкости меньше минимума
    @Test
    public void volumeDownOverMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.volumeDown();
        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    // переключение станции +1
    @Test
    public void channelUp() {
        Radio radio = new Radio();
        radio.setChannel(8);
        radio.nextRadioChannel();
        int actual = radio.getChannel();
        int expected = 9;
        assertEquals(actual, expected);
    }

    // переключение станции -1
    @Test
    public void channelDown() {
        Radio radio = new Radio();
        radio.setChannel(5);
        radio.prevRadioChannel();
        int actual = radio.getChannel();
        int expected = 4;
        assertEquals(actual, expected);
    }

    // переключение станции меньше минимальной
    @Test
    public void channelOverMin() {
        Radio radio = new Radio();
        radio.setChannel(-3);
        radio.prevRadioChannel();
        int actual = radio.getChannel();
        int expected = 10;
        assertEquals(actual, expected);
    }

    // переключение станции выше максимальной
    @Test
    public void channelOverMax() {
        Radio radio = new Radio();
        radio.setChannel(11);
        radio.nextRadioChannel();
        int actual = radio.getChannel();
        int expected = 0;
        assertEquals(actual, expected);
    }
}
