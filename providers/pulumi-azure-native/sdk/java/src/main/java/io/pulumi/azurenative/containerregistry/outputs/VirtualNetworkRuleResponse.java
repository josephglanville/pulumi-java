// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNetworkRuleResponse {
    private final @Nullable String action;
    private final String virtualNetworkResourceId;

    @OutputCustomType.Constructor({"action","virtualNetworkResourceId"})
    private VirtualNetworkRuleResponse(
        @Nullable String action,
        String virtualNetworkResourceId) {
        this.action = action;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
    }

    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    public String getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setVirtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }

        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(action, virtualNetworkResourceId);
        }
    }
}
