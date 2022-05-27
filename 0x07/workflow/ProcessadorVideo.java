import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList<>();

    public void registrarCanal(CanalNotificacao canal){
        this.canais.add(canal);
    }

    public void processar(Video video){
        for (CanalNotificacao c : this.getCanais()){
            Mensagem mensagem = new Mensagem(TipoMensagem.LOG, video.getArquivo() + " - " + video.getFormato());
            c.notificar(mensagem);
        }
    }

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void setCanais(List<CanalNotificacao> canais) {
        this.canais = canais;
    }


}