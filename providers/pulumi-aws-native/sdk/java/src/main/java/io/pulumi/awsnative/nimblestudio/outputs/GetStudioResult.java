// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.outputs;

import io.pulumi.awsnative.nimblestudio.outputs.StudioEncryptionConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStudioResult {
    /**
     * <p>The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    private final @Nullable String adminRoleArn;
    /**
     * <p>A friendly name for the studio.</p>
     * 
     */
    private final @Nullable String displayName;
    /**
     * <p>The Amazon Web Services Region where the studio resource is located.</p>
     * 
     */
    private final @Nullable String homeRegion;
    /**
     * <p>The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.</p>
     * 
     */
    private final @Nullable String ssoClientId;
    private final @Nullable StudioEncryptionConfiguration studioEncryptionConfiguration;
    private final @Nullable String studioId;
    /**
     * <p>The address of the web page for the studio.</p>
     * 
     */
    private final @Nullable String studioUrl;
    /**
     * <p>The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    private final @Nullable String userRoleArn;

    @CustomType.Constructor
    private GetStudioResult(
        @CustomType.Parameter("adminRoleArn") @Nullable String adminRoleArn,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("homeRegion") @Nullable String homeRegion,
        @CustomType.Parameter("ssoClientId") @Nullable String ssoClientId,
        @CustomType.Parameter("studioEncryptionConfiguration") @Nullable StudioEncryptionConfiguration studioEncryptionConfiguration,
        @CustomType.Parameter("studioId") @Nullable String studioId,
        @CustomType.Parameter("studioUrl") @Nullable String studioUrl,
        @CustomType.Parameter("userRoleArn") @Nullable String userRoleArn) {
        this.adminRoleArn = adminRoleArn;
        this.displayName = displayName;
        this.homeRegion = homeRegion;
        this.ssoClientId = ssoClientId;
        this.studioEncryptionConfiguration = studioEncryptionConfiguration;
        this.studioId = studioId;
        this.studioUrl = studioUrl;
        this.userRoleArn = userRoleArn;
    }

    /**
     * <p>The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>
     * 
    */
    public Optional<String> getAdminRoleArn() {
        return Optional.ofNullable(this.adminRoleArn);
    }
    /**
     * <p>A friendly name for the studio.</p>
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * <p>The Amazon Web Services Region where the studio resource is located.</p>
     * 
    */
    public Optional<String> getHomeRegion() {
        return Optional.ofNullable(this.homeRegion);
    }
    /**
     * <p>The Amazon Web Services SSO application client ID used to integrate with Amazon Web Services SSO to enable Amazon Web Services SSO users to log in to Nimble Studio portal.</p>
     * 
    */
    public Optional<String> getSsoClientId() {
        return Optional.ofNullable(this.ssoClientId);
    }
    public Optional<StudioEncryptionConfiguration> getStudioEncryptionConfiguration() {
        return Optional.ofNullable(this.studioEncryptionConfiguration);
    }
    public Optional<String> getStudioId() {
        return Optional.ofNullable(this.studioId);
    }
    /**
     * <p>The address of the web page for the studio.</p>
     * 
    */
    public Optional<String> getStudioUrl() {
        return Optional.ofNullable(this.studioUrl);
    }
    /**
     * <p>The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>
     * 
    */
    public Optional<String> getUserRoleArn() {
        return Optional.ofNullable(this.userRoleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminRoleArn;
        private @Nullable String displayName;
        private @Nullable String homeRegion;
        private @Nullable String ssoClientId;
        private @Nullable StudioEncryptionConfiguration studioEncryptionConfiguration;
        private @Nullable String studioId;
        private @Nullable String studioUrl;
        private @Nullable String userRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminRoleArn = defaults.adminRoleArn;
    	      this.displayName = defaults.displayName;
    	      this.homeRegion = defaults.homeRegion;
    	      this.ssoClientId = defaults.ssoClientId;
    	      this.studioEncryptionConfiguration = defaults.studioEncryptionConfiguration;
    	      this.studioId = defaults.studioId;
    	      this.studioUrl = defaults.studioUrl;
    	      this.userRoleArn = defaults.userRoleArn;
        }

        public Builder adminRoleArn(@Nullable String adminRoleArn) {
            this.adminRoleArn = adminRoleArn;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder homeRegion(@Nullable String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }
        public Builder ssoClientId(@Nullable String ssoClientId) {
            this.ssoClientId = ssoClientId;
            return this;
        }
        public Builder studioEncryptionConfiguration(@Nullable StudioEncryptionConfiguration studioEncryptionConfiguration) {
            this.studioEncryptionConfiguration = studioEncryptionConfiguration;
            return this;
        }
        public Builder studioId(@Nullable String studioId) {
            this.studioId = studioId;
            return this;
        }
        public Builder studioUrl(@Nullable String studioUrl) {
            this.studioUrl = studioUrl;
            return this;
        }
        public Builder userRoleArn(@Nullable String userRoleArn) {
            this.userRoleArn = userRoleArn;
            return this;
        }        public GetStudioResult build() {
            return new GetStudioResult(adminRoleArn, displayName, homeRegion, ssoClientId, studioEncryptionConfiguration, studioId, studioUrl, userRoleArn);
        }
    }
}
