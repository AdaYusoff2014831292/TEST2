
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
    
    try{
        ip = InetAddress.getLocalHost();
         
        InetAddress inet = InetAddress.getByName(ip.getHostName());

        boolean status = inet.isReachable(5000);

        if (status)
        {
            System.out.println(inet.getCanonicalHostName() + " Host Reached\t" + java.net.Inet6Address.getByName(ip.getHostName()).getHostAddress());
        }
        else
        {
            System.out.println(inet.getCanonicalHostName() + " Host Unreachable");
        }
        
        System.out.println(inet.getCanonicalHostName() + " Host Reached\t" + java.net.Inet6Address.getByName(ip.getHostName()).getHostAddress());

    }
    
    catch (IOException e)
    {
        System.err.println("Error in reaching the Host");
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
 

