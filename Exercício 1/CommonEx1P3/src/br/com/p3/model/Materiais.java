package br.com.p3.model;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Materiais implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int Id;
	private String Desc;
	private String numPat;
	private double Peso;
	private double Valor;
	
	public Materiais (int Id, String Desc, String numPat, double Peso, double Valor) throws RemoteException {
		this.Id = Id;
		this.Desc = Desc;
		this.numPat = numPat;
		this.Peso = Peso;
		this.Valor = Valor;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	
	public String getNumPat() {
		return numPat;
	}

	public void setNumPat(String numPat) {
		this.numPat = numPat;
	}

	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.Id + ", \nDescrição: " + this.Desc + ", \nNúmero do Patrimônio: " + this.numPat + " Peso: " + this.Peso + " Valor: " + this.Valor;
	}

}
