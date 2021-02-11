package entrega5;

import static entrega5.generadordcontraseñas.*;

public class Mayusculas {
    public static String getPasswordmay() {

    return getPasswordmay(8);
}

    public static String getPasswordmay(int length) {

        return getPasswordmay(mayusculas, slider.getValue());
    }

    public static String getPasswordmay(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }

}
