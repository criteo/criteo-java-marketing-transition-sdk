

# AudienceWarning

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**traceId** | **String** | (REQUIRED) The Correlation ID provided by the Gateway. It is also a unique identifier for this particular occurrence of the problem. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | (REQUIRED) The classification of the error | 
**code** | **String** | (REQUIRED) A machine-readable unique error code, expressed as a string value. The format used must be kebab-case. | 
**instance** | **String** | (REQUIRED) A URI reference that identifies the specific occurrence of the problem | 
**title** | **String** | (RECOMMENDED) A short, human-readable summary of the problem type |  [optional]
**detail** | **String** | (REQUIRED) A human-readable explanation specific to this occurrence of the problem | 
**source** | [**Object**](.md) | (OPTIONAL) A machine-readable structure to reference to the exact location(s) causing the error(s) |  [optional]
**stackTrace** | **List&lt;String&gt;** | (NEVER IN PRODUCTION) A human-readable stacktrace produced by the implementation technology |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ACCESS_CONTROL | &quot;access-control&quot;
AUTHENTICATION | &quot;authentication&quot;
AUTHORIZATION | &quot;authorization&quot;
AVAILABILITY | &quot;availability&quot;
DEPRECATION | &quot;deprecation&quot;
QUOTA | &quot;quota&quot;
VALIDATION | &quot;validation&quot;



