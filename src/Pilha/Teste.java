package Pilha;

public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack pilha = new Stack();
        //EMPILHANDO
        pilha.push(10);
        pilha.push(11);
        pilha.push(12);
        pilha.push(13);
        pilha.push(9);
        //MOSTRAR PILHA
        System.out.println("Elementos: ");
        pilha.print();
        //REMOVER ELEMENTOS
        System.out.println("Remover elemento no topo:");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        //MOSTAR ELEMENTOS
        System.out.println("Elementos: ");
        pilha.print();
        //TOTAL DE ELEMENTOS NA PILHA
        System.out.println(pilha.size());
        //LIMPAR PILHA
        pilha.limpar();
        //TAMANHO DA PILHA
        System.out.println(pilha.size());
        //MOSTRAR ELEMENTOS DA PILHA
        //pilha.print();
        
    }
    
}
