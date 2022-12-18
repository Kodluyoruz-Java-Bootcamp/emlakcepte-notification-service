package emlakcepte.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import emlakcepte.model.User;

@Component
public class NotificationListener {

	@RabbitListener(queues = "emlakcepte.notification")
	public void notificationListener(User user) {

		System.out.println("user :" + user.getMail());
	}

}
