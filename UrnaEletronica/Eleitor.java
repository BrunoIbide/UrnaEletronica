public class Eleitor extends Pessoa
{
    String titulo;
    
    public Eleitor(String nome, String rg, String titulo){
        this.setNome(nome);
        this.setRg(rg);
        this.titulo = titulo;
    }
    
}
