// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrationEligibilityInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse {
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * The state of the original AgentJob.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The type of AgentJob.
     * 
     */
    private final String jobCategory;
    /**
     * The owner of the AgentJob
     * 
     */
    private final String jobOwner;
    /**
     * UTC Date and time when the AgentJob was last executed.
     * 
     */
    private final String lastExecutedOn;
    /**
     * Information about eligibility of agent job for migration.
     * 
     */
    private final MigrationEligibilityInfoResponse migrationEligibility;
    /**
     * AgentJob name
     * 
     */
    private final String name;
    /**
     * Type of result - database level or task level
     * Expected value is 'AgentJobLevelOutput'.
     * 
     */
    private final String resultType;

    @CustomType.Constructor
    private ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("jobCategory") String jobCategory,
        @CustomType.Parameter("jobOwner") String jobOwner,
        @CustomType.Parameter("lastExecutedOn") String lastExecutedOn,
        @CustomType.Parameter("migrationEligibility") MigrationEligibilityInfoResponse migrationEligibility,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resultType") String resultType) {
        this.id = id;
        this.isEnabled = isEnabled;
        this.jobCategory = jobCategory;
        this.jobOwner = jobOwner;
        this.lastExecutedOn = lastExecutedOn;
        this.migrationEligibility = migrationEligibility;
        this.name = name;
        this.resultType = resultType;
    }

    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The state of the original AgentJob.
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The type of AgentJob.
     * 
    */
    public String getJobCategory() {
        return this.jobCategory;
    }
    /**
     * The owner of the AgentJob
     * 
    */
    public String getJobOwner() {
        return this.jobOwner;
    }
    /**
     * UTC Date and time when the AgentJob was last executed.
     * 
    */
    public String getLastExecutedOn() {
        return this.lastExecutedOn;
    }
    /**
     * Information about eligibility of agent job for migration.
     * 
    */
    public MigrationEligibilityInfoResponse getMigrationEligibility() {
        return this.migrationEligibility;
    }
    /**
     * AgentJob name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Type of result - database level or task level
     * Expected value is 'AgentJobLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Boolean isEnabled;
        private String jobCategory;
        private String jobOwner;
        private String lastExecutedOn;
        private MigrationEligibilityInfoResponse migrationEligibility;
        private String name;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.jobCategory = defaults.jobCategory;
    	      this.jobOwner = defaults.jobOwner;
    	      this.lastExecutedOn = defaults.lastExecutedOn;
    	      this.migrationEligibility = defaults.migrationEligibility;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder jobCategory(String jobCategory) {
            this.jobCategory = Objects.requireNonNull(jobCategory);
            return this;
        }
        public Builder jobOwner(String jobOwner) {
            this.jobOwner = Objects.requireNonNull(jobOwner);
            return this;
        }
        public Builder lastExecutedOn(String lastExecutedOn) {
            this.lastExecutedOn = Objects.requireNonNull(lastExecutedOn);
            return this;
        }
        public Builder migrationEligibility(MigrationEligibilityInfoResponse migrationEligibility) {
            this.migrationEligibility = Objects.requireNonNull(migrationEligibility);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }        public ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputAgentJobLevelResponse(id, isEnabled, jobCategory, jobOwner, lastExecutedOn, migrationEligibility, name, resultType);
        }
    }
}
