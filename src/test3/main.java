package test3;

public class main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x[]= {0,10,20,30,40,50,60,70,80,90};
		float y[]= {68,67.1f,66.4f,65.6f,64.6f,61.8f,61,60.8f,60.4f,60};
		float sum_xx=0,sum_y=0,sum_x=0,sum_xy=0;
		float a,b;
		for(int i=0;i<x.length;i++) {
			sum_xx+=x[i]*x[i];
			sum_x+=x[i];
			sum_y+=y[i];
			sum_xy+=x[i]*y[i];
		}
		b=(sum_xx*sum_y-sum_x*sum_xy)/(x.length*sum_xx-sum_x*sum_x);
		a=(x.length*sum_xy-sum_x*sum_y)/(x.length*sum_xx-sum_x*sum_x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a*55+b);

	}

}
