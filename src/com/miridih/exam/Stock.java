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

		////////////////////수 입력받기////////////////
		Scanner sc=new Scanner(in);
		t=sc.nextInt();
		results=new int[t];


		//첫번째 t만큼 반복
		for(int i=0;i<t;i++) {

			n= sc.nextInt();
			testPrice=new int[n+1];
			//최대 가격 변수
			int max=0;
			//계산 결과 변수
			int result=0;

			//두번째 n만큼 반복
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
