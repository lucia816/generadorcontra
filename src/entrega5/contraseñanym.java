package entrega5;

import entrega5.generadordcontraseñas.*;

import static entrega5.generadordcontraseñas.*;

public class contraseñanym {

    public static String getPasswordnl() {
        return getPasswordnl(8);
    }

    public static String getPasswordnl(int length) {
        return getPasswordnl(numeros + minisculas, slider.getValue());
    }

    public static String getPasswordnl(String key, int length) {
        String pswd = "";

        for (int i = 0; i < length; i++) {
            pswd+=(key.charAt((int)(Math.random() * key.length())));
        }

        return pswd;
    }
}
