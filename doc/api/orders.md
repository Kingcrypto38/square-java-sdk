# Orders

```java
OrdersApi ordersApi = client.getOrdersApi();
```

## Class Name

`OrdersApi`

## Methods

* [Create Order](../../doc/api/orders.md#create-order)
* [Batch Retrieve Orders](../../doc/api/orders.md#batch-retrieve-orders)
* [Calculate Order](../../doc/api/orders.md#calculate-order)
* [Clone Order](../../doc/api/orders.md#clone-order)
* [Search Orders](../../doc/api/orders.md#search-orders)
* [Retrieve Order](../../doc/api/orders.md#retrieve-order)
* [Update Order](../../doc/api/orders.md#update-order)
* [Pay Order](../../doc/api/orders.md#pay-order)


# Create Order

Creates a new [order](../../doc/models/order.md) that can include information about products for
purchase and settings to apply to the purchase.

To pay for a created order, see
[Pay for Orders](https://developer.squareup.com/docs/orders-api/pay-for-orders).

You can modify open orders using the [UpdateOrder](../../doc/api/orders.md#update-order) endpoint.

```java
CompletableFuture<CreateOrderResponse> createOrderAsync(
    final CreateOrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateOrderRequest`](../../doc/models/create-order-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`CreateOrderResponse`](../../doc/models/create-order-response.md)

## Example Usage

```java
CreateOrderRequest body = new CreateOrderRequest.Builder()
    .order(new Order.Builder(
        "057P5VYJ4A5X1"
    )
    .referenceId("my-order-001")
    .lineItems(Arrays.asList(
            new OrderLineItem.Builder(
                "1"
            )
            .name("New York Strip Steak")
            .basePriceMoney(new Money.Builder()
                    .amount(1599L)
                    .currency("USD")
                    .build())
            .build(),
            new OrderLineItem.Builder(
                "2"
            )
            .catalogObjectId("BEMYCSMIJL46OCDV4KYIKXIB")
            .modifiers(Arrays.asList(
                    new OrderLineItemModifier.Builder()
                        .catalogObjectId("CHQX7Y4KY6N5KINJKZCFURPZ")
                        .build()
                ))
            .appliedDiscounts(Arrays.asList(
                    new OrderLineItemAppliedDiscount.Builder(
                        "one-dollar-off"
                    )
                    .build()
                ))
            .build()
        ))
    .taxes(Arrays.asList(
            new OrderLineItemTax.Builder()
                .uid("state-sales-tax")
                .name("State Sales Tax")
                .percentage("9")
                .scope("ORDER")
                .build()
        ))
    .discounts(Arrays.asList(
            new OrderLineItemDiscount.Builder()
                .uid("labor-day-sale")
                .name("Labor Day Sale")
                .percentage("5")
                .scope("ORDER")
                .build(),
            new OrderLineItemDiscount.Builder()
                .uid("membership-discount")
                .catalogObjectId("DB7L55ZH2BGWI4H23ULIWOQ7")
                .scope("ORDER")
                .build(),
            new OrderLineItemDiscount.Builder()
                .uid("one-dollar-off")
                .name("Sale - $1.00 off")
                .amountMoney(new Money.Builder()
                    .amount(100L)
                    .currency("USD")
                    .build())
                .scope("LINE_ITEM")
                .build()
        ))
    .build())
    .idempotencyKey("8193148c-9586-11e6-99f9-28cfe92138cf")
    .build();

ordersApi.createOrderAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Batch Retrieve Orders

Retrieves a set of [orders](../../doc/models/order.md) by their IDs.

If a given order ID does not exist, the ID is ignored instead of generating an error.

```java
CompletableFuture<BatchRetrieveOrdersResponse> batchRetrieveOrdersAsync(
    final BatchRetrieveOrdersRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BatchRetrieveOrdersRequest`](../../doc/models/batch-retrieve-orders-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`BatchRetrieveOrdersResponse`](../../doc/models/batch-retrieve-orders-response.md)

## Example Usage

```java
BatchRetrieveOrdersRequest body = new BatchRetrieveOrdersRequest.Builder(
    Arrays.asList(
        "CAISEM82RcpmcFBM0TfOyiHV3es",
        "CAISENgvlJ6jLWAzERDzjyHVybY"
    )
)
.locationId("057P5VYJ4A5X1")
.build();

ordersApi.batchRetrieveOrdersAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Calculate Order

Enables applications to preview order pricing without creating an order.

```java
CompletableFuture<CalculateOrderResponse> calculateOrderAsync(
    final CalculateOrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CalculateOrderRequest`](../../doc/models/calculate-order-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`CalculateOrderResponse`](../../doc/models/calculate-order-response.md)

## Example Usage

```java
CalculateOrderRequest body = new CalculateOrderRequest.Builder(
    new Order.Builder(
        "D7AVYMEAPJ3A3"
    )
    .lineItems(Arrays.asList(
            new OrderLineItem.Builder(
                "1"
            )
            .name("Item 1")
            .basePriceMoney(new Money.Builder()
                    .amount(500L)
                    .currency("USD")
                    .build())
            .build(),
            new OrderLineItem.Builder(
                "2"
            )
            .name("Item 2")
            .basePriceMoney(new Money.Builder()
                    .amount(300L)
                    .currency("USD")
                    .build())
            .build()
        ))
    .discounts(Arrays.asList(
            new OrderLineItemDiscount.Builder()
                .name("50% Off")
                .percentage("50")
                .scope("ORDER")
                .build()
        ))
    .build()
)
.build();

ordersApi.calculateOrderAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Clone Order

Creates a new order, in the `DRAFT` state, by duplicating an existing order. The newly created order has
only the core fields (such as line items, taxes, and discounts) copied from the original order.

```java
CompletableFuture<CloneOrderResponse> cloneOrderAsync(
    final CloneOrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CloneOrderRequest`](../../doc/models/clone-order-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`CloneOrderResponse`](../../doc/models/clone-order-response.md)

## Example Usage

```java
CloneOrderRequest body = new CloneOrderRequest.Builder(
    "ZAISEM52YcpmcWAzERDOyiWS123"
)
.version(3)
.idempotencyKey("UNIQUE_STRING")
.build();

ordersApi.cloneOrderAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Search Orders

Search all orders for one or more locations. Orders include all sales,
returns, and exchanges regardless of how or when they entered the Square
ecosystem (such as Point of Sale, Invoices, and Connect APIs).

`SearchOrders` requests need to specify which locations to search and define a
[SearchOrdersQuery](../../doc/models/search-orders-query.md) object that controls
how to sort or filter the results. Your `SearchOrdersQuery` can:

Set filter criteria.
Set the sort order.
Determine whether to return results as complete `Order` objects or as
[OrderEntry](../../doc/models/order-entry.md) objects.

Note that details for orders processed with Square Point of Sale while in
offline mode might not be transmitted to Square for up to 72 hours. Offline
orders have a `created_at` value that reflects the time the order was created,
not the time it was subsequently transmitted to Square.

```java
CompletableFuture<SearchOrdersResponse> searchOrdersAsync(
    final SearchOrdersRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SearchOrdersRequest`](../../doc/models/search-orders-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`SearchOrdersResponse`](../../doc/models/search-orders-response.md)

## Example Usage

```java
SearchOrdersRequest body = new SearchOrdersRequest.Builder()
    .locationIds(Arrays.asList(
        "057P5VYJ4A5X1",
        "18YC4JDH91E1H"
    ))
    .query(new SearchOrdersQuery.Builder()
        .filter(new SearchOrdersFilter.Builder()
            .stateFilter(new SearchOrdersStateFilter.Builder(
                Arrays.asList(
                    "COMPLETED"
                )
            )
            .build())
            .dateTimeFilter(new SearchOrdersDateTimeFilter.Builder()
                .closedAt(new TimeRange.Builder()
                    .startAt("2018-03-03T20:00:00+00:00")
                    .endAt("2019-03-04T21:54:45+00:00")
                    .build())
                .build())
            .build())
        .sort(new SearchOrdersSort.Builder(
            "CLOSED_AT"
        )
        .sortOrder("DESC")
        .build())
        .build())
    .limit(3)
    .returnEntries(true)
    .build();

ordersApi.searchOrdersAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Retrieve Order

Retrieves an [Order](../../doc/models/order.md) by ID.

```java
CompletableFuture<RetrieveOrderResponse> retrieveOrderAsync(
    final String orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | The ID of the order to retrieve. |

## Response Type

[`RetrieveOrderResponse`](../../doc/models/retrieve-order-response.md)

## Example Usage

```java
String orderId = "order_id6";

ordersApi.retrieveOrderAsync(orderId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Order

Updates an open [order](../../doc/models/order.md) by adding, replacing, or deleting
fields. Orders with a `COMPLETED` or `CANCELED` state cannot be updated.

An `UpdateOrder` request requires the following:

- The `order_id` in the endpoint path, identifying the order to update.
- The latest `version` of the order to update.
- The [sparse order](https://developer.squareup.com/docs/orders-api/manage-orders/update-orders#sparse-order-objects)
  containing only the fields to update and the version to which the update is
  being applied.
- If deleting fields, the [dot notation paths](https://developer.squareup.com/docs/orders-api/manage-orders/update-orders#identifying-fields-to-delete)
  identifying the fields to clear.

To pay for an order, see
[Pay for Orders](https://developer.squareup.com/docs/orders-api/pay-for-orders).

```java
CompletableFuture<UpdateOrderResponse> updateOrderAsync(
    final String orderId,
    final UpdateOrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | The ID of the order to update. |
| `body` | [`UpdateOrderRequest`](../../doc/models/update-order-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`UpdateOrderResponse`](../../doc/models/update-order-response.md)

## Example Usage

```java
String orderId = "order_id6";
UpdateOrderRequest body = new UpdateOrderRequest.Builder()
    .build();

ordersApi.updateOrderAsync(orderId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Pay Order

Pay for an [order](../../doc/models/order.md) using one or more approved [payments](../../doc/models/payment.md)
or settle an order with a total of `0`.

The total of the `payment_ids` listed in the request must be equal to the order
total. Orders with a total amount of `0` can be marked as paid by specifying an empty
array of `payment_ids` in the request.

To be used with `PayOrder`, a payment must:

- Reference the order by specifying the `order_id` when [creating the payment](../../doc/api/payments.md#create-payment).
  Any approved payments that reference the same `order_id` not specified in the
  `payment_ids` is canceled.
- Be approved with [delayed capture](https://developer.squareup.com/docs/payments-api/take-payments/card-payments/delayed-capture).
  Using a delayed capture payment with `PayOrder` completes the approved payment.

```java
CompletableFuture<PayOrderResponse> payOrderAsync(
    final String orderId,
    final PayOrderRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | The ID of the order being paid. |
| `body` | [`PayOrderRequest`](../../doc/models/pay-order-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`PayOrderResponse`](../../doc/models/pay-order-response.md)

## Example Usage

```java
String orderId = "order_id6";
PayOrderRequest body = new PayOrderRequest.Builder(
    "c043a359-7ad9-4136-82a9-c3f1d66dcbff"
)
.paymentIds(Arrays.asList(
        "EnZdNAlWCmfh6Mt5FMNST1o7taB",
        "0LRiVlbXVwe8ozu4KbZxd12mvaB"
    ))
.build();

ordersApi.payOrderAsync(orderId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

