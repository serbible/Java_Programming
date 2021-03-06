package ch15.ex1;

import java.awt.*;
public class BorderTest {
  private Frame frame;
  private Button center, west, east, north, south;
  private TextField tf1;
  public BorderTest() {
    frame = new Frame("BorderLayout 예제");  //화면 객체를 생성한다.
    south = new Button("버튼1");
    west = new Button("버튼2");
    east = new Button("버튼3");
    center = new Button("버튼4");
    tf1=new TextField();
    tf1.setText("입력창입니다.");
  }
  public void startFrame() {
		frame.add(tf1, "North");  //각각의 컴포넌트의 위치를 지정한다.
		frame.add(south, "South");
		frame.add(west, "West");
		frame.add(east, "East");
		frame.add(center, "Center");

		frame.setSize(400,400);  //프레임의 크기를 세팅한다.
		frame.setVisible(true);  //프레임의 보기속성을 지정한다.
  }
  public static void main(String[] args) {
    BorderTest  border = new BorderTest();
    border.startFrame();
  }
}
