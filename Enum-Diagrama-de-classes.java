public enum Cartas {
       A, J, Q, K;
} 

// inicializando valores

public enum CartasEnum {
	J(11),Q(12),K(13),A(14);

	public int valorCarta;
	CartasEnum(int valor) {
		valorCarta = valor;
	}
}

// inicializando opções de menu

public enum OpcoesMenu {	
	SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	OpcoesMenu(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
}

// classe testadora

public class TestadoraEnum {
	public static void escolheOpcao(OpcoesMenu opcao){
		if(opcao == OpcoesMenu.SALVAR){
			System.out.println("Salvando o arquivo!");
		}
		else if(opcao == OpcoesMenu.ABRIR){
			System.out.println("Abrindo o arquivo!");
		}
	}

	public static void main(String[] args) {
		escolheOpcao(OpcoesMenu.ABRIR);	
	}
}

// imprimindo valor EnumSyntax

public enum MarcasEnum {
	AMAZON, DELL, HP, TOSHIBA, LG, SAMSUNG;
}
Veja a saída de um valor através do método name.

// Imprimindo Valor

public class TestadoraEnum {	
	public static void main(String[] args) {
		MarcasEnum hp = MarcasEnum.HP;	
MarcasEnum samsung = MarcasEnum. SAMSUNG;	
		System.out.println("Nome da Marca = "+hp.name());
System.out.println("Nome da Marca = "+samsung.name());
	}
}

Percorrendo Valor

public class TestadoraEnum {	
	public static void main(String[] args) {
for(OpcoesMenu op : OpcoesMenu.values()){
			System.out.print("Menu " + op + " = " + op.getValor()+"\n");
}
	}
}

// Comparando Valores Enum
// Um Enum pode ser comparado com outro objeto através do método equals.

// Na Listagem declaramos o método “comparaEnum” do tipo static para ser
// acessível para toda a classe e fazer referência ao tipo Enum declarado.

// Listagem Usando o método equals

public class TestadoraEnum {
public static void comparaEnum(OpcoesMenu opcao){
		if(opcao.equals(OpcoesMenu.SALVAR)){
			System.out.println("Foi escolhido a opção Salvar");
		}else if(opcao.equals(OpcoesMenu.ABRIR)){
			System.out.println("Foi escolhido a opção ABRIR");
		}else if(opcao.equals(OpcoesMenu.FECHAR)){
			System.out.println("Foi escolhido a opção FECHAR");
		}
	}
	
	public static void main(String[] args) {
		comparaEnum(OpcoesMenu.SALVAR);
	}
}


// Nos tipos Enum também existem outros métodos descritos abaixo.

// String toString() - retorna uma String com o nome da instância (em maiúsculas).
// valueOf(String nome) – retorna o objeto da classe enum cujo nome é a string do argumento.
// int ordinal() - retorna o número de ordem do objeto na enumeração.

// Mais informações acesse o link da documentação onde irá encontrar mais características
// e métodos: http://docs.oracle.com/javase/6/docs/api/java/lang/Enum.html

