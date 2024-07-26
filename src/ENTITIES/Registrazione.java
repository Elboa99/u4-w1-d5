package ENTITIES;

import INTAERFACES.Play;

import java.util.Scanner;

public class Registrazione extends ElementoMultimedia implements Play {

    Scanner scanner = new Scanner(System.in);
    /* ATTRIBUTI*/
    private int volume;
    private int duration;



    /*METODO*/


    /* COSTRUTTORI*/
    public Registrazione(String title, int volume, int duration) {
        super(title);
        this.volume = volume;
        this.duration = duration;
    }

    // 3- Metodi
    public void alzaVolume() {
        System.out.println("Inserire nuovo valore volume");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > 0 && valoreVolume > this.volume) {
            setVolume(valoreVolume);
        } else {
            System.out.println("Impossibile alzare il volume, prego inserire valore corretto:");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }
    }

    public void abbassaVolume() {
        System.out.println("Inserire nuovo valore volume");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > 0 && valoreVolume < this.volume) {
            setVolume(valoreVolume);
        } else {
            System.out.println("Impossibile abbasare il volume, prego inserire valore corretto:");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return duration;
    }

    public void setDurata(int durata) {
        this.duration = durata;
    }


    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(getTitle() + " " + "!".repeat(volume));
        }
    }
}











