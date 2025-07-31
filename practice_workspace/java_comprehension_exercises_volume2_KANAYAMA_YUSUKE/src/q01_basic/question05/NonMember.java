package q01_basic.question05;

public class NonMember extends AbstMember {
	public NonMember(String name) {
		super.name = name;
	}
	public void buyItem() {
		System.out.println(super.name + "  purchased the item at a fixed price");
	}
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(super.name + " is a non-member");
	}
}
