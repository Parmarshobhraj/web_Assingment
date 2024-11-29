package Message_Passing_System;

public class Message {
	
	
	private int uid;
	private String from;
	private String to;
	private String msg;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Message(int uid, String from, String to, String msg) {
		super();
		this.uid = uid;
		this.from = from;
		this.to = to;
		this.msg = msg;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message [uid=" + uid + ", from=" + from + ", to=" + to + ", msg=" + msg + "]";
	}
	

}
