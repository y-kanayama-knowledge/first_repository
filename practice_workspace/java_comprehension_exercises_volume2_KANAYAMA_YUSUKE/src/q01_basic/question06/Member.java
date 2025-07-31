package q01_basic.question06;

public class Member {
	private int id;
	private String password;
	private int age;
	private int rank;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Member() {
	}
	public Member(int id, String password, int age, int rank) {
		this.id = id;
		this.password = password;
		this.age = age;
		this.rank = rank;
	}
	public void buyItem() {
		System.out.println();
	}
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + this.id);
		System.out.println("password:" + this.password);
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}
}
