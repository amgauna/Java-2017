# Desta vez, o conteúdo da String “aux” contém os dados do filme modelados
# no formato JSON. Esse conteúdo é transportado automaticamente para um 
# objeto do tipo Filme, bastando realizar uma chamada ao método “fromJson”.
# Observe que o método fromJson requisita os seguintes parâmetros: a string
# JSON e a classe do objeto que receberá os resultados.  
  
import java.util.ArrayList;

import com.google.gson.Gson;

  class Filme {
    public String titulo;
    public int ano;
    public ArrayList generos;
  }


  //classe com exemplo de uso do JSON
  //converte objeto Filme para uma string JSON
public class LendoJSON {


   public static void main(String[] args) {

  //string com informação representada em JSON
      String aux = "{\"titulo\":\"JSON James\",\"ano\":2012,\"generos\":[\"Western\"]}";

  //instancia um objeto da classe Gson
  Gson gson = new Gson();

  //instancia um filme e preenche seus dados com a informação vinda
//da string JSON
  Filme f = gson.fromJson(aux, Filme.class);

  //imprime os resultados
  System.out.println(f.titulo);
  System.out.println(f.ano);
  System.out.println(f.generos.toString());
  }
}
