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
		String [] tab=null;

		////////////////////�� �Է¹ޱ�
		Scanner sc=new Scanner(in);
		t=Integer.parseInt(sc.nextLine());
		results=new int[t];
		//ù��° t��ŭ �ݺ�
		for(int i=0;i<t;i++) {
			String ns=sc.nextLine();
			n=Integer.parseInt(ns.trim());
			testPrice=new int[n];
			tab=new String[n];
			//�ι�° n��ŭ �ݺ�
			for(int j=0;j<n;j++) {
				if(j==(n-1)) {
					tab[j]=sc.nextLine();
					testPrice[j]=Integer.parseInt(tab[j].trim());
				}else {
					tab[j]=sc.next();
					testPrice[j]=Integer.parseInt(tab[j]);
				}

			}	
		}

	}

	/*************�ְ� �ջ� �޼���****************/
	public void bigCount(int [] testPrice){
		//�ִ� �ǸŰ�� ����
		int maxSum=0;
		//�ְ� �ǸŰ�� �ջ�� ����
		int sum=0;
		//���� ����
		int count=0;

		while(true) {
			for(int i=0;i<testPrice.length;i++) {
				
			}
		}
	}
}
