package com.albert.rpsgame;

import java.util.ArrayList;
import java.util.List;

public enum Move {
    ROCK, PAPER, SCISSORS, LIZARD, SPOCK;

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
