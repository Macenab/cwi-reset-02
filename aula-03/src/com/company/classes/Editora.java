package com.company.classes;

public class Editora {
    private String nome;
    private String localizacao;

    public Editora(String nome, String localizacao) {
        identificaEditora();
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public void identificaEditora(){
        if (this.nome.equals("DC Comics")){
            throw new RuntimeException("Sua Editora tá falida, vai embora");
        } else {
            System.out.println("Editora:" + this.nome);
        }
    }
}
