
# Catalog Subscription Plan

Describes a subscription plan. A subscription plan represents what you want to sell in a subscription model, and includes references to each of the associated subscription plan variations.
For more information, see [Subscription Plans and Variations](https://developer.squareup.com/docs/subscriptions-api/plans-and-variations).

## Structure

`CatalogSubscriptionPlan`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The name of the plan. | String getName() |
| `Phases` | [`List<SubscriptionPhase>`](../../doc/models/subscription-phase.md) | Optional | A list of SubscriptionPhase containing the [SubscriptionPhase](entity:SubscriptionPhase) for this plan.<br>This field it required. Not including this field will throw a REQUIRED_FIELD_MISSING error | List<SubscriptionPhase> getPhases() |
| `SubscriptionPlanVariations` | [`List<CatalogObject>`](../../doc/models/catalog-object.md) | Optional | The list of subscription plan variations available for this product | List<CatalogObject> getSubscriptionPlanVariations() |
| `EligibleItemIds` | `List<String>` | Optional | The list of IDs of `CatalogItems` that are eligible for subscription by this SubscriptionPlan's variations. | List<String> getEligibleItemIds() |
| `EligibleCategoryIds` | `List<String>` | Optional | The list of IDs of `CatalogCategory` that are eligible for subscription by this SubscriptionPlan's variations. | List<String> getEligibleCategoryIds() |
| `AllItems` | `Boolean` | Optional | If true, all items in the merchant's catalog are subscribable by this SubscriptionPlan. | Boolean getAllItems() |

## Example (as JSON)

```json
{
  "name": "name6",
  "phases": [
    {
      "uid": "uid0",
      "cadence": "QUARTERLY",
      "periods": 112,
      "recurring_price_money": {
        "amount": 66,
        "currency": "TMT"
      },
      "ordinal": 78,
      "pricing": {
        "type": "STATIC",
        "discount_ids": [
          "discount_ids5",
          "discount_ids6"
        ],
        "price_money": {
          "amount": 202,
          "currency": "CNY"
        }
      }
    },
    {
      "uid": "uid0",
      "cadence": "QUARTERLY",
      "periods": 112,
      "recurring_price_money": {
        "amount": 66,
        "currency": "TMT"
      },
      "ordinal": 78,
      "pricing": {
        "type": "STATIC",
        "discount_ids": [
          "discount_ids5",
          "discount_ids6"
        ],
        "price_money": {
          "amount": 202,
          "currency": "CNY"
        }
      }
    },
    {
      "uid": "uid0",
      "cadence": "QUARTERLY",
      "periods": 112,
      "recurring_price_money": {
        "amount": 66,
        "currency": "TMT"
      },
      "ordinal": 78,
      "pricing": {
        "type": "STATIC",
        "discount_ids": [
          "discount_ids5",
          "discount_ids6"
        ],
        "price_money": {
          "amount": 202,
          "currency": "CNY"
        }
      }
    }
  ],
  "subscription_plan_variations": [
    {
      "type": "TIME_PERIOD",
      "id": "id4",
      "updated_at": "updated_at0",
      "version": 208,
      "is_deleted": false,
      "custom_attribute_values": {
        "key0": {
          "name": "name8",
          "string_value": "string_value2",
          "custom_attribute_definition_id": "custom_attribute_definition_id4",
          "type": "STRING",
          "number_value": "number_value8"
        },
        "key1": {
          "name": "name8",
          "string_value": "string_value2",
          "custom_attribute_definition_id": "custom_attribute_definition_id4",
          "type": "STRING",
          "number_value": "number_value8"
        },
        "key2": {
          "name": "name8",
          "string_value": "string_value2",
          "custom_attribute_definition_id": "custom_attribute_definition_id4",
          "type": "STRING",
          "number_value": "number_value8"
        }
      },
      "catalog_v1_ids": [
        {
          "catalog_v1_id": "catalog_v1_id4",
          "location_id": "location_id4"
        },
        {
          "catalog_v1_id": "catalog_v1_id4",
          "location_id": "location_id4"
        },
        {
          "catalog_v1_id": "catalog_v1_id4",
          "location_id": "location_id4"
        }
      ]
    },
    {
      "type": "TIME_PERIOD",
      "id": "id4",
      "updated_at": "updated_at0",
      "version": 208,
      "is_deleted": false,
      "custom_attribute_values": {
        "key0": {
          "name": "name8",
          "string_value": "string_value2",
          "custom_attribute_definition_id": "custom_attribute_definition_id4",
          "type": "STRING",
          "number_value": "number_value8"
        },
        "key1": {
          "name": "name8",
          "string_value": "string_value2",
          "custom_attribute_definition_id": "custom_attribute_definition_id4",
          "type": "STRING",
          "number_value": "number_value8"
        },
        "key2": {
          "name": "name8",
          "string_value": "string_value2",
          "custom_attribute_definition_id": "custom_attribute_definition_id4",
          "type": "STRING",
          "number_value": "number_value8"
        }
      },
      "catalog_v1_ids": [
        {
          "catalog_v1_id": "catalog_v1_id4",
          "location_id": "location_id4"
        },
        {
          "catalog_v1_id": "catalog_v1_id4",
          "location_id": "location_id4"
        },
        {
          "catalog_v1_id": "catalog_v1_id4",
          "location_id": "location_id4"
        }
      ]
    }
  ],
  "eligible_item_ids": [
    "eligible_item_ids8",
    "eligible_item_ids7"
  ],
  "eligible_category_ids": [
    "eligible_category_ids5",
    "eligible_category_ids6",
    "eligible_category_ids7"
  ],
  "all_items": false
}
```

