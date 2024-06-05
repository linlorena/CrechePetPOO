import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {
  private String nomePet;
  private List<Pet> pets; 
  private final List<Servico> servicosSelecionados;
  private double totalAPagar;
  private String tipoPet; 

  public Tutor(String nome, String telefone, String endereco, String email, String nomePet, String tipoPet) {
      super(nome, telefone, endereco, email);
      this.nomePet = nomePet;
      this.pets = new ArrayList<Pet>();
      this.servicosSelecionados = new ArrayList<Servico>();      
      this.totalAPagar = 0.0;
      this.tipoPet = tipoPet;
  }

  public String getNomePet() {
      return nomePet;
  }

  public void setNomePet(String novoNomePet) {
      this.nomePet = novoNomePet;
  }

  public String getTipoPet() {      
      return tipoPet; 
  }

  public void setTipoPet(String tipoPet) {
    this.tipoPet = tipoPet;
}

  public List<Servico> getServicosSelecionados() {
      return servicosSelecionados;
  }

    public List<Pet> getPets() {
      return this.pets;
    }

  public double getTotalAPagar() {
      return totalAPagar;
  }

  public void adicionarServico(Servico servico) {
      servicosSelecionados.add(servico);
      totalAPagar += servico.getPreco();
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Nome do Tutor: " + getNome());
      System.out.println("Telefone do Tutor: " + getTelefone());
      System.out.println("Endereço do Tutor: " + getEndereco());
      System.out.println("E-mail do Tutor: " + getEmail());
      System.out.println("Nome do Pet: " + nomePet);
      System.out.println("Tipo do Pet: " + tipoPet);
      System.out.println("Serviços Selecionados:");
      for (Servico servico : servicosSelecionados) {
          System.out.println(servico.getDescricao() + " - R$ " + servico.getPreco());
      }
      System.out.println("Total a Pagar: R$ " + totalAPagar);
  }

    public static Tutor criarTutor(Scanner scanner) {
        System.out.println("Digite o nome do tutor:");
        String nome = scanner.nextLine();
        return new Tutor(nome, "", "", "", "", "");    
    }

    public void atualizarTutor(Scanner scanner) {
        System.out.println("Digite o novo nome do tutor:");
        String novoNome = scanner.nextLine();
        setNome(novoNome); 
    
        System.out.println("Digite o novo telefone do tutor:");
        String novoTelefone = scanner.nextLine();
        setTelefone(novoTelefone); 
    
        System.out.println("Digite o novo endereço do tutor:");
        String novoEndereco = scanner.nextLine();
        setEndereco(novoEndereco); 
    
        System.out.println("Digite o novo e-mail do tutor:");
        String novoEmail = scanner.nextLine();
        setEmail(novoEmail); 
    
        System.out.println("Tutor atualizado com sucesso!");
}
} 
