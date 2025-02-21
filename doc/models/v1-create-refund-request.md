
# V1 Create Refund Request

V1CreateRefundRequest

## Structure

`V1CreateRefundRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `PaymentId` | `String` | Required | The ID of the payment to refund. If you are creating a `PARTIAL`<br>refund for a split tender payment, instead provide the id of the<br>particular tender you want to refund. | String getPaymentId() |
| `Type` | [`String`](../../doc/models/v1-create-refund-request-type.md) | Required | - | String getType() |
| `Reason` | `String` | Required | The reason for the refund. | String getReason() |
| `RefundedMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getRefundedMoney() |
| `RequestIdempotenceKey` | `String` | Optional | An optional key to ensure idempotence if you issue the same PARTIAL refund request more than once. | String getRequestIdempotenceKey() |

## Example (as JSON)

```json
{
  "payment_id": "payment_id2",
  "type": "FULL",
  "reason": "reason2",
  "refunded_money": {
    "amount": 214,
    "currency_code": "SRD"
  },
  "request_idempotence_key": "request_idempotence_key6"
}
```

