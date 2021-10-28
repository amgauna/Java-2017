import javax.swing.JOptionPane;
public class Main{
public static void main(String args[]){
String veiculos[];
veiculos = new String[10];
int horas[];
horas = new int[10];
boolean continua = true;
do{
String opc =
JOptionPane.showInputDialog(
"1-Incluir Veículo\n"+
"2-Retirar Veículo\n"+
"3-Mostrar Veículos\n"+
"4-Fechamento\n"+
"5-Trocar de Vaga\n"+
"6-Sair");
if ( opc.equals("1") ){
Estacionamento estac = new Estacionamento();
//incluir
String placa =
JOptionPane.showInputDialog(null,"Informe a Placa");
int hora =
Integer.parseInt(
JOptionPane.showInputDialog(null,"Informe a hora")
);
estac.incluirVeiculo(placa,hora) ;
}else if ( opc.equals("2")){
//Retirar Veículo
}else if ( opc.equals("3")){
Estacionamento estac = new Estacionamento();
String vagas = estac.mostrarVeiculo();
JOptionPane.showMessageDialog(null,vagas);
}else if ( opc.equals("4") ){
//Fechamento
}else if ( opc.equals("5") ){
//Trocar Vaga
}else if ( opc.equals("6") ){
continua = false;
}else{
JOptionPane.showMessageDialog(null,"Opção inválida");
}
}while(continua);
}
}
 
 
 
esta é a classe estacionamento..
 
 
 
import javax.swing.*;
public class Estacionamento{
private String veiculos[] = new String[10];
private int horas[] = new int[10];
public void incluirVeiculo(String placa, int hora){
boolean incluido = false;
for (int i=0; i< veiculos.length; i++){
if (veiculos == null){
veiculos = placa;
horas = hora;
i=veiculos.length;
JOptionPane.showMessageDialog(null,
"Veículo incluído com sucesso");
incluido = true;
}
}
if (!incluido){
JOptionPane.showMessageDialog(null,
"Não existe vaga vazia");
}
}
public String mostrarVeiculo(){
//Mostrar Veículos
String vagas = "";
for(int i=0; i<veiculos.length;i++){
if (veiculos!=null)
vagas+="Vaga "+(i+1)+" "+veiculos+"\n";
else
vagas+="Vaga "+(i+1)+" vazia\n";
}
return vagas;
}
}
 
 
 
// obs: nao esta dando certo os outros itens do menu
