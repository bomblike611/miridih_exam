package com.miridih.exam;

import java.util.*;
import java.io.*;

public class Stock implements Solver {
	//연산결과를 저장할 배열
	private int [] results;

	public static void main(String[] args) {
		new Stock().solve(System.in, System.out);		
	}

	/**
	 * 문제 풀이 메인 메소드   
	 * @param in 테스트 케이스 입력을 받이들이는 InputStream
	 * @param out 결과값을 출력할 PrintStream 
	 */
	public void solve(InputStream in, PrintStream out) {
		//////////////저장될 변수/////////////////
		int t=0;
		int n=0;
		int [] testPrice=null;
		String [] tab=null;

		////////////////////수 입력받기
		Scanner sc=new Scanner(in);
		t=Integer.parseInt(sc.nextLine());
		results=new int[t];
		//첫번째 t만큼 반복
		for(int i=0;i<t;i++) {
			String ns=sc.nextLine();
			n=Integer.parseInt(ns.trim());
			testPrice=new int[n];
			tab=new String[n];
			//두번째 n만큼 반복
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

	/*************주가 합산 메서드****************/
	public void bigCount(int [] testPrice){
		//최대 판매결과 변수
		int maxSum=0;
		//주가 판매결과 합산용 변수
		int sum=0;
		//구매 변수
		int count=0;

		while(true) {
			for(int i=0;i<testPrice.length;i++) {
				
			}
		}
	}
}
