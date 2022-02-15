// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.testbase.inputs.TestBaseAccountSKUArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TestBaseAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestBaseAccountArgs Empty = new TestBaseAccountArgs();

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

    @InputImport(name="restore")
    private final @Nullable Input<Boolean> restore;

    public Input<Boolean> getRestore() {
        return this.restore == null ? Input.empty() : this.restore;
    }

    @InputImport(name="sku", required=true)
    private final Input<TestBaseAccountSKUArgs> sku;

    public Input<TestBaseAccountSKUArgs> getSku() {
        return this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="testBaseAccountName")
    private final @Nullable Input<String> testBaseAccountName;

    public Input<String> getTestBaseAccountName() {
        return this.testBaseAccountName == null ? Input.empty() : this.testBaseAccountName;
    }

    public TestBaseAccountArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> restore,
        Input<TestBaseAccountSKUArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> testBaseAccountName) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restore = restore;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
        this.testBaseAccountName = testBaseAccountName;
    }

    private TestBaseAccountArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restore = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.testBaseAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestBaseAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> restore;
        private Input<TestBaseAccountSKUArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(TestBaseAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restore = defaults.restore;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
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

        public Builder setRestore(@Nullable Input<Boolean> restore) {
            this.restore = restore;
            return this;
        }

        public Builder setRestore(@Nullable Boolean restore) {
            this.restore = Input.ofNullable(restore);
            return this;
        }

        public Builder setSku(Input<TestBaseAccountSKUArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(TestBaseAccountSKUArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
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

        public Builder setTestBaseAccountName(@Nullable Input<String> testBaseAccountName) {
            this.testBaseAccountName = testBaseAccountName;
            return this;
        }

        public Builder setTestBaseAccountName(@Nullable String testBaseAccountName) {
            this.testBaseAccountName = Input.ofNullable(testBaseAccountName);
            return this;
        }

        public TestBaseAccountArgs build() {
            return new TestBaseAccountArgs(location, resourceGroupName, restore, sku, tags, testBaseAccountName);
        }
    }
}