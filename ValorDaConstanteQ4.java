package valorden;
import javax.swing.JOptionPane;
public class ValorDeN {

    public static void main(String[] args) {
        // Solicita o número de termos para a série usando JOptionPane
        String nString = JOptionPane.showInputDialog("Digite o número de termos para a série:");
        int n = Integer.parseInt(nString);

        // Calcula a aproximação de PI usando a série
        double pi = calcularPI(n);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "A aproximação de PI com " + n + " termos é: " + pi,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Função para calcular a aproximação de PI
    private static double calcularPI(int n) {
        double resultado = 0.0;
        for (int i = 0; i < n; i++) {
            resultado += (i % 2 == 0 ? 1 : -1) * 4.0 / (2 * i + 1);
        }
        return resultado;
    }
}
