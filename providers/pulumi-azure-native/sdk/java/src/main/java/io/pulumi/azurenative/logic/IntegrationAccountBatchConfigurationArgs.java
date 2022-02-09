// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.logic.inputs.BatchConfigurationPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationAccountBatchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountBatchConfigurationArgs Empty = new IntegrationAccountBatchConfigurationArgs();

    @InputImport(name="batchConfigurationName")
    private final @Nullable Input<String> batchConfigurationName;

    public Input<String> getBatchConfigurationName() {
        return this.batchConfigurationName == null ? Input.empty() : this.batchConfigurationName;
    }

    @InputImport(name="integrationAccountName", required=true)
    private final Input<String> integrationAccountName;

    public Input<String> getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties", required=true)
    private final Input<BatchConfigurationPropertiesArgs> properties;

    public Input<BatchConfigurationPropertiesArgs> getProperties() {
        return this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IntegrationAccountBatchConfigurationArgs(
        @Nullable Input<String> batchConfigurationName,
        Input<String> integrationAccountName,
        @Nullable Input<String> location,
        Input<BatchConfigurationPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.batchConfigurationName = batchConfigurationName;
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private IntegrationAccountBatchConfigurationArgs() {
        this.batchConfigurationName = Input.empty();
        this.integrationAccountName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountBatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> batchConfigurationName;
        private Input<String> integrationAccountName;
        private @Nullable Input<String> location;
        private Input<BatchConfigurationPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountBatchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchConfigurationName = defaults.batchConfigurationName;
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setBatchConfigurationName(@Nullable Input<String> batchConfigurationName) {
            this.batchConfigurationName = batchConfigurationName;
            return this;
        }

        public Builder setBatchConfigurationName(@Nullable String batchConfigurationName) {
            this.batchConfigurationName = Input.ofNullable(batchConfigurationName);
            return this;
        }

        public Builder setIntegrationAccountName(Input<String> integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Input.of(Objects.requireNonNull(integrationAccountName));
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

        public Builder setProperties(Input<BatchConfigurationPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(BatchConfigurationPropertiesArgs properties) {
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

        public IntegrationAccountBatchConfigurationArgs build() {
            return new IntegrationAccountBatchConfigurationArgs(batchConfigurationName, integrationAccountName, location, properties, resourceGroupName, tags);
        }
    }
}
