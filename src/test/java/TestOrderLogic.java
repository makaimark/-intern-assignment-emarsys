import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestOrderLogic {

    private static String file = "src/main/resources/testfile.csv";

    @Test
    public void test_getAllDestination(){
        String[] example = { "x", "y" };
        String[] example2 = { "m", "n" };
        List<String[]> list = Arrays.asList(example, example2);
        assertEquals(OrderLogic.getAllDestination(list), Arrays.asList("x", "m"));
    }

    @Test
    public void test_orderDestinations() throws IOException {
        CSVReader.setFile(file);
        List<String> list = OrderLogic.orderDestinations(CSVReader.readFromCSV());
        assertEquals(list, Arrays.asList("z", "y", "x"));
    }
}
