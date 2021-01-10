package inurymbetov.com.github.diplomka.Form;

import inurymbetov.com.github.diplomka.Command;
import inurymbetov.com.github.diplomka.InfoList;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

@Slf4j
public class Registration implements ActionListener, Command {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(clear.getActionCommand())) clear();
        if (e.getActionCommand().equals(send.getActionCommand())) send();
    }

    private JFrame frame                = new JFrame();

    private JButton send                = new JButton("send");
    private JButton clear               = new JButton("clear");

    private JTextField nameF            = new JTextField();
    private JTextField nameS            = new JTextField();
    private JTextField login            = new JTextField();
    private JTextField phone            = new JTextField();
    private JPasswordField password     = new JPasswordField();

    private JLabel titleLabel           = new JLabel("Registration");

    public Registration(){

        titleLabel.setBounds            (180, 120, 140 ,40);

        nameF.setBounds                 (60,220,180,40);
        nameS.setBounds                 (260,220,180,40);
        login.setBounds                 (60, 301, 380, 39);
        phone.setBounds                 (60, 380, 380, 39);
        password.setBounds              (60,460,380,39);

        send.setBounds                  (60,540,180,40);
        send.addActionListener          (this);
        clear.setBounds                 (260,540,180,40);
        clear.addActionListener         (this);

        frame.setDefaultCloseOperation  (JFrame.EXIT_ON_CLOSE);
        frame.setSize                   (500, 800);
        frame.setLayout                 (null);
        frame.setVisible                (true);

        addFrame(frame, Arrays.asList(nameF, nameS, login, phone, password, send, clear, titleLabel));
    }

    private void clear(){
        nameF.setText("");
        nameS.setText("");
        login.setText("");
        phone.setText("");
        password.setText("");
    }

    private void send(){
        InfoList infoList = new InfoList((nameF.getText() + " " + nameS.getText()), login.getText(), phone.getText(), String.valueOf(password.getText()));
        infoList.printInfo();
    }
}
