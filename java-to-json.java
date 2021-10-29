# Neste exemplo, o conteúdo de um objeto da classe Filme é convertido para 
# o formato JSON, armazenado na variável string “aux” e depois exibido na tela. 
# Veja que a classe Gson é inteligente o suficiente para entender a estrutura 
# do objeto e modelar as suas informações no formato JSON.
  
import java.util.ArrayList;

import com.google.gson.Gson;

  class Filme {
    public String titulo;
    public int ano;
    public ArrayList generos;
  }

  //classe com exemplo de uso do JSON
  //converte objeto Filme para uma string JSON
  public class GravandoJSON {

       public static void main(String[] args) {

        //instancia um filme e preenche suas propriedades
        Filme f = new Filme();
      f.titulo = "JSON x XML";
      f.ano = 2012;
      f.generos = new ArrayList();
      f.generos.add("Aventura");
      f.generos.add("Ação");
      f.generos.add("Ficção");

      //instancia um objeto da classe Gson
      Gson gson = new Gson();

      //pega os dados do filme, converte para JSON e armazena em string
      String aux = gson.toJson(f);

      //imprime os resultados
      System.out.println(aux);
       }
}
