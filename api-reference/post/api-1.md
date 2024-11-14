# 선택한 게시글 삭제 API



## 선택한 게시글 삭제

<mark style="color:green;">`POST`</mark> `/delete/{id}`

\<Description of the endpoint>

**Headers**

| Name          | Value              |
| ------------- | ------------------ |
| Content-Type  | `application/json` |
| Authorization | `Bearer <token>`   |

**Parameter**

| Name | Type    | Description |
| ---- | ------- | ----------- |
| `id` | integer | 게시글 id      |

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
