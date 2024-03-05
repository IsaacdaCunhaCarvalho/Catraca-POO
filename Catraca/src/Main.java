import java.util.List;

class Pessoa {
    private String nome;
    private String cargo;

    public Pessoa(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}

class Catraca {
    private boolean catraca;

    public Catraca() {
        this.catraca = true;
    }

    public void destravar() {
        this.catraca = false;
        System.out.println("Catraca destravada.");
    }

    public void travar() {
        this.catraca = true;
        System.out.println("Catraca travada.");
    }

    public boolean Passar(Pessoa pessoa) {
        if (!catraca) {
            System.out.println(pessoa.getNome() + " passou pela catraca.");
            travar();
            return true;
        } else {
            System.out.println("A catraca está travada. " + pessoa.getNome() + " não pode passar.");
            return false;
        }
    }
}

class Permissao {
    public void permissao(String cargo) {
        List<String> cargos = List.of("Gerente", "Supervisor", "Analista");
        String cargoVerificado = cargo;
        if (cargos.contains(cargoVerificado)) {
        }
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }
}