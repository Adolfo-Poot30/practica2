package metodos;

public class CalcularFactorial extends VerificarDatos{
    
    public int calcularFactorial(int valor){
        if(valor == 0){
            return 1;
        }else{
            return valor * calcularFactorial(valor-1);
        }
    }
}
