package br.com.thayna.designpatterns.fundamentals.notifications;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
