package br.com.thayna.designpatterns.fundamentals.notifications;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }
}
