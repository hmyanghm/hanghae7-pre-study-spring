# 선택한 게시글 조회 API



## 선택한 게시글 조회

<mark style="color:green;">`GET`</mark> `/get/list/{id}`

**Headers**

| Name          | Value              |
| ------------- | ------------------ |
| Content-Type  | `application/json` |
| Authorization | `Bearer <token>`   |

**Parameter**

| Name | Type    | Description |
| ---- | ------- | ----------- |
| `id` | integer | 게시글 id      |

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
}
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
