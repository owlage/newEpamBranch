package directory;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String nameDir;
    private List<File> fileList = new ArrayList<>();

    public Directory(String nameDir) {
        this.nameDir = nameDir;
        fileList.add(new File("FILE"));
    }

    public String getNameDir() {
        return nameDir;
    }

    public void setNameDir(String nameDir) {
        this.nameDir = nameDir;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }
}
