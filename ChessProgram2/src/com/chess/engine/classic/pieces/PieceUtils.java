package com.chess.engine.classic.pieces;

import com.chess.engine.classic.Alliance;
import com.chess.engine.classic.board.BoardUtils;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

enum PieceUtils {

    INSTANCE;

    private final Table<Alliance, Integer, com.chess.engine.classic.pieces.Queen> ALL_POSSIBLE_QUEENS = PieceUtils.createAllPossibleMovedQueens();
    private final Table<Alliance, Integer, Rook> ALL_POSSIBLE_ROOKS = PieceUtils.createAllPossibleMovedRooks();
    private final Table<Alliance, Integer, com.chess.engine.classic.pieces.Knight> ALL_POSSIBLE_KNIGHTS = PieceUtils.createAllPossibleMovedKnights();
    private final Table<Alliance, Integer, com.chess.engine.classic.pieces.Bishop> ALL_POSSIBLE_BISHOPS = PieceUtils.createAllPossibleMovedBishops();
    private final Table<Alliance, Integer, com.chess.engine.classic.pieces.Pawn> ALL_POSSIBLE_PAWNS = PieceUtils.createAllPossibleMovedPawns();

    com.chess.engine.classic.pieces.Pawn getMovedPawn(final Alliance alliance,
                                                      final int destinationCoordinate) {
        return ALL_POSSIBLE_PAWNS.get(alliance, destinationCoordinate);
    }

    com.chess.engine.classic.pieces.Knight getMovedKnight(final Alliance alliance,
                                                          final int destinationCoordinate) {
        return ALL_POSSIBLE_KNIGHTS.get(alliance, destinationCoordinate);
    }

    com.chess.engine.classic.pieces.Bishop getMovedBishop(final Alliance alliance,
                                                          final int destinationCoordinate) {
        return ALL_POSSIBLE_BISHOPS.get(alliance, destinationCoordinate);
    }

    Rook getMovedRook(final Alliance alliance,
                      final int destinationCoordinate) {
        return ALL_POSSIBLE_ROOKS.get(alliance, destinationCoordinate);
    }

    com.chess.engine.classic.pieces.Queen getMovedQueen(final Alliance alliance,
                                                        final int destinationCoordinate) {
        return ALL_POSSIBLE_QUEENS.get(alliance, destinationCoordinate);
    }

    private static Table<Alliance, Integer, com.chess.engine.classic.pieces.Pawn> createAllPossibleMovedPawns() {
        final ImmutableTable.Builder<Alliance, Integer, com.chess.engine.classic.pieces.Pawn> pieces = ImmutableTable.builder();
        for(final Alliance alliance : Alliance.values()) {
            for(int i = 0; i < BoardUtils.NUM_TILES; i++) {
                pieces.put(alliance, i, new com.chess.engine.classic.pieces.Pawn(alliance, i, false));
            }
        }
        return pieces.build();
    }

    private static Table<Alliance, Integer, com.chess.engine.classic.pieces.Knight> createAllPossibleMovedKnights() {
        final ImmutableTable.Builder<Alliance, Integer, com.chess.engine.classic.pieces.Knight> pieces = ImmutableTable.builder();
        for(final Alliance alliance : Alliance.values()) {
            for(int i = 0; i < BoardUtils.NUM_TILES; i++) {
                pieces.put(alliance, i, new com.chess.engine.classic.pieces.Knight(alliance, i, false));
            }
        }
        return pieces.build();
    }

    private static Table<Alliance, Integer, com.chess.engine.classic.pieces.Bishop> createAllPossibleMovedBishops() {
        final ImmutableTable.Builder<Alliance, Integer, com.chess.engine.classic.pieces.Bishop> pieces = ImmutableTable.builder();
        for(final Alliance alliance : Alliance.values()) {
            for(int i = 0; i < BoardUtils.NUM_TILES; i++) {
                pieces.put(alliance, i, new com.chess.engine.classic.pieces.Bishop(alliance, i, false));
            }
        }
        return pieces.build();
    }

    private static Table<Alliance, Integer, Rook> createAllPossibleMovedRooks() {
        final ImmutableTable.Builder<Alliance, Integer, Rook> pieces = ImmutableTable.builder();
        for(final Alliance alliance : Alliance.values()) {
            for(int i = 0; i < BoardUtils.NUM_TILES; i++) {
                pieces.put(alliance, i, new Rook(alliance, i, false));
            }
        }
        return pieces.build();
    }

    private static Table<Alliance, Integer, com.chess.engine.classic.pieces.Queen> createAllPossibleMovedQueens() {
        final ImmutableTable.Builder<Alliance, Integer, com.chess.engine.classic.pieces.Queen> pieces = ImmutableTable.builder();
        for(final Alliance alliance : Alliance.values()) {
            for(int i = 0; i < BoardUtils.NUM_TILES; i++) {
                pieces.put(alliance, i, new com.chess.engine.classic.pieces.Queen(alliance, i, false));
            }
        }
        return pieces.build();
    }

}

