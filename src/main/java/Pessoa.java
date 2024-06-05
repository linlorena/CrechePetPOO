public abstract class Pessoa {
  private String nome;
  private String telefone;
  private String endereco;
  private String email;

  public Pessoa(String nome, String telefone, String endereco, String email) {
      this.nome = nome;
      this.telefone = telefone;
      this.endereco = endereco;
      this.email = email;
  }

  public String getNome() {
      return nome;
  }

  public String getTelefone() {
      return telefone;
  }

  public String getEndereco() {
      return endereco;
  }

  public String getEmail() {
      return email;
  }

  public void setNome(String nome) {
    this.nome = nome;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public void setEmail(String email) {
    this.email = email;
}

  public abstract void exibirInformacoes();
}
