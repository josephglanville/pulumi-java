// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs Empty = new AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs();

    /**
     * The minimum allowed OS version. If not set, any version
     * of this OS satisfies the constraint.
     * Format: "major.minor.patch" such as "10.5.301", "9.2.1".
     * 
     */
    @Import(name="minimumVersion")
      private final @Nullable Output<String> minimumVersion;

    public Output<String> getMinimumVersion() {
        return this.minimumVersion == null ? Output.empty() : this.minimumVersion;
    }

    /**
     * The operating system type of the device.
     * Possible values are `OS_UNSPECIFIED`, `DESKTOP_MAC`, `DESKTOP_WINDOWS`, `DESKTOP_LINUX`, `DESKTOP_CHROME_OS`, `ANDROID`, and `IOS`.
     * 
     */
    @Import(name="osType", required=true)
      private final Output<String> osType;

    public Output<String> getOsType() {
        return this.osType;
    }

    public AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs(
        @Nullable Output<String> minimumVersion,
        Output<String> osType) {
        this.minimumVersion = minimumVersion;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
    }

    private AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs() {
        this.minimumVersion = Output.empty();
        this.osType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> minimumVersion;
        private Output<String> osType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
        }

        public Builder minimumVersion(@Nullable Output<String> minimumVersion) {
            this.minimumVersion = minimumVersion;
            return this;
        }
        public Builder minimumVersion(@Nullable String minimumVersion) {
            this.minimumVersion = Output.ofNullable(minimumVersion);
            return this;
        }
        public Builder osType(Output<String> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Output.of(Objects.requireNonNull(osType));
            return this;
        }        public AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs build() {
            return new AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs(minimumVersion, osType);
        }
    }
}
