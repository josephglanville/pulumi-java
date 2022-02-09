// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.machinelearning.inputs.ResourceSkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CommitmentPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommitmentPlanArgs Empty = new CommitmentPlanArgs();

    @InputImport(name="commitmentPlanName")
    private final @Nullable Input<String> commitmentPlanName;

    public Input<String> getCommitmentPlanName() {
        return this.commitmentPlanName == null ? Input.empty() : this.commitmentPlanName;
    }

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

    @InputImport(name="sku")
    private final @Nullable Input<ResourceSkuArgs> sku;

    public Input<ResourceSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CommitmentPlanArgs(
        @Nullable Input<String> commitmentPlanName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<ResourceSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.commitmentPlanName = commitmentPlanName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private CommitmentPlanArgs() {
        this.commitmentPlanName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commitmentPlanName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<ResourceSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitmentPlanName = defaults.commitmentPlanName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setCommitmentPlanName(@Nullable Input<String> commitmentPlanName) {
            this.commitmentPlanName = commitmentPlanName;
            return this;
        }

        public Builder setCommitmentPlanName(@Nullable String commitmentPlanName) {
            this.commitmentPlanName = Input.ofNullable(commitmentPlanName);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<ResourceSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable ResourceSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public CommitmentPlanArgs build() {
            return new CommitmentPlanArgs(commitmentPlanName, location, resourceGroupName, sku, tags);
        }
    }
}
