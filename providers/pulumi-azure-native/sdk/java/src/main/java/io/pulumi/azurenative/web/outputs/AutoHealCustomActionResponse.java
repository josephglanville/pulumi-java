// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoHealCustomActionResponse {
    /**
     * Executable to be run.
     * 
     */
    private final @Nullable String exe;
    /**
     * Parameters for the executable.
     * 
     */
    private final @Nullable String parameters;

    @CustomType.Constructor
    private AutoHealCustomActionResponse(
        @CustomType.Parameter("exe") @Nullable String exe,
        @CustomType.Parameter("parameters") @Nullable String parameters) {
        this.exe = exe;
        this.parameters = parameters;
    }

    /**
     * Executable to be run.
     * 
    */
    public Optional<String> getExe() {
        return Optional.ofNullable(this.exe);
    }
    /**
     * Parameters for the executable.
     * 
    */
    public Optional<String> getParameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealCustomActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exe;
        private @Nullable String parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoHealCustomActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exe = defaults.exe;
    	      this.parameters = defaults.parameters;
        }

        public Builder exe(@Nullable String exe) {
            this.exe = exe;
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }        public AutoHealCustomActionResponse build() {
            return new AutoHealCustomActionResponse(exe, parameters);
        }
    }
}
