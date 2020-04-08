package Deitel;

public class DadosCalculado
{
    private float peso;
    private float altura;

    /**
     * @param altura the altura to set
     */
    public void setAltura(final float altura) {
        this.altura = altura;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(final float peso) {
        this.peso = peso;
    }
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    public float CalculoIMC(){
        return peso/(altura*altura);
    }

    public String Resultado(){
        return "Seu IMC é " + CalculoIMC();
    }

}