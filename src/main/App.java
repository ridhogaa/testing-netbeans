/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import repository.UserRepository;
import ui.LoginRegister;

/**
 *
 * @author ridhogymnastiar
 */
// Depedency Inversion
public class App {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginRegister(new UserRepository()).setVisible(true);
        });
    }
}
