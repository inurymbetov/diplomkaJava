package inurymbetov.com.github.diplomka;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    private static HashMap<String, String> userInfo;
    private static Registration registration;

    public static void main(String[] args) {
         userInfo = new HashMap<>();
         userInfo.put(Const.LOGIN, Const.PASS);

         registration = new Registration();
    }
}
