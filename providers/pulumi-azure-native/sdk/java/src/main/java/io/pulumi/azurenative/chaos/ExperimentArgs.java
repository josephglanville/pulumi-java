// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos;

import io.pulumi.azurenative.chaos.inputs.ExperimentPropertiesArgs;
import io.pulumi.azurenative.chaos.inputs.ResourceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExperimentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    /**
     * String that represents a Experiment resource name.
     * 
     */
    @InputImport(name="experimentName")
      private final @Nullable Input<String> experimentName;

    public Input<String> getExperimentName() {
        return this.experimentName == null ? Input.empty() : this.experimentName;
    }

    /**
     * The identity of the experiment resource.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<ResourceIdentityArgs> identity;

    public Input<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The properties of the experiment resource.
     * 
     */
    @InputImport(name="properties", required=true)
      private final Input<ExperimentPropertiesArgs> properties;

    public Input<ExperimentPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ExperimentArgs(
        @Nullable Input<String> experimentName,
        @Nullable Input<ResourceIdentityArgs> identity,
        @Nullable Input<String> location,
        Input<ExperimentPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.experimentName = experimentName;
        this.identity = identity;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ExperimentArgs() {
        this.experimentName = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> experimentName;
        private @Nullable Input<ResourceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private Input<ExperimentPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setExperimentName(@Nullable Input<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }

        public Builder setExperimentName(@Nullable String experimentName) {
            this.experimentName = Input.ofNullable(experimentName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(Input<ExperimentPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(ExperimentPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ExperimentArgs build() {
            return new ExperimentArgs(experimentName, identity, location, properties, resourceGroupName, tags);
        }
    }
}
