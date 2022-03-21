// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.MoveResourcePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MoveResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MoveResourceArgs Empty = new MoveResourceArgs();

    /**
     * The Move Collection Name.
     * 
     */
    @Import(name="moveCollectionName", required=true)
      private final Output<String> moveCollectionName;

    public Output<String> getMoveCollectionName() {
        return this.moveCollectionName;
    }

    /**
     * The Move Resource Name.
     * 
     */
    @Import(name="moveResourceName")
      private final @Nullable Output<String> moveResourceName;

    public Output<String> getMoveResourceName() {
        return this.moveResourceName == null ? Output.empty() : this.moveResourceName;
    }

    /**
     * Defines the move resource properties.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<MoveResourcePropertiesArgs> properties;

    public Output<MoveResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public MoveResourceArgs(
        Output<String> moveCollectionName,
        @Nullable Output<String> moveResourceName,
        @Nullable Output<MoveResourcePropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.moveCollectionName = Objects.requireNonNull(moveCollectionName, "expected parameter 'moveCollectionName' to be non-null");
        this.moveResourceName = moveResourceName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private MoveResourceArgs() {
        this.moveCollectionName = Output.empty();
        this.moveResourceName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> moveCollectionName;
        private @Nullable Output<String> moveResourceName;
        private @Nullable Output<MoveResourcePropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moveCollectionName = defaults.moveCollectionName;
    	      this.moveResourceName = defaults.moveResourceName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder moveCollectionName(Output<String> moveCollectionName) {
            this.moveCollectionName = Objects.requireNonNull(moveCollectionName);
            return this;
        }
        public Builder moveCollectionName(String moveCollectionName) {
            this.moveCollectionName = Output.of(Objects.requireNonNull(moveCollectionName));
            return this;
        }
        public Builder moveResourceName(@Nullable Output<String> moveResourceName) {
            this.moveResourceName = moveResourceName;
            return this;
        }
        public Builder moveResourceName(@Nullable String moveResourceName) {
            this.moveResourceName = Output.ofNullable(moveResourceName);
            return this;
        }
        public Builder properties(@Nullable Output<MoveResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable MoveResourcePropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public MoveResourceArgs build() {
            return new MoveResourceArgs(moveCollectionName, moveResourceName, properties, resourceGroupName);
        }
    }
}
