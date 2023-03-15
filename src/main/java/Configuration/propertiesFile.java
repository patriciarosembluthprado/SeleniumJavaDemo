package Configuration;

import Helpers.createDriver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class propertiesFile {

    static Properties prop = new Properties();
    static String projectPath = System.getProperty("user.dir");

    public static void getEnvProperties(){
        try{
            InputStream input = new FileInputStream(projectPath + "/src/main/java/Configuration/env.properties");
            prop.load(input);
            String devURL = prop.getProperty("URL");
            createDriver.URL=devURL;

        }catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

    }
}
