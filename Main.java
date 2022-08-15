// tempo para inserir 1_000_000 de elementos na pilha
// tempo para percorrer e somar 1_000_000 de elementos
// tempo para garantir que um numero esta na pilha

public class Main {
    
    public static void main(String[] args) {
        Pilha p = new Pilha(1_000_000);
        long t0 = System.nanoTime();
        for(int i=0; i<1_000_000; i++){
            p.empilhar(i);
        }
        long tf = System.nanoTime();
        System.out.println((tf-t0)/1e9 + "s para inserir 1000000 de elementos");

        System.out.println(p.somarTudo()/1e9 + "s para somar 1000000 de elementos");
        
        System.out.println(p.garantia()/1e9 + "s para garantir que um numero esta na pilha");
    }

}
