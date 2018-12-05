import java.util.Scanner;

public class Main {


    private static void menu() {

        System.out.println("***** M E N U *****");
        System.out.println("1 - Editar projeto");
        System.out.println("2 - Incluir informações");
        System.out.println("3 - Consultar informações");
        System.out.println("4 - Mostrar relatório de produção acadêmica");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcão: ");
    }


    public static void main(String[] args) {
        int opc=0, opc2 = 0, opc3 = 0;
        String nome;
        Scanner input = new Scanner(System.in);

        do {
            menu();
            opc = input.nextInt();
            System.out.println();
            switch (opc) {

                case 1: {
                    System.out.println("1 - Alocar participante");
                    System.out.println("2 - Alterar status");
                    System.out.println("0 - Voltar para o menu");
                    System.out.print("Escolha uma opcão: ");
                    opc2 = input.nextInt();
                    if (opc2 == 1) {
                        System.out.println("Digite o nome do participante");
                        input.nextLine();
                        nome = input.nextLine();
                        System.out.println("Participante alocado!");
                        System.out.println();
                    } else if (opc2 == 2) {
                        System.out.println("1 - Em elaboração para em andamento");
                        System.out.println("2 - Em andamento para concluído");
                        System.out.println("0 - Voltar para o menu");
                        System.out.print("Escolha uma opcão: ");
                        opc3 = input.nextInt();
                        if(opc3 == 1) {
                            System.out.println("Status alterado com sucesso!");
                            System.out.println();
                        }else if(opc3 == 2) {
                            System.out.println("Status alterado com sucesso!");
                            System.out.println();
                        }else if(opc3 == 0) {

                        }
                    } else if (opc2 == 0) {

                    }
                    break;
                }
                case 2: {

                    break;
                }

                case 3: {
                    System.out.println("1 - Consultar por colaborador");
                    System.out.println("2 - Consultar por projeto");
                    System.out.println("0 - Voltar para o menu");
                    System.out.print("Escolha uma opcão: ");
                    opc2 = input.nextInt();
                    System.out.println();
                    if (opc2 == 1) {

                    } else if (opc2 == 2) {

                    } else if (opc2 == 0) {

                    }
                    break;
                }
                case 4: {

                    break;
                }
                case 0: {
                    break;
                }


            }
        }while(opc != 0);
    }

}
