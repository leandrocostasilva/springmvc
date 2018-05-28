/**
 * 
 */
package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

/**
 * @author leandro
 *
 */
public class CarrinhoItem {
	
    private TipoPreco tipoPreco;
    private Produto produto;
    
    public CarrinhoItem(Produto produto, TipoPreco tipoPreco) {
        this.produto = produto;
        this.tipoPreco = tipoPreco;
    }
    
	/**
	 * @return the produto
	 */
	public final Produto getProduto() {
		return produto;
	}
	/**
	 * @param produto the produto to set
	 */
	public final void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public BigDecimal getPreco(){
	    return produto.precoPara(tipoPreco);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()h
	 */
	@Override
	public String toString() {
		return String.format("CarrinhoItem [tipoPreco=%s, produto=%s]", tipoPreco, produto);
	}
	
	public BigDecimal getTotal(int quantidade) {
	    return this.getPreco().multiply(new BigDecimal(quantidade));
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result + ((tipoPreco == null) ? 0 : tipoPreco.hashCode());
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
		if (!(obj instanceof CarrinhoItem)) {
			return false;
		}
		CarrinhoItem other = (CarrinhoItem) obj;
		if (produto == null) {
			if (other.produto != null) {
				return false;
			}
		} else if (!produto.equals(other.produto)) {
			return false;
		}
		if (tipoPreco != other.tipoPreco) {
			return false;
		}
		return true;
	}

	/**
	 * @return the tipoPreco
	 */
	public final TipoPreco getTipoPreco() {
		return tipoPreco;
	}

	/**
	 * @param tipoPreco the tipoPreco to set
	 */
	public final void setTipoPreco(TipoPreco tipoPreco) {
		this.tipoPreco = tipoPreco;
	}

}
