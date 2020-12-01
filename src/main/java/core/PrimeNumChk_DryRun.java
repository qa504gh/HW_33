package core;

public class PrimeNumChk_DryRun {
public Boolean validate(final Integer primeNumber) {
for (int i = 2; i < (primeNumber / 2); i++) {
if (primeNumber % i == 0) {
	return true;          //return false; switch places
}
}
return false;    //return true;       switch places
}
}