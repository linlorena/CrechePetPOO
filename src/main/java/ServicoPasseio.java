public class ServicoPasseio extends Servico {
    private String tipoPet;

    public ServicoPasseio(String descricao, double preco, int duracao, boolean disponibilidade, String tipoPet) {
        super(descricao, preco, duracao, disponibilidade, tipoPet);
        this.tipoPet = tipoPet;
    }

    public String getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(String tipoPet) {
        this.tipoPet = tipoPet;
    }
    
  public void realizarServico(int duracaoPasseio, String local) {
      System.out.println("Realizando serviço de passeio: " + getDescricao());
      System.out.println("Tipo de pet: " + tipoPet);
      System.out.println("Duração do passeio: " + duracaoPasseio + " minutos");
      System.out.println("Local do passeio: " + local);
  }

  @Override
  public void realizarServico() {
      System.out.println("Realizando serviço de passeio: " + getDescricao());
      System.out.println("Tipo de pet: " + tipoPet);
      System.out.println("Preparando equipamentos e acessórios para o passeio.");
      System.out.println("Proporcionando um ambiente seguro e estimulante para o pet durante o passeio.");
      System.out.println("Observando o comportamento e bem-estar do pet durante todo o passeio.");
      System.out.println("Finalizando serviço de passeio.");
  }

      @Override
      public void exibirInformacoes() {
        System.out.println("Serviço: Passeio");
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Disponibilidade: " + (isDisponibilidade() ? "Sim" : "Não"));
        System.out.println("Tipo de pet: " + tipoPet);
      }
}