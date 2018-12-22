package json;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestGson {	
	public static void readJsonFile() {
		
	}
	public static void main(String[] args) throws IOException {
		Hub hub = new Hub(InfoType.INCOMING,"Lee","06 26 97 07 87","support","23/12/2018; 12h23",true);
		Hub hub1 = new Hub(InfoType.OUTGOING,"Thibaut","06 26 97 07 22","coming here","23/12/2018; 12h23",false);
		List<Hub> hubs = new ArrayList<>();
		hubs.add(hub);
		hubs.add(hub1);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(hubs);
		System.out.println(json);
		mapper.writeValue(new File("test.json"), hubs);
		
		String sample = "{\"messageType\":\"INCOMING\",\"title\":\"Lee\",\"subTitle\":\"06 26 97 07 87\",\"content\":\"support\",\"time\":\"23/12/2018; 12h23\",\"isStar\":true}";
		Hub testHub = mapper.readValue(sample, Hub.class);
		System.out.println(testHub.toString());
		
	}
}
