package ENTITIES;

import INTERFACES.Play;

import java.util.Scanner;

public class Registrazione extends ElementoMultimedia implements Play {

    Scanner scanner = new Scanner(System.in);
    /* ATTRIBUTI*/
    private int volume;
    private int duration;


    /* COSTRUTTORI*/
    public Registrazione(String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }

    // 3- Metodi
    public void alzaVolume() {
        System.out.println("Insert new Volume number");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > 0 && valoreVolume > this.volume) {
            setVolume(valoreVolume);
        } else {
            System.out.println("Can't Turn up the volume, please Try Again");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }
    }

    public void abbassaVolume() {
        System.out.println("Insert new Volume number");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > 0 && valoreVolume < this.volume) {
            setVolume(valoreVolume);
        } else {
            System.out.println("Can't turn down the volume, please try again:");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(getTitle() + " " + "!".repeat(volume));
        }
    }
}











