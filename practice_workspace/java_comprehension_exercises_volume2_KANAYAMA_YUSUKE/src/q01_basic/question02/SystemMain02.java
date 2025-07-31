package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member a = new Member();
		a.setName("Miura Manabu");
		a.setAge(30);
		a.setRank(1);
		a.showMember();
		a.rankUp();
	}
}
