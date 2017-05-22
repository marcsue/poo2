package classes;

//MARC SUÉ PIRES MORAES JÚNIOR
//11411BCC022
public class Main 
{
    public static void main(String[] args) 
    {
    
       Caixa cx100 = new Notas(100);
       Caixa cx50 = new Notas(50);
       Caixa cx20 = new Notas(20);
       Caixa cx10 = new Notas(10);
       Caixa cx5 = new Notas(5);
       Caixa cx2 = new Notas(2);
       Caixa cx1 = new Notas(1);
       
       cx100.next = cx50;
       cx50.next = cx20;
       cx20.next = cx10;
       cx10.next = cx5;
       cx5.next = cx2;
       cx2.next = cx1;
       cx1.next = null;
       
       cx100.contaNotas(475);
    }
    
}
