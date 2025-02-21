
# V1 List Refunds Request

## Structure

`V1ListRefundsRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Order` | [`String`](../../doc/models/sort-order.md) | Optional | The order (e.g., chronological or alphabetical) in which results from a request are returned. | String getOrder() |
| `BeginTime` | `String` | Optional | The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013 (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year. | String getBeginTime() |
| `EndTime` | `String` | Optional | The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than begin_time, this endpoint returns an error. Default value: The current time. | String getEndTime() |
| `Limit` | `Integer` | Optional | The approximate number of refunds to return in a single response. Default: 100. Max: 200. Response may contain more results than the prescribed limit when refunds are made simultaneously to multiple tenders in a payment or when refunds are generated in an exchange to account for the value of returned goods. | Integer getLimit() |
| `BatchToken` | `String` | Optional | A pagination cursor to retrieve the next set of results for your<br>original query to the endpoint. | String getBatchToken() |

## Example (as JSON)

```json
{
  "order": "DESC",
  "begin_time": "begin_time0",
  "end_time": "end_time4",
  "limit": 66,
  "batch_token": "batch_token0"
}
```

