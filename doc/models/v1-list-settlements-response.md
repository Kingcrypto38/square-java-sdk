
# V1 List Settlements Response

## Structure

`V1ListSettlementsResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Items` | [`List<V1Settlement>`](../../doc/models/v1-settlement.md) | Optional | - | List<V1Settlement> getItems() |

## Example (as JSON)

```json
{
  "items": [
    {
      "id": "id8",
      "status": "FAILED",
      "total_money": {
        "amount": 250,
        "currency_code": "KZT"
      },
      "initiated_at": "initiated_at0",
      "bank_account_id": "bank_account_id8"
    },
    {
      "id": "id8",
      "status": "FAILED",
      "total_money": {
        "amount": 250,
        "currency_code": "KZT"
      },
      "initiated_at": "initiated_at0",
      "bank_account_id": "bank_account_id8"
    },
    {
      "id": "id8",
      "status": "FAILED",
      "total_money": {
        "amount": 250,
        "currency_code": "KZT"
      },
      "initiated_at": "initiated_at0",
      "bank_account_id": "bank_account_id8"
    }
  ]
}
```

