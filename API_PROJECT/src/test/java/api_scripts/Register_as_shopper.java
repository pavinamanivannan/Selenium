package api_scripts;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import generic.Spec_builder_class;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.RegisterAsShopper;
import utils.Get_properties;
import utils.Set_properties;

public class Register_as_shopper {
	@Test
	public void register() throws IOException
	{
		String remail = "shopper"+RandomStringUtils.randomAlphanumeric(3)+"@gmail.com";//1
		
		
		RegisterAsShopper ras = new RegisterAsShopper();//2 pojo
		ras.setCity("Bangalore");
		ras.setCountry("India");
		ras.setEmail(remail);
		ras.setFirstName("Shopper");
		ras.setGender("MALE");
		ras.setLastName("A");
		ras.setPassword("Shopper@123");
		ras.setPhone(9087654321l);
		ras.setState("Karnataka");
		ras.setZoneId("ALPHA");
		
		ObjectMapper obj= new ObjectMapper();
		String jsonbody = obj.writeValueAsString(ras);
		
		Get_properties gp = new Get_properties();//convert from java to json
		String baseurl = gp.get("baseurl");
		String endpoint = gp.get("Register_as_shopper_endpoint");
		String content = gp.get("content_type");
		String line = gp.get("create_status_line");
		
		Spec_builder_class spec = new Spec_builder_class();// implementation of propertyfile
		RequestSpecification request = spec.request(jsonbody, content);
		
		ResponseSpecification response = spec.response(201, line, 30001, "data.role", "SHOPPER");
	
		Response res = RestAssured.given().spec(request).when().post(baseurl+endpoint).
		then().spec(response).extract().response();
		
		JsonPath jp = new JsonPath(res.asPrettyString());
		Object id= jp.get("data.userId");
		Object emailid= jp.get("data.email");
		
		Set_properties sp= new Set_properties();
		sp.set("Shopperid",  ""+id+"");
		sp.set("email",  ""+emailid+"");
		
	}
}
