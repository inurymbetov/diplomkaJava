package inurymbetov.com.github.diplomka;

import inurymbetov.com.github.diplomka.Form.Registration;

import java.util.HashMap;

public class Main {

    private static HashMap<String, String> userInfo;
    private static Registration registration;

    public static void main(String[] args) {
         userInfo = new HashMap<>();
         userInfo.put(Const.LOGIN, Const.PASS);

         registration = new Registration();
    }
}
