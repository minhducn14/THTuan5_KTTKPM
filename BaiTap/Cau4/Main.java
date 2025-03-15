package BaiTap.Cau4;

public class Main {
    public static void main(String[] args) {
        BookNotifier notifier = new BookNotifier();
        LibraryMember member1 = new LibraryMember("Alice");
        LibraryMember member2 = new LibraryMember("Bob");

        notifier.addObserver(member1);
        notifier.addObserver(member2);

        notifier.notifyObservers("Sach moi 'Design Patterns' da co mat tai thu vien!");
    }
}
