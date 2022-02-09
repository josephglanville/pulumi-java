// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.RestorePointCollectionSourcePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestorePointCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestorePointCollectionArgs Empty = new RestorePointCollectionArgs();

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="restorePointCollectionName")
    private final @Nullable Input<String> restorePointCollectionName;

    public Input<String> getRestorePointCollectionName() {
        return this.restorePointCollectionName == null ? Input.empty() : this.restorePointCollectionName;
    }

    @InputImport(name="source")
    private final @Nullable Input<RestorePointCollectionSourcePropertiesArgs> source;

    public Input<RestorePointCollectionSourcePropertiesArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RestorePointCollectionArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> restorePointCollectionName,
        @Nullable Input<RestorePointCollectionSourcePropertiesArgs> source,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointCollectionName = restorePointCollectionName;
        this.source = source;
        this.tags = tags;
    }

    private RestorePointCollectionArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorePointCollectionName = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> restorePointCollectionName;
        private @Nullable Input<RestorePointCollectionSourcePropertiesArgs> source;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointCollectionName = defaults.restorePointCollectionName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setRestorePointCollectionName(@Nullable Input<String> restorePointCollectionName) {
            this.restorePointCollectionName = restorePointCollectionName;
            return this;
        }

        public Builder setRestorePointCollectionName(@Nullable String restorePointCollectionName) {
            this.restorePointCollectionName = Input.ofNullable(restorePointCollectionName);
            return this;
        }

        public Builder setSource(@Nullable Input<RestorePointCollectionSourcePropertiesArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable RestorePointCollectionSourcePropertiesArgs source) {
            this.source = Input.ofNullable(source);
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

        public RestorePointCollectionArgs build() {
            return new RestorePointCollectionArgs(location, resourceGroupName, restorePointCollectionName, source, tags);
        }
    }
}
