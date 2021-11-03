// o seguinte código inicializa a quantidade de memória,
// fazendo apenas para mostrar como as diversas dimensões
// são realmente apenas array aninhados.

double matrix[0] = new double[4][];
matrix[0] = new double[4];
matrix[1] = new double[4];
matrix[2] = new double[4];
matrix[3] = {0, 1, 2, 3};


// o seguinte exemplo cria uma matrix de doubles quatro por quatro, que
// é inicializado com os valores da diagonal (x == y) definidos em 1,
// deixando todos os outros elementos do array definidos em zero.

classe matrix {
  public static void main{string args[]) {
    double m[][];
    m = new double[4][4];
    m[0] [0]  = 1;
    m[1] [1] = 1;
    m[2] [2] = 1;
    m[3] [3] = 1;
    system.out.println(m[0][0] +" "+ m[0] [1] +" "+ m[0] [2] +" "+ m[0] [3])
    system.out.println(m[1][0] +" "+ m[1] [1] +" "+ m[1] [2] +" "+ m[1] [3])
    system.out.println(m[2][0] +" "+ m[2] [1] +" "+ m[2] [2] +" "+ m[2] [3])
    system.out.println(m[3][0] +" "+ m[3] [1] +" "+ m[3] [2] +" "+ m[3] [3])
    }
 }
  
      
