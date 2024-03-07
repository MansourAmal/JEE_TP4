package dao;

import java.util.List;
import metier.theatre.PieceTheatre;

public interface IPieceTheatreDao {
    PieceTheatre save(PieceTheatre pieceTheatre);
    List<PieceTheatre> piecesTheatreParMC(String mc);
    PieceTheatre getPieceTheatre(Long id);
    PieceTheatre updatePieceTheatre(PieceTheatre pieceTheatre);
    void deletePieceTheatre(Long id);
}

