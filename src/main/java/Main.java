import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

    public class Main {
        private static List<Servico> servicosSelecionados = new ArrayList<Servico>();
        
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CrechePet creche = new CrechePet();
        double total = 0.0;

        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Menu Funcionários");
            System.out.println("2. Menu Pets");
            System.out.println("3. Menu Tutores");
            System.out.println("4. Menu Serviços");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuFuncionarios(scanner, creche);
                    break;
                case 2:
                    menuPets(scanner, creche);
                    break;
                case 3:
                    menuTutores(scanner, creche);
                    break;
                case 4:
                    menuServicos(scanner, creche);
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void menuFuncionarios(Scanner scanner, CrechePet creche) {
        int opcao;
        do {
            System.out.println("\nMenu Funcionários:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Deletar Funcionário");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    creche.adicionarFuncionario(scanner);
                    break;
                case 2:
                    creche.listarFuncionarios();
                    break;
                case 3:
                    creche.atualizarFuncionario(scanner);
                    break;
                case 4:
                    creche.deletarFuncionario(scanner);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }

    private static void menuPets(Scanner scanner, CrechePet creche) {
        int opcao;
        do {
            System.out.println("\nMenu Pets:");
            System.out.println("1. Adicionar Pet");
            System.out.println("2. Listar Pets");
            System.out.println("3. Atualizar Pet");
            System.out.println("4. Deletar Pet");
            System.out.println("5. Passear com Gato");
            System.out.println("6. Adestrar Gato");
            System.out.println("7. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    creche.adicionarPet(scanner);
                    break;
                case 2:
                    creche.listarPets();
                    break;
                case 3:
                    creche.atualizarPet(scanner);
                    break;
                case 4:
                    creche.deletarPet(scanner);
                    break;
                case 5:
                    System.out.println("Digite o nome do gato para passear:");
                        String nomeGatoPassear = scanner.nextLine();
                        for (Pet pet : creche.getPets()) {
                            if (pet instanceof Gato && pet.getNome().equalsIgnoreCase(nomeGatoPassear)) {
                                try {
                                    ((Gato) pet).passear();
                                } catch (GatoNaoAdestravelException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Digite o nome do gato para adestrar:");
                        String nomeGatoAdestrar = scanner.nextLine();
                        for (Pet pet : creche.getPets()) {
                            if (pet instanceof Gato && pet.getNome().equalsIgnoreCase(nomeGatoAdestrar)) {
                                try {
                                    ((Gato) pet).adestrar();
                                } catch (GatoNaoAdestravelException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            }
                        }
                        break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 7);
    }

    private static void menuTutores(Scanner scanner, CrechePet creche) {
        int opcao;
        do {
            System.out.println("\nMenu Tutores:");
            System.out.println("1. Adicionar Tutor");
            System.out.println("2. Listar Tutores");
            System.out.println("3. Atualizar Tutor");
            System.out.println("4. Deletar Tutor");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    creche.adicionarTutor(scanner);
                    break;
                case 2:
                    creche.listarTutoresEPets();
                    break;
                case 3:
                    creche.atualizarTutor(scanner);
                    break;
                case 4:
                    creche.deletarTutor(scanner);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }

            private static void menuServicos(Scanner scanner, CrechePet creche) {
                int opcao;
                do {
                    System.out.println("\nMenu Serviços:");
                    System.out.println("1. Listar Serviços");
                    System.out.println("2. Atualizar Serviço");
                    System.out.println("3. Deletar Serviço");
                    System.out.println("4. Adicionar Serviço");
                    System.out.println("5. Finalizar Seleção de Serviços e Calcular Total");
                    System.out.println("6. Voltar ao Menu Principal");
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

            switch (opcao) {
                case 1:
                    listarServicos(creche);
                    break;
                case 2:
                    creche.atualizarServico(scanner);
                    break;
                case 3:
                    creche.deletarServico(scanner);
                    break;
                case 4:
                    adicionarServico(creche, servicosSelecionados, scanner);
                        break;
                case 5:
                    calcularTotal(servicosSelecionados);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }
    
    private static void listarServicos(CrechePet creche) {
        System.out.println("\nServiços oferecidos:");
        System.out.println("1. Hospedagem - R$ 50.0/dia");
        System.out.println("2. Banho - R$ 30.0 - 60 minutos");
        System.out.println("3. Passeio - R$ 40.0 - 90 minutos");
        System.out.println("4. Adestramento - R$ 60.0 - 180 minutos");
    }
    
        private static void adicionarServico(CrechePet creche, List<Servico> servicosSelecionados, Scanner scanner) {
            System.out.println("\nEscolha o serviço que deseja adicionar:");
            listarServicos(creche);
            int opcaoServico = scanner.nextInt();
            scanner.nextLine();

       switch (opcaoServico) {
            case 1:
                servicosSelecionados.add(new ServicoHospedagem("Hospedagem", 50.0, 120, true, "Cachorro"));
                break;
            case 2:
                servicosSelecionados.add(new ServicoBanho("Banho", 30.0, 60, true, "Cachorro"));
                break;
            case 3:
                servicosSelecionados.add(new ServicoPasseio("Passeio", 40.0, 90, true, "Cachorro"));
                break;
            case 4:
                servicosSelecionados.add(new ServicoAdestramento("Adestramento", 60.0, 180, true, "Cachorro"));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    
    private static void calcularTotal(List<Servico> servicosSelecionados) {
        double total = 0.0;
        for (Servico servico : servicosSelecionados) {
            total += servico.getPreco();
        }
        System.out.println("\nTotal em Reais: R$ " + total);
    }
}
