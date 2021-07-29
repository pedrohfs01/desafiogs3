package com.pedrofernandes.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Cliente.
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "nome", nullable = false)
    private String nome;

    @NotNull
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @OneToMany(mappedBy = "cliente")
    private Set<Endereco> enderecos = new HashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<Telefone> telefones = new HashSet<>();

    @OneToMany(mappedBy = "cliente")
    private Set<Email> emails = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Cliente nome(String nome) {
        this.nome = nome;
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cliente cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public Cliente enderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
        return this;
    }

    public Cliente addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
        endereco.setCliente(this);
        return this;
    }

    public Cliente removeEndereco(Endereco endereco) {
        this.enderecos.remove(endereco);
        endereco.setCliente(null);
        return this;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public Cliente telefones(Set<Telefone> telefones) {
        this.telefones = telefones;
        return this;
    }

    public Cliente addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
        telefone.setCliente(this);
        return this;
    }

    public Cliente removeTelefone(Telefone telefone) {
        this.telefones.remove(telefone);
        telefone.setCliente(null);
        return this;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public Cliente emails(Set<Email> emails) {
        this.emails = emails;
        return this;
    }

    public Cliente addEmail(Email email) {
        this.emails.add(email);
        email.setCliente(this);
        return this;
    }

    public Cliente removeEmail(Email email) {
        this.emails.remove(email);
        email.setCliente(null);
        return this;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cliente)) {
            return false;
        }
        return id != null && id.equals(((Cliente) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Cliente{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            "}";
    }
}
