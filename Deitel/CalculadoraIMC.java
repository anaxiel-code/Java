package Deitel;

import javax.swing.JOptionPane;

/**
 * CalculadoraIMC
 */
public class CalculadoraIMC
{   public static void main(String[] args) 
    {
        DadosCalculado dados = new DadosCalculado();

        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o peso"));
        dados.setPeso(peso);

        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a altura"));
        dados.setAltura(altura);

        JOptionPane.showMessageDialog(null, dados.Resultado()+"\nBMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater" , "Results", 0);
    }
}
