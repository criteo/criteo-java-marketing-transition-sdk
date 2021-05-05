

# ReadAdSetSchedule

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**NillableDateTime**](NillableDateTime.md) |  |  [optional]
**endDate** | [**NillableDateTime**](NillableDateTime.md) |  |  [optional]
**activationStatus** | [**ActivationStatusEnum**](#ActivationStatusEnum) | Activation status of the ad set, i.e. whether the consumer wants it to deliver |  [optional]
**deliveryStatus** | [**DeliveryStatusEnum**](#DeliveryStatusEnum) | Delivery status of the delivery of the ad set, i.e. whether the ad set is delivering |  [optional]



## Enum: ActivationStatusEnum

Name | Value
---- | -----
ON | &quot;on&quot;
OFF | &quot;off&quot;



## Enum: DeliveryStatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
INACTIVE | &quot;inactive&quot;
LIVE | &quot;live&quot;
NOTLIVE | &quot;notLive&quot;
PAUSING | &quot;pausing&quot;
PAUSED | &quot;paused&quot;
SCHEDULED | &quot;scheduled&quot;
ENDED | &quot;ended&quot;
NOTDELIVERING | &quot;notDelivering&quot;
ARCHIVED | &quot;archived&quot;



