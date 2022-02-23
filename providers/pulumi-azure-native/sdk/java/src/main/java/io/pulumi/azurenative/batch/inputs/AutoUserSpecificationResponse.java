// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoUserSpecificationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoUserSpecificationResponse Empty = new AutoUserSpecificationResponse();

    /**
     * The default value is nonAdmin.
     * 
     */
    @InputImport(name="elevationLevel")
      private final @Nullable String elevationLevel;

    public Optional<String> getElevationLevel() {
        return this.elevationLevel == null ? Optional.empty() : Optional.ofNullable(this.elevationLevel);
    }

    /**
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable String scope;

    public Optional<String> getScope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    public AutoUserSpecificationResponse(
        @Nullable String elevationLevel,
        @Nullable String scope) {
        this.elevationLevel = elevationLevel;
        this.scope = scope;
    }

    private AutoUserSpecificationResponse() {
        this.elevationLevel = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoUserSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String elevationLevel;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoUserSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.scope = defaults.scope;
        }

        public Builder setElevationLevel(@Nullable String elevationLevel) {
            this.elevationLevel = elevationLevel;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public AutoUserSpecificationResponse build() {
            return new AutoUserSpecificationResponse(elevationLevel, scope);
        }
    }
}
