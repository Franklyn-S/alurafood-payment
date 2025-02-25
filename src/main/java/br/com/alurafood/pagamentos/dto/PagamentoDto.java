package br.com.alurafood.pagamentos.dto;

import br.com.alurafood.pagamentos.models.Pagamento;
import br.com.alurafood.pagamentos.models.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDto {
	private Long id;
	private BigDecimal valor;
	private String nome;
	private String numero;
	private String expiracao;
	private String codigo;
	private Status status;
	private Long formaDePagamentoId;
	private Long pedidoId;
}
