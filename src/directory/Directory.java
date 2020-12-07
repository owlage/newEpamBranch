package directory;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String nameDir;
    private List<File> fileList;

    public Directory(String nameDir) {
        this.nameDir = nameDir;
        fileList = new ArrayList<>();
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
