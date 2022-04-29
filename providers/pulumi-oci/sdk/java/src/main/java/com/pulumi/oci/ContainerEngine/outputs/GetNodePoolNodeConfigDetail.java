// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ContainerEngine.outputs.GetNodePoolNodeConfigDetailPlacementConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodePoolNodeConfigDetail {
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
     * @return Whether to enable in-transit encryption for the data volume&#39;s paravirtualized attachment. This field applies to both block volumes and boot volumes. The default value is false.
     * 
     */
    private final Boolean isPvEncryptionInTransitEnabled;
    /**
     * @return The OCID of the Key Management Service key assigned to the boot volume.
     * 
     */
    private final String kmsKeyId;
    /**
     * @return The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/).
     * 
     */
    private final List<String> nsgIds;
    /**
     * @return The placement configurations for the node pool. Provide one placement configuration for each availability domain in which you intend to launch a node.
     * 
     */
    private final List<GetNodePoolNodeConfigDetailPlacementConfig> placementConfigs;
    /**
     * @return The number of nodes in the node pool.
     * 
     */
    private final Integer size;

    @CustomType.Constructor
    private GetNodePoolNodeConfigDetail(
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("isPvEncryptionInTransitEnabled") Boolean isPvEncryptionInTransitEnabled,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("nsgIds") List<String> nsgIds,
        @CustomType.Parameter("placementConfigs") List<GetNodePoolNodeConfigDetailPlacementConfig> placementConfigs,
        @CustomType.Parameter("size") Integer size) {
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.kmsKeyId = kmsKeyId;
        this.nsgIds = nsgIds;
        this.placementConfigs = placementConfigs;
        this.size = size;
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
     * @return Whether to enable in-transit encryption for the data volume&#39;s paravirtualized attachment. This field applies to both block volumes and boot volumes. The default value is false.
     * 
     */
    public Boolean isPvEncryptionInTransitEnabled() {
        return this.isPvEncryptionInTransitEnabled;
    }
    /**
     * @return The OCID of the Key Management Service key assigned to the boot volume.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/).
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds;
    }
    /**
     * @return The placement configurations for the node pool. Provide one placement configuration for each availability domain in which you intend to launch a node.
     * 
     */
    public List<GetNodePoolNodeConfigDetailPlacementConfig> placementConfigs() {
        return this.placementConfigs;
    }
    /**
     * @return The number of nodes in the node pool.
     * 
     */
    public Integer size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodePoolNodeConfigDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> definedTags;
        private Map<String,Object> freeformTags;
        private Boolean isPvEncryptionInTransitEnabled;
        private String kmsKeyId;
        private List<String> nsgIds;
        private List<GetNodePoolNodeConfigDetailPlacementConfig> placementConfigs;
        private Integer size;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodePoolNodeConfigDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definedTags = defaults.definedTags;
    	      this.freeformTags = defaults.freeformTags;
    	      this.isPvEncryptionInTransitEnabled = defaults.isPvEncryptionInTransitEnabled;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.nsgIds = defaults.nsgIds;
    	      this.placementConfigs = defaults.placementConfigs;
    	      this.size = defaults.size;
        }

        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = Objects.requireNonNull(isPvEncryptionInTransitEnabled);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder nsgIds(List<String> nsgIds) {
            this.nsgIds = Objects.requireNonNull(nsgIds);
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder placementConfigs(List<GetNodePoolNodeConfigDetailPlacementConfig> placementConfigs) {
            this.placementConfigs = Objects.requireNonNull(placementConfigs);
            return this;
        }
        public Builder placementConfigs(GetNodePoolNodeConfigDetailPlacementConfig... placementConfigs) {
            return placementConfigs(List.of(placementConfigs));
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }        public GetNodePoolNodeConfigDetail build() {
            return new GetNodePoolNodeConfigDetail(definedTags, freeformTags, isPvEncryptionInTransitEnabled, kmsKeyId, nsgIds, placementConfigs, size);
        }
    }
}
