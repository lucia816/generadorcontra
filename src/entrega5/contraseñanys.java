package entrega5;

import static entrega5.generadordcontraseñas.*;

public class contraseñanys {
    public static String getPasswordns() {
        return getPasswordns(8);
    }

    public static String getPasswordns(int length) {
        return getPasswordns( numeros+ simbolo, slider.getValue());
    }

    public static String getPasswordns(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
