// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A rollout policy configuration.
 * 
 */
public final class RolloutPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RolloutPolicyResponse Empty = new RolloutPolicyResponse();

    /**
     * An optional RFC3339 timestamp on or after which the update is considered rolled out to any zone that is not explicitly stated.
     * 
     */
    @Import(name="defaultRolloutTime", required=true)
      private final String defaultRolloutTime;

    public String getDefaultRolloutTime() {
        return this.defaultRolloutTime;
    }

    /**
     * Location based rollout policies to apply to the resource. Currently only zone names are supported and must be represented as valid URLs, like: zones/us-central1-a. The value expects an RFC3339 timestamp on or after which the update is considered rolled out to the specified location.
     * 
     */
    @Import(name="locationRolloutPolicies", required=true)
      private final Map<String,String> locationRolloutPolicies;

    public Map<String,String> getLocationRolloutPolicies() {
        return this.locationRolloutPolicies;
    }

    public RolloutPolicyResponse(
        String defaultRolloutTime,
        Map<String,String> locationRolloutPolicies) {
        this.defaultRolloutTime = Objects.requireNonNull(defaultRolloutTime, "expected parameter 'defaultRolloutTime' to be non-null");
        this.locationRolloutPolicies = Objects.requireNonNull(locationRolloutPolicies, "expected parameter 'locationRolloutPolicies' to be non-null");
    }

    private RolloutPolicyResponse() {
        this.defaultRolloutTime = null;
        this.locationRolloutPolicies = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultRolloutTime;
        private Map<String,String> locationRolloutPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRolloutTime = defaults.defaultRolloutTime;
    	      this.locationRolloutPolicies = defaults.locationRolloutPolicies;
        }

        public Builder defaultRolloutTime(String defaultRolloutTime) {
            this.defaultRolloutTime = Objects.requireNonNull(defaultRolloutTime);
            return this;
        }
        public Builder locationRolloutPolicies(Map<String,String> locationRolloutPolicies) {
            this.locationRolloutPolicies = Objects.requireNonNull(locationRolloutPolicies);
            return this;
        }        public RolloutPolicyResponse build() {
            return new RolloutPolicyResponse(defaultRolloutTime, locationRolloutPolicies);
        }
    }
}
