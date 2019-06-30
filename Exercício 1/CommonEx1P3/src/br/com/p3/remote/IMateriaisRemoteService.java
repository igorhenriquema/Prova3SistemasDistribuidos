package br.com.p3.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.p3.model.Materiais;

public interface IMateriaisRemoteService extends Remote {
	
	void insert(Materiais m) throws RemoteException;
	
	List<Materiais> getAll() throws RemoteException;
	
}
