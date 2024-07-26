package ENTITIES;

import INTAERFACES.Brightness;
import INTAERFACES.Play;

public class Video extends ElementoMultimedia implements Play, Brightness {
    private int Brightness;
    private int Duration;
    private int volume;

    public Video(String Title, int Brightness, int Duration, int volume) {
        super(Title);
        this.Brightness = Brightness;
        this.Duration = Duration;
        this.volume = volume;
    }

    @Override
    public void play() {
        String volume = "1";

        for (int i = 0; i < this.volume; i++) {
            volume += "!";
        }
        for (int i = 0; i < this.Duration; i++) {
            volume += "!";
            System.out.println();
        }

    }


    @Override
    public void Brightness() {

    }


}
