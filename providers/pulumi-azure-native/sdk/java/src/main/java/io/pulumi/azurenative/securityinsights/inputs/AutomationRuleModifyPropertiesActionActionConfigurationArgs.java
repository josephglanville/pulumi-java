// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.enums.IncidentClassification;
import io.pulumi.azurenative.securityinsights.enums.IncidentClassificationReason;
import io.pulumi.azurenative.securityinsights.enums.IncidentSeverity;
import io.pulumi.azurenative.securityinsights.enums.IncidentStatus;
import io.pulumi.azurenative.securityinsights.inputs.IncidentLabelArgs;
import io.pulumi.azurenative.securityinsights.inputs.IncidentOwnerInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of the modify properties automation rule action
 * 
 */
public final class AutomationRuleModifyPropertiesActionActionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleModifyPropertiesActionActionConfigurationArgs Empty = new AutomationRuleModifyPropertiesActionActionConfigurationArgs();

    /**
     * The reason the incident was closed
     * 
     */
    @InputImport(name="classification")
      private final @Nullable Output<Either<String,IncidentClassification>> classification;

    public Output<Either<String,IncidentClassification>> getClassification() {
        return this.classification == null ? Output.empty() : this.classification;
    }

    /**
     * Describes the reason the incident was closed
     * 
     */
    @InputImport(name="classificationComment")
      private final @Nullable Output<String> classificationComment;

    public Output<String> getClassificationComment() {
        return this.classificationComment == null ? Output.empty() : this.classificationComment;
    }

    /**
     * The classification reason to close the incident with
     * 
     */
    @InputImport(name="classificationReason")
      private final @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason;

    public Output<Either<String,IncidentClassificationReason>> getClassificationReason() {
        return this.classificationReason == null ? Output.empty() : this.classificationReason;
    }

    /**
     * List of labels to add to the incident
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<List<IncidentLabelArgs>> labels;

    public Output<List<IncidentLabelArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Describes a user that the incident is assigned to
     * 
     */
    @InputImport(name="owner")
      private final @Nullable Output<IncidentOwnerInfoArgs> owner;

    public Output<IncidentOwnerInfoArgs> getOwner() {
        return this.owner == null ? Output.empty() : this.owner;
    }

    /**
     * The severity of the incident
     * 
     */
    @InputImport(name="severity")
      private final @Nullable Output<Either<String,IncidentSeverity>> severity;

    public Output<Either<String,IncidentSeverity>> getSeverity() {
        return this.severity == null ? Output.empty() : this.severity;
    }

    /**
     * The status of the incident
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<Either<String,IncidentStatus>> status;

    public Output<Either<String,IncidentStatus>> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public AutomationRuleModifyPropertiesActionActionConfigurationArgs(
        @Nullable Output<Either<String,IncidentClassification>> classification,
        @Nullable Output<String> classificationComment,
        @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason,
        @Nullable Output<List<IncidentLabelArgs>> labels,
        @Nullable Output<IncidentOwnerInfoArgs> owner,
        @Nullable Output<Either<String,IncidentSeverity>> severity,
        @Nullable Output<Either<String,IncidentStatus>> status) {
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.labels = labels;
        this.owner = owner;
        this.severity = severity;
        this.status = status;
    }

    private AutomationRuleModifyPropertiesActionActionConfigurationArgs() {
        this.classification = Output.empty();
        this.classificationComment = Output.empty();
        this.classificationReason = Output.empty();
        this.labels = Output.empty();
        this.owner = Output.empty();
        this.severity = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleModifyPropertiesActionActionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,IncidentClassification>> classification;
        private @Nullable Output<String> classificationComment;
        private @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason;
        private @Nullable Output<List<IncidentLabelArgs>> labels;
        private @Nullable Output<IncidentOwnerInfoArgs> owner;
        private @Nullable Output<Either<String,IncidentSeverity>> severity;
        private @Nullable Output<Either<String,IncidentStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleModifyPropertiesActionActionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.labels = defaults.labels;
    	      this.owner = defaults.owner;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
        }

        public Builder classification(@Nullable Output<Either<String,IncidentClassification>> classification) {
            this.classification = classification;
            return this;
        }

        public Builder classification(@Nullable Either<String,IncidentClassification> classification) {
            this.classification = Output.ofNullable(classification);
            return this;
        }

        public Builder classificationComment(@Nullable Output<String> classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }

        public Builder classificationComment(@Nullable String classificationComment) {
            this.classificationComment = Output.ofNullable(classificationComment);
            return this;
        }

        public Builder classificationReason(@Nullable Output<Either<String,IncidentClassificationReason>> classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }

        public Builder classificationReason(@Nullable Either<String,IncidentClassificationReason> classificationReason) {
            this.classificationReason = Output.ofNullable(classificationReason);
            return this;
        }

        public Builder labels(@Nullable Output<List<IncidentLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable List<IncidentLabelArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder owner(@Nullable Output<IncidentOwnerInfoArgs> owner) {
            this.owner = owner;
            return this;
        }

        public Builder owner(@Nullable IncidentOwnerInfoArgs owner) {
            this.owner = Output.ofNullable(owner);
            return this;
        }

        public Builder severity(@Nullable Output<Either<String,IncidentSeverity>> severity) {
            this.severity = severity;
            return this;
        }

        public Builder severity(@Nullable Either<String,IncidentSeverity> severity) {
            this.severity = Output.ofNullable(severity);
            return this;
        }

        public Builder status(@Nullable Output<Either<String,IncidentStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable Either<String,IncidentStatus> status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public AutomationRuleModifyPropertiesActionActionConfigurationArgs build() {
            return new AutomationRuleModifyPropertiesActionActionConfigurationArgs(classification, classificationComment, classificationReason, labels, owner, severity, status);
        }
    }
}
