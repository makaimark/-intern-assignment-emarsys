import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String[]> destinations;

        try {
            destinations = CSVReader.readFromCSV();
            OrderLogic.orderDestinations(destinations);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
