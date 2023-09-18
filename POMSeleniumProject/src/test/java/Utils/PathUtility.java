package Utils;

import java.nio.file.Paths;

public class PathUtility {

	private static String projPath = System.getProperty("user.dir");
	
	public static String GetConfigFilePath() {
		return Paths.get(projPath, "src", "test", "java", "Configs", "GlobalConfig.jason").toString();

	}
	
	public static String GetTestDataFilePath() {
		return Paths.get(projPath, "src", "test", "java", "TestData", "TestCasesData.jason").toString();

	}

}
