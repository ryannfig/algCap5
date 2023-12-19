package questaosete;
import javax.swing.JOptionPane;
public class QuestaoSete {

    public static void main(String[] args) {
       int x;
       int i = 1;
       
       while(i<20)
       {
           x = (int) Math.pow(i, 2);
           x = 1 + 2;
           JOptionPane.showMessageDialog(null,i+x);
           i = i + 2;
           JOptionPane.showMessageDialog(null, "Passei por aqui");
       }
       JOptionPane.showMessageDialog(null, "Ufa, cheguei aqui");
    }
    
}
