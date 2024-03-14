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
@Table(name = "TB_OCORRENCIA")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_OCORRENCIA")
    @SequenceGenerator(
            name = "SQ_OCORRENCIA",
            sequenceName = "SQ_OCORRENCIA",
            allocationSize = 1
    )
    @Column(name = "ID_OCORRENCIA")
    private Long id;

    @Column(name = "DESC_OCORRENCIA")
    private String descricao;

    @Column(name = "DATA_OCORRENCIA")
    private LocalDateTime data;




}
