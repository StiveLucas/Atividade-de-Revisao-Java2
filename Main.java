public class Main {

    public static void main(String[] args) {
        
        //instanciando classes
        Gerente gerente = new Gerente("Goku", 1400, "Admistrador", 200);
        Assistente assistente = new Assistente("Vegeta", 1200, "Admistrador");

        System.out.println(gerente+ "\nBonus Calculado com o salário: R$ "+gerente.bonusCalculado());
        System.out.println(assistente+ "\n5% do salário: R$ "+assistente.CalcularBonus());
    }
}