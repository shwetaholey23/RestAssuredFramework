package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileAndEnv {

	public static Map<String, String> fileAndEnv = new HashMap<String, String>();

	public static Properties propMain = new Properties();

	public static Properties propPreSet = new Properties();

	
	public static Map<String, String> envAndFile() {
		
		String environment = System.getProperty("env");

		try {
			if (environment.equalsIgnoreCase("dev")) {
				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");

				propMain.load(fisDev);

				fileAndEnv.put("serverUrl", propMain.getProperty("serverUrl"));

				fileAndEnv.put("portNo", propMain.getProperty("portNo"));

				fileAndEnv.put("userName", propMain.getProperty("userName"));

				fileAndEnv.put("password", propMain.getProperty("password"));
			}

			else if (environment.equalsIgnoreCase("qa")) {
				FileInputStream fisQa = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");

				propMain.load(fisQa);

				fileAndEnv.put("serverUrl", propMain.getProperty("serverUrl"));

				fileAndEnv.put("portNo", propMain.getProperty("portNo"));

				fileAndEnv.put("userName", propMain.getProperty("userName"));

				fileAndEnv.put("password", propMain.getProperty("password"));
			}
			
			
			else if (environment.equalsIgnoreCase("stage")) {
				FileInputStream fisStage = new FileInputStream(System.getProperty("user.dir") + "/inputs/stage.properties");

				propMain.load(fisStage);

				fileAndEnv.put("serverUrl", propMain.getProperty("serverUrl"));

				fileAndEnv.put("portNo", propMain.getProperty("portNo"));

				fileAndEnv.put("userName", propMain.getProperty("userName"));

				fileAndEnv.put("password", propMain.getProperty("password"));
			}
		} catch (Exception e) {

		}

		return fileAndEnv;

	}
	
	
	public static Map<String, String> getConfigReader()
	{
		
		if(fileAndEnv==null)
		{
			fileAndEnv=envAndFile();
		}
		return fileAndEnv;
		
	}

}
