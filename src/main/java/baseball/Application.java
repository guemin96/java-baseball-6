package baseball;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // 변수 선언

        // TODO: 프로그램 구현
        Game_Playing Player = new Game_Playing();
        System.out.println("숫자 야구 게임을 시작합니다.");
        try{
            Player.Main_Place();
        }
        catch (IllegalArgumentException e){
            System.err.println("예외 발생: " + e.getMessage());
        }
    }

}
