package produçao;
import javax.swing.JOptionPane;
public class Produçao {

    public static void main(String[] args) {
        final int DIAS_NO_ANO = 365;

        int quantidadeTotal = 0;
        int menorProducaoDiaria = Integer.MAX_VALUE;

        for (int dia = 1; dia <= DIAS_NO_ANO; dia++) {
            String producaoDiariaString = JOptionPane.showInputDialog("Digite a quantidade de automóveis produzidos no dia " + dia + ":");
            int producaoDiaria = Integer.parseInt(producaoDiariaString);

            quantidadeTotal += producaoDiaria;

            if (producaoDiaria < menorProducaoDiaria) {
                menorProducaoDiaria = producaoDiaria;
            }
        }
        
        JOptionPane.showMessageDialog(
                null,
                "a) A quantidade total produzida no ano todo é: " + quantidadeTotal + " automóveis.\n" +
                "b) A menor produção diária é: " + menorProducaoDiaria + " automóveis.",
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
