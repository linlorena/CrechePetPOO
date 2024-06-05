public class Cachorro extends Pet implements BanhoPet, PasseioPet, Hospedagem, Adestramento {
  public Cachorro(String nome, int idade, String tipo, double peso) {
      super(nome, idade, tipo, peso);
  }

  @Override
  public void emitirSom() {
      System.out.println("Au au!");
  }

  public void emitirSom(int vezes) {
      for (int i = 0; i < vezes; i++) {
          System.out.println("Au au!");
      }
  }

  @Override
  public void darBanho() {
      System.out.println("Dando banho em " + getNome());
      System.out.println("Aplicando shampoo em " + getNome());
      System.out.println("Enxaguando " + getNome());
      System.out.println("Secando " + getNome());
  }

  @Override
  public void passear() {
      System.out.println("Levando " + getNome() + " para passear.");
      System.out.println(getNome() + " está feliz passeando!");
  }

  @Override
  public void hospedar() {
      System.out.println("Hospedando cão de nome " + getNome() + " na creche.");
      System.out.println("Preparando espaço confortável para cão " + getNome());
      System.out.println("Fornecendo cama e brinquedos para cão " + getNome());
  }

  @Override
  public void adestrar() {
      System.out.println("Adestrando " + getNome());
      System.out.println(getNome() + " aprendeu a sentar e deitar!");
  }
}
