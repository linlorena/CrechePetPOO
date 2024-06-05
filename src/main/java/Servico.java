import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Servico {
    private static final List<Servico> listaServicos = new ArrayList<Servico>();

    private String descricao;
    private double preco;
    private int duracao;
    private boolean disponibilidade;
    private String tipoPet; 

    public Servico(String descricao, double preco, int duracao, boolean disponibilidade, String tipoPet) {
        this.descricao = descricao;
        this.preco = preco;
        this.duracao = duracao;
        this.disponibilidade = disponibilidade;
        this.tipoPet = tipoPet; 
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public abstract void exibirInformacoes();
    public abstract void realizarServico();

    public static List<Servico> getListaServicos() {
        return listaServicos;
    }

    public void atualizarServico(Scanner scanner) {
        System.out.println("Digite a descrição do serviço que deseja atualizar:");
        String descricao = scanner.nextLine();
        for (Servico servico : listaServicos) { 
            if (servico.getDescricao().equals(descricao)) {
                System.out.println("Digite o novo preço:");
                double novoPreco = Double.parseDouble(scanner.nextLine());

                System.out.println("Digite a nova duração:");
                int novaDuracao = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite a nova disponibilidade (true/false):");
                boolean novaDisponibilidade = Boolean.parseBoolean(scanner.nextLine());

                servico.setPreco(novoPreco);
                servico.setDuracao(novaDuracao);
                servico.setDisponibilidade(novaDisponibilidade);
                return;
            }
        }
        System.out.println("Serviço não encontrado.");
    }


    public static void removerServico(String descricao) {
        for (Servico servico : listaServicos) {
            if (servico.getDescricao().equals(descricao)) {
                listaServicos.remove(servico);
                break;
            }
        }
    }
}
    
