import java.rmi.*;
import java.net.*;
import java.rmi.registry.LocateRegistry;

/*
 * Questa è l'implemntazione del server.
 */

public class ComputeEngineServer {
	public static void main(String[] args) {
		try {
			// Viene istanziato un oggetto di tipo ComputeEngine
			ComputeEngine comp = new ComputeEngineImpl();
			// Viene avviato il registro
			LocateRegistry.createRegistry(1099);
			// Viene memorizzatto l'oggetto sulla tabella del registro con il nome di compute
			Naming.bind("rmi://127.0.0.1/compute", comp);
		} catch (AccessException e) {
			System.err.println("Bind operation not permitted");
		} catch (MalformedURLException e) {
			System.err.println("Wrong URL for binding");
		} catch (AlreadyBoundException e) {
			System.err.println("Object already bound to the registry");
		} catch (RemoteException e) {
			System.err.println("Remote invocation error");
		}
	}

}
