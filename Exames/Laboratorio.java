import.java.io.*;

public class Laboratorio throws Exception{
    Vetor listaExamesDisponiveis;
    Vetor pedidodoDia;

    public Laboratorio(){
        listaExamesDisponiveis = new Vetor(150);
        pedidodoDia = new Vetor(100);
    }

    public void lerArquivo(){
        FileReader arq = new FileReader("exames.txt");
        BufferedReader linha = new BufferedReader(arq);
        //Lê a linha de cabeçalho do TXT
        String aux = linha.readLine();
        
        //Lê a primeira linha do TXT
        aux = linha.readLine();
        int pos = 0;
        while(aux != null){
            String[] dados = aux.split(",");
            //Criar objeto do tipo Exame
            Exames ex = new Exame(dados[0], dados[1], Integer.parseInt(dados[2]));
            listaExamesDisponiveis.add(pos, ex);
            pos++;
            aux = linha.readLine();
        }
        arq.close();
    }
}
