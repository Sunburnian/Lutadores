package aulasetearelacionamentoentreclasses;


public class AulaSeteARelacionamentoEntreClasses {

    
    public static void main(String[] args) {
        Lutador lutador [] = new Lutador[6]; 
        lutador [0] = new Lutador("Jack","França",31,1.75f,68.9f,11,2,1);
        
        lutador [1] = new Lutador("Luffy","Brasil",29,1.68f,57.8f,14,2,3);
        
        lutador [2] = new Lutador("Jonh","EUA",35,1.65f,80.9f,12,2,1);

        lutador [3] = new Lutador("Code","Austrália",28,1.93f,81.6f,13,0,2);
        
        lutador [4] = new Lutador("Cobol","brasil",37,1.70f,119.3f,5,4,3);
        
        lutador [5] = new Lutador("J. Jonah Jameson","EUA",30,1.81f,105.7f,12,2,4);
        
        lutador[5].Status();
        
    }
    
}
