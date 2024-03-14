package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "TB_CHAMADO")
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SQ_CHAMADO")
    @SequenceGenerator(name = "SQ_CHAMADO",sequenceName = "SQ_CHAMADO",allocationSize = 1)

    @Column(name = "ID_CHAMADO")
    private Long id;

    @Column(name = "TITULO_CHAMADO")
    private String titulo;

    @Column(name = "DESC_CHAMADO")
    private String descricao;

    @Column(name = "DATA_ABERTURA")
    private LocalDateTime dataAbertura;

    @Column(name = "DATA_ENCERRAMENTO")
    private LocalDateTime dataEncerramento;

    @Column(name = "DATA_PRIMEIRO_ATENDIMENTO")
    private LocalDateTime dataPrimeiroAtendimento;


}
