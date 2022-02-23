// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of group resource.
 * 
 */
public final class GroupPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GroupPropertiesResponse Empty = new GroupPropertiesResponse();

    /**
     * If the assessments are in running state.
     * 
     */
    @InputImport(name="areAssessmentsRunning", required=true)
      private final Boolean areAssessmentsRunning;

    public Boolean getAreAssessmentsRunning() {
        return this.areAssessmentsRunning;
    }

    /**
     * List of References to Assessments created on this group.
     * 
     */
    @InputImport(name="assessments", required=true)
      private final List<String> assessments;

    public List<String> getAssessments() {
        return this.assessments;
    }

    /**
     * Time when this group was created. Date-Time represented in ISO-8601 format.
     * 
     */
    @InputImport(name="createdTimestamp", required=true)
      private final String createdTimestamp;

    public String getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Whether the group has been created and is valid.
     * 
     */
    @InputImport(name="groupStatus", required=true)
      private final String groupStatus;

    public String getGroupStatus() {
        return this.groupStatus;
    }

    /**
     * The type of group.
     * 
     */
    @InputImport(name="groupType")
      private final @Nullable String groupType;

    public Optional<String> getGroupType() {
        return this.groupType == null ? Optional.empty() : Optional.ofNullable(this.groupType);
    }

    /**
     * Number of machines part of this group.
     * 
     */
    @InputImport(name="machineCount", required=true)
      private final Integer machineCount;

    public Integer getMachineCount() {
        return this.machineCount;
    }

    /**
     * Time when this group was last updated. Date-Time represented in ISO-8601 format.
     * 
     */
    @InputImport(name="updatedTimestamp", required=true)
      private final String updatedTimestamp;

    public String getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public GroupPropertiesResponse(
        Boolean areAssessmentsRunning,
        List<String> assessments,
        String createdTimestamp,
        String groupStatus,
        @Nullable String groupType,
        Integer machineCount,
        String updatedTimestamp) {
        this.areAssessmentsRunning = Objects.requireNonNull(areAssessmentsRunning, "expected parameter 'areAssessmentsRunning' to be non-null");
        this.assessments = Objects.requireNonNull(assessments, "expected parameter 'assessments' to be non-null");
        this.createdTimestamp = Objects.requireNonNull(createdTimestamp, "expected parameter 'createdTimestamp' to be non-null");
        this.groupStatus = Objects.requireNonNull(groupStatus, "expected parameter 'groupStatus' to be non-null");
        this.groupType = groupType;
        this.machineCount = Objects.requireNonNull(machineCount, "expected parameter 'machineCount' to be non-null");
        this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp, "expected parameter 'updatedTimestamp' to be non-null");
    }

    private GroupPropertiesResponse() {
        this.areAssessmentsRunning = null;
        this.assessments = List.of();
        this.createdTimestamp = null;
        this.groupStatus = null;
        this.groupType = null;
        this.machineCount = null;
        this.updatedTimestamp = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean areAssessmentsRunning;
        private List<String> assessments;
        private String createdTimestamp;
        private String groupStatus;
        private @Nullable String groupType;
        private Integer machineCount;
        private String updatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.areAssessmentsRunning = defaults.areAssessmentsRunning;
    	      this.assessments = defaults.assessments;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.groupStatus = defaults.groupStatus;
    	      this.groupType = defaults.groupType;
    	      this.machineCount = defaults.machineCount;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
        }

        public Builder setAreAssessmentsRunning(Boolean areAssessmentsRunning) {
            this.areAssessmentsRunning = Objects.requireNonNull(areAssessmentsRunning);
            return this;
        }

        public Builder setAssessments(List<String> assessments) {
            this.assessments = Objects.requireNonNull(assessments);
            return this;
        }

        public Builder setCreatedTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }

        public Builder setGroupStatus(String groupStatus) {
            this.groupStatus = Objects.requireNonNull(groupStatus);
            return this;
        }

        public Builder setGroupType(@Nullable String groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder setMachineCount(Integer machineCount) {
            this.machineCount = Objects.requireNonNull(machineCount);
            return this;
        }

        public Builder setUpdatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }
        public GroupPropertiesResponse build() {
            return new GroupPropertiesResponse(areAssessmentsRunning, assessments, createdTimestamp, groupStatus, groupType, machineCount, updatedTimestamp);
        }
    }
}
