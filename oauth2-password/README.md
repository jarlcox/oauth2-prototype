# README

## 获取token

> 客户端ID=client01，客户端Secret=123456，Basic Auth加密请求token
> 用户名=user01，密码=123456

```sh
curl --location --request POST 'http://localhost:8085/oauth/token' \
    --header 'Authorization: Basic Y2xpZW50MDE6MTIzNDU2' \
    --header 'Content-Type: application/x-www-form-urlencoded' \
    --data-urlencode 'grant_type=password' \
    --data-urlencode 'username=user01' \
    --data-urlencode 'password=123456' \
    --data-urlencode 'scope=all'
```

> 返回token结果

```json
{
    "access_token": "0236b0c9-ea4f-4edd-9d65-cb07b2e95a95",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "all"
}
```

## 携带token访问资源

> 将token填入Bearer认证

```sh
curl --location --request GET 'http://localhost:8085/echo/Tom' \
    --header 'Authorization: Bearer 0236b0c9-ea4f-4edd-9d65-cb07b2e95a95'
```

> 正确访问资源

```json
{
    "status": 200,
    "message": "Hello, Tom with user01"
}
```