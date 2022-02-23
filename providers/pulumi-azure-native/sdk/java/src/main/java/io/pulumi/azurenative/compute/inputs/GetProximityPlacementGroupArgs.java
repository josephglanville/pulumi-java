// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProximityPlacementGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProximityPlacementGroupArgs Empty = new GetProximityPlacementGroupArgs();

    /**
     * includeColocationStatus=true enables fetching the colocation status of all the resources in the proximity placement group.
     * 
     */
    @InputImport(name="includeColocationStatus")
      private final @Nullable String includeColocationStatus;

    public Optional<String> getIncludeColocationStatus() {
        return this.includeColocationStatus == null ? Optional.empty() : Optional.ofNullable(this.includeColocationStatus);
    }

    /**
     * The name of the proximity placement group.
     * 
     */
    @InputImport(name="proximityPlacementGroupName", required=true)
      private final String proximityPlacementGroupName;

    public String getProximityPlacementGroupName() {
        return this.proximityPlacementGroupName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetProximityPlacementGroupArgs(
        @Nullable String includeColocationStatus,
        String proximityPlacementGroupName,
        String resourceGroupName) {
        this.includeColocationStatus = includeColocationStatus;
        this.proximityPlacementGroupName = Objects.requireNonNull(proximityPlacementGroupName, "expected parameter 'proximityPlacementGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetProximityPlacementGroupArgs() {
        this.includeColocationStatus = null;
        this.proximityPlacementGroupName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProximityPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String includeColocationStatus;
        private String proximityPlacementGroupName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProximityPlacementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeColocationStatus = defaults.includeColocationStatus;
    	      this.proximityPlacementGroupName = defaults.proximityPlacementGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setIncludeColocationStatus(@Nullable String includeColocationStatus) {
            this.includeColocationStatus = includeColocationStatus;
            return this;
        }

        public Builder setProximityPlacementGroupName(String proximityPlacementGroupName) {
            this.proximityPlacementGroupName = Objects.requireNonNull(proximityPlacementGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetProximityPlacementGroupArgs build() {
            return new GetProximityPlacementGroupArgs(includeColocationStatus, proximityPlacementGroupName, resourceGroupName);
        }
    }
}
