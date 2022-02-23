// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiSchemaArgs Empty = new ApiSchemaArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Must be a valid a media type used in a Content-Type header as defined in the RFC 2616. Media type of the schema document (e.g. application/json, application/xml). </br> - `Swagger` Schema use `application/vnd.ms-azure-apim.swagger.definitions+json` </br> - `WSDL` Schema use `application/vnd.ms-azure-apim.xsd+xml` </br> - `OpenApi` Schema use `application/vnd.oai.openapi.components+json` </br> - `WADL Schema` use `application/vnd.ms-azure-apim.wadl.grammars+xml`.
     * 
     */
    @InputImport(name="contentType", required=true)
      private final Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType;
    }

    /**
     * Types definitions. Used for Swagger/OpenAPI schemas only, null otherwise.
     * 
     */
    @InputImport(name="definitions")
      private final @Nullable Input<Object> definitions;

    public Input<Object> getDefinitions() {
        return this.definitions == null ? Input.empty() : this.definitions;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Schema identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="schemaId")
      private final @Nullable Input<String> schemaId;

    public Input<String> getSchemaId() {
        return this.schemaId == null ? Input.empty() : this.schemaId;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Json escaped string defining the document representing the Schema. Used for schemas other than Swagger/OpenAPI.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ApiSchemaArgs(
        Input<String> apiId,
        Input<String> contentType,
        @Nullable Input<Object> definitions,
        Input<String> resourceGroupName,
        @Nullable Input<String> schemaId,
        Input<String> serviceName,
        @Nullable Input<String> value) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.definitions = definitions;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaId = schemaId;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.value = value;
    }

    private ApiSchemaArgs() {
        this.apiId = Input.empty();
        this.contentType = Input.empty();
        this.definitions = Input.empty();
        this.resourceGroupName = Input.empty();
        this.schemaId = Input.empty();
        this.serviceName = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private Input<String> contentType;
        private @Nullable Input<Object> definitions;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> schemaId;
        private Input<String> serviceName;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.contentType = defaults.contentType;
    	      this.definitions = defaults.definitions;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaId = defaults.schemaId;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setContentType(Input<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder setDefinitions(@Nullable Input<Object> definitions) {
            this.definitions = definitions;
            return this;
        }

        public Builder setDefinitions(@Nullable Object definitions) {
            this.definitions = Input.ofNullable(definitions);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSchemaId(@Nullable Input<String> schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setSchemaId(@Nullable String schemaId) {
            this.schemaId = Input.ofNullable(schemaId);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public ApiSchemaArgs build() {
            return new ApiSchemaArgs(apiId, contentType, definitions, resourceGroupName, schemaId, serviceName, value);
        }
    }
}
