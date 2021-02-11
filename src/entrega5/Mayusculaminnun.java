package entrega5;

import static entrega5.generadordcontraseñas.*;

public class Mayusculaminnun {
    public static String getPasswordMmnum() {

        return getPasswordMmnum(8);
    }

    public static String getPasswordMmnum(int length) {

        return getPasswordMmnum(mayusculas + numeros +minisculas, slider.getValue());
    }

    public static String getPasswordMmnum(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
