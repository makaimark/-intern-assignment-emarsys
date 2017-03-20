import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<String> destinations = CSVReader.readFromCSV();
            System.out.println(destinations);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
