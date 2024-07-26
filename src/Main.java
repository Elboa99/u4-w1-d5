import ENTITIES.Registrazione;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User, set the volume of the track:");
        int volume = Integer.parseInt(scanner.nextLine());

        Registrazione registrazioneAudio = new Registrazione("Recording", volume, 15);
        registrazioneAudio.play();

        System.out.println("Wanna adjust the volume? reply with raise/lower");
        String risposta = scanner.nextLine();

        switch (risposta) {
            case "raise":
                registrazioneAudio.alzaVolume();
                registrazioneAudio.play();
                break;
            case "lower":
                registrazioneAudio.abbassaVolume();
                registrazioneAudio.play();
                break;
        }
    }
}




