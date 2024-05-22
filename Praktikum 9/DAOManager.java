/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 */

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }
    
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
