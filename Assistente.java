public class Assistente extends Funcionario {

    public Assistente(String nome, double salario, String cargo){
        super(nome, salario, cargo);
    }

    public double CalcularBonus(){
        return (getSalario() / 5);

    }

    public String toString(){
        return "\nAssistente: \nNome: "+getNome()+"\nCargo: "+getCargo()+"\nSalário: R$ "+getSalario();
    }


    
}
