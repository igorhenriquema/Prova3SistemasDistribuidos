package br.com.p3.model;

public class Material {
	
	private int Id;
	private String Desc;
	private String numPat;
	private double Peso;
	private double Valor;
	
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
	
	public String toJson() {
		String json = "";
		
		json += "{";
		json += "\"Id\":\"" + this.Id + "\",";
		json += "\"Desc\":\"" + this.Desc + "\",";
		json += "\"numPat\":\"" + this.numPat + "\"";
		json += "\"Peso\":\"" + this.Peso + "\"";
		json += "\"Valor\":\"" + this.Valor + "\"";
		json += "}";
		
		return json;
	}
	
}
