package Utils;

import java.io.FileReader;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class ReadJasonUtility {

	private static String GetValueForKeyFromJson(String key, String fileName) {

		JSONParser parser = new JSONParser();
		Object obj = null;
		String value = null;
		try {
			
			if(fileName.contains("GlobalConfig"))
			{
			 obj = parser.parse(new FileReader(PathUtility.GetConfigFilePath()));
			}
			else if(fileName.contains("TestCasesData"))
			{
				 obj = parser.parse(new FileReader(PathUtility.GetTestDataFilePath()));
			}
			JSONObject jsonObject = (JSONObject) obj;
			value = (String) jsonObject.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}

	public static String GetValueFromConfig(String key) {

		return GetValueForKeyFromJson(key, "GlobalConfig");

	}

	public static String GetValueFromTestData(String key) {

		return GetValueForKeyFromJson(key, "TestCasesData");

	}

}
