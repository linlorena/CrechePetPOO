    import java.util.ArrayList;
    import java.util.Iterator;
    import java.util.List;
    import java.util.Scanner;

    public class CrechePet {
        private final List<Funcionario> funcionarios;
        private List<Pet> pets;
        private final List<Tutor> tutores;
        private final List<Servico> servicos;

        public CrechePet() {
            this.funcionarios = new ArrayList<Funcionario>();
            this.pets = new ArrayList<Pet>();
            this.tutores = new ArrayList<Tutor>();
            this.servicos = new ArrayList<Servico>();
        }

        public void adicionarFuncionario(Scanner scanner) {
            Funcionario funcionario = Funcionario.criarFuncionario(scanner);
            funcionarios.add(funcionario);
        }

        public void listarFuncionarios() {
            for (Funcionario funcionario : funcionarios) {
                funcionario.exibirInformacoes();
            }
        }

        public void atualizarFuncionario(Scanner scanner) {
            System.out.println("Digite o nome do funcionário que deseja atualizar:");
            String nome = scanner.nextLine();
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getNome().equals(nome)) {
                    funcionario.atualizarFuncionario(scanner);
                    return;
                }
            }
            System.out.println("Funcionário não encontrado.");
        }

        public void deletarFuncionario(Scanner scanner) {
            System.out.println("Digite o nome do funcionário que deseja deletar:");
            String nome = scanner.nextLine();
            Iterator<Funcionario> iterator = funcionarios.iterator();
            while (iterator.hasNext()) {
                Funcionario funcionario = iterator.next();
                if (funcionario.getNome().equals(nome)) {
                    iterator.remove();
                    System.out.println("Funcionário deletado com sucesso!");
                    return;
                }
            }
            System.out.println("Funcionário não encontrado.");
        }

        public void adicionarTutor(Scanner scanner) {
            Tutor tutor = Tutor.criarTutor(scanner);
            tutores.add(tutor);
        }

        public void listarTutores() {
            for (Tutor tutor : tutores) {
                tutor.exibirInformacoes();
            }
        }

        public void listarTutoresEPets() {
            for (Tutor tutor : this.tutores) {
                System.out.println("Tutor: " + tutor.getNome());
                for (Pet pet : tutor.getPets()) {
                    System.out.println("  Pet: " + pet.getNome());
                }
            }
        }

        public void atualizarTutor(Scanner scanner) {
            System.out.println("Digite o nome do tutor que deseja atualizar:");
            String nome = scanner.nextLine();
            for (Tutor tutor : tutores) {
                if (tutor.getNome().equals(nome)) {
                    tutor.atualizarTutor(scanner);
                    return;
                }
            }
            System.out.println("Tutor não encontrado.");
        }

        public void deletarTutor(Scanner scanner) {
            System.out.println("Digite o nome do tutor que deseja deletar:");
            String nome = scanner.nextLine();
            Iterator<Tutor> iterator = tutores.iterator();
            while (iterator.hasNext()) {
                Tutor tutor = iterator.next();
                if (tutor.getNome().equals(nome)) {
                    iterator.remove();
                    System.out.println("Tutor deletado com sucesso!");
                    return;
                }
            }
            System.out.println("Tutor não encontrado.");
        }

        public void adicionarPet(Scanner scanner) {
            Pet pet = Pet.criarPet(scanner);
            pets.add(pet);
        }

        public void listarPets() {
            if (pets.isEmpty()) {
                System.out.println("Nenhum pet cadastrado.");
            } else {
                System.out.println("Lista de Pets:");
                for (Pet pet : pets) {
                    System.out.println(pet.getNome()); 
                }
            }
        }

        public List<Pet> getPets() {
            return pets;
        }

        public void atualizarPet(Scanner scanner) {
            System.out.println("Digite o nome do pet que deseja atualizar:");
            String nome = scanner.nextLine();
            for (Pet pet : pets) {
                if (pet.getNome().equals(nome)) {
                    pet.atualizarPet(scanner);
                    return;
                }
            }
            System.out.println("Pet não encontrado.");
        }

        public void deletarPet(Scanner scanner) {
            System.out.println("Digite o nome do pet que deseja deletar:");
            String nome = scanner.nextLine();
            Iterator<Pet> iterator = pets.iterator();
            while (iterator.hasNext()) {
                Pet pet = iterator.next();
                if (pet.getNome().equals(nome)) {
                    iterator.remove();
                    System.out.println("Pet deletado com sucesso!");
                    return;
                }
            }
            System.out.println("Pet não encontrado.");
        }

        public void adicionarServico(Scanner scanner) {
            System.out.println("Digite a descrição do serviço:");
            String descricao = scanner.nextLine();
            System.out.println("Digite o preço do serviço:");
            double preco = scanner.nextDouble();
            System.out.println("Digite a duração do serviço:");
            int duracao = scanner.nextInt();
            scanner.nextLine();  
            System.out.println("Digite a disponibilidade do serviço (true/false):");
            boolean disponibilidade = scanner.nextBoolean();
            scanner.nextLine();  

            Servico novoServico = new ServicoImpl(descricao, preco, duracao, disponibilidade, null);
            servicos.add(novoServico);
            System.out.println("Serviço adicionado com sucesso!");
        }

        public void listarServicos() {
            for (Servico servico : servicos) {
                servico.exibirInformacoes();
            }
        }

        public void atualizarServico(Scanner scanner) {
            System.out.println("Digite a descrição do serviço que deseja atualizar:");
            String descricao = scanner.nextLine();
            for (Servico servico : servicos) {
                if (servico.getDescricao().equals(descricao)) {
                    servico.atualizarServico(scanner);
                    return;
                }
            }
            System.out.println("Serviço não encontrado.");
        }

        public void deletarServico(Scanner scanner) {
            System.out.println("Digite a descrição do serviço que deseja deletar:");
            String descricao = scanner.nextLine();
            Iterator<Servico> iterator = servicos.iterator();
            while (iterator.hasNext()) {
                Servico servico = iterator.next();
                if (servico.getDescricao().equals(descricao)) {
                    iterator.remove();
                    System.out.println("Serviço deletado com sucesso!");
                    return;
                }
            }
            System.out.println("Serviço não encontrado.");
        }
    }
