package com.remotedebug;
/**
 *
 * Ref : https://medium.com/swlh/remote-debugging-a-java-application-running-in-docker-container-with-intellij-idea-efe54cd77f02
 */
public class RemoteDebug {
    public static void main(String[] args) {
        System.out.println("Starting the remote debugging application");
        System.out.println("The application will be running inside a docker image");
        int i = 0;
        while(true) {
            System.out.println("Value of i is " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
