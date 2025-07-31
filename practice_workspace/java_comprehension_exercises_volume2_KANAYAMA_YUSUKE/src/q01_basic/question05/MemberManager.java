package q01_basic.question05;

public class MemberManager {
	praivate MemberManager() {	
	}
	static void showAllMembers(AbstMember[] members) {
		for(AbstMember info : members) {
			info.showMember();
		}
	}
}
