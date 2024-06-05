public class Gato extends Pet implements BanhoPet, Hospedagem {
  public Gato(String nome, int idade, String tipo, double peso) {
      super(nome, idade, tipo, peso);
  }

  @Override
  public void emitirSom() {
      System.out.println("Miau!");
  }

  public void emitirSom(int vezes) {
      for (int i = 0; i < vezes; i++) {
          System.out.println("Miau!");
      }
  }

  @Override
  public void darBanho() {
      System.out.println("Dando banho em " + getNome());
      System.out.println("Enxaguando " + getNome());
      System.out.println("Secando " + getNome());
  }

  @Override
  public void hospedar() {
      System.out.println("Hospedando felino de nome " + getNome() + " na creche.");
      System.out.println("Preparando espaço confortável para felino  " + getNome());
      System.out.println("Fornecendo cama e brinquedos para felino " + getNome());
  }

    @Override
    public void passear() {
        throw new GatoNaoAdestravelException(getNome() + " não quer passear!");
    }

    @Override
    public void adestrar() {
        throw new GatoNaoAdestravelException(getNome() + " não quer ser adestrado!");
    }
}

