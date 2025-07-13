public class FactoryExample {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.notifyUser(); 
    }
}

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}

class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) return null;
        if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        return null;
    }
}
