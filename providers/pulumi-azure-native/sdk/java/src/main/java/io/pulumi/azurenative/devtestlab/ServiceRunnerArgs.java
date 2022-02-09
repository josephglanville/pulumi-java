// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.IdentityPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceRunnerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceRunnerArgs Empty = new ServiceRunnerArgs();

    @InputImport(name="identity")
    private final @Nullable Input<IdentityPropertiesArgs> identity;

    public Input<IdentityPropertiesArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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

    public ServiceRunnerArgs(
        @Nullable Input<IdentityPropertiesArgs> identity,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.identity = identity;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ServiceRunnerArgs() {
        this.identity = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRunnerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IdentityPropertiesArgs> identity;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRunnerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setIdentity(@Nullable Input<IdentityPropertiesArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public ServiceRunnerArgs build() {
            return new ServiceRunnerArgs(identity, labName, location, name, resourceGroupName, tags);
        }
    }
}
