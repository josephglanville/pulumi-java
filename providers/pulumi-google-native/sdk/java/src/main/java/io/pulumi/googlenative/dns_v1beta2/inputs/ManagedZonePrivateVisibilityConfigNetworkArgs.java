// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZonePrivateVisibilityConfigNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigNetworkArgs Empty = new ManagedZonePrivateVisibilityConfigNetworkArgs();

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl")
      private final @Nullable Output<String> networkUrl;

    public Output<String> getNetworkUrl() {
        return this.networkUrl == null ? Output.empty() : this.networkUrl;
    }

    public ManagedZonePrivateVisibilityConfigNetworkArgs(
        @Nullable Output<String> kind,
        @Nullable Output<String> networkUrl) {
        this.kind = kind;
        this.networkUrl = networkUrl;
    }

    private ManagedZonePrivateVisibilityConfigNetworkArgs() {
        this.kind = Output.empty();
        this.networkUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> kind;
        private @Nullable Output<String> networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder networkUrl(@Nullable Output<String> networkUrl) {
            this.networkUrl = networkUrl;
            return this;
        }
        public Builder networkUrl(@Nullable String networkUrl) {
            this.networkUrl = Output.ofNullable(networkUrl);
            return this;
        }        public ManagedZonePrivateVisibilityConfigNetworkArgs build() {
            return new ManagedZonePrivateVisibilityConfigNetworkArgs(kind, networkUrl);
        }
    }
}
