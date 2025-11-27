package api_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Spec_builder_class;
import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;
import utils.Get_properties;

public class Get_shopper {
	@Test
	public void get_shopper() throws IOException
	{
		Get_properties gp= new Get_properties();
		String token = gp.get_output_property("Bearer_toker");
		String baseurl = gp.get("baseurl");
		String status_line = gp.get("get_status_line");
		String endpoint = gp.get("fetch_shopper_data_endpoint");
		String id = gp.get_output_property("Shopperid");
		
		Spec_builder_class sp = new Spec_builder_class();
		ResponseSpecification response = sp.response(200, status_line, 3000l, "message", "Success");
		
		RestAssured.given().relaxedHTTPSValidation().auth().oauth2(token).pathParam("shopperId", id).
		when().get(baseurl+endpoint).then().spec(response).log().all();
		
	}
}
