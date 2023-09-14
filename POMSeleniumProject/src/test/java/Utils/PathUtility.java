package Utils;

import java.nio.file.Paths;

public class PathUtility {

	public static String GetConfigFilePath() {
		String projpath = System.getProperty("user.dir");
		return Paths.get(projpath.toString(), "src", "test", "java", "Configs", "GlobalConfig.jason").toString();

	}
	
	public static String GetTestDataFilePath() {
		String projpath = System.getProperty("user.dir");
		return Paths.get(projpath.toString(), "src", "test", "java", "TestData", "TestCasesData.jason").toString();

	}

}
