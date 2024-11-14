# 선택한 게시글 수정 API



## 선택한 게시글 수정

<mark style="color:green;">`PATCH`</mark> `/update/{id}`

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

**Body**

| Name      | Type   | Description |
| --------- | ------ | ----------- |
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
