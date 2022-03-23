# README

## 手动测试

1. 浏览器请求授权：<http://localhost:8080/oauth/authorize?client_id=client01&client_secret=123456&response_type=code>

2. 输入用户名密码：username=user01，password=123456，选择授权类型并确认

3. 浏览器重定向返回code：<http://localhost:9001/callback?code=SSvnle>

4. 获取访问token，客户端ID=client01，客户端secret=123456，Basic验证

  ```sh
  curl --location --request POST 'http://localhost:8080/oauth/token?grant_type=authorization_code&code=SSvnle&redirect_uri=http://localhost:9001/callback&scope=read_user_info' \
      --header 'Authorization: Basic Y2xpZW50MDE6MTIzNDU2'
  ```

  ```json
  {
      "access_token": "bb068178-77c2-4f67-b577-6060fa5c323b",
      "token_type": "bearer",
      "expires_in": 43199,
      "scope": "read_user_info"
  }
  ```

5. 通过token访问资源，Bearer认证

  ```sh
  curl --location --request GET 'http://localhost:8081/echo/tom' \
      --header 'Authorization: Bearer bb068178-77c2-4f67-b577-6060fa5c323b'
  ```

  ```json
  {
      "status": 200,
      "message": "Hello, tom with user01"
  }
  ```

## 客户端测试

TODO: oauth2-authorization-code-web
