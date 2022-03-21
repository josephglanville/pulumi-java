// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExperimentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExperimentArgs Empty = new GetExperimentArgs();

    /**
     * The Experiment identifier associated with the Experiment
     * 
     */
    @Import(name="experimentName", required=true)
      private final String experimentName;

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * The Profile identifier associated with the Tenant and Partner
     * 
     */
    @Import(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExperimentArgs(
        String experimentName,
        String profileName,
        String resourceGroupName) {
        this.experimentName = Objects.requireNonNull(experimentName, "expected parameter 'experimentName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExperimentArgs() {
        this.experimentName = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String experimentName;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.experimentName = defaults.experimentName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder experimentName(String experimentName) {
            this.experimentName = Objects.requireNonNull(experimentName);
            return this;
        }
        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetExperimentArgs build() {
            return new GetExperimentArgs(experimentName, profileName, resourceGroupName);
        }
    }
}
