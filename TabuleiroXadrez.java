void main(){
    String linha;
    linha = IO.readln("Quantas Colunas: "); //pega o número de colunas
    String[] partes = linha.split(" ");

    int tabuleiro = 0;

    int coluna = Integer.parseInt(partes[0]);  

       if(coluna % 2 == 1){

         IO.println("O número de colunas não pode ser impar, porque eu não quero." );
         return; //interrompe o codigo se ele por impar

       } else{

         tabuleiro = coluna * coluna; //calcula a quantidade de quadrados do tabuleiro
          
    IO.println("A quantidade de quadradinhos do tabuleiro com base no número de colunas é: " + tabuleiro);
         
       };

    int i = 0; // coluna atual

    int quadradinhos = tabuleiro; //cópia de tabuleiro, porque o while vai diminuindo esse valor

    int row = 0; //linha atual

    while ( quadradinhos > 0 ){
        

     if((row + i) % 2 == 0)
        { //linha mais a coluna tipo coluna em 0 e linha em 0, o resto da 0
          IO.print("■ ");
    }
           else{IO.print("O ");

           }

            i = i + 1;

        if(i == coluna){  //verifica se o contador de colunas já chegou no valor que o usuario
            IO.println(); //botou se sim ele volta pro zero, e insere outra linha
            i = 0;         

            row = row + 1; //soma 1 a uma linha pra indicar que ta em outra
        };
        
   
         quadradinhos = quadradinhos - 1;
         

    }

   

}