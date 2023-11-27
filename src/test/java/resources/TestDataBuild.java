package resources;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlace;
import Pojo.Location;

public class TestDataBuild {
	
	public AddPlace addplacePayLoad(String name, String language, String address)
	{
AddPlace p = new AddPlace();
		
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("https://rahulshettyacademy.com");
		
		List<String> mystring = new ArrayList<String>();
		mystring.add("shoe park");
		mystring.add("shop");
		
		p.setTypes(mystring);
		
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		return p;
		
	}
	
	public String deletePlacePayLoad(String placeId)
	{
		return "{\r\n \"place_id\": \""+placeId+"\"\r\n}";
	}


}
