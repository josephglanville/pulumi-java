// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A restriction on the OS type and version of devices making requests.
 * 
 */
public final class OsConstraintResponse extends io.pulumi.resources.InvokeArgs {

    public static final OsConstraintResponse Empty = new OsConstraintResponse();

    /**
     * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
     * 
     */
    @Import(name="minimumVersion", required=true)
      private final String minimumVersion;

    public String getMinimumVersion() {
        return this.minimumVersion;
    }

    /**
     * The allowed OS type.
     * 
     */
    @Import(name="osType", required=true)
      private final String osType;

    public String getOsType() {
        return this.osType;
    }

    /**
     * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
     * 
     */
    @Import(name="requireVerifiedChromeOs", required=true)
      private final Boolean requireVerifiedChromeOs;

    public Boolean getRequireVerifiedChromeOs() {
        return this.requireVerifiedChromeOs;
    }

    public OsConstraintResponse(
        String minimumVersion,
        String osType,
        Boolean requireVerifiedChromeOs) {
        this.minimumVersion = Objects.requireNonNull(minimumVersion, "expected parameter 'minimumVersion' to be non-null");
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs, "expected parameter 'requireVerifiedChromeOs' to be non-null");
    }

    private OsConstraintResponse() {
        this.minimumVersion = null;
        this.osType = null;
        this.requireVerifiedChromeOs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minimumVersion;
        private String osType;
        private Boolean requireVerifiedChromeOs;

        public Builder() {
    	      // Empty
        }

        public Builder(OsConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumVersion = defaults.minimumVersion;
    	      this.osType = defaults.osType;
    	      this.requireVerifiedChromeOs = defaults.requireVerifiedChromeOs;
        }

        public Builder minimumVersion(String minimumVersion) {
            this.minimumVersion = Objects.requireNonNull(minimumVersion);
            return this;
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder requireVerifiedChromeOs(Boolean requireVerifiedChromeOs) {
            this.requireVerifiedChromeOs = Objects.requireNonNull(requireVerifiedChromeOs);
            return this;
        }        public OsConstraintResponse build() {
            return new OsConstraintResponse(minimumVersion, osType, requireVerifiedChromeOs);
        }
    }
}
