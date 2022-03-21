// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ScaleRuleAuthResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container Custom scaling rule.
 * 
 */
public final class CustomScaleRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomScaleRuleResponse Empty = new CustomScaleRuleResponse();

    /**
     * Authentication secrets for the custom scale rule.
     * 
     */
    @Import(name="auth")
      private final @Nullable List<ScaleRuleAuthResponse> auth;

    public List<ScaleRuleAuthResponse> getAuth() {
        return this.auth == null ? List.of() : this.auth;
    }

    /**
     * Metadata properties to describe custom scale rule.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    /**
     * Type of the custom scale rule
     * eg: azure-servicebus, redis etc.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public CustomScaleRuleResponse(
        @Nullable List<ScaleRuleAuthResponse> auth,
        @Nullable Map<String,String> metadata,
        @Nullable String type) {
        this.auth = auth;
        this.metadata = metadata;
        this.type = type;
    }

    private CustomScaleRuleResponse() {
        this.auth = List.of();
        this.metadata = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScaleRuleAuthResponse> auth;
        private @Nullable Map<String,String> metadata;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder auth(@Nullable List<ScaleRuleAuthResponse> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(ScaleRuleAuthResponse... auth) {
            return auth(List.of(auth));
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public CustomScaleRuleResponse build() {
            return new CustomScaleRuleResponse(auth, metadata, type);
        }
    }
}
