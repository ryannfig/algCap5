package quintapotencia;
import javax.swing.JOptionPane;
public class QuintaPotencia {

    public static void main(String[] args) {
      
        // Solicita o número usando JOptionPane
        String numeroString = JOptionPane.showInputDialog("Digite um número:");
        double numero = Double.parseDouble(numeroString);

        // Calcula o número elevado à quinta potência
        double resultado = Math.pow(numero, 5);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "O número elevado à quinta potência é: " + resultado);
        
    }
}
