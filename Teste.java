package Teste;

public class Pessoa{

    private String nome;
    private LocalDate dataNascimento;
}
public Pessoa(String nome, LocalDate dataNascimento) {
        nome = nome;
        dataNascimento = dataNascimento;}
public class Funcionario extends Pessoa {

    private BigDecimal salario;
    private String funcao;

}        
public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
    super(nome, dataNascimento);
        salario = salario;
        funcao = funcao;
}
public class Principal {

    public static void main(String[] args) {
            	
}
/*Foi sómente o que consegui fazer, devido ao pouco conhecimento que tenho em java*/