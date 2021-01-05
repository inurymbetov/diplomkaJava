package inurymbetov.com.github.diplomka;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class InfoList {
    private List<String> info = new ArrayList<>();

    InfoList(String name, String login, String phone, String password){
        this.info.add(name);
        this.info.add(login);
        this.info.add(phone);
        this.info.add(password);
    }

    public InfoList(JFrame frame, List<Component> componentList){
        componentList.forEach(frame::add);
    }

    public void printInfo(){
        System.out.println(info.get(0));
        System.out.println(info.get(1));
        System.out.println(info.get(2));
        System.out.println(info.get(3));
    }
}
