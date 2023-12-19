import javax.swing.JOptionPane;

public class SomaSerie {
    public static void main(String[] args) {
        // Solicita a quantidade de termos da série usando JOptionPane
        String nString = JOptionPane.showInputDialog("Digite a quantidade de termos da série:");
        int n = Integer.parseInt(nString);

        // Calcula a soma da série
        double soma = calcularSomaSerie(n);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "A soma da série para " + n + " termos é: " + soma,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Função para calcular a soma da série
    private static double calcularSomaSerie(int n) {
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += (double) i / ((10 * i) + 1);
        }
        return soma;
    }
}
