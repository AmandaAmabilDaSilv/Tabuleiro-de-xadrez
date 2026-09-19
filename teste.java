void main(){
    String linha;
    linha = IO.readln("Quantas Colunas: ");
    String[] partes = linha.split(" ");

    int tabuleiro = 0;

    int coluna = Integer.parseInt(partes[0]);

       if(coluna % 2 == 1){

         IO.println("O número de colunas não pode ser impar, porque eu não quero." );

       } else{

         tabuleiro = coluna * 2;
          
    IO.println("A quantidade de quadradinhos do tabuleiro com base no número de colunas é: " + tabuleiro);
         
       };
      
    int quadradinhos = tabuleiro;
    while ( quadradinhos > 0 ){
         int i = 0;

         IO.println("*");
         
         quadradinhos = quadradinhos - 1;
         i = i + 1;

    }

   
    



}