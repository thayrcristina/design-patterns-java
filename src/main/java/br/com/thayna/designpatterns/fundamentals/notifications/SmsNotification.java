package br.com.thayna.designpatterns.fundamentals.notifications;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
