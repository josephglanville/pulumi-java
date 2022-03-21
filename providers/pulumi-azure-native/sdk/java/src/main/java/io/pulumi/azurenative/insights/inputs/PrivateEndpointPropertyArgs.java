// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private endpoint which the connection belongs to.
 * 
 */
public final class PrivateEndpointPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointPropertyArgs Empty = new PrivateEndpointPropertyArgs();

    /**
     * Resource id of the private endpoint.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    public PrivateEndpointPropertyArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private PrivateEndpointPropertyArgs() {
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }        public PrivateEndpointPropertyArgs build() {
            return new PrivateEndpointPropertyArgs(id);
        }
    }
}
