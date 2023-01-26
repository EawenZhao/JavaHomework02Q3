import java.io.File;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.count(new File("src/News.txt"), new File("src/Result.txt"));
    }
}