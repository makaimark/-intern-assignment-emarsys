import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private static String file = "src/main/resources/holiday.csv";

    public static List<String[]> readFromCSV() throws IOException {

        List<String[]> destinationDependencies = new ArrayList<>();
        String line;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line = br.readLine()) != null) {
            String[] oneLine = line.split("=>");
            destinationDependencies.add(oneLine);
        }
        br.close();
        return destinationDependencies;
    }
}
