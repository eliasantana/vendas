package io.github.douglasfps.domain.entity;

public class Cliente {
    private Integer id;
    private String nome;

    public Cliente(){

    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(Integer id, String nome){
        this.nome =nome;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
