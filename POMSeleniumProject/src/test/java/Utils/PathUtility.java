package Utils;

import java.nio.file.Paths;

public class PathUtility {

	public static String GetConfigPath() {

		return Paths.get("../home/Configs/GlobalConfig.jason").toString();

	}

}
