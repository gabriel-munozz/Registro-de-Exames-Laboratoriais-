public class Vetor {
    Exames[] A; // armazena os elementos da lista - nomes
    int capacity; // capacidade do vetor
    int size; // elementos no vetor

    public Vetor(int capacity) {
        A = new Exames[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    
    public boolean isEmpty() {
        //verifica se o vetor esta vazio
        if (size==0)
            return true;
        else
            return false;
    }
    
    public int size() {
        //retorna a qtde de elementos na lista
        return size;    
    }

    public Exames get(int i) throws Exception {
        //retorna o elemento da posição i
        if (i>=size)
            throw new Exception ("Posição Inválida!!");
        return A[i];        
    }

    public void set(int i, Exames n) throws Exception {
        //altera o conteúdo da posição i para n
        if (i>=size)
            throw new Exception ("Posição Inválida!!");
        A[i]=n;
    }
    
    public void add(int i, Exames n) throws Exception {
        //insere novo elemento na lista na posição i
        if (size==capacity)
            throw new Exception ("A lista está cheia!");
        if (i>size)
            throw new Exception ("Posição de inserção Inválida!!");
        for (int z=size;z>i;z--)
            A[z]=A[z-1];
        A[i]=n;
        size++;
    }
    
    public void remove(int i) throws Exception {
        //remove o conteúdo da posição i
        if (isEmpty())
            throw new Exception ("A lista está vazia!!");
        if (i>=size)
            throw new Exception ("Posição Inválida!!");
        for(int z=i;z<size-1;z++)  
            A[z]=A[z+1];
        size--;           
    }

    public int search(Exames n) {
        //busca n na lista e retorna a posição onde foi encontrado ou -1
        for (int i=0;i<size;i++)
            if (A[i].nome.equals(n.nome)))
                return i;
        return -1;
    }

    public void mostraLista() {
        //exibe todos os elementos da lista
        System.out.println("\nElementos da lista");
      
        for (int i=0;i<size;i++)
            System.out.println(A[i].abrev);
            System.out.println(A[i].nome);
            System.out.println(A[i].qtDias);
    }
}
