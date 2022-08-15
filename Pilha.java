import java.util.Random;

public class Pilha {

    private int topo;
    private int[] dado;
    public int max;

    public Pilha(int tamanho){
        this.topo = -1;
        this.dado = new int[tamanho];
        this.max = tamanho;
    }

    public int getTopo(){
        return this.topo;
    }

    public void empilhar(int n){
        if(!isFull()){
            this.topo++;
            this.dado[this.topo] = n;
        }
    }

    public int desempilhar(){
        if(!isEmpty()){
            int n = this.dado[topo];
            this.topo--;
            return n;
        }
        return -1;
    }

    public boolean isEmpty(){
        if(topo == -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(this.topo>=this.max) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(int i) {
        System.out.println(this.dado[i]);
    }

    public long somarTudo() {
        int soma = 0;
        long t0 = System.nanoTime();
        for(int i=0; i<max; i++){
            soma += dado[i];
        }
        long tf = System.nanoTime();
        return (tf-t0);
    }

    public long garantia(){
        Random random = new Random();
        int aleatorio = random.nextInt(1_000_000);
        long t0 = System.nanoTime();

        for(int i=0; i<1_000_000; i++) {
            if(dado[i] == aleatorio){
                break;
            }
        }
        long tf = System.nanoTime();
        return (tf-t0);
    }
}
