package json;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;

public class Demo {
	/**
	 * @param fileName:file to be read
	 * Files.readAllBytes(); read all the bytes from a file; return type:byte[]; arg type:Path
	 * Paths.get();Converts a path string to a PATH. for example:
	 * separator is "/" and getPath("/foo","bar","gus") is invoked,then the path string "/foo/bar/gus" is converted to a Path
	 */
	public static JSONArray parseJsonFile(String fileName) throws IOException, JSONException {
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		return new JSONArray(content);
	}
	
	public static void printJsonLevelOne(JSONObject obj) throws JSONException {
		System.out.println(obj.get("messageType"));
		System.out.println(obj.get("title"));
		System.out.println(obj.get("content"));
		System.out.println(obj.get("isStar"));
	
		if(obj.get("callDetails") !=null) {
			JSONObject jsonObjCallDetail = (JSONObject) obj.get("callDetails");
			printJsonLevelTwo(jsonObjCallDetail);
		}
		System.out.println("******************");
	}
	
	public static void printJsonLevelTwo(JSONObject obj) throws JSONException {
		System.out.println(obj.get("callTitle"));
		System.out.println(obj.get("callContent"));
		if(obj.get("transfers") !=null) {
			String[] names= {"name","duration","date"};
			printJson((JSONArray)obj.get("transfers"),names);
		}
		if(obj.get("senariaTrip") !=null) {
			String[] names= {"name","duration","date"};
			printJson((JSONArray)obj.get("senariaTrip"),names);
		}
		if(obj.get("history") !=null) {
			String[] names= {"time","type","duration"};
			printJson((JSONArray)obj.get("history"),names);
		}
		if(obj.get("comment") !=null) {
			String[] names= {""};
			printJson((JSONArray)obj.get("comment"),names);
		}
	}
	
	public static void printJson(JSONArray jsonArr,String[] jsonNames) throws JSONException {
		for(int i=0;i<jsonArr.length();i++) {
			JSONObject jsonObj = (JSONObject) jsonArr.get(i);
			printJsonContent(jsonObj,jsonNames);
		}
	}
	
	public static void printJsonContent(JSONObject obj,String[] jsonNames) throws JSONException {
		for(String s:jsonNames) {
			System.out.println(s+" : "+obj.get(s));
		}
	}
	
	public static void main(String[]args) throws IOException, JSONException {
			//parsing json
			JSONArray jsonArr = parseJsonFile("myTestData.json");
			for(int i=0;i<jsonArr.length();i++) {
				JSONObject jsonObj = ((JSONObject)jsonArr.get(i));
				if(jsonObj.get("messageType") !=null &&
						jsonObj.get("title") !=null && 
						jsonObj.get("content") !=null && 
						jsonObj.get("isStar") !=null)
				printJsonLevelOne(jsonObj);
			}
		
	}
}
