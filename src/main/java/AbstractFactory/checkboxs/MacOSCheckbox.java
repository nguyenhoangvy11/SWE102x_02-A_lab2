package AbstractFactory.checkboxs;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
