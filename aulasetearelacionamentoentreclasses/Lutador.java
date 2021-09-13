package aulasetearelacionamentoentreclasses;

public class Lutador {
    private String nome,nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;
    
    public Lutador(String nome,String nacionalidade,int idade,float altura,float peso,int vitorias,int derrotas,int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    public void setNome(String no){
        this.nome=no;
    }
    public String getNome(){
        return nome;
    }

    public void setNacionalidade(String na){
        this.nacionalidade=na;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setIdade(int id){
        this.idade=id;
    }
    public int getIdade(){
        return idade;
    }
   
    public void setAltura(float al){
        this.altura=al;
    }
    public float getAltura(){
        return altura;
    }
    
    public void setPeso(float pe){
        this.peso=pe;
        setCategoria();
    }
    public float getPeso(){
        return peso;
    }    

    private void setCategoria(){//não precisa de parâmetro já que não vai ser acessada do lado de fora da classe
        if(this.peso<52.2){
            this.categoria = "Inválido";
        }else{
            if(this.peso<=70.3){
                this.categoria = "Leve";
            }else{
                if(this.peso<=83.9){
                    this.categoria = "Médio";
                }else{
                    if(this.peso<=120.2){
                        this.categoria = "Pesado";
                    }else{
                        this.categoria = "Inválido";
                    }
                }
            }
        }
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setVitorias(int vi){
        this.vitorias=vi;
    }
    public int getVitorias(){
        return vitorias;
    }
    
    public void setDerrotas(int de){
        this.derrotas=de;
    }
    public int getDerrotas(){
        return derrotas;
    }
    
    public void setEmpates(int em){
        this.empates=em;
    }
    public int getEmpates(){
        return empates;
    }
     
    
    public void Apresentar(){
        System.out.printf("\nCHEGOUA A HORA! Apresentamos o lutador %s",this.getNome());
        System.out.printf("\nDiretamente de %s",this.getNacionalidade());
        System.out.printf("\nCom %d anos e %.2f de altura",this.getIdade(),this.getAltura());
        System.out.printf("\nPesando %.2f",this.getPeso());
        System.out.printf("\n%d Vitórias",this.getVitorias());
        System.out.printf("\n%d Derrotas",this.getDerrotas());
        System.out.printf("\n%d Empates",this.getEmpates());
    }
    
    public void Status(){
        System.out.printf("\n%s é um peso %s",this.getNome(),this.getCategoria());
        System.out.printf("\nTeve %d Vitórias",this.getVitorias());
        System.out.printf("\nTeve %d Derrotas",this.getDerrotas());
        System.out.printf("\nTeve %d Empates",this.getEmpates());
    }
    
    public void GanharLuta(){
        this.setVitorias(this.getVitorias() +1);
    }
    
    public void PerderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void EmpatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
}
