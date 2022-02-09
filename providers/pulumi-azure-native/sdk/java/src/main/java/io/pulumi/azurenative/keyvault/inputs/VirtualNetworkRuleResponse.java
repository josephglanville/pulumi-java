// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkRuleResponse Empty = new VirtualNetworkRuleResponse();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="ignoreMissingVnetServiceEndpoint")
    private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;

    public Optional<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Optional.empty() : Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    public VirtualNetworkRuleResponse(
        String id,
        @Nullable Boolean ignoreMissingVnetServiceEndpoint) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
    }

    private VirtualNetworkRuleResponse() {
        this.id = null;
        this.ignoreMissingVnetServiceEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(id, ignoreMissingVnetServiceEndpoint);
        }
    }
}
