// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.VirtualNetworkPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of private link resources
 * 
 */
public final class VirtualNetworkPropertiesListArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPropertiesListArgs Empty = new VirtualNetworkPropertiesListArgs();

    /**
     * Next page link if any.
     * 
     */
    @Import(name="nextLink")
      private final @Nullable Output<String> nextLink;

    public Output<String> getNextLink() {
        return this.nextLink == null ? Codegen.empty() : this.nextLink;
    }

    /**
     * Array of virtual networks.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<List<VirtualNetworkPropertiesArgs>> value;

    public Output<List<VirtualNetworkPropertiesArgs>> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public VirtualNetworkPropertiesListArgs(
        @Nullable Output<String> nextLink,
        @Nullable Output<List<VirtualNetworkPropertiesArgs>> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    private VirtualNetworkPropertiesListArgs() {
        this.nextLink = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nextLink;
        private @Nullable Output<List<VirtualNetworkPropertiesArgs>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable Output<String> nextLink) {
            this.nextLink = nextLink;
            return this;
        }
        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = Codegen.ofNullable(nextLink);
            return this;
        }
        public Builder value(@Nullable Output<List<VirtualNetworkPropertiesArgs>> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable List<VirtualNetworkPropertiesArgs> value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }
        public Builder value(VirtualNetworkPropertiesArgs... value) {
            return value(List.of(value));
        }        public VirtualNetworkPropertiesListArgs build() {
            return new VirtualNetworkPropertiesListArgs(nextLink, value);
        }
    }
}
