package br.com.caelum.argentum.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.argentum.modelo.Negociacao;
import br.com.caelum.argentum.ws.ClienteWebService;

@ManagedBean
@ViewScoped
//Sempre que um ManagedBean possuir o escopo maior que o escopo de requisi��o, ele dever� implementar a interface Serializable:
public class ArgentumBean implements Serializable {

	private List<Negociacao> negociacoes;

	public ArgentumBean() {
		negociacoes = new ClienteWebService().getNegociacoes();
	}

	public List<Negociacao> getNegociacoes() {
		return negociacoes;
	}

}
