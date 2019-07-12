package JunitClasses;

public class PrimeNumber {

	public String PrimeOrNotPrime(int number) {
		int temp = number/2;
		boolean flag = false;
		if(number == 0 || number == 1) {
			flag = true;
			return "Not Prime";
			
		}
		for(int i = 2; i < temp; i++) {
			if(number%i == 0) {
				flag = true;
				return "Not Prime";
			}
		}
		if(flag==false) {
			return "Prime";
		}
		return "finish";
		
	}
}
