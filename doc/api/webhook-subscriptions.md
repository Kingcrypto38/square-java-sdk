# Webhook Subscriptions

```java
WebhookSubscriptionsApi webhookSubscriptionsApi = client.getWebhookSubscriptionsApi();
```

## Class Name

`WebhookSubscriptionsApi`

## Methods

* [List Webhook Event Types](../../doc/api/webhook-subscriptions.md#list-webhook-event-types)
* [List Webhook Subscriptions](../../doc/api/webhook-subscriptions.md#list-webhook-subscriptions)
* [Create Webhook Subscription](../../doc/api/webhook-subscriptions.md#create-webhook-subscription)
* [Delete Webhook Subscription](../../doc/api/webhook-subscriptions.md#delete-webhook-subscription)
* [Retrieve Webhook Subscription](../../doc/api/webhook-subscriptions.md#retrieve-webhook-subscription)
* [Update Webhook Subscription](../../doc/api/webhook-subscriptions.md#update-webhook-subscription)
* [Update Webhook Subscription Signature Key](../../doc/api/webhook-subscriptions.md#update-webhook-subscription-signature-key)
* [Test Webhook Subscription](../../doc/api/webhook-subscriptions.md#test-webhook-subscription)


# List Webhook Event Types

Lists all webhook event types that can be subscribed to.

```java
CompletableFuture<ListWebhookEventTypesResponse> listWebhookEventTypesAsync(
    final String apiVersion)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `apiVersion` | `String` | Query, Optional | The API version for which to list event types. Setting this field overrides the default version used by the application. |

## Response Type

[`ListWebhookEventTypesResponse`](../../doc/models/list-webhook-event-types-response.md)

## Example Usage

```java
webhookSubscriptionsApi.listWebhookEventTypesAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List Webhook Subscriptions

Lists all webhook subscriptions owned by your application.

```java
CompletableFuture<ListWebhookSubscriptionsResponse> listWebhookSubscriptionsAsync(
    final String cursor,
    final Boolean includeDisabled,
    final String sortOrder,
    final Integer limit)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cursor` | `String` | Query, Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this to retrieve the next set of results for your original query.<br><br>For more information, see [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination). |
| `includeDisabled` | `Boolean` | Query, Optional | Includes disabled [Subscription](entity:WebhookSubscription)s.<br>By default, all enabled [Subscription](entity:WebhookSubscription)s are returned.<br>**Default**: `false` |
| `sortOrder` | [`String`](../../doc/models/sort-order.md) | Query, Optional | Sorts the returned list by when the [Subscription](entity:WebhookSubscription) was created with the specified order.<br>This field defaults to ASC. |
| `limit` | `Integer` | Query, Optional | The maximum number of results to be returned in a single page.<br>It is possible to receive fewer results than the specified limit on a given page.<br>The default value of 100 is also the maximum allowed value.<br><br>Default: 100 |

## Response Type

[`ListWebhookSubscriptionsResponse`](../../doc/models/list-webhook-subscriptions-response.md)

## Example Usage

```java
Boolean includeDisabled = false;

webhookSubscriptionsApi.listWebhookSubscriptionsAsync(null, includeDisabled, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create Webhook Subscription

Creates a webhook subscription.

```java
CompletableFuture<CreateWebhookSubscriptionResponse> createWebhookSubscriptionAsync(
    final CreateWebhookSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateWebhookSubscriptionRequest`](../../doc/models/create-webhook-subscription-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`CreateWebhookSubscriptionResponse`](../../doc/models/create-webhook-subscription-response.md)

## Example Usage

```java
CreateWebhookSubscriptionRequest body = new CreateWebhookSubscriptionRequest.Builder(
    new WebhookSubscription.Builder()
        .name("Example Webhook Subscription")
        .eventTypes(Arrays.asList(
            "payment.created",
            "payment.updated"
        ))
        .notificationUrl("https://example-webhook-url.com")
        .apiVersion("2021-12-15")
        .build()
)
.idempotencyKey("63f84c6c-2200-4c99-846c-2670a1311fbf")
.build();

webhookSubscriptionsApi.createWebhookSubscriptionAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete Webhook Subscription

Deletes a webhook subscription.

```java
CompletableFuture<DeleteWebhookSubscriptionResponse> deleteWebhookSubscriptionAsync(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | [REQUIRED] The ID of the [Subscription](entity:WebhookSubscription) to delete. |

## Response Type

[`DeleteWebhookSubscriptionResponse`](../../doc/models/delete-webhook-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

webhookSubscriptionsApi.deleteWebhookSubscriptionAsync(subscriptionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Retrieve Webhook Subscription

Retrieves a webhook subscription identified by its ID.

```java
CompletableFuture<RetrieveWebhookSubscriptionResponse> retrieveWebhookSubscriptionAsync(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | [REQUIRED] The ID of the [Subscription](entity:WebhookSubscription) to retrieve. |

## Response Type

[`RetrieveWebhookSubscriptionResponse`](../../doc/models/retrieve-webhook-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

webhookSubscriptionsApi.retrieveWebhookSubscriptionAsync(subscriptionId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Webhook Subscription

Updates a webhook subscription.

```java
CompletableFuture<UpdateWebhookSubscriptionResponse> updateWebhookSubscriptionAsync(
    final String subscriptionId,
    final UpdateWebhookSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | [REQUIRED] The ID of the [Subscription](entity:WebhookSubscription) to update. |
| `body` | [`UpdateWebhookSubscriptionRequest`](../../doc/models/update-webhook-subscription-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`UpdateWebhookSubscriptionResponse`](../../doc/models/update-webhook-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateWebhookSubscriptionRequest body = new UpdateWebhookSubscriptionRequest.Builder()
    .subscription(new WebhookSubscription.Builder()
        .name("Updated Example Webhook Subscription")
        .enabled(false)
        .build())
    .build();

webhookSubscriptionsApi.updateWebhookSubscriptionAsync(subscriptionId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update Webhook Subscription Signature Key

Updates a webhook subscription by replacing the existing signature key with a new one.

```java
CompletableFuture<UpdateWebhookSubscriptionSignatureKeyResponse> updateWebhookSubscriptionSignatureKeyAsync(
    final String subscriptionId,
    final UpdateWebhookSubscriptionSignatureKeyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | [REQUIRED] The ID of the [Subscription](entity:WebhookSubscription) to update. |
| `body` | [`UpdateWebhookSubscriptionSignatureKeyRequest`](../../doc/models/update-webhook-subscription-signature-key-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`UpdateWebhookSubscriptionSignatureKeyResponse`](../../doc/models/update-webhook-subscription-signature-key-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateWebhookSubscriptionSignatureKeyRequest body = new UpdateWebhookSubscriptionSignatureKeyRequest.Builder()
    .idempotencyKey("ed80ae6b-0654-473b-bbab-a39aee89a60d")
    .build();

webhookSubscriptionsApi.updateWebhookSubscriptionSignatureKeyAsync(subscriptionId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Test Webhook Subscription

Tests a webhook subscription by sending a test event to the notification URL.

```java
CompletableFuture<TestWebhookSubscriptionResponse> testWebhookSubscriptionAsync(
    final String subscriptionId,
    final TestWebhookSubscriptionRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | [REQUIRED] The ID of the [Subscription](entity:WebhookSubscription) to test. |
| `body` | [`TestWebhookSubscriptionRequest`](../../doc/models/test-webhook-subscription-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`TestWebhookSubscriptionResponse`](../../doc/models/test-webhook-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
TestWebhookSubscriptionRequest body = new TestWebhookSubscriptionRequest.Builder()
    .eventType("payment.created")
    .build();

webhookSubscriptionsApi.testWebhookSubscriptionAsync(subscriptionId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

