package metodos;

public class VerificarDatos {
  
    public int esUnNumero(String dato) {
        int numero = -1;
        if (dato != null) {

            try {
                numero = Integer.parseInt(dato);
                return numero;
            } catch (Exception e) {
                return numero;
            }
        }
        return numero;
    }
}
