package AbstractFactory.factorys;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.MacOSButton;
import AbstractFactory.checkboxs.Checkbox;
import AbstractFactory.checkboxs.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
