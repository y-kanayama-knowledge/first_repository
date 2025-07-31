package question27;

import java.util.ArrayList;
import java.util.List;

public class Question27_02 {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("イヌ");
		animals.add("クマ");
		animals.add("フクロウ");

		System.out.println("動物は[" + animals.get(0) + "," + animals.get(2) + "]がいます。");
	}
}
