package test4;

public class main {
	static double b = Math.PI;
	static double e = Math.E;
	static double q = Math.pow(10, -6);
	static int a = 0;
	static int n = 1;
	static double h = Math.PI - 0;
	static double old_Tn;
	static double Tn;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Tn = (h / 2) * (f(a) + f(b));
		old_Tn = Tn;
		do {
			double Hn = 0;
			double T2n = 0;
			for (int i = 0; i <= n - 1; i++) {
				Hn += f(a + (2 * i + 1) * h / 2);
			}
			Hn = Hn * h;
			T2n = (old_Tn + Hn) / 2;
			if (Math.abs(Hn - old_Tn) < q) {
				System.out.println(old_Tn + "  " + (n / 2));
				break;
			}
			n = 2 * n;
			h = h / 2;
			old_Tn = T2n;
		} while (true);
	}

	public static double f(double a) {
		return Math.pow(e, a) * Math.cos(a);
	}
}
