package com.albert.rpsgame;

import java.util.ArrayList;
import java.util.List;

public enum Move {
    ROCK(1), PAPER(2), SCISSORS(3), LIZARD(4), SPOCK(5);

    Move(int i) {
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

    public static Move findPlayerMove(UserDecision userDecision) {
        return Move.values()[Integer.parseInt(userDecision.getChosenNumber())-1];
    }

    public static Move findComputerMove(UserDecision userDecision) {
        Move computerMove = Move.values()[userDecision.drawNumber()-1];
        System.out.println("Komputer wybrał " + computerMove);
        return computerMove;
    }
}
