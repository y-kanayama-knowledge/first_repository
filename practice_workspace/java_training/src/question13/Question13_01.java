package question13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Question13_01 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(reader.readLine());
		int num2 = Integer.parseInt(reader.readLine());
		Calculator cal = new Calculator();
		int sum = cal.sum(num1, num2);
		System.out.println(sum);
		
	}

}
