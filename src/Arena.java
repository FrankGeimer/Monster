import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Monster> lMonster = new ArrayList<>();

		lMonster.add(new FireMonster("FireMonster", 20, 100));
		lMonster.add(new GrassMonster("GrassMonster", 20, 100));
		lMonster.add(new WaterMonster("WaterMonster", 20, 100));

		for (int i = 1; i <= lMonster.size(); i++) {

			System.out.println(lMonster.get(i - 1).getName() + "(" + i + ")");
		}
		System.out.println("Which monster do you want to play?");

		Scanner input = new Scanner(System.in);
		int erster = input.nextInt();
		input.close();
		Monster monster1 = lMonster.get(erster - 1);
		lMonster.remove(erster - 1);

		//int number;
		double random;
		random = Math.random() * lMonster.size();
		//System.out.println(((int) random) + 1);

		//int zweiter = 0;
		Monster monster2 = lMonster.get((int) random);
		lMonster.remove((int) random);

		System.out.println(monster1.getName());
		System.out.println(monster2.getName());
		
		while (monster1.getLife()>0 && monster2.getLife()>0) {
		monster1.takeHit(monster2);
		monster2.takeHit(monster1);} 
		
	}
		
}
