import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCSVReader {

    private static String file = "src/main/resources/testfile.csv";

    @Test
    public void test_file_reader_result_length(){
        List<String[]> result = new ArrayList<>();
        CSVReader.setFile(file);
        try {
            result = CSVReader.readFromCSV();
        } catch (IOException e) {
            Assert.fail("File not found");
        }
        assertEquals(result.size(), 3);
    }

    @Test
    public void test_file_reader_result(){
        List<String[]> result = new ArrayList<>();
        CSVReader.setFile(file);
        try {
            result = CSVReader.readFromCSV();
        } catch (IOException e) {
            Assert.fail("File not found");
        }
        assertEquals(result.get(0)[0] + "=>" + result.get(0)[1], "x=>y");
    }

    @Test(expected = java.io.FileNotFoundException.class)
    public void test_invalid_file_name() throws IOException {
        CSVReader.setFile("xyz");
        CSVReader.readFromCSV();
    }
}
