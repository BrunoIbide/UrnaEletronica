public class Candidato extends Pessoa {

    String nome;
    String partido;
    String numero;
    int totalVotos;
    
    public Candidato(){
    
    }
    public int totalVotos(){
        return totalVotos;
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