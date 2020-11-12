public class Urna implements Voto{
    int voto;
    int totalVotos;
    Candidato candidato;
    Eleitor eleitor;
    
    
    public boolean validaVoto(Eleitor eleitor){
        if(eleitor.votoEleitor >= 0 && eleitor.votoEleitor <= 1){
            return true;
        }
        return false;
    }
    
    public void addVoto(Candidato candidato){
        if(candidato.totalVotos >= 0 ){
            candidato.totalVotos = candidato.totalVotos + 1;
        }   
    }  
}
