# 게시글 작성 API



## 게시글 작성

<mark style="color:green;">`POST`</mark> `/register`

\<Description of the endpoint>

**Headers**

| Name          | Value              |
| ------------- | ------------------ |
| Content-Type  | `application/json` |
| Authorization | `Bearer <token>`   |

**Body**

| Name      | Type   | Description |
| --------- | ------ | ----------- |
| `title`   | string | 게시글 제목      |
| `content` | string | 게시글 내용      |

**Response**

{% tabs %}
{% tab title="200" %}
```json
{
  "code": 200,
  "message": "OK",
  "data": "SUCCESS"
}
```
{% endtab %}

{% tab title="400" %}
```json
{
  "code": 400,
  "message": "Bad Request",
  "data": "ERROR"
}
```
{% endtab %}
{% endtabs %}
