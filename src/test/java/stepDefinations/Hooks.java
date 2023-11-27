package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		TestDefination t = new TestDefination();
		if(t.place_id==null)
		{
			t.add_place_payload_with("Shetty", "French", "Asia");
			t.user_calls_with_http_request("AddPlaceAPI", "POST");
			t.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
	}

}
