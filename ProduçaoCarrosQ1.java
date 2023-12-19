package produçao;
import javax.swing.JOptionPane;
public class Produçao {

    public static void main(String[] args) {
        final int DIAS_NO_ANO = 365; // Número de dias em um ano

        // Solicita a quantidade diária de automóveis usando JOptionPane
        int quantidadeTotal = 0;
        int menorProducaoDiaria = Integer.MAX_VALUE;

        for (int dia = 1; dia <= DIAS_NO_ANO; dia++) {
            String producaoDiariaString = JOptionPane.showInputDialog("Digite a quantidade de automóveis produzidos no dia " + dia + " (-1 para encerrar):");
            int producaoDiaria = Integer.parseInt(producaoDiariaString);

            // Verifica se o usuário encerrou a digitação
            if (producaoDiaria == -1) {
                break;
            }

            // Atualiza a quantidade total se a produção for maior ou igual a 0
            if (producaoDiaria >= 0) {
                quantidadeTotal += producaoDiaria;

                // Atualiza a menor produção diária
                if (producaoDiaria < menorProducaoDiaria) {
                    menorProducaoDiaria = producaoDiaria;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite um valor maior ou igual a 0 para a produção diária.", "Erro", JOptionPane.ERROR_MESSAGE);
                dia--; // Decrementa o contador de dias para repetir a iteração do mesmo dia
            }
        }

        // Exibe os resultados usando JOptionPane
        JOptionPane.showMessageDialog(
                null,
                "a) A quantidade total produzida no ano todo é: " + quantidadeTotal + " automóveis.\n" +
                        "b) A menor produção diária é: " + (menorProducaoDiaria == Integer.MAX_VALUE ? "Nenhuma produção registrada" : menorProducaoDiaria + " automóveis."),
                "Resultados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}


    
