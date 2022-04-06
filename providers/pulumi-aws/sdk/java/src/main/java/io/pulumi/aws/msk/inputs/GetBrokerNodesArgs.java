// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBrokerNodesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBrokerNodesArgs Empty = new GetBrokerNodesArgs();

    /**
     * The ARN of the cluster the nodes belong to.
     * 
     */
    @Import(name="clusterArn", required=true)
      private final String clusterArn;

    public String getClusterArn() {
        return this.clusterArn;
    }

    public GetBrokerNodesArgs(String clusterArn) {
        this.clusterArn = Objects.requireNonNull(clusterArn, "expected parameter 'clusterArn' to be non-null");
    }

    private GetBrokerNodesArgs() {
        this.clusterArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerNodesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
        }

        public Builder clusterArn(String clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }        public GetBrokerNodesArgs build() {
            return new GetBrokerNodesArgs(clusterArn);
        }
    }
}