package entrega5;

import static entrega5.generadordcontraseñas.*;

public class contraseñaletraM {
    public static String getPasswordmM() {
        return getPasswordmM(8);
    }

    public static String getPasswordmM(int length) {
        return getPasswordmM( minisculas+ mayusculas, slider.getValue());
    }

    public static String getPasswordmM(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
