import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    // тесты станций из конструктора

    @Test
    // переключение на следующий канал
    public void constructorTestChannelNext() {
        Radio radio = new Radio(
                1,
                10,
                1000,
                100);
        int actual = radio.nextRadioStation();
        assertEquals(2, radio.getCurrentChannel());
    }

    @Test
    // переключение на предыдущий канал
    public void constructorTestChannelPrev() {
        Radio radio = new Radio(
                3,
                10,
                1000,
                100);
        int actual = radio.prevRadioStation();
        assertEquals(2, radio.getCurrentChannel());
    }

    @Test
    // переключение с минимального на максимальный канал
    public void constructorTestCurrentChannelMin() {
        Radio radio = new Radio(
                -1,
                10,
                1000,
                100);
        int actual = radio.nextRadioStation();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    // переключение с максимального на минимальный канал
    public void constructorTestCurrentChannelMax() {
        Radio radio = new Radio(
                11,
                10,
                1000,
                100);
        int actual = radio.prevRadioStation();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    // тест текущей станции
    public void constructorTestCurrentChannel() {
        Radio radio = new Radio(
                6,
                10,
                1000,
                100);
        assertEquals(6, radio.getCurrentChannel());
    }

    // тесты громкости из конструктора

    @Test
    // Уменьшение громкости меньше минимума
    public void constructorTestVolumeDown() {
        Radio radio = new Radio(
                6,
                10,
                -1,
                100);
        int actual = radio.switchVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    // Увеличение громкости больше максимума
    public void constructorTestVolumeUp() {
        Radio radio = new Radio(
                1,
                10,
                101,
                100);
        int actual = radio.switchVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    // тест текущей громкости
    public void constructorTestCurrent() {
        Radio radio = new Radio(
                1,
                10,
                65,
                100);
        assertEquals(65, radio.getCurrentVolume());
    }

    @Test
    // уменьшение громкости
    public void constructorTestCurrentMin() {
        Radio radio = new Radio(
                0,
                10,
                49,
                100);
        int actual = radio.switchVolumeDown();
        assertEquals(48, radio.getCurrentVolume());
    }

    @Test
    //увеличение громкости
    public void constructorTestCurrentMax() {
        Radio radio = new Radio(
                0,
                10,
                33,
                100);
        int actual = radio.switchVolumeUp();
        assertEquals(34, radio.getCurrentVolume());
    }

}
