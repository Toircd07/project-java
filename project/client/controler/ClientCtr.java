/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author 84386
 */
public class ClientCtr {
    private int port ;
    private String host;
    private Socket mySocket;
    public String getResult;

    public ClientCtr() {
        host = "localhost" ;
        port = 8888 ;
    }
    public void openSocket(){
        try {
            mySocket = new Socket(host,port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void sendNhanVien (NhanVien s){
        try {
            ObjectOutputStream oos =  new ObjectOutputStream(mySocket.getOutputStream());
            oos.writeObject(s);  // gui nhan vien sang sever
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public String getResult(){
        String res = "";
        try {
            ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream()) 
            res = (String).ois.readObject(); // nhan ve thong diep
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res ;
    }
    public void closeConnection(){
        try {
           mySocket.close();
        } catch (Exception e) {
        }
    }
}