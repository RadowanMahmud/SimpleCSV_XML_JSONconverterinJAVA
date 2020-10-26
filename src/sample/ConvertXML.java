package sample;

import org.json.CDL;
import org.json.JSONException;
import org.json.XML;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConvertXML implements ConvertFile {
    @Override
    public void convertGivenFile(File outputfile) {
        String  XMLFormat;
        try {
            XMLFormat = XML.toString(readFromFile.jsonArray);
            FileOutputStream outputStream = new FileOutputStream(outputfile);
            outputStream.write(XMLFormat.getBytes());
            outputStream.close();
            System.out.println("File written in xml");
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
