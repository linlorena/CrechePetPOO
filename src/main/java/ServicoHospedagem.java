public class ServicoHospedagem extends Servico {
        private String tipoPet;

      public ServicoHospedagem(String descricao, double preco, int duracao, boolean disponibilidade, String tipoPet) {
          super(descricao, preco, duracao, disponibilidade, tipoPet);
      }

  public String getTipoPet() {
      return tipoPet;
  }

  @Override
  public void realizarServico() {
      System.out.println("Realizando serviço de hospedagem: " + getDescricao());
      System.out.println("Tipo de pet: " + tipoPet);
      System.out.println("Preparando ambiente para o pet se hospedar.");
      System.out.println("Fornecendo cama confortável e brinquedos para entretenimento.");
      System.out.println("Garantindo alimentação adequada conforme as instruções do tutor.");
      System.out.println("Finalizando serviço de hospedagem.");
  }

    @Override
      public void exibirInformacoes() {
          System.out.println("Serviço de hospedagem:");
          System.out.println("Descrição: " + getDescricao());
          System.out.println("Preço: R$" + getPreco());
          System.out.println("Duração: " + getDuracao() + " dias");
          System.out.println("Disponibilidade: " + (isDisponibilidade() ? "Sim" : "Não"));
          System.out.println("Tipo de Pet: " + tipoPet);
      }
}
