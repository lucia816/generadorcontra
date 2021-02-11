package entrega5;

import static entrega5.generadordcontraseñas.*;

public class contraseñanumeroymayusculas {
    public static String getPasswordnM() {
        return getPasswordnM(8);
    }

    public static String getPasswordnM(int length) {
        return getPasswordnM( numeros+mayusculas, slider.getValue());
    }

    public static String getPasswordnM(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
