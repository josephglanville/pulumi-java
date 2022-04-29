// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetVolumeBackupPoliciesVolumeBackupPolicySchedule;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVolumeBackupPoliciesVolumeBackupPolicy {
    /**
     * @return The OCID of the compartment. If no compartment is specified, the Oracle defined backup policies are listed.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The paired destination region for copying scheduled backups to. Example `us-ashburn-1`. See [Region Pairs](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#RegionPairs) for details about paired regions.
     * 
     */
    private final String destinationRegion;
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the volume backup policy.
     * 
     */
    private final String id;
    /**
     * @return The collection of schedules that this policy will apply.
     * 
     */
    private final List<GetVolumeBackupPoliciesVolumeBackupPolicySchedule> schedules;
    /**
     * @return The date and time the volume backup policy was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetVolumeBackupPoliciesVolumeBackupPolicy(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("destinationRegion") String destinationRegion,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("schedules") List<GetVolumeBackupPoliciesVolumeBackupPolicySchedule> schedules,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.destinationRegion = destinationRegion;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.schedules = schedules;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID of the compartment. If no compartment is specified, the Oracle defined backup policies are listed.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The paired destination region for copying scheduled backups to. Example `us-ashburn-1`. See [Region Pairs](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm#RegionPairs) for details about paired regions.
     * 
     */
    public String destinationRegion() {
        return this.destinationRegion;
    }
    /**
     * @return A user-friendly name. Does not have to be unique, and it&#39;s changeable. Avoid entering confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the volume backup policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The collection of schedules that this policy will apply.
     * 
     */
    public List<GetVolumeBackupPoliciesVolumeBackupPolicySchedule> schedules() {
        return this.schedules;
    }
    /**
     * @return The date and time the volume backup policy was created. Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeBackupPoliciesVolumeBackupPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String destinationRegion;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private List<GetVolumeBackupPoliciesVolumeBackupPolicySchedule> schedules;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeBackupPoliciesVolumeBackupPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.destinationRegion = defaults.destinationRegion;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.schedules = defaults.schedules;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = Objects.requireNonNull(destinationRegion);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
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
        public Builder schedules(List<GetVolumeBackupPoliciesVolumeBackupPolicySchedule> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }
        public Builder schedules(GetVolumeBackupPoliciesVolumeBackupPolicySchedule... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetVolumeBackupPoliciesVolumeBackupPolicy build() {
            return new GetVolumeBackupPoliciesVolumeBackupPolicy(compartmentId, definedTags, destinationRegion, displayName, freeformTags, id, schedules, timeCreated);
        }
    }
}
