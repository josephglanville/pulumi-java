// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMoveResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMoveResourceArgs Empty = new GetMoveResourceArgs();

    /**
     * The Move Collection Name.
     * 
     */
    @Import(name="moveCollectionName", required=true)
      private final String moveCollectionName;

    public String getMoveCollectionName() {
        return this.moveCollectionName;
    }

    /**
     * The Move Resource Name.
     * 
     */
    @Import(name="moveResourceName", required=true)
      private final String moveResourceName;

    public String getMoveResourceName() {
        return this.moveResourceName;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetMoveResourceArgs(
        String moveCollectionName,
        String moveResourceName,
        String resourceGroupName) {
        this.moveCollectionName = Objects.requireNonNull(moveCollectionName, "expected parameter 'moveCollectionName' to be non-null");
        this.moveResourceName = Objects.requireNonNull(moveResourceName, "expected parameter 'moveResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMoveResourceArgs() {
        this.moveCollectionName = null;
        this.moveResourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMoveResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String moveCollectionName;
        private String moveResourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMoveResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moveCollectionName = defaults.moveCollectionName;
    	      this.moveResourceName = defaults.moveResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder moveCollectionName(String moveCollectionName) {
            this.moveCollectionName = Objects.requireNonNull(moveCollectionName);
            return this;
        }
        public Builder moveResourceName(String moveResourceName) {
            this.moveResourceName = Objects.requireNonNull(moveResourceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetMoveResourceArgs build() {
            return new GetMoveResourceArgs(moveCollectionName, moveResourceName, resourceGroupName);
        }
    }
}
