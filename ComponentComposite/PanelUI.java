package ComponentComposite;

import java.util.ArrayList;
import java.util.List;

public class PanelUI implements UIComponent {
    private String name;
    private List<UIComponent> children = new ArrayList<>();

    public PanelUI(String name) {
        this.name = name;
    }

    public void add(UIComponent component) {
        children.add(component);
    }

    @Override
    public void render() {
        System.out.println("Render Panel: " + name);
        for (UIComponent component : children) {
            component.render();
        }
    }

    @Override
    public void click() {
        System.out.println("Panel clicked: " + name);
        for (UIComponent component : children) {
            component.click();
        }
    }
}
