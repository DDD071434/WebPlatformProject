<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Oh!gym</title>
    <link rel="stylesheet" type="text/css" href="../css/framestyle.css" />
    <link rel="stylesheet" type="text/css" href="../css/teachermypage.css" />
    <script src="../js/include.js"></script>
    <script src="../js/header.js"></script>
  </head>
  <body>
    <div class="container">
      <header include-html="..\html\header.html"></header>
      <!-- 메인 태그 안에다 내용 작성 -->
      <main>
        <div id="title">
          <h1>마이페이지</h1>
        </div>
        <div id="clientName">
          <p class="name">김경연</p>
          <p>선생님</p>
          <button>정보수정</button>
        </div>
        <div class="notice">
          <h3><a href="#">프로필</a></h3>
        </div>
        <div id="history">
          <h3><a href="#">받은 요청</a></h3>
          <div class="box">
            <div>
              <ul id="requestList"></ul>
            </div>
          </div>
          <h3><a href="#">이용 내역</a></h3>
        </div>
        <div class="notice">
          <h3><a href="#">알림</a></h3>
          <h3><a href="#">공지사항</a></h3>
          <h3><a href="#">Oh!GYM 안내</a></h3>
        </div>
      </main>
      <template id="request-card-temp">
        <li>
          <div id="request-card">
            <p></p>
            <p></p>
            <p></p>
          </div>
          <div class="bottom">
            <a href="#" id="bottom">자세히 보기</a>
          </div>
        </li>
      </template>
      <footer include-html="..\html\footer.html"></footer>
    </div>
  </body>
  <script>
    includeHTML();
  </script>
  <script src="../js/teachermypage.js"></script>
</html>
