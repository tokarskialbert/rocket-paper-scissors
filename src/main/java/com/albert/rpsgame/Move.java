package com.albert.rpsgame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Move {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

    static Map<Integer, Move> moveMap = new HashMap<>();

    static {
        moveMap.put(1, Move.ROCK);
        moveMap.put(2, Move.PAPER);
        moveMap.put(3, Move.SCISSORS);
        moveMap.put(4, Move.LIZARD);
        moveMap.put(5, Move.SPOCK);
    }

    public static Map<Integer, Move> getMoveMap() {
        return moveMap;
    }

    List<Move> beats = new ArrayList<>();

    static {
        ROCK.beats.add(SCISSORS);
        ROCK.beats.add(LIZARD);

        PAPER.beats.add(ROCK);
        PAPER.beats.add(SPOCK);

        SCISSORS.beats.add(PAPER);
        SCISSORS.beats.add(LIZARD);

        LIZARD.beats.add(PAPER);
        LIZARD.beats.add(SPOCK);

        SPOCK.beats.add(ROCK);
        SPOCK.beats.add(SCISSORS);
    }

    public boolean beats(final Move m) {
        return beats.contains(m);
    }
}
