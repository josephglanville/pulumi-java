// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.VolumeNodeResourcesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CSINodeDriver holds information about the specification of one CSI driver installed on a node
 * 
 */
public final class CSINodeDriverArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSINodeDriverArgs Empty = new CSINodeDriverArgs();

    /**
     * allocatable represents the volume resources of a node that are available for scheduling.
     * 
     */
    @Import(name="allocatable")
      private final @Nullable Output<VolumeNodeResourcesArgs> allocatable;

    public Output<VolumeNodeResourcesArgs> getAllocatable() {
        return this.allocatable == null ? Output.empty() : this.allocatable;
    }

    /**
     * This is the name of the CSI driver that this object refers to. This MUST be the same name returned by the CSI GetPluginName() call for that driver.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * nodeID of the node from the driver point of view. This field enables Kubernetes to communicate with storage systems that do not share the same nomenclature for nodes. For example, Kubernetes may refer to a given node as "node1", but the storage system may refer to the same node as "nodeA". When Kubernetes issues a command to the storage system to attach a volume to a specific node, it can use this field to refer to the node name using the ID that the storage system will understand, e.g. "nodeA" instead of "node1". This field is required.
     * 
     */
    @Import(name="nodeID", required=true)
      private final Output<String> nodeID;

    public Output<String> getNodeID() {
        return this.nodeID;
    }

    /**
     * topologyKeys is the list of keys supported by the driver. When a driver is initialized on a cluster, it provides a set of topology keys that it understands (e.g. "company.com/zone", "company.com/region"). When a driver is initialized on a node, it provides the same topology keys along with values. Kubelet will expose these topology keys as labels on its own node object. When Kubernetes does topology aware provisioning, it can use this list to determine which labels it should retrieve from the node object and pass back to the driver. It is possible for different nodes to use different topology keys. This can be empty if driver does not support topology.
     * 
     */
    @Import(name="topologyKeys")
      private final @Nullable Output<List<String>> topologyKeys;

    public Output<List<String>> getTopologyKeys() {
        return this.topologyKeys == null ? Output.empty() : this.topologyKeys;
    }

    public CSINodeDriverArgs(
        @Nullable Output<VolumeNodeResourcesArgs> allocatable,
        Output<String> name,
        Output<String> nodeID,
        @Nullable Output<List<String>> topologyKeys) {
        this.allocatable = allocatable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nodeID = Objects.requireNonNull(nodeID, "expected parameter 'nodeID' to be non-null");
        this.topologyKeys = topologyKeys;
    }

    private CSINodeDriverArgs() {
        this.allocatable = Output.empty();
        this.name = Output.empty();
        this.nodeID = Output.empty();
        this.topologyKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSINodeDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VolumeNodeResourcesArgs> allocatable;
        private Output<String> name;
        private Output<String> nodeID;
        private @Nullable Output<List<String>> topologyKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(CSINodeDriverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatable = defaults.allocatable;
    	      this.name = defaults.name;
    	      this.nodeID = defaults.nodeID;
    	      this.topologyKeys = defaults.topologyKeys;
        }

        public Builder allocatable(@Nullable Output<VolumeNodeResourcesArgs> allocatable) {
            this.allocatable = allocatable;
            return this;
        }
        public Builder allocatable(@Nullable VolumeNodeResourcesArgs allocatable) {
            this.allocatable = Output.ofNullable(allocatable);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder nodeID(Output<String> nodeID) {
            this.nodeID = Objects.requireNonNull(nodeID);
            return this;
        }
        public Builder nodeID(String nodeID) {
            this.nodeID = Output.of(Objects.requireNonNull(nodeID));
            return this;
        }
        public Builder topologyKeys(@Nullable Output<List<String>> topologyKeys) {
            this.topologyKeys = topologyKeys;
            return this;
        }
        public Builder topologyKeys(@Nullable List<String> topologyKeys) {
            this.topologyKeys = Output.ofNullable(topologyKeys);
            return this;
        }
        public Builder topologyKeys(String... topologyKeys) {
            return topologyKeys(List.of(topologyKeys));
        }        public CSINodeDriverArgs build() {
            return new CSINodeDriverArgs(allocatable, name, nodeID, topologyKeys);
        }
    }
}
