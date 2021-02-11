package entrega5;

import static entrega5.generadordcontraseñas.*;

public class numeromayussimbolo {
    public static String getPasswordnummaysim() {

        return getPasswordnummaysim(8);
    }

    public static String getPasswordnummaysim(int length) {

        return getPasswordnunmaysim(numeros + mayusculas + simbolo, slider.getValue());
    }

    public static String getPasswordnunmaysim(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
