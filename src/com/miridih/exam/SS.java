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
	 
	            for(int i = N-1; i > -1; i--){//�ڿ��� ���� ��
	                if(stock[i] > max) // ���� ������ ���ݱ��� ���� ��Ҷ� ���� ũ�ٸ�  
	                    max = stock[i]; // max = stock[i]
	                else
	                    gain += (max - stock[i]);//�ƴϸ� �Ⱦ��� �� �̵��� �� ���ش�.(���� ��Ѱ��� - ���� ����)
	            }
	            System.out.println(gain);
	         }
	    }
	

}
