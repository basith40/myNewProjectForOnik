package restAssuredTest;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test01_GET {
	@Test
	public void test1() {
		Response resp = get("https://reqres.in/api/users?page=2");
		System.out.println(resp.asString());
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getHeader("content-type"));
		System.out.println(resp.getTime());
		int testStatus = resp.getStatusCode();
		Assert.assertEquals(testStatus, 200);
		
	}
	@Test
	public void test2() {
		given()
		    .get("https://reqres.in/api/users?page=2")
		.then()
		    .statusCode(200)
		    .body("data.id[0]",equalTo(7));
		
	}

}
