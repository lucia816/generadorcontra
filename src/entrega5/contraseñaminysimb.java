package entrega5;

import static entrega5.generadordcontraseñas.*;

public class contraseñaminysimb {
    public static String getPasswordsm() {
        return getPasswordsm(8);
    }

    public static String getPasswordsm(int length) {
        return getPasswordsm(minisculas + simbolo, slider.getValue());
    }

    public static String getPasswordsm(String key, int length) {
        String contraseña = "";

        for (int i = 0; i < length; i++) {
            contraseña+=(key.charAt((int)(Math.random() * key.length())));
        }

        return contraseña;
    }
}
