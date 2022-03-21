// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAttackComplexity;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAttackVector;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAuthentication;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSAvailabilityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSConfidentialityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSIntegrityImpact;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSPrivilegesRequired;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSScope;
import io.pulumi.googlenative.containeranalysis_v1.enums.CVSSUserInteraction;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common Vulnerability Scoring System. For details, see https://www.first.org/cvss/specification-document This is a message we will try to use for storing multiple versions of CVSS. The intention is that as new versions of CVSS scores get added, we will be able to modify this message rather than adding new protos for each new version of the score.
 * 
 */
public final class CVSSArgs extends io.pulumi.resources.ResourceArgs {

    public static final CVSSArgs Empty = new CVSSArgs();

    @Import(name="attackComplexity")
      private final @Nullable Output<CVSSAttackComplexity> attackComplexity;

    public Output<CVSSAttackComplexity> getAttackComplexity() {
        return this.attackComplexity == null ? Output.empty() : this.attackComplexity;
    }

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    @Import(name="attackVector")
      private final @Nullable Output<CVSSAttackVector> attackVector;

    public Output<CVSSAttackVector> getAttackVector() {
        return this.attackVector == null ? Output.empty() : this.attackVector;
    }

    @Import(name="authentication")
      private final @Nullable Output<CVSSAuthentication> authentication;

    public Output<CVSSAuthentication> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    @Import(name="availabilityImpact")
      private final @Nullable Output<CVSSAvailabilityImpact> availabilityImpact;

    public Output<CVSSAvailabilityImpact> getAvailabilityImpact() {
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
      private final @Nullable Output<CVSSConfidentialityImpact> confidentialityImpact;

    public Output<CVSSConfidentialityImpact> getConfidentialityImpact() {
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
      private final @Nullable Output<CVSSIntegrityImpact> integrityImpact;

    public Output<CVSSIntegrityImpact> getIntegrityImpact() {
        return this.integrityImpact == null ? Output.empty() : this.integrityImpact;
    }

    @Import(name="privilegesRequired")
      private final @Nullable Output<CVSSPrivilegesRequired> privilegesRequired;

    public Output<CVSSPrivilegesRequired> getPrivilegesRequired() {
        return this.privilegesRequired == null ? Output.empty() : this.privilegesRequired;
    }

    @Import(name="scope")
      private final @Nullable Output<CVSSScope> scope;

    public Output<CVSSScope> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    @Import(name="userInteraction")
      private final @Nullable Output<CVSSUserInteraction> userInteraction;

    public Output<CVSSUserInteraction> getUserInteraction() {
        return this.userInteraction == null ? Output.empty() : this.userInteraction;
    }

    public CVSSArgs(
        @Nullable Output<CVSSAttackComplexity> attackComplexity,
        @Nullable Output<CVSSAttackVector> attackVector,
        @Nullable Output<CVSSAuthentication> authentication,
        @Nullable Output<CVSSAvailabilityImpact> availabilityImpact,
        @Nullable Output<Double> baseScore,
        @Nullable Output<CVSSConfidentialityImpact> confidentialityImpact,
        @Nullable Output<Double> exploitabilityScore,
        @Nullable Output<Double> impactScore,
        @Nullable Output<CVSSIntegrityImpact> integrityImpact,
        @Nullable Output<CVSSPrivilegesRequired> privilegesRequired,
        @Nullable Output<CVSSScope> scope,
        @Nullable Output<CVSSUserInteraction> userInteraction) {
        this.attackComplexity = attackComplexity;
        this.attackVector = attackVector;
        this.authentication = authentication;
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

    private CVSSArgs() {
        this.attackComplexity = Output.empty();
        this.attackVector = Output.empty();
        this.authentication = Output.empty();
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

    public static Builder builder(CVSSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CVSSAttackComplexity> attackComplexity;
        private @Nullable Output<CVSSAttackVector> attackVector;
        private @Nullable Output<CVSSAuthentication> authentication;
        private @Nullable Output<CVSSAvailabilityImpact> availabilityImpact;
        private @Nullable Output<Double> baseScore;
        private @Nullable Output<CVSSConfidentialityImpact> confidentialityImpact;
        private @Nullable Output<Double> exploitabilityScore;
        private @Nullable Output<Double> impactScore;
        private @Nullable Output<CVSSIntegrityImpact> integrityImpact;
        private @Nullable Output<CVSSPrivilegesRequired> privilegesRequired;
        private @Nullable Output<CVSSScope> scope;
        private @Nullable Output<CVSSUserInteraction> userInteraction;

        public Builder() {
    	      // Empty
        }

        public Builder(CVSSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attackComplexity = defaults.attackComplexity;
    	      this.attackVector = defaults.attackVector;
    	      this.authentication = defaults.authentication;
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

        public Builder attackComplexity(@Nullable Output<CVSSAttackComplexity> attackComplexity) {
            this.attackComplexity = attackComplexity;
            return this;
        }
        public Builder attackComplexity(@Nullable CVSSAttackComplexity attackComplexity) {
            this.attackComplexity = Output.ofNullable(attackComplexity);
            return this;
        }
        public Builder attackVector(@Nullable Output<CVSSAttackVector> attackVector) {
            this.attackVector = attackVector;
            return this;
        }
        public Builder attackVector(@Nullable CVSSAttackVector attackVector) {
            this.attackVector = Output.ofNullable(attackVector);
            return this;
        }
        public Builder authentication(@Nullable Output<CVSSAuthentication> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable CVSSAuthentication authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }
        public Builder availabilityImpact(@Nullable Output<CVSSAvailabilityImpact> availabilityImpact) {
            this.availabilityImpact = availabilityImpact;
            return this;
        }
        public Builder availabilityImpact(@Nullable CVSSAvailabilityImpact availabilityImpact) {
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
        public Builder confidentialityImpact(@Nullable Output<CVSSConfidentialityImpact> confidentialityImpact) {
            this.confidentialityImpact = confidentialityImpact;
            return this;
        }
        public Builder confidentialityImpact(@Nullable CVSSConfidentialityImpact confidentialityImpact) {
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
        public Builder integrityImpact(@Nullable Output<CVSSIntegrityImpact> integrityImpact) {
            this.integrityImpact = integrityImpact;
            return this;
        }
        public Builder integrityImpact(@Nullable CVSSIntegrityImpact integrityImpact) {
            this.integrityImpact = Output.ofNullable(integrityImpact);
            return this;
        }
        public Builder privilegesRequired(@Nullable Output<CVSSPrivilegesRequired> privilegesRequired) {
            this.privilegesRequired = privilegesRequired;
            return this;
        }
        public Builder privilegesRequired(@Nullable CVSSPrivilegesRequired privilegesRequired) {
            this.privilegesRequired = Output.ofNullable(privilegesRequired);
            return this;
        }
        public Builder scope(@Nullable Output<CVSSScope> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable CVSSScope scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }
        public Builder userInteraction(@Nullable Output<CVSSUserInteraction> userInteraction) {
            this.userInteraction = userInteraction;
            return this;
        }
        public Builder userInteraction(@Nullable CVSSUserInteraction userInteraction) {
            this.userInteraction = Output.ofNullable(userInteraction);
            return this;
        }        public CVSSArgs build() {
            return new CVSSArgs(attackComplexity, attackVector, authentication, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
        }
    }
}
