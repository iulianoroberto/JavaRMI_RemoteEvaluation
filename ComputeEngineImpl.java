import java.rmi.*;
import java.rmi.server.*;

/*
 * Implementazione dell'interfaccia ComputeEngine che permette di realizzare gli oggetti remoti.
 */

public class ComputeEngineImpl extends UnicastRemoteObject implements ComputeEngine {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ComputeEngineImpl() throws RemoteException {	}

	// Il metodo ricevuto un task lo manda in esecuzione (esecuzione remota sincrona)
	public Object process(Task t) throws RemoteException {	
		return t.execute();
	}

}
