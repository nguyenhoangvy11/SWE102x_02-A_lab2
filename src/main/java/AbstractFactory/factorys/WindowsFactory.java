package AbstractFactory.factorys;

import AbstractFactory.buttons.Button;
import AbstractFactory.buttons.WindowsButton;
import AbstractFactory.checkboxs.Checkbox;
import AbstractFactory.checkboxs.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
