import java.rmi.*;

/*
 * Questa è l'interfaccia degli oggetti remoti che estendono questa interfaccia.
 * In questa interfaccia sono definiti i prototipi dei metodi che esporranno gli oggetti remoti e saranno invocabili da remoto.
 * Gli oggetti remoti saranno degli engine capaci di svolgere dei task.
 */

public interface ComputeEngine extends Remote{
	// Questo metodo sarà invocato dai client per sottomettere dei task (Task come parametro), il risultato dell'elaborazione sarà un Object
	public Object process(Task t) throws RemoteException;
}
