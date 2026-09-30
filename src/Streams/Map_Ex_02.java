package Streams;

import java.util.Arrays;
import java.util.List;

public class Map_Ex_02 {
	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

// before java8/without using streams
		for (String name : vehicles) {
			System.out.println(name.length());
		}

		System.out.println();
		
// using streams
		vehicles.stream().map(vname -> vname.length()).forEach(len -> System.out.println(len));
		System.out.println();
		vehicles.stream().map(vname -> vname.length()).forEach(System.out::println);

	}
}
