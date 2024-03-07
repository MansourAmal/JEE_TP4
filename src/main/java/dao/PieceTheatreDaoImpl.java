package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.SingletonConnection;
import metier.theatre.PieceTheatre;

public class PieceTheatreDaoImpl implements IPieceTheatreDao {

    @Override
    public PieceTheatre save(PieceTheatre pieceTheatre) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO pieceth(NOM_PIECETH, AUTEUR) VALUES(?, ?)");
            ps.setString(1, pieceTheatre.getNomPieceTheatre());
            ps.setString(2, pieceTheatre.getAuteur());
            ps.executeUpdate();

            PreparedStatement ps2 = conn.prepareStatement("SELECT MAX(ID_PIECETH) as MAX_ID FROM pieceth");
            ResultSet rs = ps2.executeQuery();

            if (rs.next()) {
                pieceTheatre.setIdPieceTheatre(rs.getLong("MAX_ID"));
            }

            ps.close();
            ps2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pieceTheatre;
    }

    @Override
    public List<PieceTheatre> piecesTheatreParMC(String mc) {
        List<PieceTheatre> piecesTheatre = new ArrayList<>();
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM pieceth WHERE NOM_PIECETH LIKE ?");
            ps.setString(1, "%" + mc + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PieceTheatre pieceTheatre = new PieceTheatre();
                pieceTheatre.setIdPieceTheatre(rs.getLong("ID_PIECETH"));
                pieceTheatre.setNomPieceTheatre(rs.getString("NOM_PIECETH"));
                pieceTheatre.setAuteur(rs.getString("AUTEUR"));
                piecesTheatre.add(pieceTheatre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return piecesTheatre;
    }

    @Override
    public PieceTheatre getPieceTheatre(Long id) {
        Connection conn = SingletonConnection.getConnection();
        PieceTheatre pieceTheatre = new PieceTheatre();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM pieceth WHERE ID_PIECETH = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pieceTheatre.setIdPieceTheatre(rs.getLong("ID_PIECETH"));
                pieceTheatre.setNomPieceTheatre(rs.getString("NOM_PIECETH"));
                pieceTheatre.setAuteur(rs.getString("AUTEUR"));
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pieceTheatre;
    }

    @Override
    public PieceTheatre updatePieceTheatre(PieceTheatre pieceTheatre) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE pieceth SET NOM_PIECETH=?, AUTEUR=? WHERE ID_PIECETH=?");
            ps.setString(1, pieceTheatre.getNomPieceTheatre());
            ps.setString(2, pieceTheatre.getAuteur());
            ps.setLong(3, pieceTheatre.getIdPieceTheatre());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pieceTheatre;
    }

    @Override
    public void deletePieceTheatre(Long id) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM pieceth WHERE ID_PIECETH = ?");
            ps.setLong(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


