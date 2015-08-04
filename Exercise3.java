public class Exercise3 {

	public static void main(String[] args) {

		double[] numbers = new double[20];
		numbers[0] = 1;

		for (int i = 1; i < 20; i++) {
			numbers[i] = 2 * numbers[i - 1];
			
		}

		double[] means = new double[20];

		means[0] = 1;
		means[means.length - 1] = numbers[19];
		

		for (int i = 1; i < 19; i++) {
			means[i] = (numbers[i-1]+numbers[i+1])/2;
			System.out.println(means[i]);
			}

	}

}
