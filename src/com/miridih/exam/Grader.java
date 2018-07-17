package com.miridih.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;


public class Grader {
	public static void main(String[] args) {
		final String BF = "D:/Work/miri-exam/sample/";

		grade(new Stock(), BF + "�ֽ�����-input02.txt", BF + "�ֽ�����-output02.txt");
		grade(new RotatedRect(), BF + "ȸ���簢��-input.txt", BF + "ȸ���簢��-output.txt");
		grade(new Raster(), BF + "�����ͱ׷���-input00.txt", BF + "�����ͱ׷���output00.txt");

	}

	/**
	 * solver�� ä���� �����Ѵ�.
	 * 
	 * @param solver
	 *            ���� Ǯ�� ��ü
	 * @param inFileName
	 *            ü���� �Է� ���ϸ�
	 * @param answerFileName
	 *            ä���� ���� ���ϸ�
	 */
	static private void grade(Solver solver, String inFileName, String answerFileName) {
		System.out.println(solver.getClass().getSimpleName() + " start.");

		try {

			File outputFile = File.createTempFile("miridih", ".txt");

			solver.solve(new FileInputStream(inFileName), new PrintStream(outputFile));

			boolean isCorrect = Grader.isSameTextFile(answerFileName, outputFile.getPath());

			System.out.println("\tGrading result : " + isCorrect);

			if (!isCorrect) {
				System.out.println("/tOutput filename is " + outputFile.getPath());
			}

		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
	}

	/**
	 * �ΰ��� "�V��Ʈ" ������ �����ϸ� true�� ��ȯ�Ѵ�.
	 * 
	 * @param file1
	 * @param file2
	 * @return
	 * @throws IOException
	 */
	static public boolean isSameTextFile(String file1, String file2) throws IOException {
		List<String> fc1 = Files.readAllLines(FileSystems.getDefault().getPath(file1));
		List<String> fc2 = Files.readAllLines(FileSystems.getDefault().getPath(file2));

		trim(fc1);
		trim(fc2);

		if (fc1.size() != fc2.size()) {
			System.out.println("fc1 line size : " + fc1.size());
			System.out.println("fc2 line size : " + fc2.size());
			return false;
		}

		for (int i = 0; i < fc1.size(); i++) {
			if (!fc1.get(i).trim().equals(fc2.get(i).trim())) {
				System.out.println("Line no : " + (i + 1));
				System.out.println("fc1 : " + fc1.get(i));
				System.out.println("fc2 : " + fc2.get(i));
				return false;
			}
		}

		return true;
	}

	/**
	 * strings�� �� �κп��� ����ִ� ������ �����Ѵ�.
	 * 
	 * @param strings
	 */
	static public void trim(List<String> strings) {
		int size = strings.size();

		for (int i = size - 1; i >= 0; i--) {
			if (strings.get(i).trim().length() == 0) {
				strings.remove(i);
			}

			else {
				return;
			}

		}
	}

}
