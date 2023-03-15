package restAssuredTest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class Test_POST {
	@SuppressWarnings("unchecked")
	@Test 
	public void test() {
		JSONObject re = new JSONObject();
		re.put("name", "abdul");
		re.put("job", "QA Tester");
		System.out.println(re.toJSONString());
		given().
		header("my_content","json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(re.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201);
		
		
	}

}
