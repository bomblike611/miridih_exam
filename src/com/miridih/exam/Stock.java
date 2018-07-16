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

		////////////////////수 입력받기
		Scanner sc=new Scanner(in);
		t=sc.nextInt();
		results=new int[t];
		
		
		//첫번째 t만큼 반복
		for(int i=0;i<t;i++) {
			n= sc.nextInt();
			testPrice=new int[n+1];
			int max=0;
			int result=0;
			//두번째 n만큼 반복
			for(int j=0;j<n;j++) {
				if(j==(n-1)) {
					tab[j]=sc.nextLine();
					testPrice[j]=Integer.parseInt(tab[j].trim());
				}else {
					tab[j]=sc.next();
					testPrice[j]=Integer.parseInt(tab[j]);
				}
				System.out.println(testPrice[j]);
			}
			
			for(int d=n-1;d<-1;i--) {
				System.out.println("dd");
				if(testPrice[d]>max) {
					max=testPrice[d];
				}else {
					result+=(max-testPrice[d]);
				}
			}
			results[i]=result;
		}

		for(int i=0;i<results.length;i++) {
			System.out.println(results[i]);
		}
	}

	/*************주가 합산 메서드****************//*
	public int bigCount(int [] testPrice){
		//최대 최대판매결과 변수
		int maxSum=0;
		//주가 판매결과 변수
		int sum=0;
		//주가 최저가격 변수
		int minPrice=testPrice[0];

		
			for(int i=0;i<testPrice.length;i++) {
				sum=testPrice[i]-minPrice;
				if(sum>maxSum) {
					maxSum=sum;
				}
				if(testPrice[i]<minPrice) {
					minPrice=testPrice[i];
				}
			}
			return maxSum;
	}*/
}
