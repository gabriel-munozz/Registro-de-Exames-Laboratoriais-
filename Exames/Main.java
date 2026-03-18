import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader arq = new FileReader("exames.txt");
        BufferedReader linha = new BufferedReader(arq);
        //Lê a linha de cabeçalho do TXT
        String aux = linha.readLine();
        
        //Lê a primeira linha do TXT
        aux = linha.readLine();
        while(aux != null){
            String[] dados = aux.split(",");
            System.out.print("\nAbreviação: " + dados[0]);
            System.out.print(" Nome do exame: " + dados[1]);
            System.out.print(" Resultado: " + dados[2] + " dias");
            aux = linha.readLine();
        }
        arq.close();

    }
}