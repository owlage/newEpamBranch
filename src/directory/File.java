package directory;

import java.util.ArrayList;
import java.util.List;

public class File{

    private String nameFile;
    private List<TextFile> textFileList = new ArrayList<>();

    public File(String nameFile) {
        this.nameFile = nameFile;
        textFileList.add(new TextFile());
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
}
