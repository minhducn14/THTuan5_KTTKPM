package BaiTap.Cau2;

public class AudioBook implements Book {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
