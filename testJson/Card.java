package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Card {
	private InfoType messageType;
	private String title;
	private String subTitle;
	private String content;
	private String time;
	@JsonProperty("isStar")
	private boolean isStar;
	public Card() {}

	public Card(InfoType messageType, String title, String subTitle, String content, String time, boolean isStar) {
		super();
		this.messageType = messageType;
		this.title = title;
		this.subTitle = subTitle;
		this.content = content;
		this.time = time;
		this.isStar = isStar;
	}


	public InfoType getMessageType() {
		return messageType;
	}
	public void setMessageType(InfoType messageType) {
		this.messageType = messageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public boolean isStar() {
		return isStar;
	}
	public void setStar(boolean isStar) {
		this.isStar = isStar;
	}


	@Override
	public String toString() {
		return "Card [messageType=" + messageType + ", title=" + title + ", subTitle=" + subTitle + ", content="
				+ content + ", time=" + time + ", isStar=" + isStar + "]";
	}
}
