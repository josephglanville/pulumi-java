// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiMappingState extends io.pulumi.resources.ResourceArgs {

    public static final ApiMappingState Empty = new ApiMappingState();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId")
      private final @Nullable Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId == null ? Output.empty() : this.apiId;
    }

    /**
     * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
     * 
     */
    @Import(name="apiMappingKey")
      private final @Nullable Output<String> apiMappingKey;

    public Output<String> getApiMappingKey() {
        return this.apiMappingKey == null ? Output.empty() : this.apiMappingKey;
    }

    /**
     * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
     * 
     */
    @Import(name="stage")
      private final @Nullable Output<String> stage;

    public Output<String> getStage() {
        return this.stage == null ? Output.empty() : this.stage;
    }

    public ApiMappingState(
        @Nullable Output<String> apiId,
        @Nullable Output<String> apiMappingKey,
        @Nullable Output<String> domainName,
        @Nullable Output<String> stage) {
        this.apiId = apiId;
        this.apiMappingKey = apiMappingKey;
        this.domainName = domainName;
        this.stage = stage;
    }

    private ApiMappingState() {
        this.apiId = Output.empty();
        this.apiMappingKey = Output.empty();
        this.domainName = Output.empty();
        this.stage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiMappingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiId;
        private @Nullable Output<String> apiMappingKey;
        private @Nullable Output<String> domainName;
        private @Nullable Output<String> stage;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiMappingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.apiMappingKey = defaults.apiMappingKey;
    	      this.domainName = defaults.domainName;
    	      this.stage = defaults.stage;
        }

        public Builder apiId(@Nullable Output<String> apiId) {
            this.apiId = apiId;
            return this;
        }
        public Builder apiId(@Nullable String apiId) {
            this.apiId = Output.ofNullable(apiId);
            return this;
        }
        public Builder apiMappingKey(@Nullable Output<String> apiMappingKey) {
            this.apiMappingKey = apiMappingKey;
            return this;
        }
        public Builder apiMappingKey(@Nullable String apiMappingKey) {
            this.apiMappingKey = Output.ofNullable(apiMappingKey);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }
        public Builder stage(@Nullable Output<String> stage) {
            this.stage = stage;
            return this;
        }
        public Builder stage(@Nullable String stage) {
            this.stage = Output.ofNullable(stage);
            return this;
        }        public ApiMappingState build() {
            return new ApiMappingState(apiId, apiMappingKey, domainName, stage);
        }
    }
}