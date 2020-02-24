package game;

import materials.Coin;
import materials.CoinState;

import java.util.List;

public class Rules {

  /**
   * Cette méthode permet de déterminer si une suite d'états de pièce permet de gagner à une partie
   * @param states liste d'états pour un joueur
   * @return true si un joueur a gagné, false sinon
   */
  public boolean checkWin(List<CoinState> states) {
    // TODO: Votre code ici
    int cmptHead = 0;
    int cmptTails = 0;
    boolean resultat = false;
    for (CoinState cs : states) {
      if (cs.equals(CoinState.HEADS)) {
        cmptHead++;
      } else {
        cmptTails++;
      }
    }
    if (cmptHead == 3 || cmptTails == 3) {
      resultat = true;
    }
    return resultat;
  }
}
