public class Main {


    public static void main(String[] args) {
        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

}

    public static void printEmpregado(Empregado empregado) {

        System.out.printf("=======%s=======\n", empregado.getClass().getCanonicalName());

        if (empregado instanceof Gerente gerente){
        
        
        }
        switch (empregado) {
            case Gerente gerente -> {
                gerente.setCodigo("001");
                gerente.setNome("João");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setPassword ("123456");
                gerente.setComissao(600);


                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getPassword());
                System.out.println(gerente.getComissao());
            }
            
            case Vendedor vendedor -> {
                vendedor.setCodigo("002");
                vendedor.setNome("Maria");
                vendedor.setSalario(2000);
                vendedor.setPercentualComissao(10);


                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getPercentualComissao());
            }
        }
        System.out.println("=====================\n");


    }

}