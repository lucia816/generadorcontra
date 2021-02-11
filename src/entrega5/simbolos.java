package entrega5;

import static entrega5.generadordcontraseñas.*;

public class simbolos {
    public static String getPasswords() {

        return getPasswords(8);
    }

    public static String getPasswords(int length) {

        return getPasswords(simbolo, slider.getValue());
    }

    public static String getPasswords(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
