
import java.io.Serializable;

/*
 * Interfaccia task che definisce il prototipo della funzione execute (tipo astratto perché è un'interfaccia).
 * In alternativa a Task si potrebbe usare l'interfaccia Runnable che Java mette già a disposizone con la differenza che
 * mentre execute() restituisce un Object, Runnable è void (andrebbe bene per task che non restituiscono nulla o comunque
 * la restituzione andrebbe implemntata in modo diverso)
 */

// Nota bene che Task è un'interfaccia che estende Serializable perché gli oggetti dovranno essere trasferiti da client a server
// Serializzati e trasferiti verso il processo che ospita l'engine
public interface Task extends Serializable{
	public Object execute();
}
