// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppImageConfigKernelSpec {
    /**
     * The display name of the kernel.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The name of the kernel.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private AppImageConfigKernelSpec(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("name") String name) {
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * The display name of the kernel.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The name of the kernel.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public AppImageConfigKernelSpec build() {
            return new AppImageConfigKernelSpec(displayName, name);
        }
    }
}
