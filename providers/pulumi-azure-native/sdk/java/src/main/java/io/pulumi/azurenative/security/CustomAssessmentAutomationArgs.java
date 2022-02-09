// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.enums.SeverityEnum;
import io.pulumi.azurenative.security.enums.SupportedCloudEnum;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomAssessmentAutomationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomAssessmentAutomationArgs Empty = new CustomAssessmentAutomationArgs();

    @InputImport(name="compressedQuery")
    private final @Nullable Input<String> compressedQuery;

    public Input<String> getCompressedQuery() {
        return this.compressedQuery == null ? Input.empty() : this.compressedQuery;
    }

    @InputImport(name="customAssessmentAutomationName")
    private final @Nullable Input<String> customAssessmentAutomationName;

    public Input<String> getCustomAssessmentAutomationName() {
        return this.customAssessmentAutomationName == null ? Input.empty() : this.customAssessmentAutomationName;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="remediationDescription")
    private final @Nullable Input<String> remediationDescription;

    public Input<String> getRemediationDescription() {
        return this.remediationDescription == null ? Input.empty() : this.remediationDescription;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="severity")
    private final @Nullable Input<Either<String,SeverityEnum>> severity;

    public Input<Either<String,SeverityEnum>> getSeverity() {
        return this.severity == null ? Input.empty() : this.severity;
    }

    @InputImport(name="supportedCloud")
    private final @Nullable Input<Either<String,SupportedCloudEnum>> supportedCloud;

    public Input<Either<String,SupportedCloudEnum>> getSupportedCloud() {
        return this.supportedCloud == null ? Input.empty() : this.supportedCloud;
    }

    public CustomAssessmentAutomationArgs(
        @Nullable Input<String> compressedQuery,
        @Nullable Input<String> customAssessmentAutomationName,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> remediationDescription,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,SeverityEnum>> severity,
        @Nullable Input<Either<String,SupportedCloudEnum>> supportedCloud) {
        this.compressedQuery = compressedQuery;
        this.customAssessmentAutomationName = customAssessmentAutomationName;
        this.description = description;
        this.displayName = displayName;
        this.remediationDescription = remediationDescription;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.severity = severity;
        this.supportedCloud = supportedCloud;
    }

    private CustomAssessmentAutomationArgs() {
        this.compressedQuery = Input.empty();
        this.customAssessmentAutomationName = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.remediationDescription = Input.empty();
        this.resourceGroupName = Input.empty();
        this.severity = Input.empty();
        this.supportedCloud = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAssessmentAutomationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> compressedQuery;
        private @Nullable Input<String> customAssessmentAutomationName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> remediationDescription;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,SeverityEnum>> severity;
        private @Nullable Input<Either<String,SupportedCloudEnum>> supportedCloud;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomAssessmentAutomationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressedQuery = defaults.compressedQuery;
    	      this.customAssessmentAutomationName = defaults.customAssessmentAutomationName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.remediationDescription = defaults.remediationDescription;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.severity = defaults.severity;
    	      this.supportedCloud = defaults.supportedCloud;
        }

        public Builder setCompressedQuery(@Nullable Input<String> compressedQuery) {
            this.compressedQuery = compressedQuery;
            return this;
        }

        public Builder setCompressedQuery(@Nullable String compressedQuery) {
            this.compressedQuery = Input.ofNullable(compressedQuery);
            return this;
        }

        public Builder setCustomAssessmentAutomationName(@Nullable Input<String> customAssessmentAutomationName) {
            this.customAssessmentAutomationName = customAssessmentAutomationName;
            return this;
        }

        public Builder setCustomAssessmentAutomationName(@Nullable String customAssessmentAutomationName) {
            this.customAssessmentAutomationName = Input.ofNullable(customAssessmentAutomationName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setRemediationDescription(@Nullable Input<String> remediationDescription) {
            this.remediationDescription = remediationDescription;
            return this;
        }

        public Builder setRemediationDescription(@Nullable String remediationDescription) {
            this.remediationDescription = Input.ofNullable(remediationDescription);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSeverity(@Nullable Input<Either<String,SeverityEnum>> severity) {
            this.severity = severity;
            return this;
        }

        public Builder setSeverity(@Nullable Either<String,SeverityEnum> severity) {
            this.severity = Input.ofNullable(severity);
            return this;
        }

        public Builder setSupportedCloud(@Nullable Input<Either<String,SupportedCloudEnum>> supportedCloud) {
            this.supportedCloud = supportedCloud;
            return this;
        }

        public Builder setSupportedCloud(@Nullable Either<String,SupportedCloudEnum> supportedCloud) {
            this.supportedCloud = Input.ofNullable(supportedCloud);
            return this;
        }

        public CustomAssessmentAutomationArgs build() {
            return new CustomAssessmentAutomationArgs(compressedQuery, customAssessmentAutomationName, description, displayName, remediationDescription, resourceGroupName, severity, supportedCloud);
        }
    }
}
