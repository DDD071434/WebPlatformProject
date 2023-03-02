<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="../css/framestyle.css">
    <link rel="stylesheet" type="text/css" href="../css/searchstyle.css">
    <script src="../js/header.js"></script>
    <script src="../js/include.js"></script>
    <script src="https://kit.fontawesome.com/367bc8d5b8.js" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <header include-html="..\html\header.html"></header>
        <main>
            <h1>근선생 찾기</h1>
            <select id="type" name="type" >
                <option value="none">서비스 선택</option>
                <option value="pt">퍼스널트레이닝</option>
                <option value="crossfit">크로스핏</option>
                <option value="pilates">필라테스</option>
                <option value="yoga">요가</option>
                <option value="climing">클라이밍</option>
                <option value="spinning">스피닝</option>
                <option value="ballet">발레</option>
                <option value="swimming">수영</option>
                <option value="health">헬스</option>
                <option value="etc">기타</option>
            </select>
            <select id="area" name="area" >
                <option value="none">지역</option>
                <option value="seoul">서울</option>
                <option value="sejong">세종</option>
                <option value="gangwon">강원</option>
                <option value="incheon">인천</option>
                <option value="gyeongi">경기</option>
                <option value="chungbuk">충북</option>
                <option value="chungnam">충남</option>
                <option value="gyeongbuk">경북</option>
                <option value="daejeon">대전</option>
                <option value="daegu">대구</option>
                <option value="jeonbuk">전북</option>
                <option value="gyeongnam">경남</option>
                <option value="ulsan">울산</option>
                <option value="gwangju">광주</option>
                <option value="busan">부산</option>
                <option value="jeonnam">전남</option>
                <option value="jeju">제주</option>
            </select>
            <div class="search">
                <input id="search" type="search" placeholder="내 주변 근선생은 누가 있지?"/>
                <button id="search-btn">검색</button>
            </div>
            <section id="profile-container">
            </section>
            <template id="profile-temp">
                <article class="profile">
                    <a href="../html/teacherProfile.html">
                        <div class="info">
                            <h3 id="id"></h3>
                            <div class="contents">
                                <i class="fa-regular fa-face-smile"></i>
                                <!-- <i class="fa-regular fa-circle-user"></i> -->
                                <!-- <i class="fa-regular fa-user"></i> -->
                                <p id="appeal"></p>
                            </div>
                            <div class="contents">
                                <i class="fa-solid fa-magnifying-glass"></i>
                                <!-- <i class="fa-solid fa-check"></i> -->
                                <p id="introduction"></p>
                            </div>
                            <div class="contents">
                                <i class="fa-regular fa-clock"></i>
                                <p id="contactTime"></p>
                            </div>
                            <div class="contents">
                                <i class="fa-regular fa-compass"></i>
                                <!-- <i class="fa-regular fa-map"></i> -->
                                <p id="centerLocation"></p>
                            </div>
                            <div class="score">
                                <img src="../img/star.png" alt="">
                                <span id="score">4.8</span>
                            </div>
                        </div>
                        <div class="profile-img">
                            <img id="image" src="../img/health.png" alt="profile-img">
                        </div>
                    </a>
                </article>
            </template>
        </main>
        <footer include-html="..\html\footer.html"></footer>
    </div>
</body>
<script>
    includeHTML();
</script>
<script src="../js/search.js"></script>
</html>