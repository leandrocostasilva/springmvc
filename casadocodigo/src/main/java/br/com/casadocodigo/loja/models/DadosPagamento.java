/**
 * 
 */
package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

/**
 * @author leandro
 *
 */
public class DadosPagamento {
	
    private BigDecimal value;

    public DadosPagamento(BigDecimal value) {
        this.value = value;
    }

    public DadosPagamento() {
    }

    public BigDecimal getValue() {
        return value;
    }

}
