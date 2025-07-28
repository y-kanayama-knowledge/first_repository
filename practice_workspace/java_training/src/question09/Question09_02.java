package question09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question09_02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(reader.readLine());
		if (number >= 30) {
			System.out.println("number の値は 30 以上です");
		} else {
			System.out.println("number の値は 30 未満です");
		}
		System.out.println("処理を終了します");
	}

}
