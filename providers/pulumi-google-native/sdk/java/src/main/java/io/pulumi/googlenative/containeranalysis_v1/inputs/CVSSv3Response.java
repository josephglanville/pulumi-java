// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Common Vulnerability Scoring System version 3. For details, see https://www.first.org/cvss/specification-document
 * 
 */
public final class CVSSv3Response extends io.pulumi.resources.InvokeArgs {

    public static final CVSSv3Response Empty = new CVSSv3Response();

    @Import(name="attackComplexity", required=true)
      private final String attackComplexity;

    public String getAttackComplexity() {
        return this.attackComplexity;
    }

    /**
     * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
     * 
     */
    @Import(name="attackVector", required=true)
      private final String attackVector;

    public String getAttackVector() {
        return this.attackVector;
    }

    @Import(name="availabilityImpact", required=true)
      private final String availabilityImpact;

    public String getAvailabilityImpact() {
        return this.availabilityImpact;
    }

    /**
     * The base score is a function of the base metric scores.
     * 
     */
    @Import(name="baseScore", required=true)
      private final Double baseScore;

    public Double getBaseScore() {
        return this.baseScore;
    }

    @Import(name="confidentialityImpact", required=true)
      private final String confidentialityImpact;

    public String getConfidentialityImpact() {
        return this.confidentialityImpact;
    }

    @Import(name="exploitabilityScore", required=true)
      private final Double exploitabilityScore;

    public Double getExploitabilityScore() {
        return this.exploitabilityScore;
    }

    @Import(name="impactScore", required=true)
      private final Double impactScore;

    public Double getImpactScore() {
        return this.impactScore;
    }

    @Import(name="integrityImpact", required=true)
      private final String integrityImpact;

    public String getIntegrityImpact() {
        return this.integrityImpact;
    }

    @Import(name="privilegesRequired", required=true)
      private final String privilegesRequired;

    public String getPrivilegesRequired() {
        return this.privilegesRequired;
    }

    @Import(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    @Import(name="userInteraction", required=true)
      private final String userInteraction;

    public String getUserInteraction() {
        return this.userInteraction;
    }

    public CVSSv3Response(
        String attackComplexity,
        String attackVector,
        String availabilityImpact,
        Double baseScore,
        String confidentialityImpact,
        Double exploitabilityScore,
        Double impactScore,
        String integrityImpact,
        String privilegesRequired,
        String scope,
        String userInteraction) {
        this.attackComplexity = Objects.requireNonNull(attackComplexity, "expected parameter 'attackComplexity' to be non-null");
        this.attackVector = Objects.requireNonNull(attackVector, "expected parameter 'attackVector' to be non-null");
        this.availabilityImpact = Objects.requireNonNull(availabilityImpact, "expected parameter 'availabilityImpact' to be non-null");
        this.baseScore = Objects.requireNonNull(baseScore, "expected parameter 'baseScore' to be non-null");
        this.confidentialityImpact = Objects.requireNonNull(confidentialityImpact, "expected parameter 'confidentialityImpact' to be non-null");
        this.exploitabilityScore = Objects.requireNonNull(exploitabilityScore, "expected parameter 'exploitabilityScore' to be non-null");
        this.impactScore = Objects.requireNonNull(impactScore, "expected parameter 'impactScore' to be non-null");
        this.integrityImpact = Objects.requireNonNull(integrityImpact, "expected parameter 'integrityImpact' to be non-null");
        this.privilegesRequired = Objects.requireNonNull(privilegesRequired, "expected parameter 'privilegesRequired' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.userInteraction = Objects.requireNonNull(userInteraction, "expected parameter 'userInteraction' to be non-null");
    }

    private CVSSv3Response() {
        this.attackComplexity = null;
        this.attackVector = null;
        this.availabilityImpact = null;
        this.baseScore = null;
        this.confidentialityImpact = null;
        this.exploitabilityScore = null;
        this.impactScore = null;
        this.integrityImpact = null;
        this.privilegesRequired = null;
        this.scope = null;
        this.userInteraction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CVSSv3Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attackComplexity;
        private String attackVector;
        private String availabilityImpact;
        private Double baseScore;
        private String confidentialityImpact;
        private Double exploitabilityScore;
        private Double impactScore;
        private String integrityImpact;
        private String privilegesRequired;
        private String scope;
        private String userInteraction;

        public Builder() {
    	      // Empty
        }

        public Builder(CVSSv3Response defaults) {
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

        public Builder attackComplexity(String attackComplexity) {
            this.attackComplexity = Objects.requireNonNull(attackComplexity);
            return this;
        }
        public Builder attackVector(String attackVector) {
            this.attackVector = Objects.requireNonNull(attackVector);
            return this;
        }
        public Builder availabilityImpact(String availabilityImpact) {
            this.availabilityImpact = Objects.requireNonNull(availabilityImpact);
            return this;
        }
        public Builder baseScore(Double baseScore) {
            this.baseScore = Objects.requireNonNull(baseScore);
            return this;
        }
        public Builder confidentialityImpact(String confidentialityImpact) {
            this.confidentialityImpact = Objects.requireNonNull(confidentialityImpact);
            return this;
        }
        public Builder exploitabilityScore(Double exploitabilityScore) {
            this.exploitabilityScore = Objects.requireNonNull(exploitabilityScore);
            return this;
        }
        public Builder impactScore(Double impactScore) {
            this.impactScore = Objects.requireNonNull(impactScore);
            return this;
        }
        public Builder integrityImpact(String integrityImpact) {
            this.integrityImpact = Objects.requireNonNull(integrityImpact);
            return this;
        }
        public Builder privilegesRequired(String privilegesRequired) {
            this.privilegesRequired = Objects.requireNonNull(privilegesRequired);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder userInteraction(String userInteraction) {
            this.userInteraction = Objects.requireNonNull(userInteraction);
            return this;
        }        public CVSSv3Response build() {
            return new CVSSv3Response(attackComplexity, attackVector, availabilityImpact, baseScore, confidentialityImpact, exploitabilityScore, impactScore, integrityImpact, privilegesRequired, scope, userInteraction);
        }
    }
}
