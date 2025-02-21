
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.squareup.square.http.client.HttpContext;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for V1Payment type.
 */
public class V1Payment {
    private HttpContext httpContext;
    private final String id;
    private final OptionalNullable<String> merchantId;
    private final String createdAt;
    private final OptionalNullable<String> creatorId;
    private final V1Device device;
    private final OptionalNullable<String> paymentUrl;
    private final OptionalNullable<String> receiptUrl;
    private final V1Money inclusiveTaxMoney;
    private final V1Money additiveTaxMoney;
    private final V1Money taxMoney;
    private final V1Money tipMoney;
    private final V1Money discountMoney;
    private final V1Money totalCollectedMoney;
    private final V1Money processingFeeMoney;
    private final V1Money netTotalMoney;
    private final V1Money refundedMoney;
    private final V1Money swedishRoundingMoney;
    private final V1Money grossSalesMoney;
    private final V1Money netSalesMoney;
    private final OptionalNullable<List<V1PaymentTax>> inclusiveTax;
    private final OptionalNullable<List<V1PaymentTax>> additiveTax;
    private final OptionalNullable<List<V1Tender>> tender;
    private final OptionalNullable<List<V1Refund>> refunds;
    private final OptionalNullable<List<V1PaymentItemization>> itemizations;
    private final V1Money surchargeMoney;
    private final OptionalNullable<List<V1PaymentSurcharge>> surcharges;
    private final OptionalNullable<Boolean> isPartial;

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  merchantId  String value for merchantId.
     * @param  createdAt  String value for createdAt.
     * @param  creatorId  String value for creatorId.
     * @param  device  V1Device value for device.
     * @param  paymentUrl  String value for paymentUrl.
     * @param  receiptUrl  String value for receiptUrl.
     * @param  inclusiveTaxMoney  V1Money value for inclusiveTaxMoney.
     * @param  additiveTaxMoney  V1Money value for additiveTaxMoney.
     * @param  taxMoney  V1Money value for taxMoney.
     * @param  tipMoney  V1Money value for tipMoney.
     * @param  discountMoney  V1Money value for discountMoney.
     * @param  totalCollectedMoney  V1Money value for totalCollectedMoney.
     * @param  processingFeeMoney  V1Money value for processingFeeMoney.
     * @param  netTotalMoney  V1Money value for netTotalMoney.
     * @param  refundedMoney  V1Money value for refundedMoney.
     * @param  swedishRoundingMoney  V1Money value for swedishRoundingMoney.
     * @param  grossSalesMoney  V1Money value for grossSalesMoney.
     * @param  netSalesMoney  V1Money value for netSalesMoney.
     * @param  inclusiveTax  List of V1PaymentTax value for inclusiveTax.
     * @param  additiveTax  List of V1PaymentTax value for additiveTax.
     * @param  tender  List of V1Tender value for tender.
     * @param  refunds  List of V1Refund value for refunds.
     * @param  itemizations  List of V1PaymentItemization value for itemizations.
     * @param  surchargeMoney  V1Money value for surchargeMoney.
     * @param  surcharges  List of V1PaymentSurcharge value for surcharges.
     * @param  isPartial  Boolean value for isPartial.
     */
    @JsonCreator
    public V1Payment(
            @JsonProperty("id") String id,
            @JsonProperty("merchant_id") String merchantId,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("creator_id") String creatorId,
            @JsonProperty("device") V1Device device,
            @JsonProperty("payment_url") String paymentUrl,
            @JsonProperty("receipt_url") String receiptUrl,
            @JsonProperty("inclusive_tax_money") V1Money inclusiveTaxMoney,
            @JsonProperty("additive_tax_money") V1Money additiveTaxMoney,
            @JsonProperty("tax_money") V1Money taxMoney,
            @JsonProperty("tip_money") V1Money tipMoney,
            @JsonProperty("discount_money") V1Money discountMoney,
            @JsonProperty("total_collected_money") V1Money totalCollectedMoney,
            @JsonProperty("processing_fee_money") V1Money processingFeeMoney,
            @JsonProperty("net_total_money") V1Money netTotalMoney,
            @JsonProperty("refunded_money") V1Money refundedMoney,
            @JsonProperty("swedish_rounding_money") V1Money swedishRoundingMoney,
            @JsonProperty("gross_sales_money") V1Money grossSalesMoney,
            @JsonProperty("net_sales_money") V1Money netSalesMoney,
            @JsonProperty("inclusive_tax") List<V1PaymentTax> inclusiveTax,
            @JsonProperty("additive_tax") List<V1PaymentTax> additiveTax,
            @JsonProperty("tender") List<V1Tender> tender,
            @JsonProperty("refunds") List<V1Refund> refunds,
            @JsonProperty("itemizations") List<V1PaymentItemization> itemizations,
            @JsonProperty("surcharge_money") V1Money surchargeMoney,
            @JsonProperty("surcharges") List<V1PaymentSurcharge> surcharges,
            @JsonProperty("is_partial") Boolean isPartial) {
        this.id = id;
        this.merchantId = OptionalNullable.of(merchantId);
        this.createdAt = createdAt;
        this.creatorId = OptionalNullable.of(creatorId);
        this.device = device;
        this.paymentUrl = OptionalNullable.of(paymentUrl);
        this.receiptUrl = OptionalNullable.of(receiptUrl);
        this.inclusiveTaxMoney = inclusiveTaxMoney;
        this.additiveTaxMoney = additiveTaxMoney;
        this.taxMoney = taxMoney;
        this.tipMoney = tipMoney;
        this.discountMoney = discountMoney;
        this.totalCollectedMoney = totalCollectedMoney;
        this.processingFeeMoney = processingFeeMoney;
        this.netTotalMoney = netTotalMoney;
        this.refundedMoney = refundedMoney;
        this.swedishRoundingMoney = swedishRoundingMoney;
        this.grossSalesMoney = grossSalesMoney;
        this.netSalesMoney = netSalesMoney;
        this.inclusiveTax = OptionalNullable.of(inclusiveTax);
        this.additiveTax = OptionalNullable.of(additiveTax);
        this.tender = OptionalNullable.of(tender);
        this.refunds = OptionalNullable.of(refunds);
        this.itemizations = OptionalNullable.of(itemizations);
        this.surchargeMoney = surchargeMoney;
        this.surcharges = OptionalNullable.of(surcharges);
        this.isPartial = OptionalNullable.of(isPartial);
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  merchantId  String value for merchantId.
     * @param  createdAt  String value for createdAt.
     * @param  creatorId  String value for creatorId.
     * @param  device  V1Device value for device.
     * @param  paymentUrl  String value for paymentUrl.
     * @param  receiptUrl  String value for receiptUrl.
     * @param  inclusiveTaxMoney  V1Money value for inclusiveTaxMoney.
     * @param  additiveTaxMoney  V1Money value for additiveTaxMoney.
     * @param  taxMoney  V1Money value for taxMoney.
     * @param  tipMoney  V1Money value for tipMoney.
     * @param  discountMoney  V1Money value for discountMoney.
     * @param  totalCollectedMoney  V1Money value for totalCollectedMoney.
     * @param  processingFeeMoney  V1Money value for processingFeeMoney.
     * @param  netTotalMoney  V1Money value for netTotalMoney.
     * @param  refundedMoney  V1Money value for refundedMoney.
     * @param  swedishRoundingMoney  V1Money value for swedishRoundingMoney.
     * @param  grossSalesMoney  V1Money value for grossSalesMoney.
     * @param  netSalesMoney  V1Money value for netSalesMoney.
     * @param  inclusiveTax  List of V1PaymentTax value for inclusiveTax.
     * @param  additiveTax  List of V1PaymentTax value for additiveTax.
     * @param  tender  List of V1Tender value for tender.
     * @param  refunds  List of V1Refund value for refunds.
     * @param  itemizations  List of V1PaymentItemization value for itemizations.
     * @param  surchargeMoney  V1Money value for surchargeMoney.
     * @param  surcharges  List of V1PaymentSurcharge value for surcharges.
     * @param  isPartial  Boolean value for isPartial.
     */

    protected V1Payment(String id, OptionalNullable<String> merchantId, String createdAt,
            OptionalNullable<String> creatorId, V1Device device,
            OptionalNullable<String> paymentUrl, OptionalNullable<String> receiptUrl,
            V1Money inclusiveTaxMoney, V1Money additiveTaxMoney, V1Money taxMoney, V1Money tipMoney,
            V1Money discountMoney, V1Money totalCollectedMoney, V1Money processingFeeMoney,
            V1Money netTotalMoney, V1Money refundedMoney, V1Money swedishRoundingMoney,
            V1Money grossSalesMoney, V1Money netSalesMoney,
            OptionalNullable<List<V1PaymentTax>> inclusiveTax,
            OptionalNullable<List<V1PaymentTax>> additiveTax,
            OptionalNullable<List<V1Tender>> tender, OptionalNullable<List<V1Refund>> refunds,
            OptionalNullable<List<V1PaymentItemization>> itemizations, V1Money surchargeMoney,
            OptionalNullable<List<V1PaymentSurcharge>> surcharges,
            OptionalNullable<Boolean> isPartial) {
        this.id = id;
        this.merchantId = merchantId;
        this.createdAt = createdAt;
        this.creatorId = creatorId;
        this.device = device;
        this.paymentUrl = paymentUrl;
        this.receiptUrl = receiptUrl;
        this.inclusiveTaxMoney = inclusiveTaxMoney;
        this.additiveTaxMoney = additiveTaxMoney;
        this.taxMoney = taxMoney;
        this.tipMoney = tipMoney;
        this.discountMoney = discountMoney;
        this.totalCollectedMoney = totalCollectedMoney;
        this.processingFeeMoney = processingFeeMoney;
        this.netTotalMoney = netTotalMoney;
        this.refundedMoney = refundedMoney;
        this.swedishRoundingMoney = swedishRoundingMoney;
        this.grossSalesMoney = grossSalesMoney;
        this.netSalesMoney = netSalesMoney;
        this.inclusiveTax = inclusiveTax;
        this.additiveTax = additiveTax;
        this.tender = tender;
        this.refunds = refunds;
        this.itemizations = itemizations;
        this.surchargeMoney = surchargeMoney;
        this.surcharges = surcharges;
        this.isPartial = isPartial;
    }

    @JsonIgnore
    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for Id.
     * The payment's unique identifier.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Internal Getter for MerchantId.
     * The unique identifier of the merchant that took the payment.
     * @return Returns the Internal String
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMerchantId() {
        return this.merchantId;
    }

    /**
     * Getter for MerchantId.
     * The unique identifier of the merchant that took the payment.
     * @return Returns the String
     */
    @JsonIgnore
    public String getMerchantId() {
        return OptionalNullable.getFrom(merchantId);
    }

    /**
     * Getter for CreatedAt.
     * The time when the payment was created, in ISO 8601 format. Reflects the time of the first
     * payment if the object represents an incomplete partial payment, and the time of the last or
     * complete payment otherwise.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Internal Getter for CreatorId.
     * The unique identifier of the Square account that took the payment.
     * @return Returns the Internal String
     */
    @JsonGetter("creator_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCreatorId() {
        return this.creatorId;
    }

    /**
     * Getter for CreatorId.
     * The unique identifier of the Square account that took the payment.
     * @return Returns the String
     */
    @JsonIgnore
    public String getCreatorId() {
        return OptionalNullable.getFrom(creatorId);
    }

    /**
     * Getter for Device.
     * @return Returns the V1Device
     */
    @JsonGetter("device")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Device getDevice() {
        return device;
    }

    /**
     * Internal Getter for PaymentUrl.
     * The URL of the payment's detail page in the merchant dashboard. The merchant must be signed
     * in to the merchant dashboard to view this page.
     * @return Returns the Internal String
     */
    @JsonGetter("payment_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaymentUrl() {
        return this.paymentUrl;
    }

    /**
     * Getter for PaymentUrl.
     * The URL of the payment's detail page in the merchant dashboard. The merchant must be signed
     * in to the merchant dashboard to view this page.
     * @return Returns the String
     */
    @JsonIgnore
    public String getPaymentUrl() {
        return OptionalNullable.getFrom(paymentUrl);
    }

    /**
     * Internal Getter for ReceiptUrl.
     * The URL of the receipt for the payment. Note that for split tender payments, this URL
     * corresponds to the receipt for the first tender listed in the payment's tender field. Each
     * Tender object has its own receipt_url field you can use to get the other receipts associated
     * with a split tender payment.
     * @return Returns the Internal String
     */
    @JsonGetter("receipt_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReceiptUrl() {
        return this.receiptUrl;
    }

    /**
     * Getter for ReceiptUrl.
     * The URL of the receipt for the payment. Note that for split tender payments, this URL
     * corresponds to the receipt for the first tender listed in the payment's tender field. Each
     * Tender object has its own receipt_url field you can use to get the other receipts associated
     * with a split tender payment.
     * @return Returns the String
     */
    @JsonIgnore
    public String getReceiptUrl() {
        return OptionalNullable.getFrom(receiptUrl);
    }

    /**
     * Getter for InclusiveTaxMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("inclusive_tax_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getInclusiveTaxMoney() {
        return inclusiveTaxMoney;
    }

    /**
     * Getter for AdditiveTaxMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("additive_tax_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getAdditiveTaxMoney() {
        return additiveTaxMoney;
    }

    /**
     * Getter for TaxMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("tax_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getTaxMoney() {
        return taxMoney;
    }

    /**
     * Getter for TipMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("tip_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getTipMoney() {
        return tipMoney;
    }

    /**
     * Getter for DiscountMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("discount_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getDiscountMoney() {
        return discountMoney;
    }

    /**
     * Getter for TotalCollectedMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("total_collected_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getTotalCollectedMoney() {
        return totalCollectedMoney;
    }

    /**
     * Getter for ProcessingFeeMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("processing_fee_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getProcessingFeeMoney() {
        return processingFeeMoney;
    }

    /**
     * Getter for NetTotalMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("net_total_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getNetTotalMoney() {
        return netTotalMoney;
    }

    /**
     * Getter for RefundedMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("refunded_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getRefundedMoney() {
        return refundedMoney;
    }

    /**
     * Getter for SwedishRoundingMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("swedish_rounding_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getSwedishRoundingMoney() {
        return swedishRoundingMoney;
    }

    /**
     * Getter for GrossSalesMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("gross_sales_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getGrossSalesMoney() {
        return grossSalesMoney;
    }

    /**
     * Getter for NetSalesMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("net_sales_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getNetSalesMoney() {
        return netSalesMoney;
    }

    /**
     * Internal Getter for InclusiveTax.
     * All of the inclusive taxes associated with the payment.
     * @return Returns the Internal List of V1PaymentTax
     */
    @JsonGetter("inclusive_tax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<V1PaymentTax>> internalGetInclusiveTax() {
        return this.inclusiveTax;
    }

    /**
     * Getter for InclusiveTax.
     * All of the inclusive taxes associated with the payment.
     * @return Returns the List of V1PaymentTax
     */
    @JsonIgnore
    public List<V1PaymentTax> getInclusiveTax() {
        return OptionalNullable.getFrom(inclusiveTax);
    }

    /**
     * Internal Getter for AdditiveTax.
     * All of the additive taxes associated with the payment.
     * @return Returns the Internal List of V1PaymentTax
     */
    @JsonGetter("additive_tax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<V1PaymentTax>> internalGetAdditiveTax() {
        return this.additiveTax;
    }

    /**
     * Getter for AdditiveTax.
     * All of the additive taxes associated with the payment.
     * @return Returns the List of V1PaymentTax
     */
    @JsonIgnore
    public List<V1PaymentTax> getAdditiveTax() {
        return OptionalNullable.getFrom(additiveTax);
    }

    /**
     * Internal Getter for Tender.
     * All of the tenders associated with the payment.
     * @return Returns the Internal List of V1Tender
     */
    @JsonGetter("tender")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<V1Tender>> internalGetTender() {
        return this.tender;
    }

    /**
     * Getter for Tender.
     * All of the tenders associated with the payment.
     * @return Returns the List of V1Tender
     */
    @JsonIgnore
    public List<V1Tender> getTender() {
        return OptionalNullable.getFrom(tender);
    }

    /**
     * Internal Getter for Refunds.
     * All of the refunds applied to the payment. Note that the value of all refunds on a payment
     * can exceed the value of all tenders if a merchant chooses to refund money to a tender after
     * previously accepting returned goods as part of an exchange.
     * @return Returns the Internal List of V1Refund
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<V1Refund>> internalGetRefunds() {
        return this.refunds;
    }

    /**
     * Getter for Refunds.
     * All of the refunds applied to the payment. Note that the value of all refunds on a payment
     * can exceed the value of all tenders if a merchant chooses to refund money to a tender after
     * previously accepting returned goods as part of an exchange.
     * @return Returns the List of V1Refund
     */
    @JsonIgnore
    public List<V1Refund> getRefunds() {
        return OptionalNullable.getFrom(refunds);
    }

    /**
     * Internal Getter for Itemizations.
     * The items purchased in the payment.
     * @return Returns the Internal List of V1PaymentItemization
     */
    @JsonGetter("itemizations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<V1PaymentItemization>> internalGetItemizations() {
        return this.itemizations;
    }

    /**
     * Getter for Itemizations.
     * The items purchased in the payment.
     * @return Returns the List of V1PaymentItemization
     */
    @JsonIgnore
    public List<V1PaymentItemization> getItemizations() {
        return OptionalNullable.getFrom(itemizations);
    }

    /**
     * Getter for SurchargeMoney.
     * @return Returns the V1Money
     */
    @JsonGetter("surcharge_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public V1Money getSurchargeMoney() {
        return surchargeMoney;
    }

    /**
     * Internal Getter for Surcharges.
     * A list of all surcharges associated with the payment.
     * @return Returns the Internal List of V1PaymentSurcharge
     */
    @JsonGetter("surcharges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<V1PaymentSurcharge>> internalGetSurcharges() {
        return this.surcharges;
    }

    /**
     * Getter for Surcharges.
     * A list of all surcharges associated with the payment.
     * @return Returns the List of V1PaymentSurcharge
     */
    @JsonIgnore
    public List<V1PaymentSurcharge> getSurcharges() {
        return OptionalNullable.getFrom(surcharges);
    }

    /**
     * Internal Getter for IsPartial.
     * Indicates whether or not the payment is only partially paid for. If true, this payment will
     * have the tenders collected so far, but the itemizations will be empty until the payment is
     * completed.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("is_partial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetIsPartial() {
        return this.isPartial;
    }

    /**
     * Getter for IsPartial.
     * Indicates whether or not the payment is only partially paid for. If true, this payment will
     * have the tenders collected so far, but the itemizations will be empty until the payment is
     * completed.
     * @return Returns the Boolean
     */
    @JsonIgnore
    public Boolean getIsPartial() {
        return OptionalNullable.getFrom(isPartial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, merchantId, createdAt, creatorId, device, paymentUrl, receiptUrl,
                inclusiveTaxMoney, additiveTaxMoney, taxMoney, tipMoney, discountMoney,
                totalCollectedMoney, processingFeeMoney, netTotalMoney, refundedMoney,
                swedishRoundingMoney, grossSalesMoney, netSalesMoney, inclusiveTax, additiveTax,
                tender, refunds, itemizations, surchargeMoney, surcharges, isPartial);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1Payment)) {
            return false;
        }
        V1Payment other = (V1Payment) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(merchantId, other.merchantId)
            && Objects.equals(createdAt, other.createdAt)
            && Objects.equals(creatorId, other.creatorId)
            && Objects.equals(device, other.device)
            && Objects.equals(paymentUrl, other.paymentUrl)
            && Objects.equals(receiptUrl, other.receiptUrl)
            && Objects.equals(inclusiveTaxMoney, other.inclusiveTaxMoney)
            && Objects.equals(additiveTaxMoney, other.additiveTaxMoney)
            && Objects.equals(taxMoney, other.taxMoney)
            && Objects.equals(tipMoney, other.tipMoney)
            && Objects.equals(discountMoney, other.discountMoney)
            && Objects.equals(totalCollectedMoney, other.totalCollectedMoney)
            && Objects.equals(processingFeeMoney, other.processingFeeMoney)
            && Objects.equals(netTotalMoney, other.netTotalMoney)
            && Objects.equals(refundedMoney, other.refundedMoney)
            && Objects.equals(swedishRoundingMoney, other.swedishRoundingMoney)
            && Objects.equals(grossSalesMoney, other.grossSalesMoney)
            && Objects.equals(netSalesMoney, other.netSalesMoney)
            && Objects.equals(inclusiveTax, other.inclusiveTax)
            && Objects.equals(additiveTax, other.additiveTax)
            && Objects.equals(tender, other.tender)
            && Objects.equals(refunds, other.refunds)
            && Objects.equals(itemizations, other.itemizations)
            && Objects.equals(surchargeMoney, other.surchargeMoney)
            && Objects.equals(surcharges, other.surcharges)
            && Objects.equals(isPartial, other.isPartial);
    }

    /**
     * Converts this V1Payment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V1Payment [" + "id=" + id + ", merchantId=" + merchantId + ", createdAt="
                + createdAt + ", creatorId=" + creatorId + ", device=" + device + ", paymentUrl="
                + paymentUrl + ", receiptUrl=" + receiptUrl + ", inclusiveTaxMoney="
                + inclusiveTaxMoney + ", additiveTaxMoney=" + additiveTaxMoney + ", taxMoney="
                + taxMoney + ", tipMoney=" + tipMoney + ", discountMoney=" + discountMoney
                + ", totalCollectedMoney=" + totalCollectedMoney + ", processingFeeMoney="
                + processingFeeMoney + ", netTotalMoney=" + netTotalMoney + ", refundedMoney="
                + refundedMoney + ", swedishRoundingMoney=" + swedishRoundingMoney
                + ", grossSalesMoney=" + grossSalesMoney + ", netSalesMoney=" + netSalesMoney
                + ", inclusiveTax=" + inclusiveTax + ", additiveTax=" + additiveTax + ", tender="
                + tender + ", refunds=" + refunds + ", itemizations=" + itemizations
                + ", surchargeMoney=" + surchargeMoney + ", surcharges=" + surcharges
                + ", isPartial=" + isPartial + "]";
    }

    /**
     * Builds a new {@link V1Payment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1Payment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .createdAt(getCreatedAt())
                .device(getDevice())
                .inclusiveTaxMoney(getInclusiveTaxMoney())
                .additiveTaxMoney(getAdditiveTaxMoney())
                .taxMoney(getTaxMoney())
                .tipMoney(getTipMoney())
                .discountMoney(getDiscountMoney())
                .totalCollectedMoney(getTotalCollectedMoney())
                .processingFeeMoney(getProcessingFeeMoney())
                .netTotalMoney(getNetTotalMoney())
                .refundedMoney(getRefundedMoney())
                .swedishRoundingMoney(getSwedishRoundingMoney())
                .grossSalesMoney(getGrossSalesMoney())
                .netSalesMoney(getNetSalesMoney())
                .surchargeMoney(getSurchargeMoney());
        builder.merchantId = internalGetMerchantId();
        builder.creatorId = internalGetCreatorId();
        builder.paymentUrl = internalGetPaymentUrl();
        builder.receiptUrl = internalGetReceiptUrl();
        builder.inclusiveTax = internalGetInclusiveTax();
        builder.additiveTax = internalGetAdditiveTax();
        builder.tender = internalGetTender();
        builder.refunds = internalGetRefunds();
        builder.itemizations = internalGetItemizations();
        builder.surcharges = internalGetSurcharges();
        builder.isPartial = internalGetIsPartial();
        return builder;
    }

    /**
     * Class to build instances of {@link V1Payment}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private String id;
        private OptionalNullable<String> merchantId;
        private String createdAt;
        private OptionalNullable<String> creatorId;
        private V1Device device;
        private OptionalNullable<String> paymentUrl;
        private OptionalNullable<String> receiptUrl;
        private V1Money inclusiveTaxMoney;
        private V1Money additiveTaxMoney;
        private V1Money taxMoney;
        private V1Money tipMoney;
        private V1Money discountMoney;
        private V1Money totalCollectedMoney;
        private V1Money processingFeeMoney;
        private V1Money netTotalMoney;
        private V1Money refundedMoney;
        private V1Money swedishRoundingMoney;
        private V1Money grossSalesMoney;
        private V1Money netSalesMoney;
        private OptionalNullable<List<V1PaymentTax>> inclusiveTax;
        private OptionalNullable<List<V1PaymentTax>> additiveTax;
        private OptionalNullable<List<V1Tender>> tender;
        private OptionalNullable<List<V1Refund>> refunds;
        private OptionalNullable<List<V1PaymentItemization>> itemizations;
        private V1Money surchargeMoney;
        private OptionalNullable<List<V1PaymentSurcharge>> surcharges;
        private OptionalNullable<Boolean> isPartial;



        /**
         * Setter for httpContext.
         * @param  httpContext  HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for merchantId.
         * @param  merchantId  String value for merchantId.
         * @return Builder
         */
        public Builder merchantId(String merchantId) {
            this.merchantId = OptionalNullable.of(merchantId);
            return this;
        }

        /**
         * UnSetter for merchantId.
         * @return Builder
         */
        public Builder unsetMerchantId() {
            merchantId = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for creatorId.
         * @param  creatorId  String value for creatorId.
         * @return Builder
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = OptionalNullable.of(creatorId);
            return this;
        }

        /**
         * UnSetter for creatorId.
         * @return Builder
         */
        public Builder unsetCreatorId() {
            creatorId = null;
            return this;
        }

        /**
         * Setter for device.
         * @param  device  V1Device value for device.
         * @return Builder
         */
        public Builder device(V1Device device) {
            this.device = device;
            return this;
        }

        /**
         * Setter for paymentUrl.
         * @param  paymentUrl  String value for paymentUrl.
         * @return Builder
         */
        public Builder paymentUrl(String paymentUrl) {
            this.paymentUrl = OptionalNullable.of(paymentUrl);
            return this;
        }

        /**
         * UnSetter for paymentUrl.
         * @return Builder
         */
        public Builder unsetPaymentUrl() {
            paymentUrl = null;
            return this;
        }

        /**
         * Setter for receiptUrl.
         * @param  receiptUrl  String value for receiptUrl.
         * @return Builder
         */
        public Builder receiptUrl(String receiptUrl) {
            this.receiptUrl = OptionalNullable.of(receiptUrl);
            return this;
        }

        /**
         * UnSetter for receiptUrl.
         * @return Builder
         */
        public Builder unsetReceiptUrl() {
            receiptUrl = null;
            return this;
        }

        /**
         * Setter for inclusiveTaxMoney.
         * @param  inclusiveTaxMoney  V1Money value for inclusiveTaxMoney.
         * @return Builder
         */
        public Builder inclusiveTaxMoney(V1Money inclusiveTaxMoney) {
            this.inclusiveTaxMoney = inclusiveTaxMoney;
            return this;
        }

        /**
         * Setter for additiveTaxMoney.
         * @param  additiveTaxMoney  V1Money value for additiveTaxMoney.
         * @return Builder
         */
        public Builder additiveTaxMoney(V1Money additiveTaxMoney) {
            this.additiveTaxMoney = additiveTaxMoney;
            return this;
        }

        /**
         * Setter for taxMoney.
         * @param  taxMoney  V1Money value for taxMoney.
         * @return Builder
         */
        public Builder taxMoney(V1Money taxMoney) {
            this.taxMoney = taxMoney;
            return this;
        }

        /**
         * Setter for tipMoney.
         * @param  tipMoney  V1Money value for tipMoney.
         * @return Builder
         */
        public Builder tipMoney(V1Money tipMoney) {
            this.tipMoney = tipMoney;
            return this;
        }

        /**
         * Setter for discountMoney.
         * @param  discountMoney  V1Money value for discountMoney.
         * @return Builder
         */
        public Builder discountMoney(V1Money discountMoney) {
            this.discountMoney = discountMoney;
            return this;
        }

        /**
         * Setter for totalCollectedMoney.
         * @param  totalCollectedMoney  V1Money value for totalCollectedMoney.
         * @return Builder
         */
        public Builder totalCollectedMoney(V1Money totalCollectedMoney) {
            this.totalCollectedMoney = totalCollectedMoney;
            return this;
        }

        /**
         * Setter for processingFeeMoney.
         * @param  processingFeeMoney  V1Money value for processingFeeMoney.
         * @return Builder
         */
        public Builder processingFeeMoney(V1Money processingFeeMoney) {
            this.processingFeeMoney = processingFeeMoney;
            return this;
        }

        /**
         * Setter for netTotalMoney.
         * @param  netTotalMoney  V1Money value for netTotalMoney.
         * @return Builder
         */
        public Builder netTotalMoney(V1Money netTotalMoney) {
            this.netTotalMoney = netTotalMoney;
            return this;
        }

        /**
         * Setter for refundedMoney.
         * @param  refundedMoney  V1Money value for refundedMoney.
         * @return Builder
         */
        public Builder refundedMoney(V1Money refundedMoney) {
            this.refundedMoney = refundedMoney;
            return this;
        }

        /**
         * Setter for swedishRoundingMoney.
         * @param  swedishRoundingMoney  V1Money value for swedishRoundingMoney.
         * @return Builder
         */
        public Builder swedishRoundingMoney(V1Money swedishRoundingMoney) {
            this.swedishRoundingMoney = swedishRoundingMoney;
            return this;
        }

        /**
         * Setter for grossSalesMoney.
         * @param  grossSalesMoney  V1Money value for grossSalesMoney.
         * @return Builder
         */
        public Builder grossSalesMoney(V1Money grossSalesMoney) {
            this.grossSalesMoney = grossSalesMoney;
            return this;
        }

        /**
         * Setter for netSalesMoney.
         * @param  netSalesMoney  V1Money value for netSalesMoney.
         * @return Builder
         */
        public Builder netSalesMoney(V1Money netSalesMoney) {
            this.netSalesMoney = netSalesMoney;
            return this;
        }

        /**
         * Setter for inclusiveTax.
         * @param  inclusiveTax  List of V1PaymentTax value for inclusiveTax.
         * @return Builder
         */
        public Builder inclusiveTax(List<V1PaymentTax> inclusiveTax) {
            this.inclusiveTax = OptionalNullable.of(inclusiveTax);
            return this;
        }

        /**
         * UnSetter for inclusiveTax.
         * @return Builder
         */
        public Builder unsetInclusiveTax() {
            inclusiveTax = null;
            return this;
        }

        /**
         * Setter for additiveTax.
         * @param  additiveTax  List of V1PaymentTax value for additiveTax.
         * @return Builder
         */
        public Builder additiveTax(List<V1PaymentTax> additiveTax) {
            this.additiveTax = OptionalNullable.of(additiveTax);
            return this;
        }

        /**
         * UnSetter for additiveTax.
         * @return Builder
         */
        public Builder unsetAdditiveTax() {
            additiveTax = null;
            return this;
        }

        /**
         * Setter for tender.
         * @param  tender  List of V1Tender value for tender.
         * @return Builder
         */
        public Builder tender(List<V1Tender> tender) {
            this.tender = OptionalNullable.of(tender);
            return this;
        }

        /**
         * UnSetter for tender.
         * @return Builder
         */
        public Builder unsetTender() {
            tender = null;
            return this;
        }

        /**
         * Setter for refunds.
         * @param  refunds  List of V1Refund value for refunds.
         * @return Builder
         */
        public Builder refunds(List<V1Refund> refunds) {
            this.refunds = OptionalNullable.of(refunds);
            return this;
        }

        /**
         * UnSetter for refunds.
         * @return Builder
         */
        public Builder unsetRefunds() {
            refunds = null;
            return this;
        }

        /**
         * Setter for itemizations.
         * @param  itemizations  List of V1PaymentItemization value for itemizations.
         * @return Builder
         */
        public Builder itemizations(List<V1PaymentItemization> itemizations) {
            this.itemizations = OptionalNullable.of(itemizations);
            return this;
        }

        /**
         * UnSetter for itemizations.
         * @return Builder
         */
        public Builder unsetItemizations() {
            itemizations = null;
            return this;
        }

        /**
         * Setter for surchargeMoney.
         * @param  surchargeMoney  V1Money value for surchargeMoney.
         * @return Builder
         */
        public Builder surchargeMoney(V1Money surchargeMoney) {
            this.surchargeMoney = surchargeMoney;
            return this;
        }

        /**
         * Setter for surcharges.
         * @param  surcharges  List of V1PaymentSurcharge value for surcharges.
         * @return Builder
         */
        public Builder surcharges(List<V1PaymentSurcharge> surcharges) {
            this.surcharges = OptionalNullable.of(surcharges);
            return this;
        }

        /**
         * UnSetter for surcharges.
         * @return Builder
         */
        public Builder unsetSurcharges() {
            surcharges = null;
            return this;
        }

        /**
         * Setter for isPartial.
         * @param  isPartial  Boolean value for isPartial.
         * @return Builder
         */
        public Builder isPartial(Boolean isPartial) {
            this.isPartial = OptionalNullable.of(isPartial);
            return this;
        }

        /**
         * UnSetter for isPartial.
         * @return Builder
         */
        public Builder unsetIsPartial() {
            isPartial = null;
            return this;
        }

        /**
         * Builds a new {@link V1Payment} object using the set fields.
         * @return {@link V1Payment}
         */
        public V1Payment build() {
            V1Payment model =
                    new V1Payment(id, merchantId, createdAt, creatorId, device, paymentUrl,
                            receiptUrl, inclusiveTaxMoney, additiveTaxMoney, taxMoney, tipMoney,
                            discountMoney, totalCollectedMoney, processingFeeMoney, netTotalMoney,
                            refundedMoney, swedishRoundingMoney, grossSalesMoney, netSalesMoney,
                            inclusiveTax, additiveTax, tender, refunds, itemizations,
                            surchargeMoney, surcharges, isPartial);
            model.httpContext = httpContext;
            return model;
        }
    }
}
