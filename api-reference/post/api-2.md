# 댓글 작성 API



## Create a new user

<mark style="color:green;">`POST`</mark> `/comment/register`

\<Description of the endpoint>

**Headers**

| Name          | Value              |
| ------------- | ------------------ |
| Content-Type  | `application/json` |
| Authorization | `Bearer <token>`   |

**Body**

| Name       | Type    | Description |
| ---------- | ------- | ----------- |
| `board_id` | integer | 게시글 id      |
| `content`  | string  | 댓글 내용       |

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
