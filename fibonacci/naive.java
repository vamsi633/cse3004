class naive {

	static int fib(int n) {
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		long N=10;
		System.out.print("fibonacci of f(10):-");
		for(int i=0;i<N;i++) {
			
			System.out.print(fib(i)+" ");
		}

	}

}

