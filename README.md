# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항
### Step 1
- [ ] 사다리 게임 참여자 이름을 입력 받는다.
  - 이름은 쉼표(,)를 기준으로 구분한다.
  - 이름은 1글자 이상 5자 이하만 가능하다.
  - 참여자는 2명 이상이다.
  
- [ ] 사다리 높이를 입력 받는다.
  - 사다리 높이는 숫자만 입력받는다.
  - 사다리 높이는 2 이상이다.
- [ ] 사다리를 생성한다.
  - 사다리는 기둥, 가로줄로 구성되어 있다. 
  - 가로줄의 경우 랜덤으로 공백이 들어올 수 있다.