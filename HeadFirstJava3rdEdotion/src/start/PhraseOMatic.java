package start;

public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordListOne = {"Хліб", "банан", "татари", "полуниця", "япко", "сусулька", "сигарети","паляниця"};
		String[] wordListTwo = {"я", "він", "вона", "вони", "нероби", "сусіди", "марсіани"};
		String[] wordListThree = {"купили", "знайшли",  " вкрали", "подарили", "скомуніздили"};
		
		int oneLength = wordListOne.length;
		int TwoLength = wordListTwo.length;
		int ThreeLength = wordListThree.length;
		
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(TwoLength);
		int rand3 = randomGenerator.nextInt(ThreeLength);
		String Phraza = wordListTwo[rand2] + " " + wordListOne[rand1]+ " " + wordListThree [rand3];
		System.out.println(Phraza);
		
	}

}
