package materials;

import java.util.Random;

public class Coin {

  private CoinState coinState;

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    // TODO : Votre code ici
    Random rand = new Random();
    int pileOuFace = rand.nextInt(2);
    if(pileOuFace == 0){
      coinState = CoinState.HEADS;
    } else {
      coinState = CoinState.TAILS;
    }
  }

  public CoinState getState() {
    return coinState;
  }

  @Override
  public String toString() {
    return "Coin{" + "coinState=" + coinState + '}';
  }
}
