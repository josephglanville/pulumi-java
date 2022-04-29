// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigConfigurationRequestQueryParam {
    /**
     * @return (Updatable) Name of the parameter.
     * 
     */
    private final @Nullable String paramName;
    /**
     * @return (Updatable) Value of the parameter.
     * 
     */
    private final @Nullable String paramValue;

    @CustomType.Constructor
    private ConfigConfigurationRequestQueryParam(
        @CustomType.Parameter("paramName") @Nullable String paramName,
        @CustomType.Parameter("paramValue") @Nullable String paramValue) {
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    /**
     * @return (Updatable) Name of the parameter.
     * 
     */
    public Optional<String> paramName() {
        return Optional.ofNullable(this.paramName);
    }
    /**
     * @return (Updatable) Value of the parameter.
     * 
     */
    public Optional<String> paramValue() {
        return Optional.ofNullable(this.paramValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigConfigurationRequestQueryParam defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String paramName;
        private @Nullable String paramValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigConfigurationRequestQueryParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paramName = defaults.paramName;
    	      this.paramValue = defaults.paramValue;
        }

        public Builder paramName(@Nullable String paramName) {
            this.paramName = paramName;
            return this;
        }
        public Builder paramValue(@Nullable String paramValue) {
            this.paramValue = paramValue;
            return this;
        }        public ConfigConfigurationRequestQueryParam build() {
            return new ConfigConfigurationRequestQueryParam(paramName, paramValue);
        }
    }
}
