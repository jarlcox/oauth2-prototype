# README

## 获取token

> 客户端ID=client01，客户端Secret=123456，Basic Auth加密请求token

```sh
curl --location --request POST 'http://localhost:8085/oauth/token' \
    --header 'Authorization: Basic Y2xpZW50MDE6MTIzNDU2' \
    --header 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode 'grant_type=client_credentials'
```

> 返回token结果

```json
{
    "access_token": "6cba36db-37b1-4f81-ad5b-3653122440f9",
    "token_type": "bearer",
    "expires_in": 43176,
    "scope": "all"
}
```

## 携带token访问资源

> 将token填入Bearer认证

```sh
curl --location --request GET 'http://localhost:8085/echo/Tom' \
    --header 'Authorization: Bearer 6cba36db-37b1-4f81-ad5b-3653122440f9'
```

> 正确访问资源

```json
{
    "status": 200,
    "message": "Hello, Tom"
}
```
