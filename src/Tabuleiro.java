
public class Tabuleiro{

        char[][] tab = new char [3][3];
        private char p1;
        private char p2;

        private char jogadorAt;
        private int linha;
        private int coluna;
        private Jogador obp1, obp2;

        public Tabuleiro(Jogador obp1, Jogador obp2){

            for(int l = 0; l < 3; l++){
                for(int c = 0; c < 3; c++){
                    tab[l][c] = '*';
                }
            }
            this.obp1 =  obp1;
            this.obp2 =  obp2;

            obp1.getMarcador();
            obp2.getMarcador();
            jogadorAt = p1;

        }

        public void exbirTabuleiro(){
            for(int l = 0; l < 3; l++){
                for(int c = 0; c < 3; c++){
                    System.out.print(tab[l][c] + " ");
        }
            System.out.println("");
    }
}
public boolean jogar(){

    if(verificarVencedor() == 'N'){
        if(jogadorAt == p1){
            do{
                linha = obp1.escolherLinha();
                coluna = obp1.escolherColuna();
  
            } 
                 while(tab[linha][coluna] != '*');
                        tab[linha][coluna] = p1;

            jogadorAt = p2;
        } 
        else{
            do{
                linha = obp2.escolherLinha();
                coluna = obp2.escolherColuna();
            }
                 while(tab[linha][coluna] != '*');
                        tab[linha][coluna] = p2;
        }
            jogadorAt = p1; 
            return true;
    } else {
    return false;
    
} 
}

public char verificarVencedor() {
    for (int l = 0; l < 3; l++){
        if (tab[l][0] == tab[l][1] && tab[l][1] == tab[l][2] && tab[l][2] != '*'){
            return tab[l][0];
        }
            }
        
        for(int c = 0; c < 3; c++){
        if (tab[0][c] == tab[1][c] && tab[1][c] == tab[2][c] && tab[2][c] != '*'){
            return tab [0][c];
            }
        }

        for(int d = 0; d < 3; d++){
            if(tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2] && tab[2][2] != '*' || tab[0][2] == tab[1][1] && tab[2][0] == tab[1][1] && tab[1][1] != '*'){
                return tab[1][1];
            }
        }

        boolean locationAvaliable = false;
            for(int l = 0; l < 3; l++){
                for(int c = 0; c < 3; c++){
                   if(tab[l][c] == '*'){
                        locationAvaliable = true;
                        break;
                    }
                }
            }
            return locationAvaliable ? 'N' : 'D';
         }

         public void reiniciarTabuleiro(){
            for(int l = 0; l < 3; l++){
                for(int c = 0; c < 3; c++){
                    tab[l][c] = '*';
                }
            }
         }
         
         public void setIniciante(int iniciante){
            if(iniciante == 2){
                jogadorAt = 'O';
            }
            else{
                jogadorAt = 'X';
            }
         }
}
    

    