import javax.swing.*;

public class Programa03 {
    public static void main(String[] entrada){
        int num1, num2;
        double pow, div;
        String msg = "";

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        div = (double) num1 / (double)num2;
        pow = Math.pow(num1, num2);

        msg = msg + "Quociênte da divisão de " + num1 + " por " + num2 + " = " + div + "\n";
        msg = msg + "Potência de " + num1 + " por " + num2 + " = " + pow + "\n";

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}
