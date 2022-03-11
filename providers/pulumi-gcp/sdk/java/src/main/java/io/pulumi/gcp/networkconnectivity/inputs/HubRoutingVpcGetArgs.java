// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubRoutingVpcGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubRoutingVpcGetArgs Empty = new HubRoutingVpcGetArgs();

    @InputImport(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Output.empty() : this.uri;
    }

    public HubRoutingVpcGetArgs(@Nullable Output<String> uri) {
        this.uri = uri;
    }

    private HubRoutingVpcGetArgs() {
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubRoutingVpcGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HubRoutingVpcGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = Output.ofNullable(uri);
            return this;
        }
        public HubRoutingVpcGetArgs build() {
            return new HubRoutingVpcGetArgs(uri);
        }
    }
}
