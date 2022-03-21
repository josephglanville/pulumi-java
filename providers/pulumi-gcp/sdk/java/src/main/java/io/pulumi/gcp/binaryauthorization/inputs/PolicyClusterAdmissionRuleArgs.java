// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.binaryauthorization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyClusterAdmissionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyClusterAdmissionRuleArgs Empty = new PolicyClusterAdmissionRuleArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="cluster", required=true)
      private final Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster;
    }

    /**
     * The action when a pod creation is denied by the admission rule.
     * Possible values are `ENFORCED_BLOCK_AND_AUDIT_LOG` and `DRYRUN_AUDIT_LOG_ONLY`.
     * 
     */
    @Import(name="enforcementMode", required=true)
      private final Output<String> enforcementMode;

    public Output<String> getEnforcementMode() {
        return this.enforcementMode;
    }

    /**
     * How this admission rule will be evaluated.
     * Possible values are `ALWAYS_ALLOW`, `REQUIRE_ATTESTATION`, and `ALWAYS_DENY`.
     * 
     */
    @Import(name="evaluationMode", required=true)
      private final Output<String> evaluationMode;

    public Output<String> getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * The resource names of the attestors that must attest to a
     * container image. If the attestor is in a different project from the
     * policy, it should be specified in the format `projects/*{@literal /}attestors/*`.
     * Each attestor must exist before a policy can reference it. To add an
     * attestor to a policy the principal issuing the policy change
     * request must be able to read the attestor resource.
     * Note: this field must be non-empty when the evaluation_mode field
     * specifies REQUIRE_ATTESTATION, otherwise it must be empty.
     * 
     */
    @Import(name="requireAttestationsBies")
      private final @Nullable Output<List<String>> requireAttestationsBies;

    public Output<List<String>> getRequireAttestationsBies() {
        return this.requireAttestationsBies == null ? Output.empty() : this.requireAttestationsBies;
    }

    public PolicyClusterAdmissionRuleArgs(
        Output<String> cluster,
        Output<String> enforcementMode,
        Output<String> evaluationMode,
        @Nullable Output<List<String>> requireAttestationsBies) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.enforcementMode = Objects.requireNonNull(enforcementMode, "expected parameter 'enforcementMode' to be non-null");
        this.evaluationMode = Objects.requireNonNull(evaluationMode, "expected parameter 'evaluationMode' to be non-null");
        this.requireAttestationsBies = requireAttestationsBies;
    }

    private PolicyClusterAdmissionRuleArgs() {
        this.cluster = Output.empty();
        this.enforcementMode = Output.empty();
        this.evaluationMode = Output.empty();
        this.requireAttestationsBies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyClusterAdmissionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cluster;
        private Output<String> enforcementMode;
        private Output<String> evaluationMode;
        private @Nullable Output<List<String>> requireAttestationsBies;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyClusterAdmissionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.enforcementMode = defaults.enforcementMode;
    	      this.evaluationMode = defaults.evaluationMode;
    	      this.requireAttestationsBies = defaults.requireAttestationsBies;
        }

        public Builder cluster(Output<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(String cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }
        public Builder enforcementMode(Output<String> enforcementMode) {
            this.enforcementMode = Objects.requireNonNull(enforcementMode);
            return this;
        }
        public Builder enforcementMode(String enforcementMode) {
            this.enforcementMode = Output.of(Objects.requireNonNull(enforcementMode));
            return this;
        }
        public Builder evaluationMode(Output<String> evaluationMode) {
            this.evaluationMode = Objects.requireNonNull(evaluationMode);
            return this;
        }
        public Builder evaluationMode(String evaluationMode) {
            this.evaluationMode = Output.of(Objects.requireNonNull(evaluationMode));
            return this;
        }
        public Builder requireAttestationsBies(@Nullable Output<List<String>> requireAttestationsBies) {
            this.requireAttestationsBies = requireAttestationsBies;
            return this;
        }
        public Builder requireAttestationsBies(@Nullable List<String> requireAttestationsBies) {
            this.requireAttestationsBies = Output.ofNullable(requireAttestationsBies);
            return this;
        }
        public Builder requireAttestationsBies(String... requireAttestationsBies) {
            return requireAttestationsBies(List.of(requireAttestationsBies));
        }        public PolicyClusterAdmissionRuleArgs build() {
            return new PolicyClusterAdmissionRuleArgs(cluster, enforcementMode, evaluationMode, requireAttestationsBies);
        }
    }
}
