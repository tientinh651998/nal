package Test;

import java.util.Scanner;

public class Solution {

	public static String relace(String s, int pos,int num) {
		return s.substring(0, pos)+s.substring(pos+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,coppy;
		int count =0;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		coppy=s;
		String[] vietnam = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
		int i=0;
		while (i<vietnam.length)
		{
			int j=-1;
			j = coppy.indexOf(vietnam[i]);
			if (j==-1) i++;
			else
			{	
				count++;
				coppy=relace(coppy,j,vietnam[i].length());
			}
		}
		
		System.out.println(count);
		

	}

}
