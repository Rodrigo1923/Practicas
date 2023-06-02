public class Interpolacion {
	
	public static double InterpolacionLin(double[] x, double[] y, double xValue) {
		int n = x.length;
		for (int i = 0; i < n - 1; i++) {
			if (x[i] <= xValue && xValue <= x[i + 1]) {
				double yValue = y[i] + (y[i + 1] - y[i]) * (xValue - x[i]) / (x[i + 1] - x[i]);
				return yValue;
			}
		}
		return -1;
	}
	
}
