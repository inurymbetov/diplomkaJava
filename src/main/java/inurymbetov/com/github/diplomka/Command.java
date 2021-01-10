package inurymbetov.com.github.diplomka;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public interface Command {

    default void addFrame(JFrame frame, List<Component> componentList){
        componentList.forEach(frame::add);
    }
}
