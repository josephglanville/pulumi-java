// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3AttackComplexity;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3AttackVector;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3AvailabilityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3ConfidentialityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3IntegrityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3PrivilegesRequired;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3Scope;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSv3UserInteraction;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common Vulnerability Scoring System version 3. For details, see https://www.first.org/cvss/specification-document
 * 
 */
public final class CVSSv3Args extends io.pulumi.resources.ResourceArgs {

    public static final CVSSv3Args Empty = new CVSSv3Args();

    @Import(name="attackComplexity")
      private final @Nullable Output<CVSSv3AttackComplexity> attackComplexity;

    public Output<CVSSv3AttackComplexity> getAttackComplexity() {
        return this.attackComplexity == null ? Output.empty() : this.attackComplexity;
    }

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    @Import(name="attackVector")
      private final @Nullable Output<CVSSv3AttackVector> attackVector;

    public Output<CVSSv3AttackVector> getAttackVector() {
        return this.attackVector == null ? Output.empty() : this.attackVector;
    }

    @Import(name="availabilityImpact")
      private final @Nullable Output<CVSSv3AvailabilityImpact> availabilityImpact;

    public Output<CVSSv3AvailabilityImpact> getAvailabilityImpact() {
        return this.availabilityImpact == null ? Output.empty() : this.availabilityImpact;
    }

    /**
     * The base score is a function of the base metric scores.
     * 
     */
    @Import(name="baseScore")
      private final @Nullable Output<Double> baseScore;

    public Output<Double> getBaseScore() {
        return this.baseScore == null ? Output.empty() : this.baseScore;
    }

    @Import(name="confidentialityImpact")
      private final @Nullable Output<CVSSv3ConfidentialityImpact> confidentialityImpact;

    public Output<CVSSv3ConfidentialityImpact> getConfidentialityImpact() {
        return this.confidentialityImpact == null ? Output.empty() : this.confidentialityImpact;
    }

    @Import(name="exploitabilityScore")
      private final @Nullable Output<Double> exploitabilityScore;

    public Output<Double> getExploitabilityScore() {
        return this.exploitabilityScore == null ? Output.empty() : this.exploitabilityScore;
    }

    @Import(name="impactScore")
      private final @Nullable Output<Double> impactScore;

    public Output<Double> getImpactScore() {
        return this.impactScore == null ? Output.empty() : this.impactScore;
    }

    @Import(name="integrityImpact")
      private final @Nullable Output<CVSSv3IntegrityImpact> integrityImpact;

    public Output<CVSSv3IntegrityImpact> getIntegrityImpact() {
        return this.integrityImpact == null ? Output.empty() : this.integrityImpact;
    }

    @Import(name="privilegesRequired")
      private final @Nullable Output<CVSSv3PrivilegesRequired> privilegesRequired;

    public Output<CVSSv3PrivilegesRequired> getPrivilegesRequired() {
        return this.privilegesRequired == null ? Output.empty() : this.privilegesRequired;
    }

    @Import(name="scope")
      private final @Nullable Output<CVSSv3Scope> scope;

    public Output<CVSSv3Scope> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    @Import(name="userInteraction")
      private final @Nullable Output<CVSSv3UserInteraction> userInteraction;

    public Output<CVSSv3UserInteraction> getUserInteraction() {
        return this.userInteraction == null ? Output.empty() : this.userInteraction;
    }

    public CVSSv3Args(
        @Nullable Output<CVSSv3AttackComplexity> attackComplexity,
        @Nullable Output<CVSSv3AttackVector> attackVector,
        @Nullable Output<CVSSv3AvailabilityImpact> availabilityImpact,
        @Nullable Output<Double> baseScore,
        @Nullable Output<CVSSv3ConfidentialityImpact> confidentialityImpact,
        @Nullable Output<Double> exploitabilityScore,
        @Nullable Output<Double> impactScore,
        @Nullable Output<CVSSv3IntegrityImpact> integrityImpact,
        @Nullable Output<CVSSv3PrivilegesRequired> privilegesRequired,
        @Nullable Output<CVSSv3Scope> scope,
        @Nullable Output<CVSSv3UserInteraction> userInteraction) {
        this.attackComplexity = attackComplexity;
        this.attackVector = attackVector;
        this.availabilityImpact = availabilityImpact;
        this.baseScore = baseScore;
        this.confidentialityImpact = confidentialityImpact;
        this.exploitabilityScore = exploitabilityScore;
        this.impactScore = impactScore;
        this.integrityImpact = integrityImpact;
        this.privilegesRequired = privilegesRequired;
        this.scope = scope;
        this.userInteraction = userInteraction;
    }

