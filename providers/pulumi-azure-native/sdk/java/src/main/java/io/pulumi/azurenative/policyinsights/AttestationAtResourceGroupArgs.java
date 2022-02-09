// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.policyinsights.enums.ComplianceState;
import io.pulumi.azurenative.policyinsights.inputs.AttestationEvidenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestationAtResourceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestationAtResourceGroupArgs Empty = new AttestationAtResourceGroupArgs();

    @InputImport(name="attestationName")
    private final @Nullable Input<String> attestationName;

    public Input<String> getAttestationName() {
        return this.attestationName == null ? Input.empty() : this.attestationName;
    }

    @InputImport(name="comments")
    private final @Nullable Input<String> comments;

    public Input<String> getComments() {
        return this.comments == null ? Input.empty() : this.comments;
    }

    @InputImport(name="complianceState")
    private final @Nullable Input<Either<String,ComplianceState>> complianceState;

    public Input<Either<String,ComplianceState>> getComplianceState() {
        return this.complianceState == null ? Input.empty() : this.complianceState;
    }

    @InputImport(name="evidence")
    private final @Nullable Input<List<AttestationEvidenceArgs>> evidence;

    public Input<List<AttestationEvidenceArgs>> getEvidence() {
        return this.evidence == null ? Input.empty() : this.evidence;
    }

    @InputImport(name="expiresOn")
    private final @Nullable Input<String> expiresOn;

    public Input<String> getExpiresOn() {
        return this.expiresOn == null ? Input.empty() : this.expiresOn;
    }

    @InputImport(name="owner")
    private final @Nullable Input<String> owner;

    public Input<String> getOwner() {
        return this.owner == null ? Input.empty() : this.owner;
    }

    @InputImport(name="policyAssignmentId", required=true)
    private final Input<String> policyAssignmentId;

    public Input<String> getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }

    @InputImport(name="policyDefinitionReferenceId")
    private final @Nullable Input<String> policyDefinitionReferenceId;

    public Input<String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId == null ? Input.empty() : this.policyDefinitionReferenceId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public AttestationAtResourceGroupArgs(
        @Nullable Input<String> attestationName,
        @Nullable Input<String> comments,
        @Nullable Input<Either<String,ComplianceState>> complianceState,
        @Nullable Input<List<AttestationEvidenceArgs>> evidence,
        @Nullable Input<String> expiresOn,
        @Nullable Input<String> owner,
        Input<String> policyAssignmentId,
        @Nullable Input<String> policyDefinitionReferenceId,
        Input<String> resourceGroupName) {
        this.attestationName = attestationName;
        this.comments = comments;
        this.complianceState = complianceState;
        this.evidence = evidence;
        this.expiresOn = expiresOn;
        this.owner = owner;
        this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId, "expected parameter 'policyAssignmentId' to be non-null");
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private AttestationAtResourceGroupArgs() {
        this.attestationName = Input.empty();
        this.comments = Input.empty();
        this.complianceState = Input.empty();
        this.evidence = Input.empty();
        this.expiresOn = Input.empty();
        this.owner = Input.empty();
        this.policyAssignmentId = Input.empty();
        this.policyDefinitionReferenceId = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAtResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attestationName;
        private @Nullable Input<String> comments;
        private @Nullable Input<Either<String,ComplianceState>> complianceState;
        private @Nullable Input<List<AttestationEvidenceArgs>> evidence;
        private @Nullable Input<String> expiresOn;
        private @Nullable Input<String> owner;
        private Input<String> policyAssignmentId;
        private @Nullable Input<String> policyDefinitionReferenceId;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAtResourceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationName = defaults.attestationName;
    	      this.comments = defaults.comments;
    	      this.complianceState = defaults.complianceState;
    	      this.evidence = defaults.evidence;
    	      this.expiresOn = defaults.expiresOn;
    	      this.owner = defaults.owner;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAttestationName(@Nullable Input<String> attestationName) {
            this.attestationName = attestationName;
            return this;
        }

        public Builder setAttestationName(@Nullable String attestationName) {
            this.attestationName = Input.ofNullable(attestationName);
            return this;
        }

        public Builder setComments(@Nullable Input<String> comments) {
            this.comments = comments;
            return this;
        }

        public Builder setComments(@Nullable String comments) {
            this.comments = Input.ofNullable(comments);
            return this;
        }

        public Builder setComplianceState(@Nullable Input<Either<String,ComplianceState>> complianceState) {
            this.complianceState = complianceState;
            return this;
        }

        public Builder setComplianceState(@Nullable Either<String,ComplianceState> complianceState) {
            this.complianceState = Input.ofNullable(complianceState);
            return this;
        }

        public Builder setEvidence(@Nullable Input<List<AttestationEvidenceArgs>> evidence) {
            this.evidence = evidence;
            return this;
        }

        public Builder setEvidence(@Nullable List<AttestationEvidenceArgs> evidence) {
            this.evidence = Input.ofNullable(evidence);
            return this;
        }

        public Builder setExpiresOn(@Nullable Input<String> expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }

        public Builder setExpiresOn(@Nullable String expiresOn) {
            this.expiresOn = Input.ofNullable(expiresOn);
            return this;
        }

        public Builder setOwner(@Nullable Input<String> owner) {
            this.owner = owner;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = Input.ofNullable(owner);
            return this;
        }

        public Builder setPolicyAssignmentId(Input<String> policyAssignmentId) {
            this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId);
            return this;
        }

        public Builder setPolicyAssignmentId(String policyAssignmentId) {
            this.policyAssignmentId = Input.of(Objects.requireNonNull(policyAssignmentId));
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable Input<String> policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = Input.ofNullable(policyDefinitionReferenceId);
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

        public AttestationAtResourceGroupArgs build() {
            return new AttestationAtResourceGroupArgs(attestationName, comments, complianceState, evidence, expiresOn, owner, policyAssignmentId, policyDefinitionReferenceId, resourceGroupName);
        }
    }
}
