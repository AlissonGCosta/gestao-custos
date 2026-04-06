package br.com.javadeweek.gestao_custos.custom_message;

public class errorMessage {

    private String mensagem;
    private String Tipo;

    public errorMessage(String mensagem, String tipo){
        this.mensagem = mensagem;
        this.Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
