public class Tester {
    public static void main(String[] args) throws Exception {
        Jogador p1 = new Jogador('X');
        Jogador p2 = new Jogador('O');
        Tabuleiro tab = new Tabuleiro(p1, p2);
        int jogada=1;

        while(tab.jogar()){
            System.out.println("jogada " + jogada++ + ":");
            tab.exbirTabuleiro();
        }

        switch(tab.verificarVencedor()) {
            case 'E': System.out.println("O jogo terminou em empate!");
                    break;
            case 'X': System.out.println("O Jogador X ganhou!");
                    break;
            case 'O': System.out.println("O Jogador O ganhou!");
                    break;
            default: System.out.println("Houve algum problema!");        
        }
    }
}
