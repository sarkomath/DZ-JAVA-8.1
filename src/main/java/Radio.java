import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    // значения полей заданы
    private int channel;
    private int volume;
    private int maxChannel = 10;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void nextRadioChannel() {
        if (this.channel > this.maxChannel) {
            setChannel(0);
        } else {
            setChannel(this.channel + 1);
        }
    }

    public void prevRadioChannel() {
        if (this.channel < 0) {
            setChannel(this.maxChannel);
        } else {
            setChannel(this.channel - 1);
        }
    }

    public void volumeUp() {
        if (this.volume == 100) {
            return;
        } else {
            setVolume(this.volume + 1);
        }
    }

    public void volumeDown() {
        if (this.volume == 0) {
            return;
        }
        setVolume(this.volume - 1);
    }
}