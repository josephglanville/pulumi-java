// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.AssessmentStatusArgs;
import io.pulumi.azurenative.security.inputs.AzureResourceDetailsArgs;
import io.pulumi.azurenative.security.inputs.OnPremiseResourceDetailsArgs;
import io.pulumi.azurenative.security.inputs.OnPremiseSqlResourceDetailsArgs;
import io.pulumi.azurenative.security.inputs.SecurityAssessmentMetadataPropertiesArgs;
import io.pulumi.azurenative.security.inputs.SecurityAssessmentPartnerDataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentArgs Empty = new AssessmentArgs();

    /**
     * Additional data regarding the assessment
     * 
     */
    @InputImport(name="additionalData")
      private final @Nullable Input<Map<String,String>> additionalData;

    public Input<Map<String,String>> getAdditionalData() {
        return this.additionalData == null ? Input.empty() : this.additionalData;
    }

    /**
     * The Assessment Key - Unique key for the assessment type
     * 
     */
    @InputImport(name="assessmentName")
      private final @Nullable Input<String> assessmentName;

    public Input<String> getAssessmentName() {
        return this.assessmentName == null ? Input.empty() : this.assessmentName;
    }

    /**
     * Describes properties of an assessment metadata.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<SecurityAssessmentMetadataPropertiesArgs> metadata;

    public Input<SecurityAssessmentMetadataPropertiesArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Data regarding 3rd party partner integration
     * 
     */
    @InputImport(name="partnersData")
      private final @Nullable Input<SecurityAssessmentPartnerDataArgs> partnersData;

    public Input<SecurityAssessmentPartnerDataArgs> getPartnersData() {
        return this.partnersData == null ? Input.empty() : this.partnersData;
    }

    /**
     * Details of the resource that was assessed
     * 
     */
    @InputImport(name="resourceDetails", required=true)
      private final Input<Object> resourceDetails;

    public Input<Object> getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The result of the assessment
     * 
     */
    @InputImport(name="status", required=true)
      private final Input<AssessmentStatusArgs> status;

    public Input<AssessmentStatusArgs> getStatus() {
        return this.status;
    }

    public AssessmentArgs(
        @Nullable Input<Map<String,String>> additionalData,
        @Nullable Input<String> assessmentName,
        @Nullable Input<SecurityAssessmentMetadataPropertiesArgs> metadata,
        @Nullable Input<SecurityAssessmentPartnerDataArgs> partnersData,
        Input<Object> resourceDetails,
        Input<String> resourceId,
        Input<AssessmentStatusArgs> status) {
        this.additionalData = additionalData;
        this.assessmentName = assessmentName;
        this.metadata = metadata;
        this.partnersData = partnersData;
        this.resourceDetails = Objects.requireNonNull(resourceDetails, "expected parameter 'resourceDetails' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private AssessmentArgs() {
        this.additionalData = Input.empty();
        this.assessmentName = Input.empty();
        this.metadata = Input.empty();
        this.partnersData = Input.empty();
        this.resourceDetails = Input.empty();
        this.resourceId = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> additionalData;
        private @Nullable Input<String> assessmentName;
        private @Nullable Input<SecurityAssessmentMetadataPropertiesArgs> metadata;
        private @Nullable Input<SecurityAssessmentPartnerDataArgs> partnersData;
        private Input<Object> resourceDetails;
        private Input<String> resourceId;
        private Input<AssessmentStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalData = defaults.additionalData;
    	      this.assessmentName = defaults.assessmentName;
    	      this.metadata = defaults.metadata;
    	      this.partnersData = defaults.partnersData;
    	      this.resourceDetails = defaults.resourceDetails;
    	      this.resourceId = defaults.resourceId;
    	      this.status = defaults.status;
        }

        public Builder setAdditionalData(@Nullable Input<Map<String,String>> additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        public Builder setAdditionalData(@Nullable Map<String,String> additionalData) {
            this.additionalData = Input.ofNullable(additionalData);
            return this;
        }

        public Builder setAssessmentName(@Nullable Input<String> assessmentName) {
            this.assessmentName = assessmentName;
            return this;
        }

        public Builder setAssessmentName(@Nullable String assessmentName) {
            this.assessmentName = Input.ofNullable(assessmentName);
            return this;
        }

        public Builder setMetadata(@Nullable Input<SecurityAssessmentMetadataPropertiesArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable SecurityAssessmentMetadataPropertiesArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setPartnersData(@Nullable Input<SecurityAssessmentPartnerDataArgs> partnersData) {
            this.partnersData = partnersData;
            return this;
        }

        public Builder setPartnersData(@Nullable SecurityAssessmentPartnerDataArgs partnersData) {
            this.partnersData = Input.ofNullable(partnersData);
            return this;
        }

        public Builder setResourceDetails(Input<Object> resourceDetails) {
            this.resourceDetails = Objects.requireNonNull(resourceDetails);
            return this;
        }

        public Builder setResourceDetails(Object resourceDetails) {
            this.resourceDetails = Input.of(Objects.requireNonNull(resourceDetails));
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setStatus(Input<AssessmentStatusArgs> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(AssessmentStatusArgs status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public AssessmentArgs build() {
            return new AssessmentArgs(additionalData, assessmentName, metadata, partnersData, resourceDetails, resourceId, status);
        }
    }
}
