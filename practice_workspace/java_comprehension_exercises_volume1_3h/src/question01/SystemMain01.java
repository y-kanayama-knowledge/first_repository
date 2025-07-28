package question01;

public class SystemMain01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int applePrice = 100;
		String stationery = "pencil";
		
		applePrice = 200;
		stationery = "消しゴム";
		
		int bananaPrice = applePrice;
		String writingUtensils = stationery;
		
		System.out.println("りんごの値段は" + applePrice + "円です。");
		System.out.println("バナナの値段は" + bananaPrice + "円です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");
		

	}

}
