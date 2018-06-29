# Spring Sercurity oAuth, JPA, MySql example

<strong>Password for app users - "user" and "admin": </strong>123456 </br>
<strong>Username and pass of oauth server: </strong>testjwtclientid/123456 </br>
<strong>How to get token</strong>
<pre>
curl -X POST \
  http://localhost:8080/oauth/token \
  -H 'Authorization: Basic dGVzdGp3dGNsaWVudGlkOjEyMzQ1Ng==' \
  -H 'Cache-Control: no-cache' \
  -H 'Postman-Token: a28bb621-9453-42f4-9be6-047d7cb7f5ed' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F grant_type=password \
  -F username=admin \
  -F password=123456
  </pre>
