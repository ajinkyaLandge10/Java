package CollectionsFramework;
//@formatter:off
import java.util.HashSet;
import java.util.Objects;

// Dealing with Custom Object in case of Set by using HashCode and equals  
public class Student {
	public int rollNo;
	public String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		Student s1 = new Student(1,"Neha");
		Student s2 = new Student(1,"Neha");
		Student s3 = new Student(1,"Neha");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);

	}

}
