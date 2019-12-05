package coreexample;

public class SonImpl implements FatherI, MotherI {

	public static void main(String[] args) {
		FatherI father = new SonImpl();
		float AmountFromFatherI = father.getAmountfromFather(60);
		MotherI mother = new SonImpl();
		float AmountFromMotherI = mother.getAmountfromMother(60);
		System.out.println("AmountFromFather:" + AmountFromFatherI);
		System.out.println("AmountFromMother:" + AmountFromMotherI);
	}

	@Override
	public float getAmountfromMother(int percentage) {

		return (MotherI.credits - MotherI.debits) * percentage / 100;

	}

	@Override
	public float getAmountfromFather(int percentage) {

		return (FatherI.credits - FatherI.debits) * percentage / 100;
	}

}
