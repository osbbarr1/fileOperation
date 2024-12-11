
package util;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import model.FileDTO;

/**
 *
 * @author obaqu
 */
@XmlRootElement(name = "Files")
public class FileListWrapper {
    private List<FileDTO> fileList;
    private FileDTO file;

    public FileListWrapper() {}

    public FileListWrapper(List<FileDTO> fileList) {
        this.fileList = fileList;
    }
    
    public FileListWrapper(FileDTO fileDTO){
        this.file = fileDTO;
    }

    public FileDTO getFile() {
        return file;
    }

    public void setFile(FileDTO file) {
        this.file = file;
    }

    public List<FileDTO> getFileList() {
        return fileList;
    }

    public void setFileList(List<FileDTO> fileList) {
        this.fileList = fileList;
    }
}
