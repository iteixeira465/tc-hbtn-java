public class Mensagem {
    private String texto;
    TipoMensagem tipoMensagem;


    public Mensagem(TipoMensagem tipoMensagem, String texto) {
        this.tipoMensagem = tipoMensagem;
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

}