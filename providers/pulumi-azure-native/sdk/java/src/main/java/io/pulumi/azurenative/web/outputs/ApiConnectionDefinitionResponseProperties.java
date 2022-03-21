// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ApiConnectionTestLinkResponse;
import io.pulumi.azurenative.web.outputs.ApiReferenceResponse;
import io.pulumi.azurenative.web.outputs.ConnectionStatusDefinitionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiConnectionDefinitionResponseProperties {
    private final @Nullable ApiReferenceResponse api;
    /**
     * Timestamp of last connection change
     * 
     */
    private final @Nullable String changedTime;
    /**
     * Timestamp of the connection creation
     * 
     */
    private final @Nullable String createdTime;
    /**
     * Dictionary of custom parameter values
     * 
     */
    private final @Nullable Map<String,String> customParameterValues;
    /**
     * Display name
     * 
     */
    private final @Nullable String displayName;
    /**
     * Dictionary of nonsecret parameter values
     * 
     */
    private final @Nullable Map<String,String> nonSecretParameterValues;
    /**
     * Dictionary of parameter values
     * 
     */
    private final @Nullable Map<String,String> parameterValues;
    /**
     * Status of the connection
     * 
     */
    private final @Nullable List<ConnectionStatusDefinitionResponse> statuses;
    /**
     * Links to test the API connection
     * 
     */
    private final @Nullable List<ApiConnectionTestLinkResponse> testLinks;

    @CustomType.Constructor
    private ApiConnectionDefinitionResponseProperties(
        @CustomType.Parameter("api") @Nullable ApiReferenceResponse api,
        @CustomType.Parameter("changedTime") @Nullable String changedTime,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("customParameterValues") @Nullable Map<String,String> customParameterValues,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("nonSecretParameterValues") @Nullable Map<String,String> nonSecretParameterValues,
        @CustomType.Parameter("parameterValues") @Nullable Map<String,String> parameterValues,
        @CustomType.Parameter("statuses") @Nullable List<ConnectionStatusDefinitionResponse> statuses,
        @CustomType.Parameter("testLinks") @Nullable List<ApiConnectionTestLinkResponse> testLinks) {
        this.api = api;
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.customParameterValues = customParameterValues;
        this.displayName = displayName;
        this.nonSecretParameterValues = nonSecretParameterValues;
        this.parameterValues = parameterValues;
        this.statuses = statuses;
        this.testLinks = testLinks;
    }

    public Optional<ApiReferenceResponse> getApi() {
        return Optional.ofNullable(this.api);
    }
    /**
     * Timestamp of last connection change
     * 
    */
    public Optional<String> getChangedTime() {
        return Optional.ofNullable(this.changedTime);
    }
    /**
     * Timestamp of the connection creation
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * Dictionary of custom parameter values
     * 
    */
    public Map<String,String> getCustomParameterValues() {
        return this.customParameterValues == null ? Map.of() : this.customParameterValues;
    }
    /**
     * Display name
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Dictionary of nonsecret parameter values
     * 
    */
    public Map<String,String> getNonSecretParameterValues() {
        return this.nonSecretParameterValues == null ? Map.of() : this.nonSecretParameterValues;
    }
    /**
     * Dictionary of parameter values
     * 
    */
    public Map<String,String> getParameterValues() {
        return this.parameterValues == null ? Map.of() : this.parameterValues;
    }
    /**
     * Status of the connection
     * 
    */
    public List<ConnectionStatusDefinitionResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * Links to test the API connection
     * 
    */
    public List<ApiConnectionTestLinkResponse> getTestLinks() {
        return this.testLinks == null ? List.of() : this.testLinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConnectionDefinitionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiReferenceResponse api;
        private @Nullable String changedTime;
        private @Nullable String createdTime;
        private @Nullable Map<String,String> customParameterValues;
        private @Nullable String displayName;
        private @Nullable Map<String,String> nonSecretParameterValues;
        private @Nullable Map<String,String> parameterValues;
        private @Nullable List<ConnectionStatusDefinitionResponse> statuses;
        private @Nullable List<ApiConnectionTestLinkResponse> testLinks;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConnectionDefinitionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.customParameterValues = defaults.customParameterValues;
    	      this.displayName = defaults.displayName;
    	      this.nonSecretParameterValues = defaults.nonSecretParameterValues;
    	      this.parameterValues = defaults.parameterValues;
    	      this.statuses = defaults.statuses;
    	      this.testLinks = defaults.testLinks;
        }

        public Builder api(@Nullable ApiReferenceResponse api) {
            this.api = api;
            return this;
        }
        public Builder changedTime(@Nullable String changedTime) {
            this.changedTime = changedTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder customParameterValues(@Nullable Map<String,String> customParameterValues) {
            this.customParameterValues = customParameterValues;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder nonSecretParameterValues(@Nullable Map<String,String> nonSecretParameterValues) {
            this.nonSecretParameterValues = nonSecretParameterValues;
            return this;
        }
        public Builder parameterValues(@Nullable Map<String,String> parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }
        public Builder statuses(@Nullable List<ConnectionStatusDefinitionResponse> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(ConnectionStatusDefinitionResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder testLinks(@Nullable List<ApiConnectionTestLinkResponse> testLinks) {
            this.testLinks = testLinks;
            return this;
        }
        public Builder testLinks(ApiConnectionTestLinkResponse... testLinks) {
            return testLinks(List.of(testLinks));
        }        public ApiConnectionDefinitionResponseProperties build() {
            return new ApiConnectionDefinitionResponseProperties(api, changedTime, createdTime, customParameterValues, displayName, nonSecretParameterValues, parameterValues, statuses, testLinks);
        }
    }
}
