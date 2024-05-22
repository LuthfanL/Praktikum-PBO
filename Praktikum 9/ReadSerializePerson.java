/*
 * Nama : Muhammad Luthfan Lazuardi
 * NIM : 24060122120010
 * File : ReadSerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */

import java.io.*;

public class ReadSerializePerson {
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = "+person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
