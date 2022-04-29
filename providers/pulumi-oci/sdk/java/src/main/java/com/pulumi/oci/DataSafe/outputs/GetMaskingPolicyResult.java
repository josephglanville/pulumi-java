// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetMaskingPolicyColumnSource;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMaskingPolicyResult {
    private final Integer addMaskingColumnsFromSdmTrigger;
    /**
     * @return The source of masking columns.
     * 
     */
    private final List<GetMaskingPolicyColumnSource> columnSources;
    /**
     * @return The OCID of the compartment that contains the masking policy.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The description of the masking policy.
     * 
     */
    private final String description;
    /**
     * @return The display name of the masking policy.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the masking policy.
     * 
     */
    private final String id;
    /**
     * @return Indicates if the temporary tables created during a masking operation should be dropped after masking. It&#39;s enabled by default. Set this attribute to false to preserve the temporary tables. Masking creates temporary tables that map the original sensitive  data values to mask values. By default, these temporary tables are dropped after masking. But, in some cases, you may want  to preserve this information to track how masking changed your data. Note that doing so compromises security. These tables  must be dropped before the database is available for unprivileged users.
     * 
     */
    private final Boolean isDropTempTablesEnabled;
    /**
     * @return Indicates if redo logging is enabled during a masking operation. It&#39;s disabled by default. Set this attribute to true to enable redo logging. By default, masking disables redo logging and flashback logging to purge any original unmasked  data from logs. However, in certain circumstances when you only want to test masking, rollback changes, and retry masking, you could enable logging and use a flashback database to retrieve the original unmasked data after it has been masked.
     * 
     */
    private final Boolean isRedoLoggingEnabled;
    /**
     * @return Indicates if statistics gathering is enabled. It&#39;s enabled by default. Set this attribute to false to disable statistics gathering. The masking process gathers statistics on masked database tables after masking completes.
     * 
     */
    private final Boolean isRefreshStatsEnabled;
    private final String maskingPolicyId;
    /**
     * @return Specifies options to enable parallel execution when running data masking. Allowed values are &#39;NONE&#39; (no parallelism), &#39;DEFAULT&#39; (the Oracle Database computes the optimum degree of parallelism) or an integer value to be used as the degree of parallelism. Parallel execution helps effectively use multiple CPUsi and improve masking performance. Refer to the Oracle Database parallel execution framework when choosing an explicit degree of parallelism.
     * 
     */
    private final String parallelDegree;
    /**
     * @return A post-masking script, which can contain SQL and PL/SQL statements. It&#39;s executed after the core masking script generated using the masking policy. It&#39;s usually used to perform additional transformation or cleanup work after masking.
     * 
     */
    private final String postMaskingScript;
    /**
     * @return A pre-masking script, which can contain SQL and PL/SQL statements. It&#39;s executed before  the core masking script generated using the masking policy. It&#39;s usually used to perform any preparation or prerequisite work before masking data.
     * 
     */
    private final String preMaskingScript;
    /**
     * @return Specifies how to recompile invalid objects post data masking. Allowed values are &#39;SERIAL&#39; (recompile in serial),  &#39;PARALLEL&#39; (recompile in parallel), &#39;NONE&#39; (do not recompile). If it&#39;s set to PARALLEL, the value of parallelDegree attribute is used.
     * 
     */
    private final String recompile;
    /**
     * @return The current state of the masking policy.
     * 
     */
    private final String state;
    /**
     * @return The date and time the masking policy was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the masking policy was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetMaskingPolicyResult(
        @CustomType.Parameter("addMaskingColumnsFromSdmTrigger") Integer addMaskingColumnsFromSdmTrigger,
        @CustomType.Parameter("columnSources") List<GetMaskingPolicyColumnSource> columnSources,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isDropTempTablesEnabled") Boolean isDropTempTablesEnabled,
        @CustomType.Parameter("isRedoLoggingEnabled") Boolean isRedoLoggingEnabled,
        @CustomType.Parameter("isRefreshStatsEnabled") Boolean isRefreshStatsEnabled,
        @CustomType.Parameter("maskingPolicyId") String maskingPolicyId,
        @CustomType.Parameter("parallelDegree") String parallelDegree,
        @CustomType.Parameter("postMaskingScript") String postMaskingScript,
        @CustomType.Parameter("preMaskingScript") String preMaskingScript,
        @CustomType.Parameter("recompile") String recompile,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.addMaskingColumnsFromSdmTrigger = addMaskingColumnsFromSdmTrigger;
        this.columnSources = columnSources;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isDropTempTablesEnabled = isDropTempTablesEnabled;
        this.isRedoLoggingEnabled = isRedoLoggingEnabled;
        this.isRefreshStatsEnabled = isRefreshStatsEnabled;
        this.maskingPolicyId = maskingPolicyId;
        this.parallelDegree = parallelDegree;
        this.postMaskingScript = postMaskingScript;
        this.preMaskingScript = preMaskingScript;
        this.recompile = recompile;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    public Integer addMaskingColumnsFromSdmTrigger() {
        return this.addMaskingColumnsFromSdmTrigger;
    }
    /**
     * @return The source of masking columns.
     * 
     */
    public List<GetMaskingPolicyColumnSource> columnSources() {
        return this.columnSources;
    }
    /**
     * @return The OCID of the compartment that contains the masking policy.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The description of the masking policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the masking policy.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the masking policy.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates if the temporary tables created during a masking operation should be dropped after masking. It&#39;s enabled by default. Set this attribute to false to preserve the temporary tables. Masking creates temporary tables that map the original sensitive  data values to mask values. By default, these temporary tables are dropped after masking. But, in some cases, you may want  to preserve this information to track how masking changed your data. Note that doing so compromises security. These tables  must be dropped before the database is available for unprivileged users.
     * 
     */
    public Boolean isDropTempTablesEnabled() {
        return this.isDropTempTablesEnabled;
    }
    /**
     * @return Indicates if redo logging is enabled during a masking operation. It&#39;s disabled by default. Set this attribute to true to enable redo logging. By default, masking disables redo logging and flashback logging to purge any original unmasked  data from logs. However, in certain circumstances when you only want to test masking, rollback changes, and retry masking, you could enable logging and use a flashback database to retrieve the original unmasked data after it has been masked.
     * 
     */
    public Boolean isRedoLoggingEnabled() {
        return this.isRedoLoggingEnabled;
    }
    /**
     * @return Indicates if statistics gathering is enabled. It&#39;s enabled by default. Set this attribute to false to disable statistics gathering. The masking process gathers statistics on masked database tables after masking completes.
     * 
     */
    public Boolean isRefreshStatsEnabled() {
        return this.isRefreshStatsEnabled;
    }
    public String maskingPolicyId() {
        return this.maskingPolicyId;
    }
    /**
     * @return Specifies options to enable parallel execution when running data masking. Allowed values are &#39;NONE&#39; (no parallelism), &#39;DEFAULT&#39; (the Oracle Database computes the optimum degree of parallelism) or an integer value to be used as the degree of parallelism. Parallel execution helps effectively use multiple CPUsi and improve masking performance. Refer to the Oracle Database parallel execution framework when choosing an explicit degree of parallelism.
     * 
     */
    public String parallelDegree() {
        return this.parallelDegree;
    }
    /**
     * @return A post-masking script, which can contain SQL and PL/SQL statements. It&#39;s executed after the core masking script generated using the masking policy. It&#39;s usually used to perform additional transformation or cleanup work after masking.
     * 
     */
    public String postMaskingScript() {
        return this.postMaskingScript;
    }
    /**
     * @return A pre-masking script, which can contain SQL and PL/SQL statements. It&#39;s executed before  the core masking script generated using the masking policy. It&#39;s usually used to perform any preparation or prerequisite work before masking data.
     * 
     */
    public String preMaskingScript() {
        return this.preMaskingScript;
    }
    /**
     * @return Specifies how to recompile invalid objects post data masking. Allowed values are &#39;SERIAL&#39; (recompile in serial),  &#39;PARALLEL&#39; (recompile in parallel), &#39;NONE&#39; (do not recompile). If it&#39;s set to PARALLEL, the value of parallelDegree attribute is used.
     * 
     */
    public String recompile() {
        return this.recompile;
    }
    /**
     * @return The current state of the masking policy.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the masking policy was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the masking policy was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer addMaskingColumnsFromSdmTrigger;
        private List<GetMaskingPolicyColumnSource> columnSources;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isDropTempTablesEnabled;
        private Boolean isRedoLoggingEnabled;
        private Boolean isRefreshStatsEnabled;
        private String maskingPolicyId;
        private String parallelDegree;
        private String postMaskingScript;
        private String preMaskingScript;
        private String recompile;
        private String state;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaskingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addMaskingColumnsFromSdmTrigger = defaults.addMaskingColumnsFromSdmTrigger;
    	      this.columnSources = defaults.columnSources;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isDropTempTablesEnabled = defaults.isDropTempTablesEnabled;
    	      this.isRedoLoggingEnabled = defaults.isRedoLoggingEnabled;
    	      this.isRefreshStatsEnabled = defaults.isRefreshStatsEnabled;
    	      this.maskingPolicyId = defaults.maskingPolicyId;
    	      this.parallelDegree = defaults.parallelDegree;
    	      this.postMaskingScript = defaults.postMaskingScript;
    	      this.preMaskingScript = defaults.preMaskingScript;
    	      this.recompile = defaults.recompile;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder addMaskingColumnsFromSdmTrigger(Integer addMaskingColumnsFromSdmTrigger) {
            this.addMaskingColumnsFromSdmTrigger = Objects.requireNonNull(addMaskingColumnsFromSdmTrigger);
            return this;
        }
        public Builder columnSources(List<GetMaskingPolicyColumnSource> columnSources) {
            this.columnSources = Objects.requireNonNull(columnSources);
            return this;
        }
        public Builder columnSources(GetMaskingPolicyColumnSource... columnSources) {
            return columnSources(List.of(columnSources));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder isDropTempTablesEnabled(Boolean isDropTempTablesEnabled) {
            this.isDropTempTablesEnabled = Objects.requireNonNull(isDropTempTablesEnabled);
            return this;
        }
        public Builder isRedoLoggingEnabled(Boolean isRedoLoggingEnabled) {
            this.isRedoLoggingEnabled = Objects.requireNonNull(isRedoLoggingEnabled);
            return this;
        }
        public Builder isRefreshStatsEnabled(Boolean isRefreshStatsEnabled) {
            this.isRefreshStatsEnabled = Objects.requireNonNull(isRefreshStatsEnabled);
            return this;
        }
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = Objects.requireNonNull(maskingPolicyId);
            return this;
        }
        public Builder parallelDegree(String parallelDegree) {
            this.parallelDegree = Objects.requireNonNull(parallelDegree);
            return this;
        }
        public Builder postMaskingScript(String postMaskingScript) {
            this.postMaskingScript = Objects.requireNonNull(postMaskingScript);
            return this;
        }
        public Builder preMaskingScript(String preMaskingScript) {
            this.preMaskingScript = Objects.requireNonNull(preMaskingScript);
            return this;
        }
        public Builder recompile(String recompile) {
            this.recompile = Objects.requireNonNull(recompile);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetMaskingPolicyResult build() {
            return new GetMaskingPolicyResult(addMaskingColumnsFromSdmTrigger, columnSources, compartmentId, definedTags, description, displayName, freeformTags, id, isDropTempTablesEnabled, isRedoLoggingEnabled, isRefreshStatsEnabled, maskingPolicyId, parallelDegree, postMaskingScript, preMaskingScript, recompile, state, timeCreated, timeUpdated);
        }
    }
}
