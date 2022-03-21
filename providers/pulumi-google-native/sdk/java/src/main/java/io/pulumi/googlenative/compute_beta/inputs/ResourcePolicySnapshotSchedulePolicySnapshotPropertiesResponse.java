// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Specified snapshot properties for scheduled snapshots created by this policy.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse Empty = new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse();

    /**
     * Chain name that the snapshot is created in.
     * 
     */
    @Import(name="chainName", required=true)
      private final String chainName;

    public String getChainName() {
        return this.chainName;
    }

    /**
     * Indication to perform a 'guest aware' snapshot.
     * 
     */
    @Import(name="guestFlush", required=true)
      private final Boolean guestFlush;

    public Boolean getGuestFlush() {
        return this.guestFlush;
    }

    /**
     * Labels to apply to scheduled snapshots. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * Cloud Storage bucket storage location of the auto snapshot (regional or multi-regional).
     * 
     */
    @Import(name="storageLocations", required=true)
      private final List<String> storageLocations;

    public List<String> getStorageLocations() {
        return this.storageLocations;
    }

    public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse(
        String chainName,
        Boolean guestFlush,
        Map<String,String> labels,
        List<String> storageLocations) {
        this.chainName = Objects.requireNonNull(chainName, "expected parameter 'chainName' to be non-null");
        this.guestFlush = Objects.requireNonNull(guestFlush, "expected parameter 'guestFlush' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.storageLocations = Objects.requireNonNull(storageLocations, "expected parameter 'storageLocations' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse() {
        this.chainName = null;
        this.guestFlush = null;
        this.labels = Map.of();
        this.storageLocations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainName;
        private Boolean guestFlush;
        private Map<String,String> labels;
        private List<String> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder chainName(String chainName) {
            this.chainName = Objects.requireNonNull(chainName);
            return this;
        }
        public Builder guestFlush(Boolean guestFlush) {
            this.guestFlush = Objects.requireNonNull(guestFlush);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder storageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }
        public Builder storageLocations(String... storageLocations) {
            return storageLocations(List.of(storageLocations));
        }        public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse build() {
            return new ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse(chainName, guestFlush, labels, storageLocations);
        }
    }
}
