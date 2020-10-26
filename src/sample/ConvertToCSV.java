package sample;

import org.json.CDL;
import org.json.JSONException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertToCSV implements ConvertFile {
    @Override
    public void convertGivenFile(File outputfile) {

        String  CSVFormat;
        try {
            CSVFormat = CDL.toString(readFromFile.jsonArray);
            FileOutputStream outputStream = new FileOutputStream(outputfile);
            outputStream.write(CSVFormat.getBytes());
            outputStream.close();
            System.out.println("File written in csv");
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
