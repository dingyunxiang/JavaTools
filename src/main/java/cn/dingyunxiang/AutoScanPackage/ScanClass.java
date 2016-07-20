package cn.dingyunxiang.AutoScanPackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileFilter;
import java.util.Set;

/**
 * Created by dingyunxiang on 16/7/18.
 */
public class ScanClass {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public void doScan(String basePackage, String filePath, Set set) {

        //transfer packageName to DirName
        String packageDirName = basePackage.replace('.', '/');
        logger.info("fully text packageDirName:>>>{}", filePath + "/" + packageDirName);

        File dir = new File(filePath + "/" + packageDirName);
        if (!dir.exists() || !dir.isDirectory()) {
            logger.error("package is not exist or not a directory");
            return;
        }

        File[] dirFiles = dir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return (file.isDirectory())
                        || (file.getName().endsWith(".java"));
            }
        });

        for (File file : dirFiles) {
            if (file.isDirectory()) {
                logger.info("new file directory:>>>{}", packageDirName + "/" + file.getName());
                doScan(basePackage + "." + file.getName(), filePath, set);
            } else {
                //sub name but '.java'
                String className = file.getName().substring(0, file.getName().length() - 5);

                try {
                    logger.info("fully name of class:>>>{}", packageDirName + '/' + className);
                    set.add(Thread.currentThread().getContextClassLoader().loadClass(basePackage + '.' + className));
                } catch (Exception e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }
    }

    public void doScan(String basePackage, Set set) {
        this.doScan(basePackage, "", set);
    }



    public void doScan(Set s, String... basePackages) {
        for (String basePackage : basePackages) {
            this.doScan(basePackage, s);
        }
    }

}
