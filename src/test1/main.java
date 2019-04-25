package test1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double[] x= {0,10,20,30,40,50,60,70,80,90,100,110,120};
		double[] y= {5,1,7.5,3,4.5,8.8,15.5,6.5,-5,-10,-2,4.5,7};
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double real_Result=0;
		for(int k=0;k<x.length;k++) {
			double sum=1;
			for(int j=0;j<x.length;j++) {
				if(j!=k) {
					sum=sum*(a-x[j])/(x[k]-x[j]);
				}	
			}
			real_Result=real_Result+y[k]*sum;
		}
		System.out.println(real_Result);
	}
}
