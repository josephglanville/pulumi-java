// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1beta1.inputs.ReplicaArgs;
import java.util.List;
import java.util.Objects;


/**
 * A replication policy that replicates the Secret payload into the locations specified in Secret.replication.user_managed.replicas
 * 
 */
public final class UserManagedArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserManagedArgs Empty = new UserManagedArgs();

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * 
     */
    @InputImport(name="replicas", required=true)
      private final Output<List<ReplicaArgs>> replicas;

    public Output<List<ReplicaArgs>> getReplicas() {
        return this.replicas;
    }

    public UserManagedArgs(Output<List<ReplicaArgs>> replicas) {
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private UserManagedArgs() {
        this.replicas = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserManagedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ReplicaArgs>> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(UserManagedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder replicas(Output<List<ReplicaArgs>> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public Builder replicas(List<ReplicaArgs> replicas) {
            this.replicas = Output.of(Objects.requireNonNull(replicas));
            return this;
        }
        public UserManagedArgs build() {
            return new UserManagedArgs(replicas);
        }
    }
}
