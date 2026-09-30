package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {

		List<String> vehiclesList = Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");

		// distinct
		List<String> distinctVehicles = vehiclesList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles); // [bus, car, bycle, bike]
		vehiclesList.stream().distinct().forEach(value -> System.out.println(value));

		// count
		long count = vehiclesList.stream().distinct().count();
		System.out.println(count); // 4

		// limit()
		List<String> limitedVehicleslist = vehiclesList.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited Vehicles:" + limitedVehicleslist);
		vehiclesList.stream().limit(3).forEach(value -> System.out.println(value));

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// count()
		long numberOfEvenNumbers = numbersList.stream().filter(num -> num % 2 == 0).count();
		System.out.println(numberOfEvenNumbers);

		// min()
		Optional<Integer> min = numbersList.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(min.get());

		// max()
		Optional<Integer> max = numbersList.stream().max((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(max.get());

		List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

		// reduce()
		Optional<String> reduced = stringList.stream().reduce((value, combinedvalue) -> {
			return combinedvalue + value;
		});
		System.out.println(reduced.get());

		Object arr[] = stringList.stream().toArray();
		System.out.println(arr.length);
		for (Object o : arr) {
			System.out.println(o);
		}

		// Integers
		List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
		List<Integer> sortedlist = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist); // Ascending order

		List<Integer> reversesortedlist = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedlist);// Descending order/reverse

		// Strings
		List<String> list2 = Arrays.asList("John", "Mary", "Kim", "David", "Smith");

		List<String> sortedlist2 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist2);

		List<String> reversesortedlist2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedlist2);

		Set<String> fruites = new HashSet<String>();

		fruites.add("One apple");
		fruites.add("One mango");
		fruites.add("Two apples");
		fruites.add("More grapes");
		fruites.add("Two guavas");

		// anyMatch()
		boolean result = fruites.stream().anyMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);// true

		// allMatch()
		result = fruites.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);// false

		// noneMatch()
		result = fruites.stream().noneMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);// false

		// findAny()
		List<String> stringList1 = Arrays.asList("one", "two", "three", "one");
		List<String> stringList11 = Arrays.asList();
		Optional<String> ele1 = stringList1.stream().findAny();
		System.out.println(ele1.get());// one //NoSuchElementException

		// findFirst()
		List<String> stringList2 = Arrays.asList("one", "two", "three", "one");
		List<String> stringList22 = Arrays.asList();
		Optional<String> ele2 = stringList.stream().findFirst();
		System.out.println(ele2.get()); // one //NoSuchElementException

		List<String> animalsList = Arrays.asList("Dog", "Cat", "Elephant");
		List<String> birdsList = Arrays.asList("peackock", "parrot", "Crow");

		Stream<String> stream1 = animalsList.stream();
		Stream<String> stream2 = birdsList.stream();

		List<String> finallist = Stream.concat(stream1, stream2).collect(Collectors.toList());

		for (String item : finallist) {
			System.out.println(item);
		}
	}
}
