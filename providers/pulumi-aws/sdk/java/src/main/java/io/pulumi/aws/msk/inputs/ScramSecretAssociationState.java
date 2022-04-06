// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScramSecretAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ScramSecretAssociationState Empty = new ScramSecretAssociationState();

    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @Import(name="clusterArn")
      private final @Nullable Output<String> clusterArn;

    public Output<String> getClusterArn() {
        return this.clusterArn == null ? Output.empty() : this.clusterArn;
    }

    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @Import(name="secretArnLists")
      private final @Nullable Output<List<String>> secretArnLists;

    public Output<List<String>> getSecretArnLists() {
        return this.secretArnLists == null ? Output.empty() : this.secretArnLists;
    }

    public ScramSecretAssociationState(
        @Nullable Output<String> clusterArn,
        @Nullable Output<List<String>> secretArnLists) {
        this.clusterArn = clusterArn;
        this.secretArnLists = secretArnLists;
    }

    private ScramSecretAssociationState() {
        this.clusterArn = Output.empty();
        this.secretArnLists = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScramSecretAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterArn;
        private @Nullable Output<List<String>> secretArnLists;

        public Builder() {
    	      // Empty
        }

        public Builder(ScramSecretAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.secretArnLists = defaults.secretArnLists;
        }

        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }
        public Builder clusterArn(@Nullable String clusterArn) {
            this.clusterArn = Output.ofNullable(clusterArn);
            return this;
        }
        public Builder secretArnLists(@Nullable Output<List<String>> secretArnLists) {
            this.secretArnLists = secretArnLists;
            return this;
        }
        public Builder secretArnLists(@Nullable List<String> secretArnLists) {
            this.secretArnLists = Output.ofNullable(secretArnLists);
            return this;
        }
        public Builder secretArnLists(String... secretArnLists) {
            return secretArnLists(List.of(secretArnLists));
        }        public ScramSecretAssociationState build() {
            return new ScramSecretAssociationState(clusterArn, secretArnLists);
        }
    }
}