class Carro {
    private String modelo;
    private String cor;
    private int ano;

    // Construtor
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

class Pessoa {
    private String nome;
    private Carro carro;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    // Método para dirigir
    public void dirigir() {
        if (carro != null) {
            System.out.println(nome + " está dirigindo o " + carro.getModelo() + " de cor " + carro.getCor() + " do ano " + carro.getAno());
        } else {
            System.out.println(nome + " não tem um carro para dirigir.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Prata", 2021);
        Carro carro2 = new Carro("Honda", "Preto", 2023);

        Pessoa pessoa = new Pessoa("João");

        // João pode dirigir o carro1
        pessoa.setCarro(carro1);
        pessoa.dirigir();

        // João troca de carro e dirige o carro2
        pessoa.setCarro(carro2);
        pessoa.dirigir();
    }
}
