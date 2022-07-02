import java.io.*;
import java.util.*;

class matrix {
	public static void main(String[] args) throws IOException {
		int rows, cols;
		int sum = 0;
		int[][] matrix;
		Scanner input = new Scanner(System.in);
	rows = input.nextInt();
		cols = input.nextInt();
		matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum = sum + matrix[i][j];
					}
		}
		System.out.println(sum);
	}
}