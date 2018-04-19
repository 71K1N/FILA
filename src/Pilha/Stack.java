/* 
            ====================================================
            TIPO:       CLASS
            NAME:       Stack
            DESCRÇÃO:   implementação de pilha
            ----------------------------------------------------
            001         isEmpty    
            002         size
            003         print
            004         push
            005         limpar
            006         pop
            007         -------

            ====================================================

 */
package Pilha;


public class Stack {

    public int num, totalElementos;
    public Stack prox;
    Stack topo = null;
    Stack fim = null;
    Stack aux;
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
    boolean isEmpty() {
        if (topo == null) {
            return true;            
        }
        return false;
    }
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
    int size() {
        return this.totalElementos;
    }
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
    void print() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia ");
        } else {
            System.out.println("Consultando toda a Pilha");
            aux = topo;
            while (aux != null) {
                System.out.println(aux.num + "  ");
                aux = aux.prox;
            }
        }
    }
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
    void push(int value) {
        Stack novo = new Stack();
        novo.num = value;
        if (isEmpty()) {
            topo = novo;
            novo.prox = null;
            totalElementos++;
        } else {
            totalElementos++;
            novo.prox = topo;
            topo = novo;
        }
    }
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
    void limpar() {
        if (topo == null) {
            System.out.println("A pilha esta vazia");
        } else {
            topo = null;
            this.totalElementos=0;
            System.out.println("A pilha foi esvaziada");
        }
    }
//------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------
    int pop() {
        if (isEmpty()) {
            System.out.println("A pilha esta vazia");
        } else {
            aux = topo;
            topo = aux.prox;
            totalElementos--;
            return aux.num;
        }
        return -1;
    }
    //
}
