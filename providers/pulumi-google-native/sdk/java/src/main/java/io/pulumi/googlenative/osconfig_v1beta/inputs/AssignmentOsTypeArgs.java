// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the criteria for selecting VM Instances by OS type.
 * 
 */
public final class AssignmentOsTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentOsTypeArgs Empty = new AssignmentOsTypeArgs();

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    @Import(name="osArchitecture")
      private final @Nullable Output<String> osArchitecture;

    public Output<String> getOsArchitecture() {
        return this.osArchitecture == null ? Codegen.empty() : this.osArchitecture;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    @Import(name="osShortName")
      private final @Nullable Output<String> osShortName;

    public Output<String> getOsShortName() {
        return this.osShortName == null ? Codegen.empty() : this.osShortName;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    @Import(name="osVersion")
      private final @Nullable Output<String> osVersion;

    public Output<String> getOsVersion() {
        return this.osVersion == null ? Codegen.empty() : this.osVersion;
    }

    public AssignmentOsTypeArgs(
        @Nullable Output<String> osArchitecture,
        @Nullable Output<String> osShortName,
        @Nullable Output<String> osVersion) {
        this.osArchitecture = osArchitecture;
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    private AssignmentOsTypeArgs() {
        this.osArchitecture = Codegen.empty();
        this.osShortName = Codegen.empty();
        this.osVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentOsTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> osArchitecture;
        private @Nullable Output<String> osShortName;
        private @Nullable Output<String> osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentOsTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osArchitecture = defaults.osArchitecture;
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osArchitecture(@Nullable Output<String> osArchitecture) {
            this.osArchitecture = osArchitecture;
            return this;
        }
        public Builder osArchitecture(@Nullable String osArchitecture) {
            this.osArchitecture = Codegen.ofNullable(osArchitecture);
            return this;
        }
        public Builder osShortName(@Nullable Output<String> osShortName) {
            this.osShortName = osShortName;
            return this;
        }
        public Builder osShortName(@Nullable String osShortName) {
            this.osShortName = Codegen.ofNullable(osShortName);
            return this;
        }
        public Builder osVersion(@Nullable Output<String> osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = Codegen.ofNullable(osVersion);
            return this;
        }        public AssignmentOsTypeArgs build() {
            return new AssignmentOsTypeArgs(osArchitecture, osShortName, osVersion);
        }
    }
}
