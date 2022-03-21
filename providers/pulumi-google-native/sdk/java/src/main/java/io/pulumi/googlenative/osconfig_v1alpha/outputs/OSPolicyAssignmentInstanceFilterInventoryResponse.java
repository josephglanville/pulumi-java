// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OSPolicyAssignmentInstanceFilterInventoryResponse {
    /**
     * The OS short name
     * 
     */
    private final String osShortName;
    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
     */
    private final String osVersion;

    @CustomType.Constructor
    private OSPolicyAssignmentInstanceFilterInventoryResponse(
        @CustomType.Parameter("osShortName") String osShortName,
        @CustomType.Parameter("osVersion") String osVersion) {
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    /**
     * The OS short name
     * 
    */
    public String getOsShortName() {
        return this.osShortName;
    }
    /**
     * The OS version Prefix matches are supported if asterisk(*) is provided as the last character. For example, to match all versions with a major version of `7`, specify the following value for this field `7.*` An empty string matches all OS versions.
     * 
    */
    public String getOsVersion() {
        return this.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentInstanceFilterInventoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osShortName;
        private String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentInstanceFilterInventoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder osShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }
        public Builder osVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }        public OSPolicyAssignmentInstanceFilterInventoryResponse build() {
            return new OSPolicyAssignmentInstanceFilterInventoryResponse(osShortName, osVersion);
        }
    }
}
