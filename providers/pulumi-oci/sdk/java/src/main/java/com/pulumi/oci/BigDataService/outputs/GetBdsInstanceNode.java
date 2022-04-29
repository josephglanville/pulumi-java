// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.BigDataService.outputs.GetBdsInstanceNodeAttachedBlockVolume;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBdsInstanceNode {
    /**
     * @return The list of block volumes attached to a given node.
     * 
     */
    private final List<GetBdsInstanceNodeAttachedBlockVolume> attachedBlockVolumes;
    /**
     * @return The name of the availability domain in which the node is running.
     * 
     */
    private final String availabilityDomain;
    /**
     * @return The name of the node.
     * 
     */
    private final String displayName;
    /**
     * @return The name of the fault domain in which the node is running.
     * 
     */
    private final String faultDomain;
    /**
     * @return The fully-qualified hostname (FQDN) of the node.
     * 
     */
    private final String hostname;
    /**
     * @return The OCID of the image from which the node was created.
     * 
     */
    private final String imageId;
    /**
     * @return The OCID of the underlying Oracle Cloud Infrastructure Compute instance.
     * 
     */
    private final String instanceId;
    /**
     * @return IP address of the node.
     * 
     */
    private final String ipAddress;
    /**
     * @return Cluster node type.
     * 
     */
    private final String nodeType;
    /**
     * @return Shape of the node.
     * 
     */
    private final String shape;
    /**
     * @return The fingerprint of the SSH key used for node access.
     * 
     */
    private final String sshFingerprint;
    /**
     * @return The state of the cluster.
     * 
     */
    private final String state;
    /**
     * @return The OCID of the subnet in which the node is to be created.
     * 
     */
    private final String subnetId;
    /**
     * @return The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetBdsInstanceNode(
        @CustomType.Parameter("attachedBlockVolumes") List<GetBdsInstanceNodeAttachedBlockVolume> attachedBlockVolumes,
        @CustomType.Parameter("availabilityDomain") String availabilityDomain,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("faultDomain") String faultDomain,
        @CustomType.Parameter("hostname") String hostname,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("nodeType") String nodeType,
        @CustomType.Parameter("shape") String shape,
        @CustomType.Parameter("sshFingerprint") String sshFingerprint,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.attachedBlockVolumes = attachedBlockVolumes;
        this.availabilityDomain = availabilityDomain;
        this.displayName = displayName;
        this.faultDomain = faultDomain;
        this.hostname = hostname;
        this.imageId = imageId;
        this.instanceId = instanceId;
        this.ipAddress = ipAddress;
        this.nodeType = nodeType;
        this.shape = shape;
        this.sshFingerprint = sshFingerprint;
        this.state = state;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The list of block volumes attached to a given node.
     * 
     */
    public List<GetBdsInstanceNodeAttachedBlockVolume> attachedBlockVolumes() {
        return this.attachedBlockVolumes;
    }
    /**
     * @return The name of the availability domain in which the node is running.
     * 
     */
    public String availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * @return The name of the node.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The name of the fault domain in which the node is running.
     * 
     */
    public String faultDomain() {
        return this.faultDomain;
    }
    /**
     * @return The fully-qualified hostname (FQDN) of the node.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The OCID of the image from which the node was created.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The OCID of the underlying Oracle Cloud Infrastructure Compute instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return IP address of the node.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Cluster node type.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }
    /**
     * @return Shape of the node.
     * 
     */
    public String shape() {
        return this.shape;
    }
    /**
     * @return The fingerprint of the SSH key used for node access.
     * 
     */
    public String sshFingerprint() {
        return this.sshFingerprint;
    }
    /**
     * @return The state of the cluster.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The OCID of the subnet in which the node is to be created.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBdsInstanceNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBdsInstanceNodeAttachedBlockVolume> attachedBlockVolumes;
        private String availabilityDomain;
        private String displayName;
        private String faultDomain;
        private String hostname;
        private String imageId;
        private String instanceId;
        private String ipAddress;
        private String nodeType;
        private String shape;
        private String sshFingerprint;
        private String state;
        private String subnetId;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBdsInstanceNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedBlockVolumes = defaults.attachedBlockVolumes;
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.displayName = defaults.displayName;
    	      this.faultDomain = defaults.faultDomain;
    	      this.hostname = defaults.hostname;
    	      this.imageId = defaults.imageId;
    	      this.instanceId = defaults.instanceId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.nodeType = defaults.nodeType;
    	      this.shape = defaults.shape;
    	      this.sshFingerprint = defaults.sshFingerprint;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder attachedBlockVolumes(List<GetBdsInstanceNodeAttachedBlockVolume> attachedBlockVolumes) {
            this.attachedBlockVolumes = Objects.requireNonNull(attachedBlockVolumes);
            return this;
        }
        public Builder attachedBlockVolumes(GetBdsInstanceNodeAttachedBlockVolume... attachedBlockVolumes) {
            return attachedBlockVolumes(List.of(attachedBlockVolumes));
        }
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = Objects.requireNonNull(faultDomain);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public Builder shape(String shape) {
            this.shape = Objects.requireNonNull(shape);
            return this;
        }
        public Builder sshFingerprint(String sshFingerprint) {
            this.sshFingerprint = Objects.requireNonNull(sshFingerprint);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetBdsInstanceNode build() {
            return new GetBdsInstanceNode(attachedBlockVolumes, availabilityDomain, displayName, faultDomain, hostname, imageId, instanceId, ipAddress, nodeType, shape, sshFingerprint, state, subnetId, timeCreated);
        }
    }
}
