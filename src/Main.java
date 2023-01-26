import java.io.File;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.count(new File("C:\\Users\\zyh19\\IdeaProjects\\JavaHomework02Q3\\src\\News.txt"), new File("./Result.txt"));
    }
}