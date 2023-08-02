package PetrikDev.ProjectTree.Controller;

import PetrikDev.ProjectTree.Moduls.Data;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {
        @MessageMapping("/click")
        @SendTo("/ws/trieng")
        public String click(Data data) throws InterruptedException {
            return data.getName();
        }
}
