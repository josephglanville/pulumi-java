// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePrivateVisibilityConfigGKEClusterArgs;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZonePrivateVisibilityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePrivateVisibilityConfigArgs Empty = new ManagedZonePrivateVisibilityConfigArgs();

    /**
     * The list of Google Kubernetes Engine clusters that can see this zone.
     * 
     */
    @Import(name="gkeClusters")
      private final @Nullable Output<List<ManagedZonePrivateVisibilityConfigGKEClusterArgs>> gkeClusters;

    public Output<List<ManagedZonePrivateVisibilityConfigGKEClusterArgs>> getGkeClusters() {
        return this.gkeClusters == null ? Codegen.empty() : this.gkeClusters;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The list of VPC networks that can see this zone.
     * 
     */
    @Import(name="networks")
      private final @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

    public Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> getNetworks() {
        return this.networks == null ? Codegen.empty() : this.networks;
    }

    public ManagedZonePrivateVisibilityConfigArgs(
        @Nullable Output<List<ManagedZonePrivateVisibilityConfigGKEClusterArgs>> gkeClusters,
        @Nullable Output<String> kind,
        @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
        this.gkeClusters = gkeClusters;
        this.kind = kind;
        this.networks = networks;
    }

    private ManagedZonePrivateVisibilityConfigArgs() {
        this.gkeClusters = Codegen.empty();
        this.kind = Codegen.empty();
        this.networks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ManagedZonePrivateVisibilityConfigGKEClusterArgs>> gkeClusters;
        private @Nullable Output<String> kind;
        private @Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusters = defaults.gkeClusters;
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
        }

        public Builder gkeClusters(@Nullable Output<List<ManagedZonePrivateVisibilityConfigGKEClusterArgs>> gkeClusters) {
            this.gkeClusters = gkeClusters;
            return this;
        }
        public Builder gkeClusters(@Nullable List<ManagedZonePrivateVisibilityConfigGKEClusterArgs> gkeClusters) {
            this.gkeClusters = Codegen.ofNullable(gkeClusters);
            return this;
        }
        public Builder gkeClusters(ManagedZonePrivateVisibilityConfigGKEClusterArgs... gkeClusters) {
            return gkeClusters(List.of(gkeClusters));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder networks(@Nullable Output<List<ManagedZonePrivateVisibilityConfigNetworkArgs>> networks) {
            this.networks = networks;
            return this;
        }
        public Builder networks(@Nullable List<ManagedZonePrivateVisibilityConfigNetworkArgs> networks) {
            this.networks = Codegen.ofNullable(networks);
            return this;
        }
        public Builder networks(ManagedZonePrivateVisibilityConfigNetworkArgs... networks) {
            return networks(List.of(networks));
        }        public ManagedZonePrivateVisibilityConfigArgs build() {
            return new ManagedZonePrivateVisibilityConfigArgs(gkeClusters, kind, networks);
        }
    }
}
