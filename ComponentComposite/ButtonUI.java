package ComponentComposite;

public class ButtonUI implements UIComponent {
    private String label;

    public ButtonUI(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Render Button: " + label);
    }

    @Override
    public void click() {
        System.out.println("Button clicked: " + label);
    }
}
