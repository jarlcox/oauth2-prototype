# README

## 手动测试

1. 浏览器请求授权：<http://localhost:8080/oauth/authorize?client_id=client01&redirect_uri=http://localhost:9001/callback&response_type=token&scope=read_user_info>

2. 输入用户名密码：username=user01，password=123456，选择授权类型并确认

3. 浏览器重定向返回code：<http://localhost:9001/callback#access_token=4107ee2f-b8fc-443b-9281-0612fbab78f8&token_type=bearer&expires_in=43199>

4. 通过token访问资源，Bearer认证

  ```sh
  curl --location --request GET 'http://localhost:8081/echo/tom' \
      --header 'Authorization: Bearer 4107ee2f-b8fc-443b-9281-0612fbab78f8'
  ```

  ```json
  {
      "status": 200,
      "message": "Hello, tom with user01"
  }
  ```

## 客户端测试

TODO
