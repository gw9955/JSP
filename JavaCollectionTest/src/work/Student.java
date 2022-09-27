package work;

public class Student implements Comparable<Student> {
	private String num;
	private String name;
	private int guk;
	private int young;
	private int math;
	private int sum;
	private int rank;

	public Student(String num, String name, int guk, int young, int math) {
		this.num = num;
		this.name = name;
		this.guk = guk;
		this.young = young;
		this.math = math;

		this.sum = guk + young + math;

	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGuk() {
		return guk;
	}

	public void setGuk(int guk) {
		this.guk = guk;
	}

	public int getYoung() {
		return young;
	}

	public void setYoung(int young) {
		this.young = young;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", guk=" + guk + ", young=" + young + ", math=" + math
				+ ", sum=" + sum + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Student stl) {
		return this.getNum().compareTo(stl.getNum());
	}
}
