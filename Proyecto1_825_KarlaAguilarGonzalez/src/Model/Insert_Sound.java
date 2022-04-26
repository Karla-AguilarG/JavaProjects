package Model;

import java.applet.AudioClip;

/**
 *
 * @author Karla Bricelda Aguilar González
 */

public class Insert_Sound {

    AudioClip sonido;

    public Insert_Sound() {
    }

    //Le damos play para escuchar el sonido del programa
    public void playMusic(String MySonido) {
        sonido = java.applet.Applet.newAudioClip(getClass().getResource(MySonido));
        sonido.loop();
    }

    //Paramos el sonido del programa
    public void stopMusic(String MySonido) {
        sonido.stop();
    }
}
