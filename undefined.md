---
description: Version 2024-11-14
icon: comment-check
---

# 응답 본문

응답 본문은 서버가 클라이언트에 보내는 데이터입니다. API의 성공 여부는 HTTP 상태 코드로 전달합니다. 돌아온 HTTP 상태 코드에 따라 요청이나 에러를 처리하는 로직을 구축하세요.&#x20;

모든 API 응답, 요청 본문은 JSON 형식입니다. 따라서 응답 헤더에는 다음과 같이 Content-Type이 포함됩니다.

```
Content-Type: application/json
```

### 응답 HTTP 상태 코드

<table><thead><tr><th width="251">HTTP 응답 상태 코드</th><th>설명</th></tr></thead><tbody><tr><td>200 - OK</td><td>요청이 성공적으로 처리되었습니다.</td></tr><tr><td>400 - Bad Request</td><td>요청을 처리할 수 없습니다. 필수 파라미터를 보내지 않았거나, 파라미터 포맷이 잘못되었을 때 돌아오는 응답입니다. 요청 파라미터를 확인해주세요.</td></tr><tr><td>403 - Forbidden</td><td>시크릿 키 없이 요청했거나 사용한 시크릿 키가 잘못되었습니다. 개발자센터에서 내 상점의 키 값을 다시 한 번 확인하고, 시크릿 키 문서를 참고하세요.</td></tr><tr><td>404 - Not Found</td><td>요청한 리소스가 존재하지 않습니다. 요청한 API 주소를 다시 한 번 확인해보세요.</td></tr><tr><td>429 - Too Many Requests</td><td>비정상적으로 많은 요청을 보냈습니다. 잠시 후 다시 시도해주세요.</td></tr><tr><td>500 - Server Error</td><td>토스페이먼츠 서버에서 에러가 발생했습니다.</td></tr></tbody></table>



