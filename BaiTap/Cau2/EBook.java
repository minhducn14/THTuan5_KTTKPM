package BaiTap.Cau2;

public class EBook implements Book {
    private String title;

    public EBook(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
