import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileCustomerWriter {
    public void create(String fileName, List<String> stringList) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (String s : stringList) {
                fileWriter.write(s + "\n");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
