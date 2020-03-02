package player;

import materials.Coin;

public class Player {

  private int id;

  @Override
  public String toString() {
    return "Son id est " + id ;
  }

  public Player(int id) {
    this.id = id;
  }

  public void play(Coin coin) {
    for (int i=0; i<3; i++) {
      coin.throwCoin();
    }
  }

}
