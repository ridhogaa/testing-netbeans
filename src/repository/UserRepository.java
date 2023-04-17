/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.Database;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author ridhogymnastiar
 */
// Single Responsibility
public class UserRepository implements factory.UserFactory {

    private static final Database db = new Database();

    @Override
    public void insert(User user) {
        db.koneksiDatabase();
        try {
            String query = " insert into user (email, username, password)"
                    + " values(?, ?, ?)";
            var myStatement = db.getKoneksi().prepareStatement(query);
            myStatement.setString(1, user.getEmail());
            myStatement.setString(2, user.getUsername());
            myStatement.setString(3, user.getPassword());
            myStatement.execute();
        } catch (SQLException e) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
