//MARC SUE PIRES MORAES JUNIOR 11411BCC022
//Gabriel Augusto Ferraz Martins 11221bcc036

public class Principal {
    public static void main(String[] args) {
        Mario mario = new Mario();

        System.out.println("COGUMELO:");
        mario.pegarCogumelo();

        System.out.println();
        System.out.println("COGUMELO:");
        mario.pegarCogumelo();

        System.out.println();
        System.out.println("PENA:");
        mario.pegarPena();

        System.out.println();
        System.out.println("PENA:");
        mario.pegarPena();

        System.out.println();
        System.out.println("2 DANOS:");
        mario.levarDano();
        mario.levarDano();

        System.out.println();
        System.out.println("PONTUACAO FINAL:");
        System.out.println(mario.getPontos());
    }
}
