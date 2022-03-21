// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.SecurityAssessmentMetadataPartnerDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssessmentMetadataInSubscriptionResult {
    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
     */
    private final String assessmentType;
    private final @Nullable List<String> categories;
    /**
     * Human readable description of the assessment
     * 
     */
    private final @Nullable String description;
    /**
     * User friendly display name of the assessment
     * 
     */
    private final String displayName;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The implementation effort required to remediate this assessment
     * 
     */
    private final @Nullable String implementationEffort;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Describes the partner that created the assessment
     * 
     */
    private final @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
    /**
     * Azure resource ID of the policy definition that turns this assessment calculation on
     * 
     */
    private final String policyDefinitionId;
    /**
     * True if this assessment is in preview release status
     * 
     */
    private final @Nullable Boolean preview;
    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
     */
    private final @Nullable String remediationDescription;
    /**
     * The severity level of the assessment
     * 
     */
    private final String severity;
    private final @Nullable List<String> threats;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * The user impact of the assessment
     * 
     */
    private final @Nullable String userImpact;

    @CustomType.Constructor
    private GetAssessmentMetadataInSubscriptionResult(
        @CustomType.Parameter("assessmentType") String assessmentType,
        @CustomType.Parameter("categories") @Nullable List<String> categories,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("implementationEffort") @Nullable String implementationEffort,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("partnerData") @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData,
        @CustomType.Parameter("policyDefinitionId") String policyDefinitionId,
        @CustomType.Parameter("preview") @Nullable Boolean preview,
        @CustomType.Parameter("remediationDescription") @Nullable String remediationDescription,
        @CustomType.Parameter("severity") String severity,
        @CustomType.Parameter("threats") @Nullable List<String> threats,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userImpact") @Nullable String userImpact) {
        this.assessmentType = assessmentType;
        this.categories = categories;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.implementationEffort = implementationEffort;
        this.name = name;
        this.partnerData = partnerData;
        this.policyDefinitionId = policyDefinitionId;
        this.preview = preview;
        this.remediationDescription = remediationDescription;
        this.severity = severity;
        this.threats = threats;
        this.type = type;
        this.userImpact = userImpact;
    }

    /**
     * BuiltIn if the assessment based on built-in Azure Policy definition, Custom if the assessment based on custom Azure Policy definition
     * 
    */
    public String getAssessmentType() {
        return this.assessmentType;
    }
    public List<String> getCategories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * Human readable description of the assessment
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * User friendly display name of the assessment
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The implementation effort required to remediate this assessment
     * 
    */
    public Optional<String> getImplementationEffort() {
        return Optional.ofNullable(this.implementationEffort);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Describes the partner that created the assessment
     * 
    */
    public Optional<SecurityAssessmentMetadataPartnerDataResponse> getPartnerData() {
        return Optional.ofNullable(this.partnerData);
    }
    /**
     * Azure resource ID of the policy definition that turns this assessment calculation on
     * 
    */
    public String getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * True if this assessment is in preview release status
     * 
    */
    public Optional<Boolean> getPreview() {
        return Optional.ofNullable(this.preview);
    }
    /**
     * Human readable description of what you should do to mitigate this security issue
     * 
    */
    public Optional<String> getRemediationDescription() {
        return Optional.ofNullable(this.remediationDescription);
    }
    /**
     * The severity level of the assessment
     * 
    */
    public String getSeverity() {
        return this.severity;
    }
    public List<String> getThreats() {
        return this.threats == null ? List.of() : this.threats;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The user impact of the assessment
     * 
    */
    public Optional<String> getUserImpact() {
        return Optional.ofNullable(this.userImpact);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssessmentMetadataInSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentType;
        private @Nullable List<String> categories;
        private @Nullable String description;
        private String displayName;
        private String id;
        private @Nullable String implementationEffort;
        private String name;
        private @Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData;
        private String policyDefinitionId;
        private @Nullable Boolean preview;
        private @Nullable String remediationDescription;
        private String severity;
        private @Nullable List<String> threats;
        private String type;
        private @Nullable String userImpact;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssessmentMetadataInSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentType = defaults.assessmentType;
    	      this.categories = defaults.categories;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.implementationEffort = defaults.implementationEffort;
    	      this.name = defaults.name;
    	      this.partnerData = defaults.partnerData;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.preview = defaults.preview;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.severity = defaults.severity;
    	      this.threats = defaults.threats;
    	      this.type = defaults.type;
    	      this.userImpact = defaults.userImpact;
        }

        public Builder assessmentType(String assessmentType) {
            this.assessmentType = Objects.requireNonNull(assessmentType);
            return this;
        }
        public Builder categories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder implementationEffort(@Nullable String implementationEffort) {
            this.implementationEffort = implementationEffort;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder partnerData(@Nullable SecurityAssessmentMetadataPartnerDataResponse partnerData) {
            this.partnerData = partnerData;
            return this;
        }
        public Builder policyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }
        public Builder preview(@Nullable Boolean preview) {
            this.preview = preview;
            return this;
        }
        public Builder remediationDescription(@Nullable String remediationDescription) {
            this.remediationDescription = remediationDescription;
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public Builder threats(@Nullable List<String> threats) {
            this.threats = threats;
            return this;
        }
        public Builder threats(String... threats) {
            return threats(List.of(threats));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userImpact(@Nullable String userImpact) {
            this.userImpact = userImpact;
            return this;
        }        public GetAssessmentMetadataInSubscriptionResult build() {
            return new GetAssessmentMetadataInSubscriptionResult(assessmentType, categories, description, displayName, id, implementationEffort, name, partnerData, policyDefinitionId, preview, remediationDescription, severity, threats, type, userImpact);
        }
    }
}
