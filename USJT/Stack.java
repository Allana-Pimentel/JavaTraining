package USJT;

public class Stack {
    private int[] arr;
    private int topo;
    private int capacidade;

    public Stack (int size) {
        this.arr = new int[size];
        this.capacidade = size;
        this.topo = -1;
    }
    public void push(int x){
        if(isFull()){
            throw new IllegalStateException("Pilha cheia!");
        }
        System.out.println("Foi incluido");

        arr[++topo] =  x;

    }
    public int pop (int x){
        if(isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        System.out.println("Foi removido o elemento" + this.arr[arr.length]);

        return this.arr[topo--];

    }

    public int topo(){
        if(isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        return this.arr[topo];
    }
    public int tamanho(){
        return this.topo  + 1;
    }
    public boolean isEmpty(){
        return this.topo -1 == -1;
    }
    public boolean isFull(){
        return this.topo == (this.capacidade -1);
    }

    public static void main(String[] args){
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("o elemento do topo da pilha é " + stack.topo());//3
        stack.topo();
        System.out.println("o elemento do topo da pilha é " + stack.topo());//2
        stack.push(4);
        System.out.println("o tamanho da pilha é " + stack.tamanho());

    }

    }
