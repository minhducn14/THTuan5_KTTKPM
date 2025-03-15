package BaiTap.Cau2;

public class PaperBook implements Book {
    private String title;

    public PaperBook(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Paper Book: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
