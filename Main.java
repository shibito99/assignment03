package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<String, String> employeeMap = new HashMap<>();
		
		employeeMap.put("鈴木", "営業課");
		employeeMap.put("田中", "経理課" );
		employeeMap.put("山田", "総務課");
		
		for(Map.Entry<String, String> entry :employeeMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("従業員名: " + key + ", 所属課: " + value);
		}
		
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("従業員名を入力してください。");
			String inputKey  = scanner.nextLine();
		
			try {
				String value = employeeMap.get(inputKey);
				if (value == null) {
					 throw new RuntimeException("キーが見つかりません: " + inputKey);
				}
	            System.out.println("キー " + inputKey + " に対応する値は " + value + " です。");
			 } catch (RuntimeException e) {
		            System.out.println(e.getMessage());
		        } finally {
		            scanner.close();
		        }
	}
}