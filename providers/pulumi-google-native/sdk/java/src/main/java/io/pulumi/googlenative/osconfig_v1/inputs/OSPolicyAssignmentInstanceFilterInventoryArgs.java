// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VM inventory details.
 * 
 */
public final class OSPolicyAssignmentInstanceFilterInventoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyAssignmentInstanceFilterInventoryArgs Empty = new OSPolicyAssignmentInstanceFilterInventoryArgs();

    /**
     * The OS short name
     * 
     */
    @Import(name="osShortName", required=true)
      private final Output<String> osShortName;

    public Output<String> getOsShortName() {
        return this.osShortName;
    }

    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    @Import(name="osVersion")
      private final @Nullable Output<String> osVersion;

    public Output<String> getOsVersion() {
        return this.osVersion == null ? Output.empty() : this.osVersion;
    }

    public OSPolicyAssignmentInstanceFilterInventoryArgs(
        Output<String> osShortName,
        @Nullable Output<String> osVersion) {
        this.osShortName = Objects.requireNonNull(osShortName, "expected parameter 'osShortName' to be non-null");
        this.osVersion = osVersion;
    }

    private OSPolicyAssignmentInstanceFilterInventoryArgs() {
        this.osShortName = Output.empty();
        this.osVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentInstanceFilterInventoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> osShortName;
        private @Nullable Output<String> osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentInstanceFilterInventoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osShortName(Output<String> osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }
        public Builder osShortName(String osShortName) {
            this.osShortName = Output.of(Objects.requireNonNull(osShortName));
            return this;
        }
        public Builder osVersion(@Nullable Output<String> osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = Output.ofNullable(osVersion);
            return this;
        }        public OSPolicyAssignmentInstanceFilterInventoryArgs build() {
            return new OSPolicyAssignmentInstanceFilterInventoryArgs(osShortName, osVersion);
        }
    }
}
