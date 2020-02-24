package game;

import materials.Coin;
import materials.CoinState;
import player.Player;
import utils.Statistics;

import java.util.*;

public class Game {

    private Rules rules;
    private Coin coin;
    private Map<Player, List<CoinState>> history;
    private Set<Player> jeu;

    public Game() {
        history = new HashMap<>();
        jeu = new HashSet<>();
    }

    /**
     * Ajouter un nouveau joueur au jeu
     *
     * @param player le nouveau joueur
     */
    public void addPlayer(Player player) {
      // TODO: Votre code ici
        jeu.add(player);
    }

    /**
     * Faire joueur tous les joueurs et stocker chaque partie dans history
     */
    public void play() {
      // TODO: Votre code ici
        List<CoinState> lstCoin = new ArrayList<>();
        for(Player p : jeu) {
            for(int i=0; i<3;i++) {
                p.play(coin);
                lstCoin.add(coin.getState());
            }
            history.put(p,lstCoin);
        }
    }

    /**
     * Calculer des statistiques de la partie précédente
     *
     * @return Statistics
     */
    public Statistics getStatistics() {
        Statistics stats = new Statistics(3,3,3,3);
      return stats;
    }

    /**
     * Obtenir l'historique de tous les joueurs de la partie précédente
     *
     * @return Map contenant chaque joueur et la liste des ses lancers
     */
    public Map<Player, List<CoinState>> getHistory() {
      // TODO: Votre code ici
      return history;
    }


    /**
     * Obtenir l'historique d'un joueur spécifique
     *
     * @param player instance du joueur pour lequel on veut avoir l'historique
     * @return la liste des lancers d'un joueur
     */
    public List<CoinState> getSpecificHistory(Player player) {
      // TODO: Votre code ici
        List<CoinState> lstCoinCourant = new ArrayList<>();
        for(Player p : history.keySet()) {
            if (p.equals(player)) {
                lstCoinCourant = history.get(p);
            }
        }
      return lstCoinCourant;
    }

}
