package dao;

import java.util.List;
import metier.theatre.PieceTheatre;

public class TestDao {
    public static void main(String[] args) {
        PieceTheatreDaoImpl pieceTheatreDao = new PieceTheatreDaoImpl();

        // Test de sauvegarde
        PieceTheatre pieceTheatre = new PieceTheatre("antigone", "william");
        pieceTheatre = pieceTheatreDao.save(pieceTheatre);
        System.out.println(pieceTheatre);

        // Test de recherche par mot-clé
        List<PieceTheatre> piecesTheatre = pieceTheatreDao.piecesTheatreParMC("an");
        for (PieceTheatre p : piecesTheatre) {
            System.out.println(p);
        }
    }
}
