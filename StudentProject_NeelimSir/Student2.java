package com.technoelevte.assignments.studentproject.byneelimsir;


import java.util.Comparator;

public class Student2 {
	int id;
	String name;
	int per;
	long mobileNomber;
	String gender;
	int age;

	public Student2(int id, String name, int per, long mobileNomber, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		this.mobileNomber = mobileNomber;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPer() {
		return per;
	}

	public long getMobileNomber() {
		return mobileNomber;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public static Comparator<Student2> IdCom = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			int id = o1.getId();
			int id2 = o2.getId();
			return id - id2;
		}

	};
	public static Comparator<Student2> NameCom = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			String name1 = o1.getName();
			String name2 = o2.getName();
			return name1.compareTo(name2);
		}

	};
	public static Comparator<Student2> NameGen = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			String gen1 = o1.getGender();
			String gen2 = o2.getGender();
			return gen1.compareTo(gen2);
		}

	};
	public static Comparator<Student2> perCom = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			int id = o1.getPer();
			int id2 = o2.getPer();
			return id - id2;
		}

	};
	public static Comparator<Student2> ageCom = new Comparator<Student2>() {

		@Override
		public int compare(Student2 o1, Student2 o2) {
			int id = o1.getAge();
			int id2 = o2.getAge();
			return id - id2;
		}

	};

	@Override
	public String toString() {

		return "id=" + id + ", name=" + name + ", per=" + per + ", mobileNomber=" + mobileNomber + ", gender=" + gender
				+ ", age=" + age + "\n";
	}

}
