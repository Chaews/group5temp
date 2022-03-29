# 자판기 게임
**의도 : 음료를 구매하면 자판기에 음료를 채워넣는 게임**

기능: 

1. 음료 구매 
- 음료 구매 시 컴퓨터가 임의로 난수만큼 재고에서 차감
- 컴퓨터가 음료를 구매하는 속도가 점점 빨라짐 ( 무한루프)

  2. 음료 채우기

- 게임 실행자에게 마우스 버튼으로 추가재고를 입력받아 부족한 재고를 채움
1. 게임 종료후 랭킹표시
- 게임 종료 후 5위 안에 들었을 경우 랭킹입력 가능
    - 게임 종료 후 리스트 클래스를 이용 객체화 하여 파일에 저장

1. 화면 출력 
- 화면출력시 자판기 문구 효과 주기 위해 포문 반복해서
- 시작 화면 /

역할:

메인/화면출력/시간계산 전반적인 기능 담당 : 채우석 (조장)

재고추가 / 버튼구현 : 박민욱

음악담당 / 구매담당 : 박영근 (발표자)

파일구조 : 파일구조는 모델 뷰 컨트롤러 구조로 작성

중요한 코드 : 구매에서 시간 조정 코드 (채우석 해결)

처음에  Tread.sleep (a) a로놓고 for문  -  를 반복해 서서히 시간이 빨라지게 하려고 했으나 속도나 너무 빠르고 단계 표시 또한 명확하지 않아  채우석님이 시간 차이 만큼 변수를 조절하고 그시간 경과에 따라 단계를 표시하는것이 좋겠다 하여 int 시간차이: 5초에 1씩 증가하고 → 시간차이*50 즉 5초경과시 * 50 → 5초당 0.5 초 만큼 컴퓨터가 구매하는 반응을 빠르게 구현하였습니다    

보완할점:  

1. 시간의 단위를 편의상 초로만 표현하였지만 나중에 랭킹을 구현할때 소수점 까지 표현하여 동점자를 줄이기
2. 단계가 지날수록 음료의 종류도 증가하여 어렵게 만들기
3. 버튼의 위치가 랜덤으로 바뀌어서 매크로 사용이 어렵게 만들기

느낀점:

1. 코드가 많아지고 할 일이 많아질수록 한 사람이 나머지를 캐리하는 느낌으로 프로젝트를 진행하게됌 세부적인 로드맵이 중요하다고 느낌
2. 

 **메소드**

1. 화면출력 메소드                                           
    1. 시작카운트다운
    2. 게임화면 
    3.  게임종료 메소드
2. 음료  메소드                                                                       
    1. 재고 보충
    2.  자동구매 메소드  

 3. 랭크  메소드

1. 시간계산
2. 랭크저장
3. 파일저장/파일불러오기

사용한 클래스 , API

1. FileInputStream , FileOutputStream //파일 읽어오기 불러오기 
2. Random //난수
3. ArrayList //리스트 
4. 외부API java zoom /  jl.player.Player
5. Frame Button  //마우스로 입력받음
6. currenttimemillis() // 시스템 시간 오늘날짜 알아내기위해 객체지정 안해도 시스템에서 바로 시간 알려줌 / 나노타임도 고려했으나 10억단위까지 표현하기 때문에 적합하지않았음

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5a46ea6d-85e2-4394-a8d0-faaed54f6adf/Untitled.png)
![image](https://user-images.githubusercontent.com/57170517/160517746-0945a97f-91aa-496a-b9f6-0eaa42ce3663.png)
