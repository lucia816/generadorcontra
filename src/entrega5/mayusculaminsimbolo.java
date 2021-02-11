package entrega5;

import static entrega5.generadordcontraseñas.*;

public class mayusculaminsimbolo {
    public static String getPasswordMms() {

        return getPasswordMms(8);
    }

    public static String getPasswordMms(int length) {

        return getPasswordMms(mayusculas + simbolo +minisculas, slider.getValue());
    }

    public static String getPasswordMms(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
