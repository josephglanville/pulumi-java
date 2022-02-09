// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PropertyArgs Empty = new PropertyArgs();

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="propId")
    private final @Nullable Input<String> propId;

    public Input<String> getPropId() {
        return this.propId == null ? Input.empty() : this.propId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="secret")
    private final @Nullable Input<Boolean> secret;

    public Input<Boolean> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public PropertyArgs(
        Input<String> displayName,
        @Nullable Input<String> propId,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> secret,
        Input<String> serviceName,
        @Nullable Input<List<String>> tags,
        Input<String> value) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.propId = propId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secret = secret;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tags = tags;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private PropertyArgs() {
        this.displayName = Input.empty();
        this.propId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.secret = Input.empty();
        this.serviceName = Input.empty();
        this.tags = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<String> propId;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> secret;
        private Input<String> serviceName;
        private @Nullable Input<List<String>> tags;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(PropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.propId = defaults.propId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secret = defaults.secret;
    	      this.serviceName = defaults.serviceName;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setPropId(@Nullable Input<String> propId) {
            this.propId = propId;
            return this;
        }

        public Builder setPropId(@Nullable String propId) {
            this.propId = Input.ofNullable(propId);
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

        public Builder setSecret(@Nullable Input<Boolean> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable Boolean secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public PropertyArgs build() {
            return new PropertyArgs(displayName, propId, resourceGroupName, secret, serviceName, tags, value);
        }
    }
}
