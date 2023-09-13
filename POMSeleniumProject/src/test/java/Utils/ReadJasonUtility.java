package Utils;

import java.io.FileReader;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class ReadJasonUtility {
	
	
	public static String GetValueForKey(String key) {
		
		JSONParser parser = new JSONParser();
		String value = null;
		try {
			Object obj = parser.parse(new FileReader("F:\\JWS\\POMSeleniumProject\\POMSeleniumProject\\src\\test\\java\\Configs\\GlobalConfig.jason"));
			JSONObject jsonObject = (JSONObject) obj;
			value = (String) jsonObject.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}
}
