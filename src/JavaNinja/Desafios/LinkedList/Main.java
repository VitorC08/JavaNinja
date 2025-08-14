package JavaNinja.Desafios.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        LinkedList<Ninja> ninjaList = new LinkedList<>();

        //lista será inicializada com 7 ninjas;
        ninjaList.add(0, new Ninja("Naruto Uzumaki", 17, "Vila da Folha"));
        ninjaList.add(1, new Ninja("Sasuke Uchiha", 17, "Vila da Folha"));
        ninjaList.add(2, new Ninja("Sakura Haruno", 17, "Vila da Folha"));
        ninjaList.add(3, new Ninja("Kakashi Hatake", 27, "Vila da Folha"));
        ninjaList.add(4, new Ninja("Gaara", 17, "Vila da Areia"));
        ninjaList.add(5, new Ninja("Neji Hyuga", 18, "Vila da Folha"));
        ninjaList.add(6, new Ninja("Rock Lee", 17, "Vila da Folha"));

        //gerenciamento da lista com menu (do-while);
        do {

            System.out.println("=== Escolha uma opção ===");
            System.out.println("1- Ver Lista completa de ninjas.");
            System.out.println("2- Remover um ninja do inicio da lista");
            System.out.println("3- Adicionar um ninja no inicio da lista");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 0){
                System.out.println("Saindo da lista de gerenciamento de ninjas...");
                break;
            }

            switch (option){
                case 1:
                    for (Ninja ninja : ninjaList){
                        System.out.println(ninja);
                    }
                    break;

                case 2 :
                    if (!ninjaList.isEmpty()){
                        System.out.println("Removendo o ninja: " + ninjaList.get(0).nome() + " da lista...");
                        ninjaList.removeFirst();
                    } else {
                        System.out.println("A lista de ninjas está vazia, não há ninjas para remover !");
                    }
                    break;

                case 3 :
                    System.out.println("Digite o nome do ninja que deseja adicionar: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade do ninja: ");
                    int idade = scanner.nextInt();

                    System.out.println("Digite a vila que o ninja pertence: ");
                    String vila = scanner.nextLine();
                    scanner.nextLine();

                    //validação nos dados do ninja adicionado;
                    if( isValid(nome) && idade > 0 && isValid(vila)){
                        ninjaList.addFirst(new Ninja(nome, idade, vila));
                        System.out.println("ninja " + ninjaList.get(0).nome() + " foi adicionado no inicio da lista.");
                    } else {
                        System.out.println("Os dados estão incompletos ou incorretos, tente novamente");
                    }
                    break;

                default:
                    System.out.println("A opção digitada não existe, tente uma opção valida.");
            }
        }while (option != 0);

        scanner.close();

    }

    //utilizado para validar as entradas de Strings;
    public static boolean isValid(String str){
        return str != null && !str.trim().isEmpty();
    }
}
