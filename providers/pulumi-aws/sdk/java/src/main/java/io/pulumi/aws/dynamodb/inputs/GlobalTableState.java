// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.aws.dynamodb.inputs.GlobalTableReplicaGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalTableState extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableState Empty = new GlobalTableState();

    /**
     * The ARN of the DynamoDB Global Table
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of the global table. Must match underlying DynamoDB Table names in all regions.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Underlying DynamoDB Table. At least 1 replica must be defined. See below.
     * 
     */
    @Import(name="replicas")
      private final @Nullable Output<List<GlobalTableReplicaGetArgs>> replicas;

    public Output<List<GlobalTableReplicaGetArgs>> getReplicas() {
        return this.replicas == null ? Output.empty() : this.replicas;
    }

    public GlobalTableState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<List<GlobalTableReplicaGetArgs>> replicas) {
        this.arn = arn;
        this.name = name;
        this.replicas = replicas;
    }

    private GlobalTableState() {
        this.arn = Output.empty();
        this.name = Output.empty();
        this.replicas = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GlobalTableReplicaGetArgs>> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.replicas = defaults.replicas;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder replicas(@Nullable Output<List<GlobalTableReplicaGetArgs>> replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder replicas(@Nullable List<GlobalTableReplicaGetArgs> replicas) {
            this.replicas = Output.ofNullable(replicas);
            return this;
        }
        public Builder replicas(GlobalTableReplicaGetArgs... replicas) {
            return replicas(List.of(replicas));
        }        public GlobalTableState build() {
            return new GlobalTableState(arn, name, replicas);
        }
    }
}