package br.ufba.poo.lista2;

/**
 * Crie a classe `Aluno`, que possui os atributos `matricula` e `nome` (ambos do
 * tipo `String`), além dos métodos e construtores relevantes de acordo com a
 * seguinte especificação:
 *
 * - O nome do aluno pode ser alterado, mas nunca o seu número de matrícula
 * - O número de matrícula de um aluno deve poder ser acessado por outras partes
 * do programa
 * - Duas instâncias de `Aluno` são consideradas iguais se possuem o mesmo número
 * de matrícula
 *
 * Assuma, para este exercício, que a classe `Aluno` sempre será instanciada com um
 * número de matrícula e um nome válidos, passados nessa ordem.
 */
public class Aluno {
    private String NumeroMatricula;
    private String NomeAluno;

    public Aluno(String matricula, String nome) {
        this.NumeroMatricula = matricula;
        this.NomeAluno = nome;
    };

    public String getMatricula(){
        return NumeroMatricula;
    };

    public String getNome(){
        return NomeAluno;
    };

    public String setNome(String NovoNome){
        NomeAluno = NovoNome;
        return NomeAluno;
    };
    public boolean equals(Object aluno){
        Aluno AlunoComparado = (Aluno) aluno;
        return NumeroMatricula.equals(AlunoComparado.NumeroMatricula);
        
    }

}
