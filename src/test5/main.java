package test5;

public class main {
	static double[][] a = { { 10, -7, 0, 1, 8 }, { -3, 2.099999, 6, 2, 5.900001 }, { 5, -1, 5, -1, 5 },
			{ 2, 1, 0, 2, 1 } };
	static double[] x = new double[4];
	static double[] b = new double[4];

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		for (int i = 0; i < 4; i++) {
			max(i);
			for (int k = i + 1; k < 4; k++) {
				double a1 = a[k][i] / a[i][i];
				for (int j = i; j < 5; j++) {		
					a[k][j] = a[k][j] - a1 * a[i][j];
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			b[i] = a[i][4];
		}
		x[3] = b[3] / a[3][3];
		for (int i = 3; i >= 0; i--) {
			double t = 0;
			for (int j = i + 1; j < 4; j++) {
				t += a[i][j] * x[j];
			}
			x[i] = (b[i] - t) / a[i][i];
		}
		System.out.println("系数行列式的值为:");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%-1f\t", a[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("x的结果为：");
		for(int i=0;i<4;i++) {
			System.out.printf("%-1f\t", x[i]);
		}

	}

	public static void max(int i) {
		double max = Math.abs(a[i][i]);
		int b = i;
		for (int k = i; k < 4; k++) {
			if (Math.abs(a[k][i]) >= max) {
				max = Math.abs(a[k][i]);
				b = k;
			}
		}
		for (int j = i; j < 5; j++) {
			double temp = a[i][j];
			a[i][j] = a[b][j];
			a[b][j] = temp;
		}
	}

}
