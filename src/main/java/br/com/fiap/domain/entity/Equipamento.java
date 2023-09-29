package br.com.fiap.domain.entity;

import java.util.UUID;

/**
 * Classe que modela um Equipamento utilizado na Benezinho Holding
 *
 * @author Benefrancis
 */
public class Equipamento {

    private Long id;

    private String nome;

    private String descrição;

    private final String ETIQUETA = UUID.randomUUID().toString();


    public Equipamento() {
    }

    public Equipamento(Long id, String nome, String descrição) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
    }

    public Equipamento(Long id, String nome) {
    }

    public Long getId() {
        return id;
    }

    public Equipamento setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Equipamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescrição() {
        return descrição;
    }

    public Equipamento setDescrição(String descrição) {
        this.descrição = descrição;
        return this;
    }

    public String getETIQUETA() {
        return ETIQUETA;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrição='" + descrição + '\'' +
                ", ETIQUETA='" + ETIQUETA + '\'' +
                '}';
    }
}
