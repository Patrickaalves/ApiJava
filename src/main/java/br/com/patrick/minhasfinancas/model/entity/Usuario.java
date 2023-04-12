package br.com.patrick.minhasfinancas.model.entity;

import lombok.*;

import javax.persistence.*;

//@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString

@Entity
@Table(name = "usuario", schema = "financas")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nome")
    private  String nome;
    @Column(name = "email")
    private  String email;
    @Column(name = "senha")
    private  String senha;




}
