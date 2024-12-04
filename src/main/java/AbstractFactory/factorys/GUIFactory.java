package AbstractFactory.factorys;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxs.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
