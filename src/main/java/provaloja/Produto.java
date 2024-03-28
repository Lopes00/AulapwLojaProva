package provaloja;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private Integer codbarra;
	private String nome;
	private String marca;
	private Integer quantidade;
	private String dtcadastro;
	
	public Produto(Integer codbarra, String nome, String marca, Integer quantidade, String dtcadastro) {
		super();
		this.codbarra = codbarra;
		this.nome = nome;
		this.marca = marca;
		this.quantidade = quantidade;
		this.dtcadastro = dtcadastro;
	}
	
	public Produto() {
		
	}

	public Integer getCodbarra() {
		return codbarra;
	}

	public void setCodbarra(Integer codbarra) {
		this.codbarra = codbarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getDtcadastro() {
		return dtcadastro;
	}

	public void setDtcadastro(String dtcadastro) {
		this.dtcadastro = dtcadastro;
	}
	
	@Override
	public String toString() {
		return "Produto [Codigodebarra=" + codbarra + ", nome=" + nome + ", marca=" + marca + ", quantidade=" + quantidade + ", dtcadastro=" + dtcadastro + "]";
	}
}


