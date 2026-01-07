package pratices.index;
class Notification{
	void send()
{
		System.out.println("sending the notification");
		}
}

class EmailNotification extends Notification{
	void send() {
		System.out.println("email the notification");
	}
}
class SMSNotification extends Notification{
	void send() {
		System.out.println("SMS the notification");
	}
}

public class Java_task4oops {
public static void main(String[]args) {
	Notification s=new EmailNotification();
	s.send();
	Notification k=new SMSNotification();
	k.send();
}
}
