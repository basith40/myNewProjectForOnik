package basith301.SeleniumFramework;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams {
	@Test
	public void streamTest() {
		//String [] names = {"basith","Shammi","Mahira","Mahima","Mehrab","Maisha"};
		ArrayList<String> myNames = new ArrayList<String>();
		myNames.add("Sufian");
		myNames.add("Sayeed");
		myNames.add("Lipi");
		myNames.add("Shilpi");
		Stream.of("basith","Shammi","Mahira","Mahima","Mehrab","Maisha").
		filter(s-> s.startsWith("M")).forEach(s-> System.out.println(s));
	
	
	}
	@Test
	public void test1() {
		System.out.println("hello");
	}
}
