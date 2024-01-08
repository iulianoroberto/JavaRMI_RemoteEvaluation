import java.rmi.*;
import java.net.*;

public class ComputeEngineClient {
	public static void main(String[] args) {
		try {

			// Recupero oggetto (reference globale) engine remoto dal registro tramite operazione di lookup (compute è il nome dell'oggetto)
			ComputeEngine comp = (ComputeEngine)Naming.lookup("rmi://127.0.0.1/compute");
			
			// Viene creato un nuovo AddTask
			//Task t = new AddTask(4, 8);

			// Creo un nuovo oggetto di tipo FibTask
			Task t = new FibTask(18);

			// Viene invocato il metodo remoto dell'oggetto remoto process per eseguire il task e recuperato il risultato
			int result = (int)comp.process(t);

			System.out.println("Il risultato del task e' " + result);
		} catch (NotBoundException e) {
			System.err.println("Bind operation not permitted");
		} catch (MalformedURLException e) {
			System.err.println("Wrong URL for binding");
		} catch (RemoteException e) {
			System.err.println("Remote invocation error");
		}
	}
}
