package br.com.projetojsf.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.projetojsf.dao.DaoGeneric;
import br.com.projetojsf.model.UsuarioPessoa;

@ManagedBean(name = "usuarioPessoaManagedBean")
@ViewScoped
public class UsuarioPessoaManagedBean {

	
	private UsuarioPessoa usuarioPessoa = new UsuarioPessoa();
	
	private DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<>();

	public UsuarioPessoa getUsuarioPessoa() {
		return usuarioPessoa;
	}

	public void setUsuarioPessoa(UsuarioPessoa usuarioPessoa) {
		this.usuarioPessoa = usuarioPessoa;
	}
	
	
	public String salvar() {
		daoGeneric.salvar(usuarioPessoa);
		return "";
	}
	
	

	
}