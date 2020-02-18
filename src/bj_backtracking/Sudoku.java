package bj_backtracking;

//BOJ 2580
import java.util.ArrayList;
import java.util.Scanner;

class xy {
	int x, y;
	
	public xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Sudoku {

	public static int[][] sudokuboard = new int[9][9];
	public static int x, y;
	public static ArrayList<xy> arr = new ArrayList<>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudokuboard[i][j] = sc.nextInt();
				if (sudokuboard[i][j] == 0) {
					arr.add(new xy(i, j));
				}
			}
		}
		
		resolve(arr, 0);
	}

	public static void resolve(ArrayList<xy> node, int index) {
		if (index == arr.size()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(sudokuboard[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}

		for (int i = 1; i < 10; i++) { // 1~9 ���� �������� ������ �˻��ϱ� ���� �ݺ�

			// ������ ���ڸ� ���� ���� 3���� üũ �޼ҵ忡 �����Ͽ� �˻�
			if (checkRow(arr, index, i) == true && checkCol(arr, index, i) == true && checkBox(arr, index, i) == true) {

				sudokuboard[arr.get(index).x][arr.get(index).y] = i;
				resolve(arr, index + 1);
			}

			// i�� 9��ä�� �ݺ����� ����ǰ� �Ǹ� ������ ����Ǿ��� ��ȣ�� ���� �� ���ο� ������ ���� ����
			if (i == 9)
				sudokuboard[arr.get(index).x][arr.get(index).y] = 0;

		}

	}

	// �������� ��ĭ�� ���ԵǾ� �ִ� �����࿡ �ߺ��˻�
	static boolean checkRow(ArrayList<xy> arr, int idx, int pro) {

		for (int i = 0; i < 9; i++) { // �������� 0~8�� �ε����� �˻�
			if (arr.get(idx).y == i)
				continue; // ��ĭ�� ���� �ǳʶڴ�.

			// �ĺ��� ���� �� ������ �̹� ������ �ǿ� �����ϴ� ���ڿ� ��ġ�ϸ�
			// �������� ���� �����̹Ƿ� false ����
			if (sudokuboard[arr.get(idx).x][i] == pro)
				return false;
		}
		return true;
	}

	// �������� ��ĭ�� ���ԵǾ� �ִ� ���ο��� �ߺ��˻�
	static boolean checkCol(ArrayList<xy> arr, int idx, int pro) {

		for (int i = 0; i < 9; i++) { // ���� ���� 0~8�� �ε����� �˻�
			if (arr.get(idx).x == i)
				continue; // ��ĭ�� ���� �ǳʶڴ�.

			// �ĺ��� ���� �� ������ �̹� ������ �ǿ� �����ϴ� ���ڿ� ��ġ�ϸ�
			// �������� ���� �����̹Ƿ� false ����
			if (sudokuboard[i][arr.get(idx).y] == pro)
				return false;
		}
		return true;
	}

	// �������� ��ĭ�� ���ԵǾ� �ִ� 3x3�ڽ��� �ߺ��˻�
	static boolean checkBox(ArrayList<xy> arr, int idx, int pro) {

		// (0,0)�� ��ĭ�� ���, (0,0) ~ (2,2)�� �˻��ؾ� �Ѵ�.
		// (1,4)�� ��ĭ�� ���, (0,3) ~ (2,5)�� �˻��ؾ� �Ѵ�.
		// �� ��ǥ�� 3���� ���� �� �� *3�� ���ָ� �ش� ��ǥ�� ���� �ڽ��� �������� ���´�.
		int a = arr.get(idx).x / 3;
		int b = arr.get(idx).y / 3;
		a *= 3;
		b *= 3;

		// 3x3ũ���� �ڽ��̹Ƿ� ���������� ���� +3���� ���� ��츸�� �ݺ�
		for (int i = a; i < a + 3; i++) {
			for (int j = b; j < b + 3; j++) {
				// �� ĭ�� ��ǥ�� ��ŵ�Ѵ�.
				if (i == arr.get(idx).x && j == arr.get(idx).y)
					continue;
				// �ĺ��� ���� �� ������ �̹� ������ �ǿ� �����ϴ� ���ڿ� ��ġ�ϸ�
				// �������� ���� �����̹Ƿ� false ����
				if (sudokuboard[i][j] != 0 && sudokuboard[i][j] == pro)
					return false;
			}
		}
		return true;

	}
}
