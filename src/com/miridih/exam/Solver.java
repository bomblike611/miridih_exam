package com.miridih.exam;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * ���� Ǯ�� Ŭ�������� ���� �������̽� 
 * 
 *  ���� Ǯ�̸� ���� ���� Ŭ�������� �� �������̽��� �����ؾ��Ѵ�. 
 *  �׷��߸� Grader Ŭ�������� ä���� ������ �� �ִ�. 
 * @author cskang
 *
 */

public interface Solver {

	/**
	 * in���κ��� �Է��� �޾� ������ Ǯ�� out���� ����Ѵ�.
	 * @param in �׽�Ʈ ���̽� �Է��� ���̵��̴� InputStream
	 * @param out ��� ���� ����� PrintStream 
	 */	
	public void solve(InputStream in, PrintStream out);

}
