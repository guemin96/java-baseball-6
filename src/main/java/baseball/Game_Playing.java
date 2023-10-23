package baseball;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game_Playing {
     public List<Integer> Make_Answer(){
         
         String s_Answer = "";
         List<Integer> i_Answer = new ArrayList<Integer>();
         List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

         while(i_Answer.size()<3){
             int num = camp.nextstep.edu.missionutils.Randoms.pickNumberInList(numbers);
             // 첫번째 값 넣기 위한 작업
             if(i_Answer.size()== 0){
                 i_Answer.add(num);

             }else{
                 // 중복된 값 체크
                 if(!i_Answer.contains(num)){
                     i_Answer.add(num);
                 }
             }
         }


         return  i_Answer;
     }

     public List<Integer> Input_Answer(){

         List<Integer> i_my_answer = new ArrayList<>();
         try{
             System.out.print("숫자를 입력해주세요 :");
             String my_answer  = camp.nextstep.edu.missionutils.Console.readLine();
             if(my_answer.length()!=3){
                throw new IllegalArgumentException("잘못된 값을 입력하였습니다.");
             }
             //입력한 값이 숫자가 되는지 확인
             int check_int_answer = Integer.parseInt(my_answer);
            
             // 문자열로 받은 값을 List<Integer> 타입에 맞게 값을 넣음
             for (int i = 0; i < my_answer.length(); i++) {
                 char c_num = my_answer.charAt(i);
                 int i_num = Character.getNumericValue(c_num);
                 i_my_answer.add(i_num);
             }

         }
         catch (IllegalArgumentException e){
            throw e;
         }
         return i_my_answer;
     }
     int Check_Answer(List<Integer> Num_Answer, List<Integer> My_Answer){
         String Message = "" ;
         int STRIKE_CNT = 0;
         int BALL_CNT = 0;

         for (int i = 0; i < My_Answer.size(); i++) {
             // 자리수까지 같을 경우 스트라이크 1 올리기
             if(My_Answer.get(i)==Num_Answer.get(i)){
                 STRIKE_CNT+=1;
             }
             // 자리수만 다를 경우 볼 1 올리기
             else if (Num_Answer.contains(My_Answer.get(i))){
                 BALL_CNT +=1;
             }
         }
         // 스트라이크, 볼 개수를 체크해서 메세지를 출력하는 부분
         if(STRIKE_CNT == 0 && BALL_CNT == 0){
             System.out.println("낫싱");
         }
         else if(BALL_CNT == 0){
             System.out.printf("%d스트라이크%n", STRIKE_CNT);

         }
         else if(STRIKE_CNT == 0 ){
             System.out.printf("%d볼%n", BALL_CNT);
         }
         else {
             System.out.printf("%d볼 %d스트라이크%n", BALL_CNT,STRIKE_CNT);
         }
         //3스트라이크가 아니면 계속 while 돌게 하기
         return STRIKE_CNT;
     }
}
