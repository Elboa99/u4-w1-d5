package ENTITIES;

import INTERFACES.Show;

public class Immagine extends ElementoMultimedia implements Show {
    private int brightness;

    public Immagine(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;

    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public void show() {
        System.out.println(getTitle() + " " + "!".repeat(brightness));
    }
}

