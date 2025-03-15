package ComponentComposite;

public class LabelUI implements UIComponent {
    private String text;

    public LabelUI(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Render Label: " + text);
    }

    @Override
    public void click() {
        System.out.println("Label clicked (no action): " + text);
    }
}
