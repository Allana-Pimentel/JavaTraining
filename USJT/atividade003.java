package USJT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Cat {
    private String codigo;
    private String nome;
    private String raca;
    private int idade;
    private String doenca;
    private double valorAtendimento;

    public Cat(String codigo, String nome, String raca, int idade, String doenca, double valorAtendimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.doenca = doenca;
        this.valorAtendimento = valorAtendimento;
    }

    // Aqui as informações serão salvas
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getDoenca() {
        return doenca;
    }

    public double getValorAtendimento() {
        return valorAtendimento;
    }
}

// código principal
public class atividade003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cat> cats = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n\nO que você deseja fazer?");
            System.out.println("1. Cadastrar um novo gato");
            System.out.println("2. Consultar os dados de um gato por meio do código");
            System.out.println("3. Consultar gatos por nome");
            System.out.println("4. Listar os gatos atendidos em ordem alfabética");
            System.out.println("5. Apagar dados de um gato");
            System.out.println("6. Localizar a ordem dos dados de um gato na listagem");
            System.out.println("7. Levantar quantos gatos da listagem possuem uma idade específica");
            System.out.println("8. Somar o valor total dos atendimentos");
            System.out.println("9. Sair");

            // metodos que chamam as opções
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cadastrarGato(scanner, cats);
                    break;
                case 2:
                    consultarGatoPorCodigo(scanner, cats);
                    break;
                case 3:
                    consultarGatosPorNome(scanner, cats);
                    break;
                case 4:
                    listarGatosOrdemAlfabetica(cats);
                    break;
                case 5:
                    apagarDadosGato(scanner, cats);
                    break;
                case 6:
                    localizarOrdemGato(scanner, cats);
                    break;
                case 7:
                    levantarQuantidadeGatosIdade(scanner, cats);
                    break;
                case 8:
                    somarValorTotalAtendimentos(cats);
                    break;
                case 9:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
    
    private static void cadastrarGato(Scanner scanner, ArrayList<Cat> cats) {
        System.out.println("Digite os dados do novo gato:");
        System.out.print("Código: ");
        String codigo = scanner.next();
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Raça: ");
        String raca = scanner.next();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Doença: ");
        String doenca = scanner.next();
        System.out.print("Valor do atendimento: ");
        double valorAtendimento = scanner.nextDouble();

        Cat cat = new Cat(codigo, nome, raca, idade, doenca, valorAtendimento);//criação de novo gato e guarda a informação com as variaveis da classe, array
        cats.add(cat); //adicionado na lista de cat
        System.out.println("Gato cadastrado com sucesso.");
    }

    private static void consultarGatoPorCodigo(Scanner scanner, ArrayList<Cat> cats) {
        System.out.print("Digite o código do gato: ");
        String codigoConsulta = scanner.next();
        for (Cat cat : cats) {
            if (cat.getCodigo().equals(codigoConsulta)) {
                System.out.println("Dados do gato:");
                System.out.println("Código: " + cat.getCodigo());
                System.out.println("Nome: " + cat.getNome());
                System.out.println("Raça: " + cat.getRaca());
                System.out.println("Idade: " + cat.getIdade());
                System.out.println("Doença: " + cat.getDoenca());
                System.out.println("Valor do atendimento: R$" + cat.getValorAtendimento());
                return;
            }
        }
        System.out.println("Gato não encontrado.");
    }

    private static void consultarGatosPorNome(Scanner scanner, ArrayList<Cat> cats) {
        System.out.print("Digite o nome do gato a ser consultado: ");
        String nomeConsulta = scanner.next();
        for (Cat cat : cats) {
            if (cat.getNome().equalsIgnoreCase(nomeConsulta)) {
                System.out.println("Gato encontrado: " + cat.getNome());
            }
        }
    }

    private static void listarGatosOrdemAlfabetica(ArrayList<Cat> cats) {
        Collections.sort(cats, Comparator.comparing(Cat::getNome));
        System.out.println("Listagem dos gatos atendidos em ordem alfabética:");
        for (Cat cat : cats) {
            System.out.println(cat.getNome());
        }
    }

    private static void apagarDadosGato(Scanner scanner, ArrayList<Cat> cats) {
        System.out.print("Digite o código do gato a ser removido: ");
        String codigoRemover = scanner.next();
        cats.removeIf(cat -> cat.getCodigo().equals(codigoRemover));
        System.out.println("Dados do gato removidos, se existirem.");
    }

    private static void localizarOrdemGato(Scanner scanner, ArrayList<Cat> cats) {
        System.out.print("Digite o nome do gato para encontrar a posição na listagem: ");
        String nomePosicao = scanner.next();
        int posicao = cats.indexOf(new Cat("", nomePosicao, "", 0, "", 0));
        if (posicao != -1) {
            System.out.println("O gato " + nomePosicao + " está na posição " + (posicao + 1) + " na listagem.");
        } else {
            System.out.println("Gato não encontrado na listagem.");
        }
    }

    private static void levantarQuantidadeGatosIdade(Scanner scanner, ArrayList<Cat> cats) {
        System.out.print("Digite a idade a ser pesquisada: ");
        int idadePesquisa = scanner.nextInt();
        int quantidadeGatosIdade = 0;
        for (Cat cat : cats) {
               if (cat.getIdade() == idadePesquisa) {
                        quantidadeGatosIdade++;
                    }
                }
                System.out.println("Quantidade de gatos com " + idadePesquisa + " anos: " + quantidadeGatosIdade);
            }

            private static void somarValorTotalAtendimentos(ArrayList<Cat> cats) {
                double valorTotalAtendimentos = 0;
                for (Cat cat : cats) {
                    valorTotalAtendimentos += cat.getValorAtendimento();
                }
                System.out.println("Valor total dos atendimentos: R$" + valorTotalAtendimentos);
            }
        }

