
# V1 Payment

A payment represents a paid transaction between a Square merchant and a
customer. Payment details are usually available from Connect API endpoints
within a few minutes after the transaction completes.

Each Payment object includes several fields that end in `_money`. These fields
describe the various amounts of money that contribute to the payment total:

<ul>
<li>
Monetary values are <b>positive</b> if they represent an
<em>increase</em> in the amount of money the merchant receives (e.g.,
<code>tax_money</code>, <code>tip_money</code>).
</li>
<li>
Monetary values are <b>negative</b> if they represent an
<em>decrease</em> in the amount of money the merchant receives (e.g.,
<code>discount_money</code>, <code>refunded_money</code>).
</li>
</ul>


## Structure

`V1Payment`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The payment's unique identifier. | String getId() |
| `MerchantId` | `String` | Optional | The unique identifier of the merchant that took the payment. | String getMerchantId() |
| `CreatedAt` | `String` | Optional | The time when the payment was created, in ISO 8601 format. Reflects the time of the first payment if the object represents an incomplete partial payment, and the time of the last or complete payment otherwise. | String getCreatedAt() |
| `CreatorId` | `String` | Optional | The unique identifier of the Square account that took the payment. | String getCreatorId() |
| `Device` | [`V1Device`](../../doc/models/v1-device.md) | Optional | - | V1Device getDevice() |
| `PaymentUrl` | `String` | Optional | The URL of the payment's detail page in the merchant dashboard. The merchant must be signed in to the merchant dashboard to view this page. | String getPaymentUrl() |
| `ReceiptUrl` | `String` | Optional | The URL of the receipt for the payment. Note that for split tender<br>payments, this URL corresponds to the receipt for the first tender<br>listed in the payment's tender field. Each Tender object has its own<br>receipt_url field you can use to get the other receipts associated with<br>a split tender payment. | String getReceiptUrl() |
| `InclusiveTaxMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getInclusiveTaxMoney() |
| `AdditiveTaxMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getAdditiveTaxMoney() |
| `TaxMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getTaxMoney() |
| `TipMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getTipMoney() |
| `DiscountMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getDiscountMoney() |
| `TotalCollectedMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getTotalCollectedMoney() |
| `ProcessingFeeMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getProcessingFeeMoney() |
| `NetTotalMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getNetTotalMoney() |
| `RefundedMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getRefundedMoney() |
| `SwedishRoundingMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getSwedishRoundingMoney() |
| `GrossSalesMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getGrossSalesMoney() |
| `NetSalesMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getNetSalesMoney() |
| `InclusiveTax` | [`List<V1PaymentTax>`](../../doc/models/v1-payment-tax.md) | Optional | All of the inclusive taxes associated with the payment. | List<V1PaymentTax> getInclusiveTax() |
| `AdditiveTax` | [`List<V1PaymentTax>`](../../doc/models/v1-payment-tax.md) | Optional | All of the additive taxes associated with the payment. | List<V1PaymentTax> getAdditiveTax() |
| `Tender` | [`List<V1Tender>`](../../doc/models/v1-tender.md) | Optional | All of the tenders associated with the payment. | List<V1Tender> getTender() |
| `Refunds` | [`List<V1Refund>`](../../doc/models/v1-refund.md) | Optional | All of the refunds applied to the payment. Note that the value of all refunds on a payment can exceed the value of all tenders if a merchant chooses to refund money to a tender after previously accepting returned goods as part of an exchange. | List<V1Refund> getRefunds() |
| `Itemizations` | [`List<V1PaymentItemization>`](../../doc/models/v1-payment-itemization.md) | Optional | The items purchased in the payment. | List<V1PaymentItemization> getItemizations() |
| `SurchargeMoney` | [`V1Money`](../../doc/models/v1-money.md) | Optional | - | V1Money getSurchargeMoney() |
| `Surcharges` | [`List<V1PaymentSurcharge>`](../../doc/models/v1-payment-surcharge.md) | Optional | A list of all surcharges associated with the payment. | List<V1PaymentSurcharge> getSurcharges() |
| `IsPartial` | `Boolean` | Optional | Indicates whether or not the payment is only partially paid for.<br>If true, this payment will have the tenders collected so far, but the<br>itemizations will be empty until the payment is completed. | Boolean getIsPartial() |

## Example (as JSON)

```json
{
  "id": "id2",
  "merchant_id": "merchant_id8",
  "created_at": "created_at0",
  "creator_id": "creator_id2",
  "device": {
    "id": "id6",
    "name": "name6"
  }
}
```

