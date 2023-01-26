import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Counter {
    List<String> wordsLists = new ArrayList<>();
    public void count(File txt, File res) {
        try {
            Scanner scanner = new Scanner(txt);
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                String[] words = nextLine.split(" |,|\\.|\n");
                for (String s : words) {
                    wordsLists.add(s);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            res.createNewFile();
            FileWriter writer = new FileWriter(res);
            writer.write("该篇文章的词数为" + wordsLists.size());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
