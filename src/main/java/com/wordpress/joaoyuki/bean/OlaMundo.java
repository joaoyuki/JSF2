package com.wordpress.joaoyuki.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean //Usamos a anotação @ManagedBean para que essa classe seja gerenciada pelo JSF.
@ViewScoped  //Usamos a anotação @ViewScoped para que o bean só esteja disponível durante a visualização. 
public class OlaMundo implements Serializable{

	private static final long serialVersionUID = 1L;

	private String mensagem = "Olá mundo - Managed bean";
	
	//Precisamos criar os métodos getters and setters para que o JSF consiga identificar o atributo nas páginas.
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
