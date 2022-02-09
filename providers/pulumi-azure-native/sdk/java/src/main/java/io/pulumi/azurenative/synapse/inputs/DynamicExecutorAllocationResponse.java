// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DynamicExecutorAllocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicExecutorAllocationResponse Empty = new DynamicExecutorAllocationResponse();

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public DynamicExecutorAllocationResponse(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    private DynamicExecutorAllocationResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicExecutorAllocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicExecutorAllocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public DynamicExecutorAllocationResponse build() {
            return new DynamicExecutorAllocationResponse(enabled);
        }
    }
}
