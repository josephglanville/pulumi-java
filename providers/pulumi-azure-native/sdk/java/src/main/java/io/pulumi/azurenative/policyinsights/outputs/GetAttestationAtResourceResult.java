// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.azurenative.policyinsights.outputs.AttestationEvidenceResponse;
import io.pulumi.azurenative.policyinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAttestationAtResourceResult {
    private final @Nullable String comments;
    private final @Nullable String complianceState;
    private final @Nullable List<AttestationEvidenceResponse> evidence;
    private final @Nullable String expiresOn;
    private final String id;
    private final String lastComplianceStateChangeAt;
    private final String name;
    private final @Nullable String owner;
    private final String policyAssignmentId;
    private final @Nullable String policyDefinitionReferenceId;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"comments","complianceState","evidence","expiresOn","id","lastComplianceStateChangeAt","name","owner","policyAssignmentId","policyDefinitionReferenceId","provisioningState","systemData","type"})
    private GetAttestationAtResourceResult(
        @Nullable String comments,
        @Nullable String complianceState,
        @Nullable List<AttestationEvidenceResponse> evidence,
        @Nullable String expiresOn,
        String id,
        String lastComplianceStateChangeAt,
        String name,
        @Nullable String owner,
        String policyAssignmentId,
        @Nullable String policyDefinitionReferenceId,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.comments = comments;
        this.complianceState = complianceState;
        this.evidence = evidence;
        this.expiresOn = expiresOn;
        this.id = Objects.requireNonNull(id);
        this.lastComplianceStateChangeAt = Objects.requireNonNull(lastComplianceStateChangeAt);
        this.name = Objects.requireNonNull(name);
        this.owner = owner;
        this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId);
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getComments() {
        return Optional.ofNullable(this.comments);
    }
    public Optional<String> getComplianceState() {
        return Optional.ofNullable(this.complianceState);
    }
    public List<AttestationEvidenceResponse> getEvidence() {
        return this.evidence == null ? List.of() : this.evidence;
    }
    public Optional<String> getExpiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }
    public String getId() {
        return this.id;
    }
    public String getLastComplianceStateChangeAt() {
        return this.lastComplianceStateChangeAt;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    public String getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }
    public Optional<String> getPolicyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestationAtResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comments;
        private @Nullable String complianceState;
        private @Nullable List<AttestationEvidenceResponse> evidence;
        private @Nullable String expiresOn;
        private String id;
        private String lastComplianceStateChangeAt;
        private String name;
        private @Nullable String owner;
        private String policyAssignmentId;
        private @Nullable String policyDefinitionReferenceId;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestationAtResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.complianceState = defaults.complianceState;
    	      this.evidence = defaults.evidence;
    	      this.expiresOn = defaults.expiresOn;
    	      this.id = defaults.id;
    	      this.lastComplianceStateChangeAt = defaults.lastComplianceStateChangeAt;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setComments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }

        public Builder setComplianceState(@Nullable String complianceState) {
            this.complianceState = complianceState;
            return this;
        }

        public Builder setEvidence(@Nullable List<AttestationEvidenceResponse> evidence) {
            this.evidence = evidence;
            return this;
        }

        public Builder setExpiresOn(@Nullable String expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastComplianceStateChangeAt(String lastComplianceStateChangeAt) {
            this.lastComplianceStateChangeAt = Objects.requireNonNull(lastComplianceStateChangeAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPolicyAssignmentId(String policyAssignmentId) {
            this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId);
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetAttestationAtResourceResult build() {
            return new GetAttestationAtResourceResult(comments, complianceState, evidence, expiresOn, id, lastComplianceStateChangeAt, name, owner, policyAssignmentId, policyDefinitionReferenceId, provisioningState, systemData, type);
        }
    }
}
