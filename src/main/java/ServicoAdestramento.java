public class ServicoAdestramento extends Servico {
        private String tipoPet;

      public ServicoAdestramento(String descricao, double preco, int duracao, boolean disponibilidade, String tipoPet) {
          super(descricao, preco, duracao, disponibilidade, tipoPet);
      }

    public String getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(String tipoPet) {
        this.tipoPet = tipoPet;
    }

  @Override
  public void realizarServico() {
      System.out.println("Realizando serviço de adestramento: " + getDescricao());
      System.out.println("Iniciando sessões de treinamento com o pet.");
      System.out.println("Utilizando técnicas de adestramento adequadas para cada pet.");
      System.out.println("Reforçando comportamentos desejados e corrigindo comportamentos indesejados.");
      System.out.println("Interagindo de forma positiva e estimulante com o pet durante o adestramento.");
      System.out.println("Finalizando sessões de treinamento e avaliando progresso do pet.");
  }

  @Override
  public void exibirInformacoes() {
      System.out.println("Serviço de Adestramento:");
      System.out.println("Descrição: " + getDescricao());
      System.out.println("Preço: " + getPreco());
      System.out.println("Duração: " + getDuracao() + " horas");
      System.out.println("Disponibilidade: " + (isDisponibilidade() ? "Sim" : "Não"));
  }
}