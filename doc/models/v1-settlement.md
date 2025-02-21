
# V1 Settlement

V1Settlement

## Structure

`V1Settlement`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The settlement's unique identifier. | String getId() |
| `Status` | [`String`](../../doc/models/v1-settlement-status.md) | Optional | - | String getStatus() |
| `TotalMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getTotalMoney() |
| `InitiatedAt` | `String` | Optional | The time when the settlement was submitted for deposit or withdrawal, in ISO 8601 format. | String getInitiatedAt() |
| `BankAccountId` | `String` | Optional | The Square-issued unique identifier for the bank account associated with the settlement. | String getBankAccountId() |
| `Entries` | [`List<V1SettlementEntry>`](../../doc/models/v1-settlement-entry.md) | Optional | The entries included in this settlement. | List<V1SettlementEntry> getEntries() |

## Example (as JSON)

```json
{
  "id": "id2",
  "status": "FAILED",
  "total_money": {
    "amount": 250,
    "currency_code": "KZT"
  },
  "initiated_at": "initiated_at4",
  "bank_account_id": "bank_account_id2"
}
```

