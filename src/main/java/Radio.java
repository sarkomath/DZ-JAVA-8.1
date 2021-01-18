import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentChannel;
    private int currentVolume;
    private int maxChannel;
    private int minChannel;
    private int maxVolume;
    private int minVolume;
}