public class ServicoImpl extends Servico {
        private String tipoPet;

      public ServicoImpl(String descricao, double preco, int duracao, boolean disponibilidade, String tipoPet) {
          super(descricao, preco, duracao, disponibilidade, tipoPet);
      }

  @Override
  public void realizarServico() {
      if (super.isDisponibilidade()) {
          System.out.println("Realizando o serviço: " + getDescricao());
          System.out.println("Preço do serviço: R$ " + getPreco());
          System.out.println("Duração estimada: " + getDuracao() + " horas");
          setDisponibilidade(false); 
          System.out.println("Serviço realizado com sucesso!");
      } else {
          System.out.println("Este serviço não está disponível no momento.");
      }
  }

    @Override
      public void exibirInformacoes() {
          System.out.println("Informações do serviço:");
          System.out.println("Descrição: " + getDescricao());
          System.out.println("Preço: R$ " + getPreco());
          System.out.println("Duração: " + getDuracao() + " horas");
          System.out.println("Disponibilidade: " + (isDisponibilidade() ? "Sim" : "Não"));
      }
}
