package sample;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;

public class Controller {
    @FXML
    Text chooseFile;
    @FXML
    CheckBox XML, JSON, CSV;
    File file;

    strategy stat = new strategy();

    public void chooseFile()
    {
        FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(null);

        if(file!=null)
        {
            try {
                readFromFile.readDataFromFile(file);
                chooseFile.setText(file.getName());
            } catch (FileNotFoundException e) {
                chooseFile.setText("Can't read file!");
            }
        }

    }

    public void convert() throws Exception {
        if(file == null){
            return ;
        }
        if(XML.isSelected()){
            stat.convert(new ConvertXML(), file, "xml");
        }
        if(JSON.isSelected()){
            stat.convert(new ConvertJson(), file, "json");
        }
        if(CSV.isSelected()) {
            stat.convert(new ConvertToCSV(),file,"csv");
        }

        chooseFile.setText("Converted");
    }
}
