package questaodez;
import javax.swing.JOptionPane;
public class QuestaoDez {
    
    public static void main(String[] args) {
        // Lê 5 valores para a variável A usando JOptionPane
        int[] valoresA = new int[5];
        for (int i = 0; i < 5; i++) {
            String valorString = JOptionPane.showInputDialog("Digite o valor " + (i + 1) + " para A:");
            valoresA[i] = Integer.parseInt(valorString);
        }

        // Conta quantos valores são negativos
        int contadorNegativos = contarNegativos(valoresA);

        // Exibe a informação usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "Quantidade de valores negativos: " + contadorNegativos,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Função para contar quantos valores são negativos
    private static int contarNegativos(int[] valores) {
        int contador = 0;
        for (int valor : valores) {
            if (valor < 0) {
                contador++;
            }
        }
        return contador;
    }
}

   
