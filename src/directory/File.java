package directory;

import java.util.ArrayList;
import java.util.List;

public class File{

    private String nameFile;
    private List<TextFile> textFileList;

    public File(String nameFile) {
        this.nameFile = nameFile;
        textFileList = new ArrayList<>();
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public List<TextFile> getTextFileList() {
        return textFileList;
    }

    public void setTextFileList(List<TextFile> textFileList) {
        this.textFileList = textFileList;
    }

    public void showTextFile(){
        int i = 0;
        for (TextFile textFile:textFileList) {
            System.out.println(textFile.getNameTextFile() + " [" + i++ + "]");
        }
    }
}
