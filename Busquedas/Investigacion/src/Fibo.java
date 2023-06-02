
public class Fibo {

	public static int fibonacci(int[] a, int tarjet) {
		
		int n = a.length;
		int fib1=1;
		int fib2=0;
		
		int fib = fib2 + fib1;
		
		while(fib<n) {
			fib2=fib1;
			fib1=fib;
			fib=fib2+fib1;
		}
		
		int dif=-1;
		while(fib >1) {
			int i = Math.min(dif + fib2, n-1);
			if(a[i] < tarjet) {
				fib = fib1;
				fib1 = fib2;
				fib2 = fib -fib1;
				dif = i;
			}else {
				if(a[i]>tarjet) {
					fib = fib2;
					fib1 = fib1-fib2;
					fib2 = fib - fib1;
				}else {
					return i;
				}
			}
		}
		if(fib1 == 1 && a[dif+1] == tarjet) {
			return dif+1;
		}
		return -1;
	}
	
}
