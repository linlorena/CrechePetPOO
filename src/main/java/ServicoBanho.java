public class ServicoBanho extends Servico {
  private String tipoPet;

  public ServicoBanho(String descricao, double preco, int duracao, boolean disponibilidade, String tipoPet) {
      super(descricao, preco, duracao, disponibilidade, tipoPet);
  }

  @Override
  public void realizarServico() {
      System.out.println("Realizando serviço de banho: " + getDescricao());
      System.out.println("Tipo de pet: " + tipoPet);
      System.out.println("Preparando água e produtos adequados para o banho.");
      System.out.println("Banho suave e cuidadoso para garantir o bem-estar do pet.");
      System.out.println("Secagem completa e higiene após o banho.");
      System.out.println("Finalizando serviço de banho.");
  }

  @Override
    public void exibirInformacoes() {
      System.out.println("Serviço de Banho");
      System.out.println("Descrição: " + getDescricao());
      System.out.println("Preço: " + getPreco());
      System.out.println("Duração: " + getDuracao() + " minutos");
      System.out.println("Disponibilidade: " + (isDisponibilidade() ? "Sim" : "Não"));
      System.out.println("Tipo de Pet: " + tipoPet);
    }
}
