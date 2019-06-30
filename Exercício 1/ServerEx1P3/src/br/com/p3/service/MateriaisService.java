package br.com.p3.service;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import br.com.p3.remote.MateriaisRemoteService;

public class MateriaisService {
	
	public MateriaisService() throws RemoteException {
		try {
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/materiais", new MateriaisRemoteService());
			
			System.out.println("Service running on port 8282");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws RemoteException {
		new MateriaisService();
	}
}
