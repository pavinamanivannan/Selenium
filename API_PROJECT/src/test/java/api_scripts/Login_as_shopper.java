package api_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import generic.Spec_builder_class;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.LoginAsShopper;
import utils.Get_properties;
import utils.Set_properties;

public class Login_as_shopper {
	@Test
	public void login() throws IOException
	{
		Get_properties gp = new Get_properties();
		String email = gp.get_output_property("email");
		String baseurl = gp.get("baseurl");
		String endpoint = gp.get("shopper_login_endpoint");
		String status_line = gp.get("get_status_line");
		String content = gp.get("content_type");
		
		LoginAsShopper las= new LoginAsShopper();
		las.setEmail(email);
		las.setPassword("Shopper@123");
		las.setRole("SHOPPER");
		
		ObjectMapper obj = new ObjectMapper();
		String jsonbody = obj.writeValueAsString(las);
		
		Spec_builder_class sc = new Spec_builder_class();
		RequestSpecification req = sc.request(jsonbody, content);
		ResponseSpecification res = sc.response(200, status_line, 3000l, "data.role", "SHOPPER");
		
		Response response = RestAssured.given().spec(req).when().post(baseurl+endpoint).
		then().spec(res).extract().response();
		
		JsonPath jp = new JsonPath(response.asPrettyString());
		Object token = jp.get("data.jwtToken");
		
		Set_properties sp= new Set_properties();
		sp.set("Bearer_toker", ""+token+"");
		
		
		
	}
}