    private CVSSv3Args() {
        this.attackComplexity = Output.empty();
        this.attackVector = Output.empty();
        this.availabilityImpact = Output.empty();
        this.baseScore = Output.empty();
        this.confidentialityImpact = Output.empty();
        this.exploitabilityScore = Output.empty();
        this.impactScore = Output.empty();
        this.integrityImpact = Output.empty();
        this.privilegesRequired = Output.empty();
        this.scope = Output.empty();
        this.userInteraction = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CVSSv3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CVSSv3AttackComplexity> attackComplexity;
        private @Nullable Output<CVSSv3AttackVector> attackVector;
        private @Nullable Output<CVSSv3AvailabilityImpact> availabilityImpact;
        private @Nullable Output<Double> baseScore;
        private @Nullable Output<CVSSv3ConfidentialityImpact> confidentialityImpact;
        private @Nullable Output<Double> exploitabilityScore;
        private @Nullable Output<Double> impactScore;
        private @Nullable Output<CVSSv3IntegrityImpact> integrityImpact;
        private @Nullable Output<CVSSv3PrivilegesRequired> privilegesRequired;
        private @Nullable Output<CVSSv3Scope> scope;
        private @Nullable Output<CVSSv3UserInteraction> userInteraction;

        public Builder() {
    	      // Empty
        }

        public Builder(CVSSv3Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attackComplexity = defaults.attackComplexity;
    	      this.attackVector = defaults.attackVector;
    	      this.availabilityImpact = defaults.availabilityImpact;
    	      this.baseScore = defaults.baseScore;
    	      this.confidentialityImpact = defaults.confidentialityImpact;
    	      this.exploitabilityScore = defaults.exploitabilityScore;
    	      this.impactScore = defaults.impactScore;
    	      this.integrityImpact = defaults.integrityImpact;
    	      this.privilegesRequired = defaults.privilegesRequired;
    	      this.scope = defaults.scope;
    	      this.userInteraction = defaults.userInteraction;
        }

        public Builder attackComplexity(@Nullable Output<CVSSv3AttackComplexity> attackComplexity) {
            this.attackComplexity = attackComplexity;
            return this;
        }
        public Builder attackComplexity(@Nullable CVSSv3AttackComplexity attackComplexity) {
            this.attackComplexity = Output.ofNullable(attackComplexity);
            return this;
        }
        public Builder attackVector(@Nullable Output<CVSSv3AttackVector> attackVector) {
            this.attackVector = attackVector;
            return this;
        }
        public Builder attackVector(@Nullable CVSSv3AttackVector attackVector) {
            this.attackVector = Output.ofNullable(attackVector);
            return this;
        }
        public Builder availabilityImpact(@Nullable Output<CVSSv3AvailabilityImpact> availabilityImpact) {
            this.availabilityImpact = availabilityImpact;
            return this;
        }
        public Builder availabilityImpact(@Nullable CVSSv3AvailabilityImpact availabilityImpact) {
            this.availabilityImpact = Output.ofNullable(availabilityImpact);
            return this;
        }
        public Builder baseScore(@Nullable Output<Double> baseScore) {
            this.baseScore = baseScore;
            return this;
        }
        public Builder baseScore(@Nullable Double baseScore) {
            this.baseScore = Output.ofNullable(baseScore);
            return this;
        }
        public Builder confidentialityImpact(@Nullable Output<CVSSv3ConfidentialityImpact> confidentialityImpact) {
            this.confidentialityImpact = confidentialityImpact;
            return this;
        }
        public Builder confidentialityImpact(@Nullable CVSSv3ConfidentialityImpact confidentialityImpact) {
            this.confidentialityImpact = Output.ofNullable(confidentialityImpact);
            return this;
        }
        public Builder exploitabilityScore(@Nullable Output<Double> exploitabilityScore) {
            this.exploitabilityScore = exploitabilityScore;
            return this;
        }
        public Builder exploitabilityScore(@Nullable Double exploitabilityScore) {
            this.exploitabilityScore = Output.ofNullable(exploitabilityScore);
            return this;
        }
        public Builder impactScore(@Nullable Output<Double> impactScore) {
            this.impactScore = impactScore;
            return this;
        }
        public Builder impactScore(@Nullable Double impactScore) {
            this.impactScore = Output.ofNullable(impactScore);
            return this;
        }
        public Builder integrityImpact(@Nullable Output<CVSSv3IntegrityImpact> integrityImpact) {
            this.integrityImpact = integrityImpact;
            return this;
        }
        public Builder integrityImpact(@Nullable CVSSv3IntegrityImpact integrityImpact) {
            this.integrityImpact = Output.ofNullable(integrityImpact);
            return this;
        }
        public Builder privilegesRequired(@Nullable Output<CVSSv3PrivilegesRequired> privilegesRequired) {
            this.privilegesRequired = privilegesRequired;
            return this;
        }
        public Builder privilegesRequired(@Nullable CVSSv3PrivilegesRequired privilegesRequired) {
            this.privilegesRequired = Output.ofNullable(privilegesRequired);
            return this;
        }
        public Builder scope(@Nullable Output<CVSSv3Scope> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable CVSSv3Scope scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }
        public Builder userInteraction(@Nullable Output<CVSSv3UserInteraction> userInteraction) {
            this.userInteraction = userInteraction;
            return this;
        }
        public Builder userInteraction(@Nullable CVSSv3UserInteraction userInteraction) {
            this.userInteraction = Output.ofNullable(userInteraction);
            return this;
        }        public CVSSv3Args build() {
            return new CVSSv3Args(attackComplexity, attackVector, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
        }
    }
}
