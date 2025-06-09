package br.com.thayna;

import br.com.thayna.designpatterns.fundamentals.notifications.EmailNotification;
import br.com.thayna.designpatterns.fundamentals.notifications.Notification;
import br.com.thayna.designpatterns.fundamentals.notifications.PushNotification;
import br.com.thayna.designpatterns.fundamentals.notifications.SmsNotification;
import br.com.thayna.designpatterns.fundamentals.notifications.NotificationService;

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();
        Notification push = new PushNotification();

        NotificationService emailService = new NotificationService(email);
        NotificationService smsService = new NotificationService(sms);
        NotificationService pushService = new NotificationService(push);

        emailService.sendNotification("Olá por Email!");
        smsService.sendNotification("Olá por SMS!");
        pushService.sendNotification("Olá por Push!");    }
}