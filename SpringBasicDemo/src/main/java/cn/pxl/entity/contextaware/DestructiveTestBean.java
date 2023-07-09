package cn.pxl.entity.contextaware;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;

@Component
public class DestructiveTestBean {
    private File file;
    @Value("${file.path.one}")
    private String filePath;

    @PostConstruct
    public void postConstruct() throws IOException {
        System.out.println("post construct!");
        if (filePath == null) {
            throw new IllegalArgumentException("filePath must not null");
        }
//        filePath = filePath+"/create.txt";
        this.file = new File(filePath);
        boolean newFile = this.file.createNewFile();
        System.out.println("create success : " + newFile);
        System.out.println("File exists : " + file.exists());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destroy!");
        if(!this.file.delete()){
            System.err.println("failed to delete file.");
        }
        System.out.println("File exists : " + file.exists());
    }

}
