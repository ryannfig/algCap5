package xelevadoay;
import javax.swing.JOptionPane;
public class XElevadoAY {

    public static void main(String[] args) {
        // Solicita o número X usando JOptionPane
        String xString = JOptionPane.showInputDialog("Digite o número X:");
        double x = Double.parseDouble(xString);

        // Solicita a potência Y usando JOptionPane
        String yString = JOptionPane.showInputDialog("Digite a potência Y:");
        double y = Double.parseDouble(yString);

        // Calcula X elevado à potência Y
        double resultado = Math.pow(x, y);

        // Exibe o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "O número " + x + " elevado à potência " + y + " é: " + resultado);
       
    }
}
