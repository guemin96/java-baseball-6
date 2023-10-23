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
            while(true){
                // 변수 선언
                List<Integer> NUM_ANSWER = new ArrayList<>();
                List<Integer> MY_ANSWER = new ArrayList<>();
                int STRIKE_CNT = 0;
                String Restart = "";

                NUM_ANSWER = Player.Make_Answer();
                System.out.println(NUM_ANSWER);
                while(STRIKE_CNT != 3){

                    MY_ANSWER = Player.Input_Answer();

                    STRIKE_CNT = Player.Check_Answer(NUM_ANSWER,MY_ANSWER);
                }
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
                while(!(Restart.equals("1")  || Restart.equals("2"))){
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

                    Restart = camp.nextstep.edu.missionutils.Console.readLine();
                }
                if(Restart.equals("2")) {
                    System.out.println("게임이 종료되었습니다.");
                    break;
                }
            }
        }
        catch (IllegalArgumentException e){
            System.err.println("예외 발생: " + e.getMessage());
        }


    }
}
