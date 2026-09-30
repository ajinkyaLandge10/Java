package Streams;

import java.util.Arrays;
import java.util.List;

//@formatter:off
class Std {
	String name;
	int score;

	Std(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

}

public class ParallelStreams_Ex_01 {
	public static void main(String[] args) {

		List<Std> studentList = Arrays.asList
			(
				new Std("David", 82),
				new Std("Bob", 90),		
				new Std("John", 65),
				new Std("Canedy", 55),
				new Std("Eric", 85),
				new Std("Smith", 88),
				new Std("Scott", 50)
			);

		// using stream() - sequencial
		studentList.stream().filter(s -> s.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));

		// parallel stream
		studentList.parallelStream().filter(s -> s.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));

		// convert steam() --> parallelStream()
		// parallel()
		studentList.stream().parallel().filter(s -> s.getScore() >= 80).limit(3)
				.forEach(stu -> System.out.println(stu.getName() + " " + stu.getScore()));

	}
}
