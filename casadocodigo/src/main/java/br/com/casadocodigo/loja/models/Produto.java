package br.com.casadocodigo.loja.models;

import java.util.Calendar;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titulo;
	private String descricao;
	private int paginas;

	@ElementCollection
	private List<Preco> precos;

	@DateTimeFormat
	private Calendar dataLancamento;
	
	private String sumarioPath;

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the descricao
	 */
	public final String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public final void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the paginas
	 */
	public final int getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public final void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	/**
	 * @return the precos
	 */
	public final List<Preco> getPrecos() {
		return precos;
	}

	/**
	 * @param precos the precos to set
	 */
	public final void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}

	/**
	 * @return the dataLancamento
	 */
	public final Calendar getDataLancamento() {
		return dataLancamento;
	}

	/**
	 * @param dataLancamento the dataLancamento to set
	 */
	public final void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	/**
	 * @return the sumarioPath
	 */
	public final String getSumarioPath() {
		return sumarioPath;
	}

	/**
	 * @param sumarioPath the sumarioPath to set
	 */
	public final void setSumarioPath(String sumarioPath) {
		this.sumarioPath = sumarioPath;
	}

	/**
	 * @return the titulo
	 */
	public final String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Produto [id=%s, titulo=%s, descricao=%s, paginas=%s, precos=%s, dataLancamento=%s, sumarioPath=%s]",
				id, titulo, descricao, paginas, precos, dataLancamento, sumarioPath);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Produto)) {
			return false;
		}
		Produto other = (Produto) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}