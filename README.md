### ソース元
https://spring.pleiades.io/guides/gs/consuming-web-service

### ソースの追加
以下のコマンドで、xsdファイルを元にクラスを生成。  
生成したクラスは「build/generated-sources」に出力されるので、  
出力したソースをsrc配下に追加

```
gradlew compileJava
```

### powershellでの疎通コマンド
実行前にコマンド実行フォルダに「target」フォルダの作成が必要

```
# Prepare the SOAP XML content
$xmlData = @"
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                                  xmlns:gs="http://spring.io/guides/gs-producing-web-service">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getCountryRequest>
         <gs:name>Spain</gs:name>
      </gs:getCountryRequest>
   </soapenv:Body>
</soapenv:Envelope>
"@

# Send the SOAP request
$response = Invoke-WebRequest -Uri "http://localhost:8080/ws" `
    -Method POST `
    -Headers @{ "Content-Type" = "text/xml" } `
    -Body $xmlData `
    -OutFile "target/response.xml"

# Read the response XML file
[xml]$xml = Get-Content "target/response.xml"
```