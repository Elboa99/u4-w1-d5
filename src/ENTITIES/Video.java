package ENTITIES;

import INTERFACES.Brightness;
import INTERFACES.Play;

import java.util.Scanner;

public class Video extends ElementoMultimedia implements Brightness, Play {

    Scanner scanner = new Scanner(System.in);
    private int volume;
    private int brightness;
    private int duration;

    public Video(String title, int volume, int brightness, int duration) {
        super(title);
        this.volume = volume;
        this.brightness = brightness;
        this.duration = duration;
    }

    public void alzaVolume() {
        System.out.println("insert new volume:");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > 0 && valoreVolume > this.volume) {
            setVolume(valoreVolume);
            System.out.println("Volume raised at: " + valoreVolume);
        } else {
            System.out.println("impossible to raise the volume, try again");
        }
    }

    public void abbassaVolume() {
        System.out.println("insert new volume:");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume >= 0 && valoreVolume < this.volume) {
            setVolume(valoreVolume);
            System.out.println("volume lowered at: " + valoreVolume);
        } else {
            System.out.println("Impossible to lower the volume, try again");
        }
    }

    @Override
    public void raiseBrightness() {
        System.out.println("insert new brightness value:");
        int valoreLuminosita = Integer.parseInt(scanner.nextLine());
        if (valoreLuminosita > 0 && valoreLuminosita > this.brightness) {
            setBrightness(valoreLuminosita);
            System.out.println("Brightness raised at: " + valoreLuminosita);
        } else {
            System.out.println("Impossible to raise brightness, try again");
        }
    }

    @Override
    public void lowBrightness() {
        System.out.println("insert new brightness value:");
        int valoreLuminosita = Integer.parseInt(scanner.nextLine());
        if (valoreLuminosita >= 0 && valoreLuminosita < this.brightness) {
            setBrightness(valoreLuminosita);
            System.out.println("brightness lowered at: " + valoreLuminosita);
        } else {
            System.out.println("Impossible to lower brightness, try again");
        }
    }

    @Override
    public void brightness() {
        for (int i = 0; i < duration; i++) {
            System.out.println(getTitle() + " " + "*".repeat(brightness));
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(getTitle() + " " + "!".repeat(volume) + " " + "*".repeat(brightness));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
