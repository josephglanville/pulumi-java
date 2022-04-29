// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UsageItemTag {
    /**
     * @return The tag key.
     * 
     */
    private final @Nullable String key;
    /**
     * @return The tag namespace.
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return The tag value.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private UsageItemTag(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.namespace = namespace;
        this.value = value;
    }

    /**
     * @return The tag key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return The tag namespace.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return The tag value.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsageItemTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String namespace;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(UsageItemTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.namespace = defaults.namespace;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public UsageItemTag build() {
            return new UsageItemTag(key, namespace, value);
        }
    }
}
