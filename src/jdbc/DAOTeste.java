/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author luist
 */
public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();
        String sql = "INSERT INTO pessoas (nome, id) VALUES (?, ?)";
        System.out.println(dao.incluir(sql, "Nando Reis", 25));
        dao.incluir(sql, "Belchior", 26);
        System.out.println(
                dao.incluir(sql, "Vismonke Sanji", 66));
        
        dao.close();
    }
}
