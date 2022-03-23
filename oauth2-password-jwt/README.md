# README

```sh
# -------------------------jdk 1.8 keytool---------------------------- #

# 生成私钥
keytool -genkeypair \
    -alias [键值对] \
    -validity [证书有效天数] \
    -keyalg [算法] \
    -keypass [键密码] \
    -storepass [存储密码] \
    -keystore [私钥文件]

# 私钥例子
keytool -genkeypair -alias app-jwt -validity 3650 -keyalg RSA -keypass 123456 -storepass 123456 -keystore app-jwt.jks

# 打印公钥
keytool -list -rfc --keystore [私钥文件] | openssl x509 -inform pem -pubkey

# 公钥例子
keytool -list -rfc --keystore app-jwt.jks | openssl x509 -inform pem -pubkey

```

> public.cert

```txt
-----BEGIN PUBLIC KEY-----
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqa4wOkR0U4BYg5NIRIdH
U56Ji20Rts5qFm2kjEyAI+i9cdAYjGqVqZ4WIBdYz/S0MuSXfjAiQqOzBLqB+AzH
0LzrmrKTVS9FslHmP3HOVc6YN1b+4AqKm3KsVJ//X2mgRteies+bJ3JHYvXWsEnK
yv/BPC1/EaAy4iHLMchdUiBy8mZJj57rvgyH1XjRqcy+U4SYMIdCTR1C+BMc5/et
wCAK3Bm1PE/c7ZSdbZHZ5IUpaVsQWMYQyCE7x3wYJOQuc24ktG9qXwNK5AhFKnEs
GnB2JMuvAN3/9+4LfQYczEuJJWx0e2emJXQMRxM3TBEnq6f6YvRfH26IdL0fegrf
7wIDAQAB
-----END PUBLIC KEY-----
```
