package metodos;

public class CalcularMcd extends VerificarDatos{
    public int calcularMCD(int valor1, int valor2){
        if(valor2 == 0){
            return valor1;
        }else{
            return calcularMCD(valor2, valor1 % valor2);
        }
    }
}
