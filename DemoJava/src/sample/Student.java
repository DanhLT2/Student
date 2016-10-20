package sample;

public class Student {

	private String id, name;
	private int age;

	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return id + "-" + name + "--" + age;
	}
	public void ininin()
	{
		System.out.format("%-10s %-10s %-10d\n", id,name,age);
	}
}
