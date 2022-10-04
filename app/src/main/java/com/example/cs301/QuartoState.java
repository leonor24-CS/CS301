package com.example.cs301;

import java.util.ArrayList;

public class QuartoState {

    public enum PlayerTurn {
        ONE, TWO
    }

    public enum TypeTurn {
        CHOOSE, PLACE
    }

    private ArrayList<Piece> pieces;
    private Piece[] availPieces;
    private Piece[][] board;

    public QuartoState()
    {
        // instantiating pieces
        for (int i = 0; i <= 16; i++) {
            pieces.add(i);
        }

        // creating pool of available pieces
        availPieces = new Piece[16];

        // creating game board for pieces to be placed on
        board = new Piece[4][4];
    }




}
