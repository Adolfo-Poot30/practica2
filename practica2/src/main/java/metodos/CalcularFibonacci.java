
package metodos;

public class CalcularFibonacci extends VerificarDatos{
    
    public int calcularFibonacci(int valor){
        if(valor == 0){
            return 0;
        }else if(valor == 1){
            return 1;
        }else{
            return calcularFibonacci(valor-1)+calcularFibonacci(valor-2);
        }
    }
    
}
