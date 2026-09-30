package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Ex_02 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jhon", "Daenerys", "Jeffery");
		List<String> lnames = new ArrayList<String>();

		lnames = names.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
		System.out.println(lnames);

		names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(str -> System.out.println(str));

		names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);

	}
}
