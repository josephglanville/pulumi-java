// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrefixArgs Empty = new PrefixArgs();

    @InputImport(name="peeringServiceName", required=true)
    private final Input<String> peeringServiceName;

    public Input<String> getPeeringServiceName() {
        return this.peeringServiceName;
    }

    @InputImport(name="peeringServicePrefixKey")
    private final @Nullable Input<String> peeringServicePrefixKey;

    public Input<String> getPeeringServicePrefixKey() {
        return this.peeringServicePrefixKey == null ? Input.empty() : this.peeringServicePrefixKey;
    }

    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    @InputImport(name="prefixName")
    private final @Nullable Input<String> prefixName;

    public Input<String> getPrefixName() {
        return this.prefixName == null ? Input.empty() : this.prefixName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrefixArgs(
        Input<String> peeringServiceName,
        @Nullable Input<String> peeringServicePrefixKey,
        @Nullable Input<String> prefix,
        @Nullable Input<String> prefixName,
        Input<String> resourceGroupName) {
        this.peeringServiceName = Objects.requireNonNull(peeringServiceName, "expected parameter 'peeringServiceName' to be non-null");
        this.peeringServicePrefixKey = peeringServicePrefixKey;
        this.prefix = prefix;
        this.prefixName = prefixName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrefixArgs() {
        this.peeringServiceName = Input.empty();
        this.peeringServicePrefixKey = Input.empty();
        this.prefix = Input.empty();
        this.prefixName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> peeringServiceName;
        private @Nullable Input<String> peeringServicePrefixKey;
        private @Nullable Input<String> prefix;
        private @Nullable Input<String> prefixName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringServiceName = defaults.peeringServiceName;
    	      this.peeringServicePrefixKey = defaults.peeringServicePrefixKey;
    	      this.prefix = defaults.prefix;
    	      this.prefixName = defaults.prefixName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPeeringServiceName(Input<String> peeringServiceName) {
            this.peeringServiceName = Objects.requireNonNull(peeringServiceName);
            return this;
        }

        public Builder setPeeringServiceName(String peeringServiceName) {
            this.peeringServiceName = Input.of(Objects.requireNonNull(peeringServiceName));
            return this;
        }

        public Builder setPeeringServicePrefixKey(@Nullable Input<String> peeringServicePrefixKey) {
            this.peeringServicePrefixKey = peeringServicePrefixKey;
            return this;
        }

        public Builder setPeeringServicePrefixKey(@Nullable String peeringServicePrefixKey) {
            this.peeringServicePrefixKey = Input.ofNullable(peeringServicePrefixKey);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setPrefixName(@Nullable Input<String> prefixName) {
            this.prefixName = prefixName;
            return this;
        }

        public Builder setPrefixName(@Nullable String prefixName) {
            this.prefixName = Input.ofNullable(prefixName);
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

        public PrefixArgs build() {
            return new PrefixArgs(peeringServiceName, peeringServicePrefixKey, prefix, prefixName, resourceGroupName);
        }
    }
}
