// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="ignoreMissingVNetServiceEndpoint")
    private final @Nullable Input<Boolean> ignoreMissingVNetServiceEndpoint;

    public Input<Boolean> getIgnoreMissingVNetServiceEndpoint() {
        return this.ignoreMissingVNetServiceEndpoint == null ? Input.empty() : this.ignoreMissingVNetServiceEndpoint;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Input<String> id,
        @Nullable Input<Boolean> ignoreMissingVNetServiceEndpoint) {
        this.id = id;
        this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
    }

    private VirtualNetworkRuleArgs() {
        this.id = Input.empty();
        this.ignoreMissingVNetServiceEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Boolean> ignoreMissingVNetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVNetServiceEndpoint = defaults.ignoreMissingVNetServiceEndpoint;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIgnoreMissingVNetServiceEndpoint(@Nullable Input<Boolean> ignoreMissingVNetServiceEndpoint) {
            this.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
            return this;
        }

        public Builder setIgnoreMissingVNetServiceEndpoint(@Nullable Boolean ignoreMissingVNetServiceEndpoint) {
            this.ignoreMissingVNetServiceEndpoint = Input.ofNullable(ignoreMissingVNetServiceEndpoint);
            return this;
        }

        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(id, ignoreMissingVNetServiceEndpoint);
        }
    }
}
