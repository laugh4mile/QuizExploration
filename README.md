# 📘 Quiz Exploration Project
Spring Boot + Docker + MariaDB + JPA 기반의 퀴즈탐험 프로젝트

---

## ✨ 프로젝트 개요
간단한 CRUD 기능 구현과 서버/DB 환경 구성 학습을 목표로 하는 개인 프로젝트입니다.  
Docker를 이용한 MariaDB 환경 구성 및 Spring Boot 연결을 중심으로 진행합니다.

---

## 🛠 기술 스택 (Tech Stack)

| Category | Tech |
|----------|------|
| Backend | Spring Boot, Spring Web, Spring Data JPA |
| Database | MariaDB (Docker) |
| Build Tool | Gradle |
| View | Thymeleaf |
| Version Control | Git, GitHub |
| Language | Java 17 |

---

## 📦 프로젝트 구조 (예정)
```
src
┣ main
┃ ┣ java/com.github.hyunsoo.quizexploration
┃ ┃ ┣ controller
┃ ┃ ┣ service
┃ ┃ ┣ repository
┃ ┃ ┗ entity
┃ ┗ resources/templates
┗ test
```


---

## 🚀 실행 방법

### 1. MariaDB Docker Container 실행
```bash
docker run -d \
  --name my-mariadb \
  -p 3306:3306 \
  -e MYSQL_ROOT_PASSWORD=test \
  -e MYSQL_DATABASE=testdb \
  -e MYSQL_USER=test \
  -e MYSQL_PASSWORD=test \
  -v mariadb_data:/var/lib/mysql \
  mariadb:11
```
### 2. Spring Boot 실행
```bash
./gradlew bootRun
```
---

## 📅 작업 기록 (Progress Log)

| 날짜 | 작업 내용 |
|------|-----------|
| 2025-11-24 | 프로젝트 생성, GitHub 연동 완료 |
| 2025-11-24 | Docker MariaDB 컨테이너 실행 |
| 2025-11-25 |  |
| 2025-11-26 |  |

---

## 🧾 향후 계획 (To-Do)
- [ ] Quiz 화면 개발 (Thymeleaf)
- [ ] 예외 처리(Spring Validation 적용)
- [ ] WebSocket 학습 및 실시간 기능 실험
- [ ] 테스트 코드 추가

---
