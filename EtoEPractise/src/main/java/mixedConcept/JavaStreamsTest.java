package mixedConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamsTest {
	@Test
	public void nameArrays() {
		ArrayList<String>id = new ArrayList<String>();
		id.add("henna30");
		id.add("juma21");
		id.add("villa54");
		id.add("bas301");
			
	}
	@Test
	public void streamFilter() {
		ArrayList<String>id = new ArrayList<String>();
		id.add("henna30");
		id.add("juma21");
		id.add("villa54");
		id.add("bas301");
		long number = id.stream().filter(a->a.startsWith("j")).count();
		System.out.println(number);
		long ne = Stream.of("henna30","juma21","villa54","bas301").filter(a->a.startsWith("A")).count();
		System.out.println(ne);
		id.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		id.stream().filter(s->s.length()>3).limit(3).forEach(s->System.out.println(s));
	}
	@Test
	public void arrays() {
		List<String>name = Arrays.asList("Basith","Shammi","Mahira","Mahima","Mehrab","Maisha");
		name.stream().filter(s->s.startsWith("M")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	@Test
	public void streamMap() {
		Stream.of("henna30","juma21","villa54","bas301")
		.filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String>name = Arrays.asList("Basith","Shammi","Mahira","Mahima","Mehrab","Maisha");
		List<String>ba = Arrays.asList("henna30","juma21","villa54","bas301");
		ba.stream().filter(s->s.length()>4).sorted().forEach(s->System.out.println(s));
		Stream<String>newStream = Stream.concat(name.stream(), ba.stream());
		newStream.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		boolean my = newStream.anyMatch(s->s.equalsIgnoreCase("mahira"));
		Assert.assertTrue(my);
	}
	@Test
	public void streamCollect() {
		List<String>id = Stream.of("henna30","juma21","villa54","bas301")
		.filter(s->s.length()>4).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(id.get(2));
		
	}
	@Test
	public void intArrays() {
		List<Integer>number = Arrays.asList(2,1,5,3,9,4,3,1,5);
		number.stream().distinct().forEach(s->System.out.println(s));
		number.stream().sorted().collect(Collectors.toList());
		System.out.println(number.get(3));
	}

}
