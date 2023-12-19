package numeros;
import javax.swing.JOptionPane;
public class Numeros {
    
    public static void main(String[] args) {
       
        StringBuilder resultado = new StringBuilder();

        // Loop for para gerar e adicionar os números
        for (int i = 1; i <= 31; i++) {
            int numero = i * i;
            resultado.append(numero).append(", ");
        }

        // Exibe os resultados usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "Os números sugeridos são:\n" + resultado.toString(),
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
