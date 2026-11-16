package com.cricketcardbattle.model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class GamePlayer {

    private final String playerId;
    private final String displayName;
    private final Deque<PlayerCard> deck;

    public GamePlayer(String playerId, String displayName) {
        this.playerId = playerId;
        this.displayName = displayName;
        this.deck = new ArrayDeque<>();
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public PlayerCard drawCard() {
        return deck.pollFirst();
    }

    public void addCardsToBottom(List<PlayerCard> cards) {
        if (cards == null) {
            return;
        }
        for (PlayerCard card : cards) {
            if (card != null) {
                deck.addLast(card);
            }
        }
    }

    public int getCardCount() {
        return deck.size();
    }

    public boolean hasCards() {
        return !deck.isEmpty();
    }
}