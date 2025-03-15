package TaskObserve;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Fix Bug #123", "Open");

        TeamMember alice = new TeamMember("Alice");
        TeamMember bob = new TeamMember("Bob");

        task.attach(alice);
        task.attach(bob);

        task.setStatus("In Progress");
        task.setStatus("Code Review");

        task.detach(alice);

        task.setStatus("Completed");
    }
}
