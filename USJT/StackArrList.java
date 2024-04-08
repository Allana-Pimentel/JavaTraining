package USJT;
import java.util.List;
import java.util.ArrayList;

public class StackArrList<T> {
    private List <T> elements;

    public void StackArrayList(){
        this.elements = new ArrayList<>();

    }
    public void push(T element){
        System.out.println("o elemento foi: " + element);

        this.elements.add(element);
    }
    public T pop(){
        if(this.elements.isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
        }
        System.out.println("o elemento removido foi: "+ (this.elements.size()-1));
        return this.elements.remove(elements.size()-1);
    }
    public T peek(){
        if(this.elements.isEmpty()){
            throw new IllegalStateException("Pilha Vazia");
    }
        return this.elements.get(this.elements.size()-1);
}
    public boolean isEmpty
            
    public static void main(String[] args){
        StackArrayList<Integer> stack = new StackArrayList<>();
        stack.push(10);

    }
}
```
### 4 - Exemplos de testes com a classe StackArrList.java