# This project is deprecated
We've built a new set of SDKs to help you use our [Criteo's API](https://developers.criteo.com/).

You can find the new Java SDKs repository here : https://github.com/criteo/criteo-api-java-sdk

# Criteo API Transition SDK for Java

## Introduction
API Client Libraries can facilitate your use of the Criteo API allowing you to build unique and customized solutions to serve your businesses and clients.
These libraries can reduce the amount of code you need to write in order to start accessing Criteo programmatically. They also can help expedite troubleshooting, should you encounter any issues.
This Transition SDK will help you migrate from MAPI to Criteo API. We will support it until end of 2021 when we will decommission the /legacy endpoints. After that date we will only support our official versioned Client Libraries available in Q3 2021.

More information: [https://developers.criteo.com/marketing-solutions/docs/java-api-client-library](https://developers.criteo.com/marketing-solutions/docs/java-api-client-library)

Criteo API Transition Swagger

- API version: 2021-04


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

or

```shell
gradle install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.criteo</groupId>
  <artifactId>api-transition.java-client</artifactId>
  <version>2021-04.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.criteo:api-transition.java-client:2021-04.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-transition.java-client-2021-04.0.jar`
* `target/lib/*.jar`

## Example
Please see [src/examples/java/com/criteo/marketing/](src/examples/java/com/criteo/marketing/) for full examples to get a valid token and make a call to the API.

## Documentation for API Endpoints

All URIs are relative to *https://api.criteo.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvertiserApi* | [**apiPortfolioGet**](docs/AdvertiserApi.md#apiPortfolioGet) | **GET** /2021-04/advertisers/me | 
*AdvertiserApi* | [**getCategories**](docs/AdvertiserApi.md#getCategories) | **GET** /legacy/marketing/v1/advertisers/{advertiserId}/categories | Gets all advertiser&#39;s categories
*AdvertiserApi* | [**getCategory**](docs/AdvertiserApi.md#getCategory) | **GET** /legacy/marketing/v1/advertisers/{advertiserId}/categories/{categoryHashCode} | Gets a specific advertiser&#39;s category
*AnalyticsApi* | [**getAdsetReport**](docs/AnalyticsApi.md#getAdsetReport) | **POST** /2021-04/statistics/report | 
*AnalyticsApi* | [**getTransactionsReport**](docs/AnalyticsApi.md#getTransactionsReport) | **POST** /2021-04/transactions/report | 
*AudienceApi* | [**createAudience**](docs/AudienceApi.md#createAudience) | **POST** /2021-04/audiences | 
*AudienceApi* | [**deleteIdentifiers**](docs/AudienceApi.md#deleteIdentifiers) | **DELETE** /2021-04/audiences/{audience-id}/contactlist | 
*AudienceApi* | [**getAudiences**](docs/AudienceApi.md#getAudiences) | **GET** /2021-04/audiences | 
*AudienceApi* | [**modifyAudience**](docs/AudienceApi.md#modifyAudience) | **PATCH** /2021-04/audiences/{audience-id} | 
*AudienceApi* | [**modifyAudienceUsers**](docs/AudienceApi.md#modifyAudienceUsers) | **PATCH** /2021-04/audiences/{audience-id}/contactlist | 
*AudienceApi* | [**removeAudience**](docs/AudienceApi.md#removeAudience) | **DELETE** /2021-04/audiences/{audience-id} | 
*CampaignApi* | [**getAdSet**](docs/CampaignApi.md#getAdSet) | **GET** /2021-04/marketing-solutions/ad-sets/{adSetId} | 
*CampaignApi* | [**getBids**](docs/CampaignApi.md#getBids) | **GET** /legacy/marketing/v1/campaigns/bids | Gets a the bids for campaigns and their categories
*CampaignApi* | [**getCategories**](docs/CampaignApi.md#getCategories) | **GET** /legacy/marketing/v1/campaigns/{campaignId}/categories | Gets categories
*CampaignApi* | [**getCategory**](docs/CampaignApi.md#getCategory) | **GET** /legacy/marketing/v1/campaigns/{campaignId}/categories/{categoryHashCode} | Gets a specific category
*CampaignApi* | [**patchAdSets**](docs/CampaignApi.md#patchAdSets) | **PATCH** /2021-04/marketing-solutions/ad-sets | 
*CampaignApi* | [**searchAdSets**](docs/CampaignApi.md#searchAdSets) | **POST** /2021-04/marketing-solutions/ad-sets/search | 
*CampaignApi* | [**startAdSets**](docs/CampaignApi.md#startAdSets) | **POST** /2021-04/marketing-solutions/ad-sets/start | 
*CampaignApi* | [**stopAdSets**](docs/CampaignApi.md#stopAdSets) | **POST** /2021-04/marketing-solutions/ad-sets/stop | 
*CampaignApi* | [**updateBids**](docs/CampaignApi.md#updateBids) | **PUT** /legacy/marketing/v1/campaigns/bids | Update bids for campaigns and their categories
*CategoryApi* | [**getCategories**](docs/CategoryApi.md#getCategories) | **GET** /legacy/marketing/v1/categories | Gets categories
*CategoryApi* | [**updateCategories**](docs/CategoryApi.md#updateCategories) | **PUT** /legacy/marketing/v1/categories | Enables/disables categories
*OAuthApi* | [**createToken**](docs/OAuthApi.md#createToken) | **POST** /oauth2/token | 


## Documentation for Models

 - [AdSetDeliveryLimitations](docs/AdSetDeliveryLimitations.md)
 - [AdSetFrequencyCapping](docs/AdSetFrequencyCapping.md)
 - [AdSetGeoLocation](docs/AdSetGeoLocation.md)
 - [AdSetSearchFilter](docs/AdSetSearchFilter.md)
 - [AdSetTargeting](docs/AdSetTargeting.md)
 - [AdSetTargetingRule](docs/AdSetTargetingRule.md)
 - [Audience](docs/Audience.md)
 - [AudienceAttributes](docs/AudienceAttributes.md)
 - [AudienceError](docs/AudienceError.md)
 - [AudienceNameDescription](docs/AudienceNameDescription.md)
 - [AudienceWarning](docs/AudienceWarning.md)
 - [BasicAudienceDefinition](docs/BasicAudienceDefinition.md)
 - [BidMessage](docs/BidMessage.md)
 - [CampaignBidChangeRequest](docs/CampaignBidChangeRequest.md)
 - [CampaignBidChangeResponse](docs/CampaignBidChangeResponse.md)
 - [CampaignBidChangeResponseMessageWithDetails](docs/CampaignBidChangeResponseMessageWithDetails.md)
 - [CampaignBidMessage](docs/CampaignBidMessage.md)
 - [CampaignMessage](docs/CampaignMessage.md)
 - [CategoryBidChangeRequest](docs/CategoryBidChangeRequest.md)
 - [CategoryBidMessage](docs/CategoryBidMessage.md)
 - [CategoryMessage](docs/CategoryMessage.md)
 - [CategoryUpdateError](docs/CategoryUpdateError.md)
 - [CategoryUpdateInput](docs/CategoryUpdateInput.md)
 - [CategoryUpdatesPerCatalog](docs/CategoryUpdatesPerCatalog.md)
 - [CategoryUpdatesPerCatalogError](docs/CategoryUpdatesPerCatalogError.md)
 - [CategoryUpdatesPerCatalogErrorMessageWithDetails](docs/CategoryUpdatesPerCatalogErrorMessageWithDetails.md)
 - [ContactlistAmendment](docs/ContactlistAmendment.md)
 - [ContactlistAmendmentAttributes](docs/ContactlistAmendmentAttributes.md)
 - [ContactlistAmendmentRequest](docs/ContactlistAmendmentRequest.md)
 - [ContactlistOperation](docs/ContactlistOperation.md)
 - [ContactlistOperationAttributes](docs/ContactlistOperationAttributes.md)
 - [CriteoApiDataOfPortfolioMessage](docs/CriteoApiDataOfPortfolioMessage.md)
 - [CriteoApiError](docs/CriteoApiError.md)
 - [CriteoApiWarning](docs/CriteoApiWarning.md)
 - [DeleteAudienceContactListResponse](docs/DeleteAudienceContactListResponse.md)
 - [DeleteAudienceResponse](docs/DeleteAudienceResponse.md)
 - [ErrorCodeResponse](docs/ErrorCodeResponse.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [GetAudiencesResponse](docs/GetAudiencesResponse.md)
 - [GetPortfolioResponse](docs/GetPortfolioResponse.md)
 - [InlineObject](docs/InlineObject.md)
 - [JwtModel](docs/JwtModel.md)
 - [ModifyAudienceResponse](docs/ModifyAudienceResponse.md)
 - [NewAudience](docs/NewAudience.md)
 - [NewAudienceAttributes](docs/NewAudienceAttributes.md)
 - [NewAudienceRequest](docs/NewAudienceRequest.md)
 - [NewAudienceResponse](docs/NewAudienceResponse.md)
 - [NillableAdSetTargetingRule](docs/NillableAdSetTargetingRule.md)
 - [NillableDateTime](docs/NillableDateTime.md)
 - [NillableDecimal](docs/NillableDecimal.md)
 - [OAuth2Error](docs/OAuth2Error.md)
 - [PatchAdSet](docs/PatchAdSet.md)
 - [PatchAdSetBidding](docs/PatchAdSetBidding.md)
 - [PatchAdSetBudget](docs/PatchAdSetBudget.md)
 - [PatchAdSetScheduling](docs/PatchAdSetScheduling.md)
 - [PortfolioMessage](docs/PortfolioMessage.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ReadAdSet](docs/ReadAdSet.md)
 - [ReadAdSetBidding](docs/ReadAdSetBidding.md)
 - [ReadAdSetBudget](docs/ReadAdSetBudget.md)
 - [ReadAdSetSchedule](docs/ReadAdSetSchedule.md)
 - [ReadModelAdSetId](docs/ReadModelAdSetId.md)
 - [ReadModelReadAdSet](docs/ReadModelReadAdSet.md)
 - [ReplaceAudience](docs/ReplaceAudience.md)
 - [ReplaceAudienceRequest](docs/ReplaceAudienceRequest.md)
 - [ReplaceAudienceResponse](docs/ReplaceAudienceResponse.md)
 - [RequestAdSetSearch](docs/RequestAdSetSearch.md)
 - [RequestsAdSetId](docs/RequestsAdSetId.md)
 - [RequestsPatchAdSet](docs/RequestsPatchAdSet.md)
 - [ResponseAdSetId](docs/ResponseAdSetId.md)
 - [ResponseReadAdSet](docs/ResponseReadAdSet.md)
 - [ResponsesAdSetId](docs/ResponsesAdSetId.md)
 - [ResponsesReadAdSet](docs/ResponsesReadAdSet.md)
 - [StatisticsReportQueryMessage](docs/StatisticsReportQueryMessage.md)
 - [TransactionsReportQueryDataMessage](docs/TransactionsReportQueryDataMessage.md)
 - [TransactionsReportQueryEntityMessage](docs/TransactionsReportQueryEntityMessage.md)
 - [TransactionsReportQueryMessage](docs/TransactionsReportQueryMessage.md)
 - [WriteModelAdSetId](docs/WriteModelAdSetId.md)
 - [WriteModelPatchAdSet](docs/WriteModelPatchAdSet.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Disclaimer

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
