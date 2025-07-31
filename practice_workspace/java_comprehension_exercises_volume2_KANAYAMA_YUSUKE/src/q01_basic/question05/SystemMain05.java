package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember a = new NonMember("Sato Kensuke");
		AbstMember[] b = new AbstMember[2];
		b[0] = a;
		Member c = new Member(1,"Passw0rd","Miura Manabu",28,2);
		b[1] = c;
		MemberManager.showAllMembers(b);
		b[0].buyItem();
		b[1].buyItem();
	}

}
