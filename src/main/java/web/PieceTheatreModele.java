package web;

import java.util.ArrayList;
import java.util.List;
import metier.theatre.PieceTheatre;

public class PieceTheatreModele {
    private String motCle;
    List<PieceTheatre> piecesTheatre = new ArrayList<>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<PieceTheatre> getPiecesTheatre() {
        return piecesTheatre;
    }

    public void setPiecesTheatre(List<PieceTheatre> piecesTheatre) {
        this.piecesTheatre = piecesTheatre;
    }
}
