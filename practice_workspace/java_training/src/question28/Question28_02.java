package question28;

public class Question28_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int NUM;
		NUM = 5 * 6;
		int MESSAGE_NO = 0;
		String str[] = { "30以上50未満", "25以上30未満" };

		if (MESSAGE_NO == 0) {
			if (NUM >= 30 && NUM < 50) {
				System.out.println(str[MESSAGE_NO]);
			}
		} else if (MESSAGE_NO == 1) {
			if (NUM >= 25 && NUM < 30) {
				System.out.println(str[MESSAGE_NO]);
			}
		}

		System.out.println("処理を終了します");
	}

}
