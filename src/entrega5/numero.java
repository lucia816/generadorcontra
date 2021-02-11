package entrega5;

import static entrega5.generadordcontraseñas.numeros;
import static entrega5.generadordcontraseñas.slider;

public class numero {
    public static String getPasswordnun() {

        return getPasswordnun(8);
    }

    public static String getPasswordnun(int length) {

        return getPasswordnun(numeros, slider.getValue());
    }

    public static String getPasswordnun(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
