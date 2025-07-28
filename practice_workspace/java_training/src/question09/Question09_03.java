package question09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question09_03 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(reader.readLine());
		if (score >= 80) {
			System.out.println("テストの点数は優秀です");
		}  else if(score < 80 && score >= 50) {
			System.out.println("テストの点数は平均的です");
		} else if(score < 50 && score >= 30) {
			System.out.println("テストの点数が及第です ");
		} else {
			System.out.println("赤点のため追試が必要です");
		}
		System.out.println("お疲れ様でした");
	}

}
