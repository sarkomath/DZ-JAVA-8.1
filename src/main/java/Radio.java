import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    // значения полей заданы
    private int currentChannel;
    private int currentVolume;
    private int maxChannel = 10;
    private int minChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


/*    // создаем конструктор


    public Radio(
            int currentChannel,
            int maxChannel,
            int currentVolume,
            int maxVolume) {
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
            return;
        }
        this.currentChannel = currentChannel;
        this.maxChannel = maxChannel;

        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    //создаем геттеры и сеттеры для создания условий

    //Установка текущей станции

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {

        this.currentChannel = currentChannel;
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public int getMaxChannel() {

        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {

        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {

        return minChannel;
    }

    public void setMinChannel(int minChannel) {

        this.minChannel = minChannel;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }*/

    /*//Переключение станций

    public int nextRadioStation() {
        if (currentChannel < maxChannel) {
            return currentChannel++;
        } else {
            return minChannel;
        }
    }

    public int prevRadioStation() {
        if (currentChannel > minChannel) {
            return currentChannel--;
        } else {
            return maxChannel;
        }
    }

    // Переключение громкости

    public int switchVolumeDown() {
        if (currentVolume > minVolume) {
            return currentVolume--;
        } else {
            return maxVolume;
        }
    }

    public int switchVolumeUp() {
        if (currentVolume < maxVolume) {
            return currentVolume++;
        } else {
            return minVolume;
        }
    }*/
}