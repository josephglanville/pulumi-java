// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVolumeBackupPolicyAssignmentsVolumeBackupPolicyAssignment {
    /**
     * @return The OCID of an asset (e.g. a volume).
     * 
     */
    private final String assetId;
    /**
     * @return The OCID of the volume backup policy assignment.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the volume backup policy that has been assigned to the volume.
     * 
     */
    private final String policyId;
    /**
     * @return The date and time the volume backup policy was assigned to the volume. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetVolumeBackupPolicyAssignmentsVolumeBackupPolicyAssignment(
        @CustomType.Parameter("assetId") String assetId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("policyId") String policyId,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.assetId = assetId;
        this.id = id;
        this.policyId = policyId;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID of an asset (e.g. a volume).
     * 
     */
    public String assetId() {
        return this.assetId;
    }
    /**
     * @return The OCID of the volume backup policy assignment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCID of the volume backup policy that has been assigned to the volume.
     * 
     */
    public String policyId() {
        return this.policyId;
    }
    /**
     * @return The date and time the volume backup policy was assigned to the volume. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeBackupPolicyAssignmentsVolumeBackupPolicyAssignment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private String id;
        private String policyId;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeBackupPolicyAssignmentsVolumeBackupPolicyAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.id = defaults.id;
    	      this.policyId = defaults.policyId;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetVolumeBackupPolicyAssignmentsVolumeBackupPolicyAssignment build() {
            return new GetVolumeBackupPolicyAssignmentsVolumeBackupPolicyAssignment(assetId, id, policyId, timeCreated);
        }
    }
}
