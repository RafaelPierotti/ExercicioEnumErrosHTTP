package org.example;

public enum CodigoErro {
    NOT_FOUND(404, "Não encontrado"),
    BAD_REQUEST(400, "Requisição inválida"),
    INTERNAL_SERVER_ERRO(500, "Erro interno no servidor");

    private final int codigo;
    private final String descricao;

    CodigoErro(int codigo, String descricao){
        this.codigo=codigo;
        this.descricao=descricao;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }
}
