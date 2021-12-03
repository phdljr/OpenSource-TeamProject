package data;

/**
 * 플레이어의 상태를 저장해둔 클래스이다. 닉네임, 플레이어가 속한 방 이름, 각 미니게임의 점수,
 * 현재 플레이중인 게임 종류, 어떠한 게임에서 상대방을 찾는지에 대한 정보가 담겨있다.<br/><br/>
 * <strong>0: 메뉴화면(기본값), 1: 같은 그림 찾기, 2: 오목, 3: 두더지 잡기</strong>
 * 
 * @author Ted
 *
 */
public class Player {
	private String uuid;
	private String nickname = "";
	private String roomName = ""; //방에 없으면 빈 문자열을 가짐. 방 이름은 랜덤 문자열은 10자리를 가짐
	private Friend[] friendList;
	private int[] score;
	private int playGameNum; //1: 같은 그림 찾기, 2: 오목, 3: 두더지 잡기, 0: 메뉴화면(기본값)
	private int searchingGameNum; //1: 같은 그림 찾기, 2: 오목, 3: 두더지 잡기, 0: 메뉴화면(기본값)
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Friend[] getFriendList() {
		return friendList;
	}
	public void setFriendList(Friend[] friendList) {
		this.friendList = friendList;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public int getPlayGameNum() {
		return playGameNum;
	}
	public void setPlayGameNum(int playGameNum) {
		this.playGameNum = playGameNum;
	}
	public int getSearchingGameNum() {
		return searchingGameNum;
	}
	public void setSearchingGameNum(int searchingGameNum) {
		this.searchingGameNum = searchingGameNum;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
}
