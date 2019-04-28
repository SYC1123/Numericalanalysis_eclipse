package test6;

public class main {
	static double[][] a = { { -4, 1, 1, 1 }, { 1, -4, 1, 1 }, { 1, 1, -4, 1 }, { 1, 1, 1, -4 } };
	static double[] b = { 1, 1, 1, 1 };
	static double[] x = new double[4];
	static double[] y = new double[4];
	static double esp = Math.pow(10, -9);

	public static void main(String[] args) {
		double e;
		// TODO Auto-generated method stub
		do {
			e = 0;
			for(int i=0;i<4;i++) {
				x[i]=y[i];
			}
			for (int i = 0; i < 4; i++) {
				y[i] = b[i];
				for (int j = 0; j < 4; j++) {
					if(j!=i) {
						y[i]=y[i]-a[i][j]*x[j];
					}
				}
				y[i]=y[i]/a[i][i];
				if(Math.abs(x[i]-y[i])>e) {
					e=Math.abs(x[i]-y[i]);
				}
			}
		} while (e >= esp);
		for(int i=0;i<4;i++) {
			System.out.println(y[i]);
		}

	}

}
