
/*
 * Fib(n) = Fib(n-1)+Fib(n-2)
 * Fib(1) = 1
 * Fib(0) = 0
 */

public class FibTask implements Task {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int n;

	// Cotruttore che inizializza la variabile di istanza
	public FibTask(int n) {
		this.n = n;
	}
	
	public Object execute() {
		return fib(n);
	}

	// Logica per il calcolo del numero di Fibonacci di un intero n (metodo privato)
	private int fib(int n) {
		if (n==0 || n==1) return n;
		else return fib(n-1) + fib(n-2);
	}

}
