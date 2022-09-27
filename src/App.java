import java.util.*;

public class App {

    static Usuario user = new Usuario(1, "Lucas", "");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        escolhaUser();
        sc.close();
    }

    public static void escolhaUser() {

        System.out.println("Digite o número de qual usuário você quer ser:");
        System.out.println("1 - Administrador");
        System.out.println("2 - Médico");
        System.out.println("3 - Paciente");
        System.out.println("4 - Encerrar o menu");
        int option = sc.nextInt();
        System.out.println();

        switch (option) {
            case 1:
                user.setTipo("Administrador");
                System.out.println();
                break;
            case 2:
                user.setTipo("Médico");
                System.out.println();
                break;
            case 3:
                user.setTipo("Paciente");
                System.out.println();
                break;
            case 4:
                System.exit(0);
                System.out.println();
                break;
            default:
                System.out.println("Você digitou uma opção inválida, por favor, digite um número de 1 a 4");
                break;
        }
        menu();

    }

    public static void menu() {

        if (user.getTipo().equals("Médico")) {
            System.out.println("Digite o número de qual operação você quer realizar:");
            System.out.println("1 - Incluir nova autorização de exame");
            System.out.println("2 - listar todas as autorizações de exame");
            System.out.println("3 - Trocar Usuário");
            System.out.println("4 - Encerrar o programa");
            int option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    novaAutorizacao();
                    System.out.println();
                    break;
                case 2:
                    // listExam();
                    System.out.println();
                    break;
                case 3:
                    // trocarUser();
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    System.out.println();
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida, por favor, digite um número de 1 a 4");
                    break;
            }
            menu();
        }

        if (user.getTipo().equals("Paciente")) {
            System.out.println("Digite o número de qual operação você quer realizar:");
            System.out.println("1 - Marcar um exame como realizado");
            System.out.println("2 - Listar todas as suas autorizações de exame");
            System.out.println("3 - Trocar Usuário");
            System.out.println("4 - Encerrar o programa");
            int option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    // marcarExam();
                    System.out.println();
                    break;
                case 2:
                    // listExam();
                    System.out.println();
                    break;
                case 3:
                    // trocarUser();
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    System.out.println();
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida, por favor, digite um número de 1 a 4");
                    break;
            }
            menu();
        }

        if (user.getTipo().equals("Administrador")) {
            System.out.println("Digite o número de qual operação você quer realizar:");
            System.out.println("1 - Incluir um novo usuário");
            System.out.println("2 - Buscar um médico ou paciente");
            System.out.println("3 - Ver estatísticas gerais");
            System.out.println("4 - Trocar Usuário");
            System.out.println("5 - Encerrar o programa");
            int option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    // novoUser();
                    System.out.println();
                    break;
                case 2:
                    // buscar();
                    System.out.println();
                    break;
                case 3:
                    // estatisticas());
                    System.out.println();
                    break;
                case 4:
                    // trocarUser();
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    System.out.println();
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida, por favor, digite um número de 1 a 4");
                    break;
            }
            menu();
        }

        
    }

    public static void novaAutorizacao() {
        System.out.print("Digite o código de autorização do exame:");
        int codigo;
        while (true) {
            codigo = sc.nextInt();
            if (codigo > 0) {
                break;
            } else {
                System.out.println("Digite um valor maior que ZERO: ");
            }
        }
    }

}
