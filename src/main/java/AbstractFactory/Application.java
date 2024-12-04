package AbstractFactory;

import AbstractFactory.buttons.Button;
import AbstractFactory.checkboxs.Checkbox;
import AbstractFactory.factorys.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
