public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno  p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Edson");
        p2.setNome("Maria");
        p3.setNome("Helena");
        p4.setNome("Fabiana");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}