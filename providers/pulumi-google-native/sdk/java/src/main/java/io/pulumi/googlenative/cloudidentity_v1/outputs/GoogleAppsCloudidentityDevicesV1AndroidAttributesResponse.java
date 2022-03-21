// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse {
    /**
     * Whether applications from unknown sources can be installed on device.
     * 
     */
    private final Boolean enabledUnknownSources;
    /**
     * Whether this account is on an owner/primary profile. For phones, only true for owner profiles. Android 4+ devices can have secondary or restricted user profiles.
     * 
     */
    private final Boolean ownerProfileAccount;
    /**
     * Ownership privileges on device.
     * 
     */
    private final String ownershipPrivilege;
    /**
     * Whether device supports Android work profiles. If false, this service will not block access to corp data even if an administrator turns on the "Enforce Work Profile" policy.
     * 
     */
    private final Boolean supportsWorkProfile;

    @CustomType.Constructor
    private GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse(
        @CustomType.Parameter("enabledUnknownSources") Boolean enabledUnknownSources,
        @CustomType.Parameter("ownerProfileAccount") Boolean ownerProfileAccount,
        @CustomType.Parameter("ownershipPrivilege") String ownershipPrivilege,
        @CustomType.Parameter("supportsWorkProfile") Boolean supportsWorkProfile) {
        this.enabledUnknownSources = enabledUnknownSources;
        this.ownerProfileAccount = ownerProfileAccount;
        this.ownershipPrivilege = ownershipPrivilege;
        this.supportsWorkProfile = supportsWorkProfile;
    }

    /**
     * Whether applications from unknown sources can be installed on device.
     * 
    */
    public Boolean getEnabledUnknownSources() {
        return this.enabledUnknownSources;
    }
    /**
     * Whether this account is on an owner/primary profile. For phones, only true for owner profiles. Android 4+ devices can have secondary or restricted user profiles.
     * 
    */
    public Boolean getOwnerProfileAccount() {
        return this.ownerProfileAccount;
    }
    /**
     * Ownership privileges on device.
     * 
    */
    public String getOwnershipPrivilege() {
        return this.ownershipPrivilege;
    }
    /**
     * Whether device supports Android work profiles. If false, this service will not block access to corp data even if an administrator turns on the "Enforce Work Profile" policy.
     * 
    */
    public Boolean getSupportsWorkProfile() {
        return this.supportsWorkProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabledUnknownSources;
        private Boolean ownerProfileAccount;
        private String ownershipPrivilege;
        private Boolean supportsWorkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledUnknownSources = defaults.enabledUnknownSources;
    	      this.ownerProfileAccount = defaults.ownerProfileAccount;
    	      this.ownershipPrivilege = defaults.ownershipPrivilege;
    	      this.supportsWorkProfile = defaults.supportsWorkProfile;
        }

        public Builder enabledUnknownSources(Boolean enabledUnknownSources) {
            this.enabledUnknownSources = Objects.requireNonNull(enabledUnknownSources);
            return this;
        }
        public Builder ownerProfileAccount(Boolean ownerProfileAccount) {
            this.ownerProfileAccount = Objects.requireNonNull(ownerProfileAccount);
            return this;
        }
        public Builder ownershipPrivilege(String ownershipPrivilege) {
            this.ownershipPrivilege = Objects.requireNonNull(ownershipPrivilege);
            return this;
        }
        public Builder supportsWorkProfile(Boolean supportsWorkProfile) {
            this.supportsWorkProfile = Objects.requireNonNull(supportsWorkProfile);
            return this;
        }        public GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse build() {
            return new GoogleAppsCloudidentityDevicesV1AndroidAttributesResponse(enabledUnknownSources, ownerProfileAccount, ownershipPrivilege, supportsWorkProfile);
        }
    }
}
