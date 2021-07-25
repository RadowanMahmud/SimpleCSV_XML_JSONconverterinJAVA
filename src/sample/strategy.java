package sample;

import java.io.File;

public class strategy {
    public void convert(ConvertFile i,File file,String extension){
        i.convertGivenFile(new File(file.getAbsolutePath() + "_output."+extension));
    }
}
