# Min Fruit
- 21.06.30 : 도메인 구매 및 ec2서버, rout53 연결.
    - minfruit.com/{name} 
    - 경로 파라미터(name) 의 값을 변경해서 넣었을 때, hello i am name 이 뜨도록 구현해 둠.
    
- 21.07.13 : spring-boot-actuator 추가
  - 시스템 health(상태정보), metrics(계량정보) 확인하고, 경로 설정 test (내 로컬에서만 확인 가능)
      - basic-path: /monitoring
      - 시스템 상태정보 확인시: http://localhost:8080/monitoring/health
      - 시스템 metircs정보 확인시: http://localhost:8080/monitoring/metrics
  - 참조: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator