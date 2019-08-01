import java.util.Scanner;
public class projeto{
public static void main(String args [])
{
double inss, segVida, valRef, valTr, salario, totalGeral;
double totalImposto, salTotal;
String funcionario, dataEnt;
Scanner in = new Scanner(System.in);

//Entrada
System.out.println("Digite o nome do funcionário: ");//Nome do funcionário
funcionario = in.nextLine();
System.out.println("Digite seu salário: ");//Entra o salário do funcionário
salario = in.nextDouble();
System.out.println("Digite a data de entrada na empresa: ");//Entra a data de ingresso na empresa
dataEnt = in.nextLine();
String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(contato.getDataNascimento());
//Processamento
inss = salario * 0.10;
segVida =salario * 0.15;
valTr = salario * 0.05;
valRef = salario * 0.11;
totalImposto = inss+segVida+valTr+valTr+valRef;
salTotal = salario;
totalGeral = salario + totalImposto;
//Saída
System.out.println("Nome: " + funcionario);
System.out.println("INSS: " + "R$" + inss);
System.out.println("SegVida: " + "R$" + segVida);
System.out.println("VT: " + "R$" + valTr);
System.out.println("VR: " + "R$" + valRef);
System.out.println("Total de impostos: " + totalImposto);
System.out.println("Total de salário: " + salTotal);
System.out.println("Total geral " + totalGeral);

}
}
