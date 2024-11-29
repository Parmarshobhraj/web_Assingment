package Message_Passing_System;

public class main {
public static void main(String[] args) {
		
		MsgController msgController = new MsgController();
        MsgView msgView = new MsgView();

        // Send a message
        Message newMessage = msgView.getMessageInput();
        msgController.sendMessage(newMessage);
        
        
        UserController userController = new UserController();
        UserView userView = new UserView();

        // Create a new user
        User newUser = userView.getUserInput();
        userController.createUser(newUser);

	}

}
