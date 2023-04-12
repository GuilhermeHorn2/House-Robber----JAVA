package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		
	    int[]h = {2,7,9,3,1};
		ArrayList<Integer> l = new ArrayList<>();
		possible_amounts(h,0,l);
		System.out.println(l);
		System.out.println(max_amount(l));
		
	}
	private static int[] rmv_adj(int[]h,int j) {
		
		int len = 0;
		if(j == 0 || j == h.length-1) {
			len = h.length -2;
		}
		else {
			len = h.length - 3;
		}
		
		if(len < 0) {
			len  = 0;
		} 
		//String s = "";
		int[] rmv = new int[len];
		int k = 0;
		for(int i =0;i < h.length;i++) {
			if(i == j-1) {
				continue;
			}
			if(i == j) {
				continue;
			}
			if(i == j+1) {
				continue;
			}
			rmv[k] = h[i];
			k++;
			//s += " "+h[i];
		}
		//System.out.println(s);
		return rmv;
		
	}
	
	private static void possible_amounts(int[]h,int n,ArrayList<Integer> l) {
		
		if(h.length == 0) {
			l.add(n);
			return;
		}
		
		
		for(int i = 0;i < h.length;i++) {
			int [] v = rmv_adj(h,i);
			possible_amounts(v,n+h[i],l);
			//System.out.println(n+h[i]);
		}
		return;
	}
	
	private static int max_amount(ArrayList<Integer> l) {
		l.sort(Comparator.naturalOrder());
		return l.get(l.size()-1);
	}
	
		
		
	
}
	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

