import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Pet {
    private static final List<Pet> listaPets = new ArrayList<Pet>();               private String nome;
    private int idade;
    private String tipo;
    private double peso;

    public Pet(String nome, int idade, String tipo, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void emitirSom();
    public abstract void darBanho();
    public abstract void hospedar();
    public abstract void passear();
    public abstract void adestrar();

    public static Pet criarPet(Scanner scanner) {
        System.out.println("Digite o nome do pet:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do pet:");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o tipo do pet (gato/cachorro):");
        String tipo = scanner.nextLine();
        System.out.println("Digite o peso do pet:");
        double peso = Double.parseDouble(scanner.nextLine());

        Pet novoPet;
        if (tipo.equalsIgnoreCase("gato")) {
            novoPet = new Gato(nome, idade, tipo, peso);
        } else if (tipo.equalsIgnoreCase("cachorro")) {
            novoPet = new Cachorro(nome, idade, tipo, peso);
        } else {
            throw new IllegalArgumentException("Tipo de pet não suportado.");
        }
        listaPets.add(novoPet);
        return novoPet;
    }

    public static List<Pet> listarPets() {
        return listaPets;
    }

    public void atualizarPet(Scanner scanner) {
        System.out.println("Digite a nova idade do pet:");
        int novaIdade = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o novo peso do pet:");
        double novoPeso = Double.parseDouble(scanner.nextLine());

        this.idade = novaIdade;
        this.peso = novoPeso;
        System.out.println("Pet atualizado com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Pet: " + nome);
        System.out.println("Idade do Pet: " + idade);
        System.out.println("Tipo do Pet: " + tipo);
        System.out.println("Peso do Pet: " + peso);
    }

    public void excluirPet() {
        listaPets.remove(this);
    }
}
