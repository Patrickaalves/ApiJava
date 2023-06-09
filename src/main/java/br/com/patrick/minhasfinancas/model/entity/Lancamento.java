package br.com.patrick.minhasfinancas.model.entity;

import br.com.patrick.minhasfinancas.model.enums.StatusLancamento;
import br.com.patrick.minhasfinancas.model.enums.TipoLancamento;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder

@Entity
@Table(name = "lancamento", schema = "financas")
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "mes")
    private Integer mes;
    @Column(name = "ano")
    private Integer ano;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "data_cadastro")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate dataCadastro;
    @Column(name = "tipo")
    @Enumerated(value = EnumType.STRING)
    private TipoLancamento tipo;
    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private StatusLancamento status;

}
