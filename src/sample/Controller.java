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
        if(XML.isSelected())
            new ConvertXML().convertGivenFile(new File(file.getAbsolutePath() + "_output.XML"));
        if(JSON.isSelected())
            new ConvertJson().convertGivenFile(new File(file.getAbsolutePath() + "_output.JSON"));
        if(CSV.isSelected())
            new ConvertToCSV().convertGivenFile(new File(file.getAbsolutePath() + "_output.CSV"));

        chooseFile.setText("Converted");
    }
}
