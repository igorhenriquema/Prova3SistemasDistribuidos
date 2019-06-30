package br.com.p3.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.p3.model.Materiais;
import br.com.p3.remote.IMateriaisRemoteService;


public class MainApp {
	
	public static void main(String[] args) {
		try {
			IMateriaisRemoteService matObj = (IMateriaisRemoteService) Naming.lookup("rmi://localhost:8282/materiais");
			
			Materiais m1 = new Materiais(1, "Martelo", "48795", 1, 100);
			Materiais m2 = new Materiais(2, "Computador", "4658", 3, 5000);
			
			matObj.insert(m1);
			matObj.insert(m2);
			
			for (Materiais mat : matObj.getAll()) {
				System.out.println(mat.toString());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
}
