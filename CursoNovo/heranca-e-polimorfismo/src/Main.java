public class Main {
    
    public static void main(String[] args) throws Exception {
        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

    }


    public static void printEmpregado (Empregado empregado) {

        empregado.setNome("João Silva");
        ((Gerente)empregado).setLogin("joao");
        ((Gerente)empregado).setSenha("senha123");


        System.out.println(empregado.getClass());
        System.out.println(empregado.getNome());
        System.out.println(((Gerente)empregado).getLogin());
        System.out.println(((Gerente)empregado).getSenha());
    }
    
}
