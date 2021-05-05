

# ContactlistOperationAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactListId** | **String** | the affected user list id |  [optional]
**operation** | **String** | The action recorded | 
**requestDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the action was recorded |  [optional]
**identifierType** | **String** | The schema specified for of the identifiers |  [optional]
**nbValidIdentifiers** | **Integer** | How many identifiers were valid for the specified schema |  [optional]
**nbInvalidIdentifiers** | **Integer** | How many identifiers were invalid for the specified schema |  [optional]
**sampleInvalidIdentifiers** | **List&lt;String&gt;** | A sample of invalid identifiers if there is some |  [optional]



