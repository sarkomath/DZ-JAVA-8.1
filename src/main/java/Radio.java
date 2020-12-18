public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 10;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) { //next
            currentChannel = minChannel;
            return;
        }
        if (currentChannel < minChannel) { //prev
            currentChannel = maxChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
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
    }

    public int nextRadioStation() {
        if (currentChannel == minChannel) {
            currentChannel = 0;
            return currentChannel;       }
        else {
            return this.currentChannel++;
        }    }

    public int prevRadioStation() {
        if (currentChannel == minChannel) {
            currentChannel = 9;
            return currentChannel;       }
        else {
            return this.currentChannel--;
        }    }
}
