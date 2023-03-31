# 운동 선생과 이용자를 매칭시켜 주는 웹사이트
</br>

### 🚀 프로젝트 소개
- 이용자는 운동 선생을 찾아 트레이닝 요청 가능
- 운동 선생은 프로필을 작성하며, 이용자의 요청서에 대해 견적서 발송 가능
- 이용자가 견적서에 대해 승낙하면 매칭되는 시스템
- 이후 이용자는 운동 선생에 대해 리뷰 작성 가능
</br>

## ⌛ 개발 기간
- 23.02.13. ~ 제작 중.

### ⚙ 개발 환경
- `Java 8`
- `JDK 1.8.0`
- **Server** : Apache Tomcat 9.0
- **Database** : MySQL

### 🎯학습 목표
- html, javascript, css 활용을 통한 페이지 작성
- MySQL, Java, Maven, Tomcat 등 응용하여 웹 사이트 구성

### 🚨개발 중점 사항
- 직관적이고 깔끔한 UI
- 편의성을 고려한 기능 구현
- 적합한 운동 선생을 매칭할 수 있도록 구현
</br>

### 💼담당 업무
- 이용자의 요청서 작성 / 리뷰 작성 html 페이지 제작
- 클라이언트-서버 ajax 비동기 통신 및 DOM 동적 렌더링
- 통신간 데이터포맷 JSON 활용
- 웹서버 API servlet 구현
- 요청서 처리 / 리뷰 작성 서비스 정의 및 구현
- DB 구성 및 입/출력 구현

### 🕹주요 기능
<br></br>
#### 1. 작동 로직
<br></br>
![1 로직](https://user-images.githubusercontent.com/119999798/229037502-4ee36208-ab5c-4928-92f3-9ae2db42fb97.jpg)
<br></br>
핵심 기능을 바탕으로 로직을 구성하였습니다. 
<br></br>
#### 2. 스키마 구성
<br></br>
![2 ERD](https://user-images.githubusercontent.com/119999798/229037506-432ec58c-439a-489e-b9d8-fb0c10228e41.png)
<br></br>
로직을 토대로 스키마 설계를 하였습니다. 
<br></br>
#### 3. 메인 화면
<br></br>
![3 메인화면](https://user-images.githubusercontent.com/119999798/229037509-43f86609-d9c7-4511-b574-7588618afd79.png)
<br></br>
웹 사이트의 메인 페이지입니다. 
<br></br>
#### 4. 회원가입 화면
<br></br>
![4 회원가입](https://user-images.githubusercontent.com/119999798/229037505-0ef1823c-73ca-4ee2-ba3f-de532ae2292e.png)
<br></br>
계정을 생성할 수 있는 회원가입 페이지입니다. 
<br></br>
#### 5. 로그인 화면
<br></br>
![5 로그인](https://user-images.githubusercontent.com/119999798/229033001-1ea4658b-9dea-439c-a7f1-796b827b3d4f.png)
<br></br>
생성한 계정에 로그인 할 수 있는 로그인 페이지입니다. 
<br></br>
#### 6. 근선생 마이프로필
<br></br>
![6 근선생프로필수정](https://user-images.githubusercontent.com/119999798/229033002-f80a979e-2f2b-452c-9835-fcc4360a19c2.png)
<br></br>
운동 선생의 프로필을 수정할 수 있는 마이 프로필 페이지입니다. 
<br></br>
#### 7. 근선생 찾기
<br></br>
![7 근선생찾기](https://user-images.githubusercontent.com/119999798/229037510-7a8cfe33-c386-4447-8540-2e93ecae8509.png)
<br></br>
지역이나 종목 등 자신에게 필요한 서비스를 찾을 수 있는 근선생 검색 기능입니다. 
<br></br>
#### 8. 근선생 프로필
<br></br>
![8 근선생프로필](https://user-images.githubusercontent.com/119999798/229033005-4c409f5b-a053-466c-bb53-337b2a6c59dd.png)
<br></br>
이용자는 검색 목록에서 근선생의 자세한 프로필을 확인할 수 있습니다. 
<br></br>
![9 근선생리뷰](https://user-images.githubusercontent.com/119999798/229033007-39019570-e232-4dfc-b257-3875a8c45631.png)
<br></br>
<br></br>
#### 9. 요청서 작성
<br></br>
![10 요청서작성페이지](https://user-images.githubusercontent.com/119999798/229037494-0bb08134-703f-4305-b1c9-e32330ea064f.png)
<br></br>
자신에게 적합한 서비스를 찾았다면 견적 요청을 통해 요청서를 작성할 수 있습니다. 
<br></br>
![11 요청서주소API활용](https://user-images.githubusercontent.com/119999798/229037499-cce88b94-34bd-4cec-ab4b-6fb61e69e208.png)
<br></br>
API를 활용하여 주소 입력 기능을 추가하였습니다. 
<br></br>
![12 요청서희망사항](https://user-images.githubusercontent.com/119999798/229033017-1ac21870-5560-4a97-a45d-d38387a72248.png)
<br></br>
희망사항까지 입력하게 되면 요청서가 발송되고, 이를 근선생이 수락하여 견적서를 보냈을 때 응답하면 매칭이 성립됩니다. 
<br></br>
#### 10. 리뷰 작성
<br></br>
![13 리뷰작성창](https://user-images.githubusercontent.com/119999798/229033018-2edb8093-8c7b-43ef-9ceb-680a25c53e6a.png)
<br></br>
서비스를 제공 받은 다음 리뷰를 작성할 수 있습니다. 

</br>
</br>

### 💡배우고 느낀 점
- 웹 개발을 위해 여러 가지 언어와 툴을 활용하였기에 프로젝트 진행 과정에서 발생한 문제는 한 가지 언어에 국한되지 않았습니다. 이로 인해 결함 원인을 파악하는 것에도 어려움을 겪었지만, 지속적인 노력 끝에 발생한 문제를 수정하여 프로젝트의 완성도를 한 층 높일 수 있었고, 이러한 경험 덕분에 디버깅의 중요성을 되새길 수 있었습니다.</br>
