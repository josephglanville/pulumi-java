// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.outputs;

import io.pulumi.aws.msk.outputs.GetBrokerNodesNodeInfoList;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBrokerNodesResult {
    private final String clusterArn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetBrokerNodesNodeInfoList> nodeInfoLists;

    @OutputCustomType.Constructor
    private GetBrokerNodesResult(
        @OutputCustomType.Parameter("clusterArn") String clusterArn,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("nodeInfoLists") List<GetBrokerNodesNodeInfoList> nodeInfoLists) {
        this.clusterArn = clusterArn;
        this.id = id;
        this.nodeInfoLists = nodeInfoLists;
    }

    public String getClusterArn() {
        return this.clusterArn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<GetBrokerNodesNodeInfoList> getNodeInfoLists() {
        return this.nodeInfoLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerNodesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterArn;
        private String id;
        private List<GetBrokerNodesNodeInfoList> nodeInfoLists;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerNodesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.id = defaults.id;
    	      this.nodeInfoLists = defaults.nodeInfoLists;
        }

        public Builder setClusterArn(String clusterArn) {
            this.clusterArn = Objects.requireNonNull(clusterArn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNodeInfoLists(List<GetBrokerNodesNodeInfoList> nodeInfoLists) {
            this.nodeInfoLists = Objects.requireNonNull(nodeInfoLists);
            return this;
        }
        public GetBrokerNodesResult build() {
            return new GetBrokerNodesResult(clusterArn, id, nodeInfoLists);
        }
    }
}
