package com.miridih.exam;
import java.util.*;

public class SS {
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	 
	        int T = sc.nextInt();
	 
	        for (int test_case = 0; test_case < T; test_case++) {
	            int N = sc.nextInt(); int[] stock = new int[N+1];
	            long gain = 0;
	            int max=0;
	 
	            for(int i = 0; i < N; i++)
	                stock[i] = sc.nextInt();
	 
	            for(int i = N-1; i > -1; i--){//뒤에서 부터 비교
	                if(stock[i] > max) // 현재 가격이 지금까지 가장 비쌀때 보다 크다면  
	                    max = stock[i]; // max = stock[i]
	                else
	                    gain += (max - stock[i]);//아니면 팔았을 때 이득을 더 해준다.(가장 비싼가격 - 현재 가격)
	            }
	            System.out.println(gain);
	         }
	    }
	

}
