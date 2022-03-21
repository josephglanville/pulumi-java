// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.awsnative.apigateway.outputs.ApiKeyStageKey;
import io.pulumi.awsnative.apigateway.outputs.ApiKeyTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiKeyResult {
    /**
     * A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
     */
    private final @Nullable String aPIKeyId;
    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
     */
    private final @Nullable String customerId;
    /**
     * A description of the purpose of the API key.
     * 
     */
    private final @Nullable String description;
    /**
     * Indicates whether the API key can be used by clients.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * A list of stages to associate with this API key.
     * 
     */
    private final @Nullable List<ApiKeyStageKey> stageKeys;
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
     */
    private final @Nullable List<ApiKeyTag> tags;

    @CustomType.Constructor
    private GetApiKeyResult(
        @CustomType.Parameter("aPIKeyId") @Nullable String aPIKeyId,
        @CustomType.Parameter("customerId") @Nullable String customerId,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("stageKeys") @Nullable List<ApiKeyStageKey> stageKeys,
        @CustomType.Parameter("tags") @Nullable List<ApiKeyTag> tags) {
        this.aPIKeyId = aPIKeyId;
        this.customerId = customerId;
        this.description = description;
        this.enabled = enabled;
        this.stageKeys = stageKeys;
        this.tags = tags;
    }

    /**
     * A Unique Key ID which identifies the API Key. Generated by the Create API and returned by the Read and List APIs
     * 
    */
    public Optional<String> getAPIKeyId() {
        return Optional.ofNullable(this.aPIKeyId);
    }
    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
    */
    public Optional<String> getCustomerId() {
        return Optional.ofNullable(this.customerId);
    }
    /**
     * A description of the purpose of the API key.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Indicates whether the API key can be used by clients.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * A list of stages to associate with this API key.
     * 
    */
    public List<ApiKeyStageKey> getStageKeys() {
        return this.stageKeys == null ? List.of() : this.stageKeys;
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
    */
    public List<ApiKeyTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aPIKeyId;
        private @Nullable String customerId;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable List<ApiKeyStageKey> stageKeys;
        private @Nullable List<ApiKeyTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aPIKeyId = defaults.aPIKeyId;
    	      this.customerId = defaults.customerId;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.stageKeys = defaults.stageKeys;
    	      this.tags = defaults.tags;
        }

        public Builder aPIKeyId(@Nullable String aPIKeyId) {
            this.aPIKeyId = aPIKeyId;
            return this;
        }
        public Builder customerId(@Nullable String customerId) {
            this.customerId = customerId;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder stageKeys(@Nullable List<ApiKeyStageKey> stageKeys) {
            this.stageKeys = stageKeys;
            return this;
        }
        public Builder stageKeys(ApiKeyStageKey... stageKeys) {
            return stageKeys(List.of(stageKeys));
        }
        public Builder tags(@Nullable List<ApiKeyTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ApiKeyTag... tags) {
            return tags(List.of(tags));
        }        public GetApiKeyResult build() {
            return new GetApiKeyResult(aPIKeyId, customerId, description, enabled, stageKeys, tags);
        }
    }
}
