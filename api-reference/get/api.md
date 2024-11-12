# 전체 게시글 목록 조회 API



## 전체 게시글 목록 조회

<mark style="color:green;">`GET`</mark> `/get/lists`

**Headers**

| Name          | Value              |
| ------------- | ------------------ |
| Content-Type  | `application/json` |
| Authorization | `Bearer <token>`   |

**Body**

| Name        | Type      | Description |
| ----------- | --------- | ----------- |
| `id`        | integer   | 게시글 id      |
| `member`    | MemberDTO | 회원DTO       |
| `title`     | string    | 게시글 제목      |
| `content`   | string    | 게시글 내용      |
| `createdAt` | string    | 생성일         |
| `updatedAt` | string    | 수정일         |

**Response**

{% tabs %}
{% tab title="200" %}
```json
[
  "size": 10,
  "page": 1,
  "totalPage": 1,
  "totalCount": 5,
  "list": [
    {
      "id": 1,
      "member": {
        "id": 1,
        "name": "홍길동",
        "username": "hong12"
      },
      "title": "Hello",
      "content": "Hello World!!! :)",
      "createdAt": "2024-11-11 12:34:56",
      "updatedAt": "2024-11-12 22:19:33"
    },
    {
      "id": 2,
      "member": {
        "id": 3,
        "name": "김미영",
        "username": "kmy0701"
      },
      "title": "항해",
      "content": "항해 사전스터디 백엔드7기",
      "createdAt": "2024-11-12 22:22:21",
      "updatedAt": "2024-11-12 22:33:33"
    }
  ]
]
```
{% endtab %}

{% tab title="400" %}
```json
{
  "error": "Invalid request"
}
```
{% endtab %}
{% endtabs %}
