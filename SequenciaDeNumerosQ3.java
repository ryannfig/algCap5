package sequenciadenumeros;
import javax.swing.JOptionPane;
public class SequenciaDeNumeros {
    
    public static void main(String[] args) {
        // Solicita o valor de N usando JOptionPane
        String nString = JOptionPane.showInputDialog("Digite o valor de N:");
        int n = Integer.parseInt(nString);

        // Calcula a soma da série
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / (2 * i);
        }

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "A soma da série para N = " + n + " é: " + soma,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
