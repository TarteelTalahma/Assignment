package project;

public interface Calculater {

	int calculatedTotal(CoinBundle enteredCoins);
	CoinBundle calculateChange(int amountMoneyToReturn);
}
