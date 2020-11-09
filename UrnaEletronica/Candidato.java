public class Candidato {

    String nome;
    String partido;
    String numero;
    int votos=0;

    public int getVotos() {
        return votos;
    }

    public void setVotos( int votos) {
        this.votos = votos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }


}