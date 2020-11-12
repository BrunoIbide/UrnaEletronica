public class Urna
{
    int voto;
    int totalVotos;
    Candidato candidato;
    
    public void addVoto(Candidato candidato){
        if(candidato.totalVotos >= 0){
            candidato.totalVotos = candidato.totalVotos + 1;
        }
        
    }  
}
