
# Order Fulfillment Delivery Details

Describes delivery details of an order fulfillment.

## Structure

`OrderFulfillmentDeliveryDetails`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Recipient` | [`OrderFulfillmentRecipient`](../../doc/models/order-fulfillment-recipient.md) | Optional | Information about the fulfillment recipient. | OrderFulfillmentRecipient getRecipient() |
| `ScheduleType` | [`String`](../../doc/models/order-fulfillment-delivery-details-schedule-type.md) | Optional | The schedule type of the delivery fulfillment. | String getScheduleType() |
| `PlacedAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was placed.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z").<br>Must be in RFC 3339 timestamp format, e.g., "2016-09-04T23:59:33.123Z". | String getPlacedAt() |
| `DeliverAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>that represents the start of the delivery period.<br>When the fulfillment `schedule_type` is `ASAP`, the field is automatically<br>set to the current time plus the `prep_time_duration`.<br>Otherwise, the application can set this field while the fulfillment `state` is<br>`PROPOSED`, `RESERVED`, or `PREPARED` (any time before the<br>terminal state such as `COMPLETED`, `CANCELED`, and `FAILED`).<br><br>The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getDeliverAt() |
| `PrepTimeDuration` | `String` | Optional | The duration of time it takes to prepare and deliver this fulfillment.<br>The timestamp must be in RFC 3339 format (for example, "P1W3D"). | String getPrepTimeDuration() |
| `DeliveryWindowDuration` | `String` | Optional | The time period after the `deliver_at` timestamp in which to deliver the order.<br>Applications can set this field when the fulfillment `state` is<br>`PROPOSED`, `RESERVED`, or `PREPARED` (any time before the terminal state<br>such as `COMPLETED`, `CANCELED`, and `FAILED`).<br>The timestamp must be in RFC 3339 format (for example, "P1W3D"). | String getDeliveryWindowDuration() |
| `Note` | `String` | Optional | Provides additional instructions about the delivery fulfillment.<br>It is displayed in the Square Point of Sale application and set by the API.<br>**Constraints**: *Maximum Length*: `550` | String getNote() |
| `CompletedAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicates when the seller completed the fulfillment.<br>This field is automatically set when  fulfillment `state` changes to `COMPLETED`.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getCompletedAt() |
| `InProgressAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicates when the seller started processing the fulfillment.<br>This field is automatically set when the fulfillment `state` changes to `RESERVED`.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getInProgressAt() |
| `RejectedAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was rejected. This field is<br>automatically set when the fulfillment `state` changes to `FAILED`.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getRejectedAt() |
| `ReadyAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the seller marked the fulfillment as ready for<br>courier pickup. This field is automatically set when the fulfillment `state` changes<br>to PREPARED.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getReadyAt() |
| `DeliveredAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was delivered to the recipient.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getDeliveredAt() |
| `CanceledAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was canceled. This field is automatically<br>set when the fulfillment `state` changes to `CANCELED`.<br><br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getCanceledAt() |
| `CancelReason` | `String` | Optional | The delivery cancellation reason. Max length: 100 characters.<br>**Constraints**: *Maximum Length*: `100` | String getCancelReason() |
| `CourierPickupAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when an order can be picked up by the courier for delivery.<br>The timestamp must be in RFC 3339 format (for example, "2016-09-04T23:59:33.123Z"). | String getCourierPickupAt() |
| `CourierPickupWindowDuration` | `String` | Optional | The period of time in which the order should be picked up by the courier after the<br>`courier_pickup_at` timestamp.<br>The time must be in RFC 3339 format (for example, "P1W3D"). | String getCourierPickupWindowDuration() |
| `IsNoContactDelivery` | `Boolean` | Optional | Whether the delivery is preferred to be no contact. | Boolean getIsNoContactDelivery() |
| `DropoffNotes` | `String` | Optional | A note to provide additional instructions about how to deliver the order.<br>**Constraints**: *Maximum Length*: `550` | String getDropoffNotes() |
| `CourierProviderName` | `String` | Optional | The name of the courier provider.<br>**Constraints**: *Maximum Length*: `255` | String getCourierProviderName() |
| `CourierSupportPhoneNumber` | `String` | Optional | The support phone number of the courier.<br>**Constraints**: *Maximum Length*: `17` | String getCourierSupportPhoneNumber() |
| `SquareDeliveryId` | `String` | Optional | The identifier for the delivery created by Square.<br>**Constraints**: *Maximum Length*: `50` | String getSquareDeliveryId() |
| `ExternalDeliveryId` | `String` | Optional | The identifier for the delivery created by the third-party courier service.<br>**Constraints**: *Maximum Length*: `50` | String getExternalDeliveryId() |
| `ManagedDelivery` | `Boolean` | Optional | The flag to indicate the delivery is managed by a third party (ie DoorDash), which means<br>we may not receive all recipient information for PII purposes. | Boolean getManagedDelivery() |

## Example (as JSON)

```json
{
  "recipient": {
    "customer_id": "customer_id6",
    "display_name": "display_name8",
    "email_address": "email_address4",
    "phone_number": "phone_number4",
    "address": {
      "address_line_1": "address_line_16",
      "address_line_2": "address_line_26",
      "address_line_3": "address_line_32",
      "locality": "locality6",
      "sublocality": "sublocality6"
    }
  },
  "schedule_type": "SCHEDULED",
  "placed_at": "placed_at6",
  "deliver_at": "deliver_at2",
  "prep_time_duration": "prep_time_duration6"
}
```

