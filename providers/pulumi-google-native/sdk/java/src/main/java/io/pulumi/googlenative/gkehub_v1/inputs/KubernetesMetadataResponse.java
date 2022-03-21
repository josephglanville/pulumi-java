// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * KubernetesMetadata provides informational metadata for Memberships representing Kubernetes clusters.
 * 
 */
public final class KubernetesMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesMetadataResponse Empty = new KubernetesMetadataResponse();

    /**
     * Kubernetes API server version string as reported by `/version`.
     * 
     */
    @Import(name="kubernetesApiServerVersion", required=true)
      private final String kubernetesApiServerVersion;

    public String getKubernetesApiServerVersion() {
        return this.kubernetesApiServerVersion;
    }

    /**
     * The total memory capacity as reported by the sum of all Kubernetes nodes resources, defined in MB.
     * 
     */
    @Import(name="memoryMb", required=true)
      private final Integer memoryMb;

    public Integer getMemoryMb() {
        return this.memoryMb;
    }

    /**
     * Node count as reported by Kubernetes nodes resources.
     * 
     */
    @Import(name="nodeCount", required=true)
      private final Integer nodeCount;

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * Node providerID as reported by the first node in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the node_count will be zero and the node_provider_id will be empty.
     * 
     */
    @Import(name="nodeProviderId", required=true)
      private final String nodeProviderId;

    public String getNodeProviderId() {
        return this.nodeProviderId;
    }

    /**
     * The time at which these details were last updated. This update_time is different from the Membership-level update_time since EndpointDetails are updated internally for API consumers.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * vCPU count as reported by Kubernetes nodes resources.
     * 
     */
    @Import(name="vcpuCount", required=true)
      private final Integer vcpuCount;

    public Integer getVcpuCount() {
        return this.vcpuCount;
    }

    public KubernetesMetadataResponse(
        String kubernetesApiServerVersion,
        Integer memoryMb,
        Integer nodeCount,
        String nodeProviderId,
        String updateTime,
        Integer vcpuCount) {
        this.kubernetesApiServerVersion = Objects.requireNonNull(kubernetesApiServerVersion, "expected parameter 'kubernetesApiServerVersion' to be non-null");
        this.memoryMb = Objects.requireNonNull(memoryMb, "expected parameter 'memoryMb' to be non-null");
        this.nodeCount = Objects.requireNonNull(nodeCount, "expected parameter 'nodeCount' to be non-null");
        this.nodeProviderId = Objects.requireNonNull(nodeProviderId, "expected parameter 'nodeProviderId' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
        this.vcpuCount = Objects.requireNonNull(vcpuCount, "expected parameter 'vcpuCount' to be non-null");
    }

    private KubernetesMetadataResponse() {
        this.kubernetesApiServerVersion = null;
        this.memoryMb = null;
        this.nodeCount = null;
        this.nodeProviderId = null;
        this.updateTime = null;
        this.vcpuCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kubernetesApiServerVersion;
        private Integer memoryMb;
        private Integer nodeCount;
        private String nodeProviderId;
        private String updateTime;
        private Integer vcpuCount;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kubernetesApiServerVersion = defaults.kubernetesApiServerVersion;
    	      this.memoryMb = defaults.memoryMb;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeProviderId = defaults.nodeProviderId;
    	      this.updateTime = defaults.updateTime;
    	      this.vcpuCount = defaults.vcpuCount;
        }

        public Builder kubernetesApiServerVersion(String kubernetesApiServerVersion) {
            this.kubernetesApiServerVersion = Objects.requireNonNull(kubernetesApiServerVersion);
            return this;
        }
        public Builder memoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder nodeProviderId(String nodeProviderId) {
            this.nodeProviderId = Objects.requireNonNull(nodeProviderId);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder vcpuCount(Integer vcpuCount) {
            this.vcpuCount = Objects.requireNonNull(vcpuCount);
            return this;
        }        public KubernetesMetadataResponse build() {
            return new KubernetesMetadataResponse(kubernetesApiServerVersion, memoryMb, nodeCount, nodeProviderId, updateTime, vcpuCount);
        }
    }
}
