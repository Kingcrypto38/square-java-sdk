# Cards

```java
CardsApi cardsApi = client.getCardsApi();
```

## Class Name

`CardsApi`

## Methods

* [List Cards](../../doc/api/cards.md#list-cards)
* [Create Card](../../doc/api/cards.md#create-card)
* [Retrieve Card](../../doc/api/cards.md#retrieve-card)
* [Disable Card](../../doc/api/cards.md#disable-card)


# List Cards

Retrieves a list of cards owned by the account making the request.
A max of 25 cards will be returned.

```java
CompletableFuture<ListCardsResponse> listCardsAsync(
    final String cursor,
    final String customerId,
    final Boolean includeDisabled,
    final String referenceId,
    final String sortOrder)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cursor` | `String` | Query, Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this to retrieve the next set of results for your original query.<br><br>See [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination) for more information. |
| `customerId` | `String` | Query, Optional | Limit results to cards associated with the customer supplied.<br>By default, all cards owned by the merchant are returned. |
| `includeDisabled` | `Boolean` | Query, Optional | Includes disabled cards.<br>By default, all enabled cards owned by the merchant are returned.<br>**Default**: `false` |
| `referenceId` | `String` | Query, Optional | Limit results to cards associated with the reference_id supplied. |
| `sortOrder` | [`String`](../../doc/models/sort-order.md) | Query, Optional | Sorts the returned list by when the card was created with the specified order.<br>This field defaults to ASC. |

## Response Type

[`ListCardsResponse`](../../doc/models/list-cards-response.md)

## Example Usage

```java
Boolean includeDisabled = false;

cardsApi.listCardsAsync(null, null, includeDisabled, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create Card

Adds a card on file to an existing merchant.

```java
CompletableFuture<CreateCardResponse> createCardAsync(
    final CreateCardRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

## Response Type

[`CreateCardResponse`](../../doc/models/create-card-response.md)

## Example Usage

```java
CreateCardRequest body = new CreateCardRequest.Builder(
    "4935a656-a929-4792-b97c-8848be85c27c",
    "cnon:uIbfJXhXETSP197M3GB",
    new Card.Builder()
        .cardholderName("Amelia Earhart")
        .billingAddress(new Address.Builder()
            .addressLine1("500 Electric Ave")
            .addressLine2("Suite 600")
            .locality("New York")
            .administrativeDistrictLevel1("NY")
            .postalCode("10003")
            .country("US")
            .build())
        .customerId("VDKXEEKPJN48QDG3BGGFAK05P8")
        .referenceId("user-id-1")
        .build()
)
.build();

cardsApi.createCardAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Retrieve Card

Retrieves details for a specific Card.

```java
CompletableFuture<RetrieveCardResponse> retrieveCardAsync(
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | Unique ID for the desired Card. |

## Response Type

[`RetrieveCardResponse`](../../doc/models/retrieve-card-response.md)

## Example Usage

```java
String cardId = "card_id4";

cardsApi.retrieveCardAsync(cardId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Disable Card

Disables the card, preventing any further updates or charges.
Disabling an already disabled card is allowed but has no effect.

```java
CompletableFuture<DisableCardResponse> disableCardAsync(
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | Unique ID for the desired Card. |

## Response Type

[`DisableCardResponse`](../../doc/models/disable-card-response.md)

## Example Usage

```java
String cardId = "card_id4";

cardsApi.disableCardAsync(cardId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

