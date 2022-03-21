// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the resource properties.
 * 
 */
public final class OsProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final OsProfileResponse Empty = new OsProfileResponse();

    /**
     * Gets or sets administrator username.
     * 
     */
    @Import(name="adminUsername")
      private final @Nullable String adminUsername;

    public Optional<String> getAdminUsername() {
        return this.adminUsername == null ? Optional.empty() : Optional.ofNullable(this.adminUsername);
    }

    /**
     * Gets or sets computer name.
     * 
     */
    @Import(name="computerName")
      private final @Nullable String computerName;

    public Optional<String> getComputerName() {
        return this.computerName == null ? Optional.empty() : Optional.ofNullable(this.computerName);
    }

    /**
     * Gets or sets os name.
     * 
     */
    @Import(name="osName", required=true)
      private final String osName;

    public String getOsName() {
        return this.osName;
    }

    /**
     * Gets or sets the type of the os.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Gets or sets the current running status of VMware Tools running in the guest operating system.
     * 
     */
    @Import(name="toolsRunningStatus", required=true)
      private final String toolsRunningStatus;

    public String getToolsRunningStatus() {
        return this.toolsRunningStatus;
    }

    /**
     * Gets or sets the current version of VMware Tools.
     * 
     */
    @Import(name="toolsVersion", required=true)
      private final String toolsVersion;

    public String getToolsVersion() {
        return this.toolsVersion;
    }

    /**
     * Gets or sets the current version status of VMware Tools installed in the guest operating system.
     * 
     */
    @Import(name="toolsVersionStatus", required=true)
      private final String toolsVersionStatus;

    public String getToolsVersionStatus() {
        return this.toolsVersionStatus;
    }

    public OsProfileResponse(
        @Nullable String adminUsername,
        @Nullable String computerName,
        String osName,
        @Nullable String osType,
        String toolsRunningStatus,
        String toolsVersion,
        String toolsVersionStatus) {
        this.adminUsername = adminUsername;
        this.computerName = computerName;
        this.osName = Objects.requireNonNull(osName, "expected parameter 'osName' to be non-null");
        this.osType = osType;
        this.toolsRunningStatus = Objects.requireNonNull(toolsRunningStatus, "expected parameter 'toolsRunningStatus' to be non-null");
        this.toolsVersion = Objects.requireNonNull(toolsVersion, "expected parameter 'toolsVersion' to be non-null");
        this.toolsVersionStatus = Objects.requireNonNull(toolsVersionStatus, "expected parameter 'toolsVersionStatus' to be non-null");
    }

    private OsProfileResponse() {
        this.adminUsername = null;
        this.computerName = null;
        this.osName = null;
        this.osType = null;
        this.toolsRunningStatus = null;
        this.toolsVersion = null;
        this.toolsVersionStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminUsername;
        private @Nullable String computerName;
        private String osName;
        private @Nullable String osType;
        private String toolsRunningStatus;
        private String toolsVersion;
        private String toolsVersionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(OsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.computerName = defaults.computerName;
    	      this.osName = defaults.osName;
    	      this.osType = defaults.osType;
    	      this.toolsRunningStatus = defaults.toolsRunningStatus;
    	      this.toolsVersion = defaults.toolsVersion;
    	      this.toolsVersionStatus = defaults.toolsVersionStatus;
        }

        public Builder adminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }
        public Builder computerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }
        public Builder osName(String osName) {
            this.osName = Objects.requireNonNull(osName);
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder toolsRunningStatus(String toolsRunningStatus) {
            this.toolsRunningStatus = Objects.requireNonNull(toolsRunningStatus);
            return this;
        }
        public Builder toolsVersion(String toolsVersion) {
            this.toolsVersion = Objects.requireNonNull(toolsVersion);
            return this;
        }
        public Builder toolsVersionStatus(String toolsVersionStatus) {
            this.toolsVersionStatus = Objects.requireNonNull(toolsVersionStatus);
            return this;
        }        public OsProfileResponse build() {
            return new OsProfileResponse(adminUsername, computerName, osName, osType, toolsRunningStatus, toolsVersion, toolsVersionStatus);
        }
    }
}
