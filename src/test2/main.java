package test2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// double[] x= {0,10,20,30,40,50,60,70,80,90,100,110,120};
		// double[] y= {5,1,7.5,3,4.5,8.8,15.5,6.5,-5,-10,-2,4.5,7};
		double[] x = { -1, 1, 2 };
		double[] y = { 3, 1, -1 };
		double[][] a = new double[x.length][x.length];
		for (int m = 0; m < x.length; m++) {
			a[m][0] = y[m];
		}
		for (int j = 1; j < x.length; j++) {
			for (int i = j; i < x.length; i++) {
				a[i][j] = (a[i - 1][j - 1] - a[i][j - 1]) / (x[i - j] - x[i]);
			}
		}
		for (int n = 0; n < x.length; n++) {
			System.out.println(a[n][n]);
		}
		
		Scanner in=new Scanner(System.in);
		double p=in.nextDouble();
		double real_result=0;
		for(int i=1;i<x.length;i++) {//次数
			double sum=1;
			for(int j=0;j<i;j++) {
				sum=sum*(p-x[j]);
			}
			sum=sum*a[i][i];
			real_result=real_result+sum;
		}
		real_result=real_result+a[0][0];
		System.out.println(real_result);
	}
}
