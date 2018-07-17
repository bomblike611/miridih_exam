package com.miridih.exam;

import java.util.*;
import java.io.*;

public class Stock implements Solver {
	//�������� ������ �迭
	private int [] results;

	public static void main(String[] args) {
		new Stock().solve(System.in, System.out);		
	}

	/**
	 * ���� Ǯ�� ���� �޼ҵ�   
	 * @param in �׽�Ʈ ���̽� �Է��� ���̵��̴� InputStream
	 * @param out ������� ����� PrintStream 
	 */
	public void solve(InputStream in, PrintStream out) {
		//////////////����� ����/////////////////
		int t=0;
		int n=0;
		int [] testPrice=null;

		////////////////////�� �Է¹ޱ�////////////////
		Scanner sc=new Scanner(in);
		t=sc.nextInt();
		results=new int[t];


		//ù��° t��ŭ �ݺ�
		for(int i=0;i<t;i++) {

			n= sc.nextInt();
			testPrice=new int[n+1];
			//�ִ� ���� ����
			int max=0;
			//��� ��� ����
			int result=0;

			//�ι�° n��ŭ �ݺ�
			for(int j=0;j<n;j++) {
				testPrice[j]=sc.nextInt();
			}

			for(int d=n-1;d>-1;d--) {
				if(testPrice[d] > max) {
					max=testPrice[d];
				}else {
					result+=(max-testPrice[d]);
				}
			}
			results[i]=result;
		}

		for(int i=0;i<results.length;i++) {
			out.println(results[i]);
		}

		sc.close();
	}

}
