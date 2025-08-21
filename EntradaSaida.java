import javax.swing.JOptionPane;
public class EntradaSaida{
    static public void main(String [] args){
        //classes empacotadoras(weappers) - Double: (class)transforma string em double
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        double soma = n1 + n2;
        JOptionPane.showMessageDialog(null, soma);
    }
}