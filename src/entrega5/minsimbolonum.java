package entrega5;

import static entrega5.generadordcontraseñas.*;
import static entrega5.generadordcontraseñas.slider;

public class minsimbolonum {
    public static String getPasswordmns() {

        return getPasswordmns(8);
    }

    public static String getPasswordmns(int length) {

        return getPasswordmns(simbolo + numeros +minisculas, slider.getValue());
    }

    public static String getPasswordmns(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
