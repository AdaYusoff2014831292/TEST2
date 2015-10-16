
/**
 * Write a description of class COMPANY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.net.*;
import java.io.*;

public class COMPANY
{
    public static void main(String[] args){
        
    InetAddress ip;
    try {
            
        ip = InetAddress.getLocalHost();
        System.out.println("Current IP address : " + ip.getHostAddress());
        
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            
        byte[] mac = network.getHardwareAddress();
            
        System.out.print("Current MAC address : ");
            
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
        }
        System.out.println(sb.toString());
    } 
     catch (UnknownHostException e) {
        
        e.printStackTrace();
        
    } 
    catch (SocketException e){
            
        e.printStackTrace();
            
    }
    
 
   }
  
   
   public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public  void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

   }
   
   public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public void main(String args[]) {
        (new HelloThread()).start();
    }

   }
   
   
}
 

