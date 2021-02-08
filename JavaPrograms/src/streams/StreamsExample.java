package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	//Count the number of names starting with alphabet A in list
	//Normal way of doing
	public static void countNames() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Anjani");
		names.add("Alekhya");
		names.add("Natasha");

		int count=0;
		for(int i=0; i<names.size(); i++){
			String actualName = names.get(i);
			if(actualName.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Count of  names starting with A: " +count);
	}

	//Using stream to process list and get count of names starting with A
	public static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Anjani");
		names.add("Alekhya");
		names.add("Natasha");

		//there is no life for intermediate operation if there is no terminal operation
		//Terminal operator will execute only if intermediate operator (applies for filter) return true
		Long count = names.stream().filter(name-> name.startsWith("A")).count();   //count() is terminal operation and filter() is intermediate operation
		System.out.println(count);

		//we can also create stream compatible list instead of processing the complete list and modifying it
		//We can create Stream using Stream API
		Long cnt = Stream.of("Abhijeet","Ram","Natasha","Anjani","Alekhya").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println("Count is: "+cnt);

		//print names of array list having length greater than 4
		names.stream().filter(name->name.length()>4).forEach(i-> System.out.println(i));

		//limit result of stream
		names.stream().filter(name->name.length()>4).limit(2).forEach(i-> System.out.println(i));
	}


	public static void streamMap() {

		//print names ends with a and convert to Uppercase
		Stream.of("Abhijeet","Ram","Natasha","Anjani","Alekhya").filter(name -> name.endsWith("a")) 	//filter names ending with a
		.map(name -> name.toUpperCase())					//whenever modification is required (like Uppercase) we have to choose map method after filter
		.forEach(i-> System.out.println(i));				//map filtered results and convert to Uppercase
	}

	public static void sortStream() {
		//convert array to arrayList, print names start with A and convert to upper case and print in sorted order
		List<String> names = Arrays.asList("Abhijeet","Ram","Natasha","Anjani","Alekhya");
		names.stream().filter(name-> name.startsWith("A")).sorted().map(name -> name.toUpperCase())
		.forEach(i->System.out.println(i));

	}

	public static void mergeList() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Shyam");

		List<String> names1 = Arrays.asList("Abhijeet","Ram","Natasha","Anjani","Alekhya");
		//merge two lists
		Stream<String> mergeStream = Stream.concat(names.stream(), names1.stream());
		mergeStream.sorted().forEach(i-> System.out.println(i));		//once stream is modified we cannot use the same stream for performing operations

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		boolean result = newStream.anyMatch(name-> name.equalsIgnoreCase("Ram"));		//check whether anything is present inside our list use anyMatch()
		if(result) {
			System.out.println("Match found");
		}
		else
			System.out.println("Failed");
	}

	public static void streamCollect() {

		List<String> list = Stream.of("Abhijeet","Ram","Natasha","Anjani","Alekhya").filter(name -> name.endsWith("a"))
				.map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(list.get(0));

		//print unique nos and sort the array
		List<Integer> nums = Arrays.asList(1,2,5,9,5,6,8,2,3,7,4);
		nums.stream().distinct().sorted().forEach(i->System.out.println(i));
	}

	public static void main(String[] args) {
		//countNames();
		//streamFilter();
		//streamMap();
		//sortStream();
		//mergeList();
		streamCollect();
	}
}
