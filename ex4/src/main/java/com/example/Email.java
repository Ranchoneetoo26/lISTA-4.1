package com.example;

public class Email {
    private String remetente;
    private String destinatario;
    private String mensagem;

    //contrutor
    public Email(String remetente, String destinatario, String mensagem) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    //metodo para contar o numero de palavras na mensagem
    public int contarPalavras(){
        if (mensagem == null || mensagem.isEmpty()) {
            return 0;
        }
        return mensagem.trim().split("\\s+").length;
    }

        // Getters e Setters
        public String getRemetente() {
            return remetente;
        }
    
        public void setRemetente(String remetente) {
            this.remetente = remetente;
        }
    
        public String getDestinatario() {
            return destinatario;
        }
    
        public void setDestinatario(String destinatario) {
            this.destinatario = destinatario;
        }
    
        public String getMensagem() {
            return mensagem;
        }
    
        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }

}
