package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertJson implements ConvertFile {
    @Override
    public void convertGivenFile(File outputfile) {
        String json;
        json=readFromFile.jsonArray.toString();
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(outputfile);
            outputStream.write(json.getBytes());
            outputStream.close();
            System.out.println("File written in json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
