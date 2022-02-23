// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeClusterArgs;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeNamespaceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scope of the extensionInstance. It can be either Cluster or Namespace; but not both.
 * 
 */
public final class ScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScopeArgs Empty = new ScopeArgs();

    /**
     * Specifies that the scope of the extensionInstance is Cluster
     * 
     */
    @InputImport(name="cluster")
      private final @Nullable Input<ScopeClusterArgs> cluster;

    public Input<ScopeClusterArgs> getCluster() {
        return this.cluster == null ? Input.empty() : this.cluster;
    }

    /**
     * Specifies that the scope of the extensionInstance is Namespace
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<ScopeNamespaceArgs> namespace;

    public Input<ScopeNamespaceArgs> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public ScopeArgs(
        @Nullable Input<ScopeClusterArgs> cluster,
        @Nullable Input<ScopeNamespaceArgs> namespace) {
        this.cluster = cluster;
        this.namespace = namespace;
    }

    private ScopeArgs() {
        this.cluster = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ScopeClusterArgs> cluster;
        private @Nullable Input<ScopeNamespaceArgs> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.namespace = defaults.namespace;
        }

        public Builder setCluster(@Nullable Input<ScopeClusterArgs> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder setCluster(@Nullable ScopeClusterArgs cluster) {
            this.cluster = Input.ofNullable(cluster);
            return this;
        }

        public Builder setNamespace(@Nullable Input<ScopeNamespaceArgs> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable ScopeNamespaceArgs namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }
        public ScopeArgs build() {
            return new ScopeArgs(cluster, namespace);
        }
    }
}
