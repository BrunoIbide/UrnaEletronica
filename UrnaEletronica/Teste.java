
public class Teste
{
    public static void main(String args[]){
    Candidato presidente = new Candidato();
    presidente.setNome("Bruno");
    presidente.setNumero("20");
    presidente.setPartido("Partido Amarelo");
    
    Candidato senador = new Candidato();
    senador.setNome("Lucas");
    senador.setNumero("111");
    senador.setPartido("Partido Laranja");
    
    Candidato deputado = new Candidato();
    deputado.setNome("Gabriel");
    deputado.setNumero("1212");
    deputado.setPartido("Partido Azul");
    
    Eleitor eleitor = new Eleitor("Isaac","50.422.654-5","569587154");
    
    Urna urna = new Urna();
    urna.addVoto(presidente);
    urna.addVoto(presidente);
    urna.addVoto(presidente);
    
    
    System.out.println(""+presidente.getNome());
    System.out.println(""+presidente.getNumero());
    System.out.println(""+presidente.getPartido());
    System.out.println(""+presidente.totalVotos());
}
}
