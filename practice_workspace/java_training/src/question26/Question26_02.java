package question26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question26_02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数値を入力してください");
		String str = br.readLine();
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		}
		System.out.println("システムを終了します ");
	}

}
