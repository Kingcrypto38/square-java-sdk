# Customer Segments

```java
CustomerSegmentsApi customerSegmentsApi = client.getCustomerSegmentsApi();
```

## Class Name

`CustomerSegmentsApi`

## Methods

* [List Customer Segments](../../doc/api/customer-segments.md#list-customer-segments)
* [Retrieve Customer Segment](../../doc/api/customer-segments.md#retrieve-customer-segment)


# List Customer Segments

Retrieves the list of customer segments of a business.

```java
CompletableFuture<ListCustomerSegmentsResponse> listCustomerSegmentsAsync(
    final String cursor,
    final Integer limit)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cursor` | `String` | Query, Optional | A pagination cursor returned by previous calls to `ListCustomerSegments`.<br>This cursor is used to retrieve the next set of query results.<br><br>For more information, see [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination). |
| `limit` | `Integer` | Query, Optional | The maximum number of results to return in a single page. This limit is advisory. The response might contain more or fewer results.<br>If the specified limit is less than 1 or greater than 50, Square returns a `400 VALUE_TOO_LOW` or `400 VALUE_TOO_HIGH` error. The default value is 50.<br><br>For more information, see [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination). |

## Response Type

[`ListCustomerSegmentsResponse`](../../doc/models/list-customer-segments-response.md)

## Example Usage

```java
customerSegmentsApi.listCustomerSegmentsAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Retrieve Customer Segment

Retrieves a specific customer segment as identified by the `segment_id` value.

```java
CompletableFuture<RetrieveCustomerSegmentResponse> retrieveCustomerSegmentAsync(
    final String segmentId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `segmentId` | `String` | Template, Required | The Square-issued ID of the customer segment. |

## Response Type

[`RetrieveCustomerSegmentResponse`](../../doc/models/retrieve-customer-segment-response.md)

## Example Usage

```java
String segmentId = "segment_id4";

customerSegmentsApi.retrieveCustomerSegmentAsync(segmentId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

