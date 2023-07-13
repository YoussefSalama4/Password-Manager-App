
package gui.java.project;

import java.net.MalformedURLException;


public class main {
    public static void main( String []arg) throws MalformedURLException, InterruptedException {

      Splash splash=   new Splash();
        Thread.sleep(2400);
        splash.setVisible(false);
        Login LF = new Login();
        LF.setVisible(true);
        

    }
}
