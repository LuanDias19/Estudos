public sealed abstract class Empregado permits Gerente, Vendedor {

    private String codigo;
    private String nome;
    private String endereco;
<<<<<<< HEAD
    private int age;
    private double salario;
=======
    private int salario;
>>>>>>> versaoDeteste


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
<<<<<<< HEAD
=======

>>>>>>> versaoDeteste
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
<<<<<<< HEAD
=======

>>>>>>> versaoDeteste
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
<<<<<<< HEAD
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
=======

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
>>>>>>> versaoDeteste
        this.salario = salario;
    }
    
}
