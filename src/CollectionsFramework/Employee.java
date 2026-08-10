package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	public int age;
	public String name;
	public int weight;

	public Employee(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Employee that) {
		// 1. Compare by age
		int ageCompare = Integer.compare(this.age, that.age);
		// 2. If ages are not equal, return the age comparison
		if (ageCompare != 0) {
			return ageCompare;
		}
		// 3. Otherwise, break the tie by comparing names
		return this.name.compareTo(that.name);
	}

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();

		emp.add(new Employee(29, "Neha", 56));
		emp.add(new Employee(26, "Priya", 58));
		emp.add(new Employee(26, "Ajinkya", 75));
		emp.add(new Employee(45, "Akash", 86));

		System.out.println("Before sorting:\n" + emp);
		Collections.sort(emp);
		System.out.println("\nAfter sorting:\n" + emp);
	}
}