import java.util.Scanner;
import java.util.InputMismatchException;

public class Funcionario {
  private String nome;
  private String telefone;
  private String email;
  private String cargo;
  private double salario;
  private String turno;

  public Funcionario(String nome, String telefone, String email, String cargo, double salario, String turno) {
      this.nome = nome;
      this.telefone = telefone;
      this.email = email;
      this.cargo = cargo;
      this.salario = salario;
      this.turno = turno;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getTelefone() {
      return telefone;
  }

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getCargo() {
      return cargo;
  }

  public void setCargo(String cargo) {
      this.cargo = cargo;
  }

  public double getSalario() {
      return salario;
  }

  public void setSalario(double salario) {
      this.salario = salario;
  }

  public String getTurno() {
      return turno;
  }

  public void setTurno(String turno) {
      this.turno = turno;
  }

  public void exibirInformacoes() {
      System.out.println("Nome: " + nome);
      System.out.println("Telefone: " + telefone);
      System.out.println("Email: " + email);
      System.out.println("Cargo: " + cargo);
      System.out.println("Salário: " + salario);
      System.out.println("Turno: " + turno);
  }

    public static Funcionario criarFuncionario(Scanner scanner) {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone do funcionário:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email do funcionário:");
        String email = scanner.nextLine();
        System.out.println("Digite o cargo do funcionário:");
        String cargo = scanner.nextLine();

        double salario = 0.0; 

        try {
            System.out.println("Digite o salário do funcionário:");
            salario = scanner.nextDouble();
            scanner.nextLine(); 

            if (salario < 0) {
                throw new IllegalArgumentException("O salário não pode ser negativo.");
            }
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Erro: Digite um valor numérico para o salário.");
        }

        System.out.println("Digite o turno do funcionário:");
        String turno = scanner.nextLine();

        return new Funcionario(nome, telefone, email, cargo, salario, turno);
    }

    public void atualizarFuncionario(Scanner scanner) {
        System.out.println("Digite o novo nome do funcionário:");
        this.nome = scanner.nextLine();
        System.out.println("Digite o novo telefone do funcionário:");
        this.telefone = scanner.nextLine();
        System.out.println("Digite o novo email do funcionário:");
        this.email = scanner.nextLine();
        System.out.println("Digite o novo cargo do funcionário:");
        this.cargo = scanner.nextLine();
        System.out.println("Digite o novo salário do funcionário:");
        this.salario = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Digite o novo turno do funcionário:");
        this.turno = scanner.nextLine();
        System.out.println("Dados do funcionário atualizados com sucesso!");
    }

public void deletarFuncionario(String nomeFuncionario) {
        if (this.nome.equals(nomeFuncionario)) {
            this.nome = "";
            this.telefone = "";
            this.email = "";
            this.cargo = "";
            this.salario = 0.0;
            this.turno = "";
            System.out.println("Funcionário deletado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}