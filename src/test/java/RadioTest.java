import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    // channel tests

    @Test
    public void testCurChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void testMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-5);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void testMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(88);
        assertEquals(0, radio.getCurrentChannel());
    }

    // volume tests

    @Test
    public void setCurVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(88);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    // switch channel tests

    @Test
    public void nextChannelButton() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        int actual = radio.nextRadioStation();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void prevChannelButton() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        int actual = radio.prevRadioStation();
        assertEquals(5, radio.getCurrentChannel());
    }

    // full tests

    @Test
    public void nextChannelButtonFullTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        int actual = radio.nextRadioStation();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void prevChannelButtonFullTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-4);
        int actual = radio.prevRadioStation();
        assertEquals(9, radio.getCurrentChannel());
    }
}
