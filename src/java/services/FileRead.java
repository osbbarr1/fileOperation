package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.FileDAO;
import model.FileDTO;
import util.FileListWrapper;

/**
 *
 * @author obaqu
 */
@WebService(serviceName = "FileRead")
public class FileRead {

    FileDAO dao = new FileDAO();
    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getFileUUID")
    public FileDTO getFile(@WebParam(name = "uuid") String uuid) {
        FileDTO dto = new FileDTO();
        dto.setId(1L);
        dto.setUuid("1");
        dto.setNamefile("hola oscar");
        dto.setHash("25");
        dto.setMetadata("yhnahs");
        return dao.findFile(uuid);
    }
    
    @WebMethod(operationName = "getFileList")
    public FileListWrapper getFileList() {
        return new FileListWrapper(dao.listFile());
    }
}
