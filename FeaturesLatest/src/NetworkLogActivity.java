import java.util.Optional;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v108.network.Network;

public class NetworkLogActivity {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// log file ->
		DevTools devTools = ((HasDevTools) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.requestWillBeSent(), request ->

		{
			org.openqa.selenium.devtools.v108.network.model.Request req = request.getRequest();
			System.out.println(req.getUrl());
			// req.getHeaders()

		});

		// Event will get fired-
		devTools.addListener(Network.responseReceived(), response ->

		{
			org.openqa.selenium.devtools.v108.network.model.Response res = response.getResponse();
			System.out.println(res.getUrl());
			System.out.println(res.getStatus());
			if (res.getStatus().toString().startsWith("4")) {
				System.out.println(res.getUrl() + "is failing with status code" + res.getStatus());
			}
		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();

	}

}
