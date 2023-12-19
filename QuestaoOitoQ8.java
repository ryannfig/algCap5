package questaosete;
import javax.swing.JOptionPane;
public class QuestaoSete {

    public static void main(String[] args) {
       int x = 0;
       int y = 30;
       
       while(x<10)
       {
           x = x + 1;
           y = y - 1;        
       }
       JOptionPane.showMessageDialog(null, x);
       JOptionPane.showMessageDialog(null, y);
    }
    
}
