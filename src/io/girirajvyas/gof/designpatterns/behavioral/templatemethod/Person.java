package io.girirajvyas.gof.designpatterns.behavioral.templatemethod;

public class Person implements Comparable<Person> {

	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person person) {
		if (this.age > person.getAge()) {
			return 1;
		}

		if (this.age < person.getAge()) {
			return -1;
		}

		return 0;
	}
}
