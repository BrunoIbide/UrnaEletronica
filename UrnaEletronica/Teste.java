
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
    urna.addVoto(senador);
    urna.addVoto(senador);
    urna.addVoto(deputado);
    urna.addVoto(deputado);
    
    
    System.out.println("Nome do Presidente: "+presidente.getNome());
    System.out.println("Numero Presidente: "+presidente.getNumero());
    System.out.println("Partido Presidente: "+presidente.getPartido());
    System.out.println("Quantidade de Votos Presidente: "+presidente.totalVotos());
    
    System.out.println("Nome do Senador: "+senador.getNome());
    System.out.println("Numero do Senador: "+senador.getNumero());
    System.out.println("Partido Senador: "+senador.getPartido());
    System.out.println("Quantidade de Votos Senador: "+senador.totalVotos());
    
    System.out.println("Nome Deputado: "+deputado.getNome());
    System.out.println("Numero Deputado: "+deputado.getNumero());
    System.out.println("Partido Deputado: "+deputado.getPartido());
    System.out.println("Quantidade de Votos Deputado: "+deputado.totalVotos());
}
}
