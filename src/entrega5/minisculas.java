package entrega5;

import static entrega5.generadordcontraseñas.*;

public class minisculas {
    public static String getPasswordmin() {

        return getPasswordmin(8);
    }

    public static String getPasswordmin(int length) {

        return getPasswordmin(minisculas, slider.getValue());
    }

    public static String getPasswordmin(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
