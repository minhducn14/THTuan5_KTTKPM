package ComponentComposite;

public class Main {
    public static void main(String[] args) {
        ButtonUI btnOK = new ButtonUI("OK");
        ButtonUI btnCancel = new ButtonUI("Cancel");
        LabelUI lblMsg = new LabelUI("Are you sure you want to exit?");

        PanelUI dialog = new PanelUI("Exit Confirmation Dialog");
        dialog.add(lblMsg);
        dialog.add(btnOK);
        dialog.add(btnCancel);

        dialog.render();
        dialog.click();
    }
}
