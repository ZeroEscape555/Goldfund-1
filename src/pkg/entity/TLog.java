package pkg.entity;

import java.util.Date;

public class TLog {
	private long id;
	
	private String ip;
	private String uri;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	private Date time;


}
