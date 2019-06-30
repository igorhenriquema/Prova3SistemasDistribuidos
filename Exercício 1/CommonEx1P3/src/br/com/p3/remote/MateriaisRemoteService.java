package br.com.p3.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.com.p3.model.Materiais;

public class MateriaisRemoteService extends UnicastRemoteObject implements IMateriaisRemoteService {
	
	private static final long serialVersionUID = 1210798659253264354L;
	
	private static List<Materiais> materiais = new ArrayList<>();
	
	public MateriaisRemoteService() throws RemoteException {}
	
	@Override
	public void insert(Materiais m) throws RemoteException {
		materiais.add(m);
	}
	
	@Override
	public List<Materiais> getAll() throws RemoteException {
		return materiais;
	}
}
