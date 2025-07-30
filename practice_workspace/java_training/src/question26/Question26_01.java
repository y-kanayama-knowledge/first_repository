package question26;

public class Question26_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "こんにちは";
		try {
		int num = Integer.parseInt(str);
		System.out.println("変換したら" + num + "になりました");
		} catch(NumberFormatException e) {
			System.out.println("例外が発生しました");
		}
	}

}
