package combate;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int rounds;

		Champion champion1 = new Champion();
		Champion champion2 = new Champion();

		System.out.printf("Digite os dados do primeiro campeão: ");
		System.out.printf("%nNome: ");
		champion1.setName(sc.nextLine());

		System.out.printf("Vida Inicial: ");
		champion1.setLife(sc.nextInt());

		System.out.printf("Ataque: ");
		champion1.setAttack(sc.nextInt());

		System.out.printf("Armadura: ");
		champion1.setArmor(sc.nextInt());
		sc.nextLine();

		System.out.printf("Digite os dados do segundo campeão: ");
		System.out.printf("%nNome: ");
		champion2.setName(sc.nextLine());

		System.out.printf("Vida Inicial: ");
		champion2.setLife(sc.nextInt());

		System.out.printf("Ataque: ");
		champion2.setAttack(sc.nextInt());

		System.out.printf("Armadura: ");
		champion2.setArmor(sc.nextInt());

		System.out.printf("%nQuantos turnos você deseja executar?: ");
		rounds = sc.nextInt();

		for (int i = 0; i < rounds; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			
			System.out.printf("%nResultado do turno: %d", i + 1);
			System.out.printf("%n%s", champion1.status());
			System.out.printf("%n%s%n", champion2.status());
			
			if (champion1.getLife() == 0 || champion2.getLife() == 0) {
				break;
			}
		}
		
		System.out.printf("%nFIM DO COMBATE");
	}
}
