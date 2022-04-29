// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataScience.outputs.GetJobJobConfigurationDetail;
import com.pulumi.oci.DataScience.outputs.GetJobJobInfrastructureConfigurationDetail;
import com.pulumi.oci.DataScience.outputs.GetJobJobLogConfigurationDetail;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    private final String artifactContentDisposition;
    private final String artifactContentLength;
    private final String artifactContentMd5;
    private final String artifactLastModified;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * 
     */
    private final String compartmentId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the project.
     * 
     */
    private final String createdBy;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    private final Boolean deleteRelatedJobRuns;
    /**
     * @return A short description of the job.
     * 
     */
    private final String description;
    /**
     * @return A user-friendly display name for the resource.
     * 
     */
    private final String displayName;
    private final Boolean emptyArtifact;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     * 
     */
    private final String id;
    private final String jobArtifact;
    /**
     * @return The job configuration details
     * 
     */
    private final List<GetJobJobConfigurationDetail> jobConfigurationDetails;
    private final String jobId;
    /**
     * @return The job infrastructure configuration details (shape, block storage, etc.)
     * 
     */
    private final List<GetJobJobInfrastructureConfigurationDetail> jobInfrastructureConfigurationDetails;
    /**
     * @return Logging configuration for resource.
     * 
     */
    private final List<GetJobJobLogConfigurationDetail> jobLogConfigurationDetails;
    /**
     * @return The state of the job.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     * 
     */
    private final String projectId;
    /**
     * @return The state of the job.
     * 
     */
    private final String state;
    /**
     * @return The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2020-08-06T21:10:29.41Z
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("artifactContentDisposition") String artifactContentDisposition,
        @CustomType.Parameter("artifactContentLength") String artifactContentLength,
        @CustomType.Parameter("artifactContentMd5") String artifactContentMd5,
        @CustomType.Parameter("artifactLastModified") String artifactLastModified,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("deleteRelatedJobRuns") Boolean deleteRelatedJobRuns,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("emptyArtifact") Boolean emptyArtifact,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("jobArtifact") String jobArtifact,
        @CustomType.Parameter("jobConfigurationDetails") List<GetJobJobConfigurationDetail> jobConfigurationDetails,
        @CustomType.Parameter("jobId") String jobId,
        @CustomType.Parameter("jobInfrastructureConfigurationDetails") List<GetJobJobInfrastructureConfigurationDetail> jobInfrastructureConfigurationDetails,
        @CustomType.Parameter("jobLogConfigurationDetails") List<GetJobJobLogConfigurationDetail> jobLogConfigurationDetails,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.artifactContentDisposition = artifactContentDisposition;
        this.artifactContentLength = artifactContentLength;
        this.artifactContentMd5 = artifactContentMd5;
        this.artifactLastModified = artifactLastModified;
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.definedTags = definedTags;
        this.deleteRelatedJobRuns = deleteRelatedJobRuns;
        this.description = description;
        this.displayName = displayName;
        this.emptyArtifact = emptyArtifact;
        this.freeformTags = freeformTags;
        this.id = id;
        this.jobArtifact = jobArtifact;
        this.jobConfigurationDetails = jobConfigurationDetails;
        this.jobId = jobId;
        this.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
        this.jobLogConfigurationDetails = jobLogConfigurationDetails;
        this.lifecycleDetails = lifecycleDetails;
        this.projectId = projectId;
        this.state = state;
        this.timeCreated = timeCreated;
    }

    public String artifactContentDisposition() {
        return this.artifactContentDisposition;
    }
    public String artifactContentLength() {
        return this.artifactContentLength;
    }
    public String artifactContentMd5() {
        return this.artifactContentMd5;
    }
    public String artifactLastModified() {
        return this.artifactLastModified;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the project.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    public Boolean deleteRelatedJobRuns() {
        return this.deleteRelatedJobRuns;
    }
    /**
     * @return A short description of the job.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A user-friendly display name for the resource.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public Boolean emptyArtifact() {
        return this.emptyArtifact;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     * 
     */
    public String id() {
        return this.id;
    }
    public String jobArtifact() {
        return this.jobArtifact;
    }
    /**
     * @return The job configuration details
     * 
     */
    public List<GetJobJobConfigurationDetail> jobConfigurationDetails() {
        return this.jobConfigurationDetails;
    }
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return The job infrastructure configuration details (shape, block storage, etc.)
     * 
     */
    public List<GetJobJobInfrastructureConfigurationDetail> jobInfrastructureConfigurationDetails() {
        return this.jobInfrastructureConfigurationDetails;
    }
    /**
     * @return Logging configuration for resource.
     * 
     */
    public List<GetJobJobLogConfigurationDetail> jobLogConfigurationDetails() {
        return this.jobLogConfigurationDetails;
    }
    /**
     * @return The state of the job.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return The state of the job.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2020-08-06T21:10:29.41Z
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactContentDisposition;
        private String artifactContentLength;
        private String artifactContentMd5;
        private String artifactLastModified;
        private String compartmentId;
        private String createdBy;
        private Map<String,Object> definedTags;
        private Boolean deleteRelatedJobRuns;
        private String description;
        private String displayName;
        private Boolean emptyArtifact;
        private Map<String,Object> freeformTags;
        private String id;
        private String jobArtifact;
        private List<GetJobJobConfigurationDetail> jobConfigurationDetails;
        private String jobId;
        private List<GetJobJobInfrastructureConfigurationDetail> jobInfrastructureConfigurationDetails;
        private List<GetJobJobLogConfigurationDetail> jobLogConfigurationDetails;
        private String lifecycleDetails;
        private String projectId;
        private String state;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactContentDisposition = defaults.artifactContentDisposition;
    	      this.artifactContentLength = defaults.artifactContentLength;
    	      this.artifactContentMd5 = defaults.artifactContentMd5;
    	      this.artifactLastModified = defaults.artifactLastModified;
    	      this.compartmentId = defaults.compartmentId;
    	      this.createdBy = defaults.createdBy;
    	      this.definedTags = defaults.definedTags;
    	      this.deleteRelatedJobRuns = defaults.deleteRelatedJobRuns;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.emptyArtifact = defaults.emptyArtifact;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.jobArtifact = defaults.jobArtifact;
    	      this.jobConfigurationDetails = defaults.jobConfigurationDetails;
    	      this.jobId = defaults.jobId;
    	      this.jobInfrastructureConfigurationDetails = defaults.jobInfrastructureConfigurationDetails;
    	      this.jobLogConfigurationDetails = defaults.jobLogConfigurationDetails;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder artifactContentDisposition(String artifactContentDisposition) {
            this.artifactContentDisposition = Objects.requireNonNull(artifactContentDisposition);
            return this;
        }
        public Builder artifactContentLength(String artifactContentLength) {
            this.artifactContentLength = Objects.requireNonNull(artifactContentLength);
            return this;
        }
        public Builder artifactContentMd5(String artifactContentMd5) {
            this.artifactContentMd5 = Objects.requireNonNull(artifactContentMd5);
            return this;
        }
        public Builder artifactLastModified(String artifactLastModified) {
            this.artifactLastModified = Objects.requireNonNull(artifactLastModified);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder deleteRelatedJobRuns(Boolean deleteRelatedJobRuns) {
            this.deleteRelatedJobRuns = Objects.requireNonNull(deleteRelatedJobRuns);
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
        public Builder emptyArtifact(Boolean emptyArtifact) {
            this.emptyArtifact = Objects.requireNonNull(emptyArtifact);
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
        public Builder jobArtifact(String jobArtifact) {
            this.jobArtifact = Objects.requireNonNull(jobArtifact);
            return this;
        }
        public Builder jobConfigurationDetails(List<GetJobJobConfigurationDetail> jobConfigurationDetails) {
            this.jobConfigurationDetails = Objects.requireNonNull(jobConfigurationDetails);
            return this;
        }
        public Builder jobConfigurationDetails(GetJobJobConfigurationDetail... jobConfigurationDetails) {
            return jobConfigurationDetails(List.of(jobConfigurationDetails));
        }
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        public Builder jobInfrastructureConfigurationDetails(List<GetJobJobInfrastructureConfigurationDetail> jobInfrastructureConfigurationDetails) {
            this.jobInfrastructureConfigurationDetails = Objects.requireNonNull(jobInfrastructureConfigurationDetails);
            return this;
        }
        public Builder jobInfrastructureConfigurationDetails(GetJobJobInfrastructureConfigurationDetail... jobInfrastructureConfigurationDetails) {
            return jobInfrastructureConfigurationDetails(List.of(jobInfrastructureConfigurationDetails));
        }
        public Builder jobLogConfigurationDetails(List<GetJobJobLogConfigurationDetail> jobLogConfigurationDetails) {
            this.jobLogConfigurationDetails = Objects.requireNonNull(jobLogConfigurationDetails);
            return this;
        }
        public Builder jobLogConfigurationDetails(GetJobJobLogConfigurationDetail... jobLogConfigurationDetails) {
            return jobLogConfigurationDetails(List.of(jobLogConfigurationDetails));
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetJobResult build() {
            return new GetJobResult(artifactContentDisposition, artifactContentLength, artifactContentMd5, artifactLastModified, compartmentId, createdBy, definedTags, deleteRelatedJobRuns, description, displayName, emptyArtifact, freeformTags, id, jobArtifact, jobConfigurationDetails, jobId, jobInfrastructureConfigurationDetails, jobLogConfigurationDetails, lifecycleDetails, projectId, state, timeCreated);
        }
    }
}
