/* 
 * Implemntazione dell'interfaccia Task per fare il calcolo remoto della somma tra due long.
*/

public class AddTask implements Task {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int a, b;

	// Costruttore per inizializzare le variabili di istanza.
	public AddTask(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// Metodo execute derivato dall'interfaccia
	public Object execute() {
		return (long) (a+b); 
	}

}
