// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolsNodePoolInitialNodeLabel;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolsNodePoolNode;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolsNodePoolNodeConfigDetail;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolsNodePoolNodeShapeConfig;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolsNodePoolNodeSource;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolsNodePoolNodeSourceDetail;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodePoolsNodePool {
    /**
     * @return The OCID of the cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return The OCID of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the compute instance backing this node.
     * 
     */
    private final String id;
    /**
     * @return A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     * 
     */
    private final List<GetNodePoolsNodePoolInitialNodeLabel> initialNodeLabels;
    /**
     * @return The version of Kubernetes this node is running.
     * 
     */
    private final String kubernetesVersion;
    /**
     * @return The name to filter on.
     * 
     */
    private final String name;
    /**
     * @return The configuration of nodes in the node pool.
     * 
     */
    private final List<GetNodePoolsNodePoolNodeConfigDetail> nodeConfigDetails;
    /**
     * @return Deprecated. see `nodeSource`. The OCID of the image running on the nodes in the node pool.
     * 
     * @deprecated
     * The &#39;node_image_id&#39; field has been deprecated. Please use &#39;node_source_details&#39; instead. If both fields are specified, then &#39;node_source_details&#39; will be used.
     * 
     */
    @Deprecated /* The 'node_image_id' field has been deprecated. Please use 'node_source_details' instead. If both fields are specified, then 'node_source_details' will be used. */
    private final String nodeImageId;
    /**
     * @return Deprecated. see `nodeSource`. The name of the image running on the nodes in the node pool.
     * 
     * @deprecated
     * The &#39;node_image_name&#39; field has been deprecated. Please use &#39;node_source_details&#39; instead. If both fields are specified, then &#39;node_source_details&#39; will be used.
     * 
     */
    @Deprecated /* The 'node_image_name' field has been deprecated. Please use 'node_source_details' instead. If both fields are specified, then 'node_source_details' will be used. */
    private final String nodeImageName;
    /**
     * @return A list of key/value pairs to add to each underlying Oracle Cloud Infrastructure instance in the node pool on launch.
     * 
     */
    private final Map<String,Object> nodeMetadata;
    /**
     * @return The OCID of the node pool to which this node belongs.
     * 
     */
    private final String nodePoolId;
    /**
     * @return The name of the node shape of the nodes in the node pool.
     * 
     */
    private final String nodeShape;
    /**
     * @return The shape configuration of the nodes.
     * 
     */
    private final List<GetNodePoolsNodePoolNodeShapeConfig> nodeShapeConfigs;
    /**
     * @return Source running on the nodes in the node pool.
     * 
     */
    private final List<GetNodePoolsNodePoolNodeSourceDetail> nodeSourceDetails;
    /**
     * @return Deprecated. see `nodeSourceDetails`. Source running on the nodes in the node pool.
     * 
     */
    private final List<GetNodePoolsNodePoolNodeSource> nodeSources;
    /**
     * @return The nodes in the node pool.
     * 
     */
    private final List<GetNodePoolsNodePoolNode> nodes;
    /**
     * @return The number of nodes in each subnet.
     * 
     */
    private final Integer quantityPerSubnet;
    /**
     * @return The SSH public key on each node in the node pool on launch.
     * 
     */
    private final String sshPublicKey;
    /**
     * @return The OCIDs of the subnets in which to place nodes for this node pool.
     * 
     */
    private final List<String> subnetIds;

    @CustomType.Constructor
    private GetNodePoolsNodePool(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("initialNodeLabels") List<GetNodePoolsNodePoolInitialNodeLabel> initialNodeLabels,
        @CustomType.Parameter("kubernetesVersion") String kubernetesVersion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodeConfigDetails") List<GetNodePoolsNodePoolNodeConfigDetail> nodeConfigDetails,
        @CustomType.Parameter("nodeImageId") String nodeImageId,
        @CustomType.Parameter("nodeImageName") String nodeImageName,
        @CustomType.Parameter("nodeMetadata") Map<String,Object> nodeMetadata,
        @CustomType.Parameter("nodePoolId") String nodePoolId,
        @CustomType.Parameter("nodeShape") String nodeShape,
        @CustomType.Parameter("nodeShapeConfigs") List<GetNodePoolsNodePoolNodeShapeConfig> nodeShapeConfigs,
        @CustomType.Parameter("nodeSourceDetails") List<GetNodePoolsNodePoolNodeSourceDetail> nodeSourceDetails,
        @CustomType.Parameter("nodeSources") List<GetNodePoolsNodePoolNodeSource> nodeSources,
        @CustomType.Parameter("nodes") List<GetNodePoolsNodePoolNode> nodes,
        @CustomType.Parameter("quantityPerSubnet") Integer quantityPerSubnet,
        @CustomType.Parameter("sshPublicKey") String sshPublicKey,
        @CustomType.Parameter("subnetIds") List<String> subnetIds) {
        this.clusterId = clusterId;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.id = id;
        this.initialNodeLabels = initialNodeLabels;
        this.kubernetesVersion = kubernetesVersion;
        this.name = name;
        this.nodeConfigDetails = nodeConfigDetails;
        this.nodeImageId = nodeImageId;
        this.nodeImageName = nodeImageName;
        this.nodeMetadata = nodeMetadata;
        this.nodePoolId = nodePoolId;
        this.nodeShape = nodeShape;
        this.nodeShapeConfigs = nodeShapeConfigs;
        this.nodeSourceDetails = nodeSourceDetails;
        this.nodeSources = nodeSources;
        this.nodes = nodes;
        this.quantityPerSubnet = quantityPerSubnet;
        this.sshPublicKey = sshPublicKey;
        this.subnetIds = subnetIds;
    }

    /**
     * @return The OCID of the cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the compute instance backing this node.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     * 
     */
    public List<GetNodePoolsNodePoolInitialNodeLabel> initialNodeLabels() {
        return this.initialNodeLabels;
    }
    /**
     * @return The version of Kubernetes this node is running.
     * 
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * @return The name to filter on.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The configuration of nodes in the node pool.
     * 
     */
    public List<GetNodePoolsNodePoolNodeConfigDetail> nodeConfigDetails() {
        return this.nodeConfigDetails;
    }
    /**
     * @return Deprecated. see `nodeSource`. The OCID of the image running on the nodes in the node pool.
     * 
     * @deprecated
     * The &#39;node_image_id&#39; field has been deprecated. Please use &#39;node_source_details&#39; instead. If both fields are specified, then &#39;node_source_details&#39; will be used.
     * 
     */
    @Deprecated /* The 'node_image_id' field has been deprecated. Please use 'node_source_details' instead. If both fields are specified, then 'node_source_details' will be used. */
    public String nodeImageId() {
        return this.nodeImageId;
    }
    /**
     * @return Deprecated. see `nodeSource`. The name of the image running on the nodes in the node pool.
     * 
     * @deprecated
     * The &#39;node_image_name&#39; field has been deprecated. Please use &#39;node_source_details&#39; instead. If both fields are specified, then &#39;node_source_details&#39; will be used.
     * 
     */
    @Deprecated /* The 'node_image_name' field has been deprecated. Please use 'node_source_details' instead. If both fields are specified, then 'node_source_details' will be used. */
    public String nodeImageName() {
        return this.nodeImageName;
    }
    /**
     * @return A list of key/value pairs to add to each underlying Oracle Cloud Infrastructure instance in the node pool on launch.
     * 
     */
    public Map<String,Object> nodeMetadata() {
        return this.nodeMetadata;
    }
    /**
     * @return The OCID of the node pool to which this node belongs.
     * 
     */
    public String nodePoolId() {
        return this.nodePoolId;
    }
    /**
     * @return The name of the node shape of the nodes in the node pool.
     * 
     */
    public String nodeShape() {
        return this.nodeShape;
    }
    /**
     * @return The shape configuration of the nodes.
     * 
     */
    public List<GetNodePoolsNodePoolNodeShapeConfig> nodeShapeConfigs() {
        return this.nodeShapeConfigs;
    }
    /**
     * @return Source running on the nodes in the node pool.
     * 
     */
    public List<GetNodePoolsNodePoolNodeSourceDetail> nodeSourceDetails() {
        return this.nodeSourceDetails;
    }
    /**
     * @return Deprecated. see `nodeSourceDetails`. Source running on the nodes in the node pool.
     * 
     */
    public List<GetNodePoolsNodePoolNodeSource> nodeSources() {
        return this.nodeSources;
    }
    /**
     * @return The nodes in the node pool.
     * 
     */
    public List<GetNodePoolsNodePoolNode> nodes() {
        return this.nodes;
    }
    /**
     * @return The number of nodes in each subnet.
     * 
     */
    public Integer quantityPerSubnet() {
        return this.quantityPerSubnet;
    }
    /**
     * @return The SSH public key on each node in the node pool on launch.
     * 
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }
    /**
     * @return The OCIDs of the subnets in which to place nodes for this node pool.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodePoolsNodePool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private Map<String,Object> freeformTags;
        private String id;
        private List<GetNodePoolsNodePoolInitialNodeLabel> initialNodeLabels;
        private String kubernetesVersion;
        private String name;
        private List<GetNodePoolsNodePoolNodeConfigDetail> nodeConfigDetails;
        private String nodeImageId;
        private String nodeImageName;
        private Map<String,Object> nodeMetadata;
        private String nodePoolId;
        private String nodeShape;
        private List<GetNodePoolsNodePoolNodeShapeConfig> nodeShapeConfigs;
        private List<GetNodePoolsNodePoolNodeSourceDetail> nodeSourceDetails;
        private List<GetNodePoolsNodePoolNodeSource> nodeSources;
        private List<GetNodePoolsNodePoolNode> nodes;
        private Integer quantityPerSubnet;
        private String sshPublicKey;
        private List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodePoolsNodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.initialNodeLabels = defaults.initialNodeLabels;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.name = defaults.name;
    	      this.nodeConfigDetails = defaults.nodeConfigDetails;
    	      this.nodeImageId = defaults.nodeImageId;
    	      this.nodeImageName = defaults.nodeImageName;
    	      this.nodeMetadata = defaults.nodeMetadata;
    	      this.nodePoolId = defaults.nodePoolId;
    	      this.nodeShape = defaults.nodeShape;
    	      this.nodeShapeConfigs = defaults.nodeShapeConfigs;
    	      this.nodeSourceDetails = defaults.nodeSourceDetails;
    	      this.nodeSources = defaults.nodeSources;
    	      this.nodes = defaults.nodes;
    	      this.quantityPerSubnet = defaults.quantityPerSubnet;
    	      this.sshPublicKey = defaults.sshPublicKey;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder initialNodeLabels(List<GetNodePoolsNodePoolInitialNodeLabel> initialNodeLabels) {
            this.initialNodeLabels = Objects.requireNonNull(initialNodeLabels);
            return this;
        }
        public Builder initialNodeLabels(GetNodePoolsNodePoolInitialNodeLabel... initialNodeLabels) {
            return initialNodeLabels(List.of(initialNodeLabels));
        }
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = Objects.requireNonNull(kubernetesVersion);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeConfigDetails(List<GetNodePoolsNodePoolNodeConfigDetail> nodeConfigDetails) {
            this.nodeConfigDetails = Objects.requireNonNull(nodeConfigDetails);
            return this;
        }
        public Builder nodeConfigDetails(GetNodePoolsNodePoolNodeConfigDetail... nodeConfigDetails) {
            return nodeConfigDetails(List.of(nodeConfigDetails));
        }
        public Builder nodeImageId(String nodeImageId) {
            this.nodeImageId = Objects.requireNonNull(nodeImageId);
            return this;
        }
        public Builder nodeImageName(String nodeImageName) {
            this.nodeImageName = Objects.requireNonNull(nodeImageName);
            return this;
        }
        public Builder nodeMetadata(Map<String,Object> nodeMetadata) {
            this.nodeMetadata = Objects.requireNonNull(nodeMetadata);
            return this;
        }
        public Builder nodePoolId(String nodePoolId) {
            this.nodePoolId = Objects.requireNonNull(nodePoolId);
            return this;
        }
        public Builder nodeShape(String nodeShape) {
            this.nodeShape = Objects.requireNonNull(nodeShape);
            return this;
        }
        public Builder nodeShapeConfigs(List<GetNodePoolsNodePoolNodeShapeConfig> nodeShapeConfigs) {
            this.nodeShapeConfigs = Objects.requireNonNull(nodeShapeConfigs);
            return this;
        }
        public Builder nodeShapeConfigs(GetNodePoolsNodePoolNodeShapeConfig... nodeShapeConfigs) {
            return nodeShapeConfigs(List.of(nodeShapeConfigs));
        }
        public Builder nodeSourceDetails(List<GetNodePoolsNodePoolNodeSourceDetail> nodeSourceDetails) {
            this.nodeSourceDetails = Objects.requireNonNull(nodeSourceDetails);
            return this;
        }
        public Builder nodeSourceDetails(GetNodePoolsNodePoolNodeSourceDetail... nodeSourceDetails) {
            return nodeSourceDetails(List.of(nodeSourceDetails));
        }
        public Builder nodeSources(List<GetNodePoolsNodePoolNodeSource> nodeSources) {
            this.nodeSources = Objects.requireNonNull(nodeSources);
            return this;
        }
        public Builder nodeSources(GetNodePoolsNodePoolNodeSource... nodeSources) {
            return nodeSources(List.of(nodeSources));
        }
        public Builder nodes(List<GetNodePoolsNodePoolNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetNodePoolsNodePoolNode... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder quantityPerSubnet(Integer quantityPerSubnet) {
            this.quantityPerSubnet = Objects.requireNonNull(quantityPerSubnet);
            return this;
        }
        public Builder sshPublicKey(String sshPublicKey) {
            this.sshPublicKey = Objects.requireNonNull(sshPublicKey);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public GetNodePoolsNodePool build() {
            return new GetNodePoolsNodePool(clusterId, compartmentId, definedTags, freeformTags, id, initialNodeLabels, kubernetesVersion, name, nodeConfigDetails, nodeImageId, nodeImageName, nodeMetadata, nodePoolId, nodeShape, nodeShapeConfigs, nodeSourceDetails, nodeSources, nodes, quantityPerSubnet, sshPublicKey, subnetIds);
        }
    }
}
