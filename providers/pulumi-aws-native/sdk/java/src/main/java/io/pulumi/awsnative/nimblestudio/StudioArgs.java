// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio;

import io.pulumi.awsnative.nimblestudio.inputs.StudioEncryptionConfigurationArgs;
import io.pulumi.awsnative.nimblestudio.inputs.StudioTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioArgs Empty = new StudioArgs();

    /**
     * <p>The IAM role that Studio Admins will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    @InputImport(name="adminRoleArn", required=true)
      private final Input<String> adminRoleArn;

    public Input<String> getAdminRoleArn() {
        return this.adminRoleArn;
    }

    /**
     * <p>A friendly name for the studio.</p>
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="studioEncryptionConfiguration")
      private final @Nullable Input<StudioEncryptionConfigurationArgs> studioEncryptionConfiguration;

    public Input<StudioEncryptionConfigurationArgs> getStudioEncryptionConfiguration() {
        return this.studioEncryptionConfiguration == null ? Input.empty() : this.studioEncryptionConfiguration;
    }

    /**
     * <p>The studio name that is used in the URL of the Nimble Studio portal when accessed by Nimble Studio users.</p>
     * 
     */
    @InputImport(name="studioName")
      private final @Nullable Input<String> studioName;

    public Input<String> getStudioName() {
        return this.studioName == null ? Input.empty() : this.studioName;
    }

    @InputImport(name="tags")
      private final @Nullable Input<StudioTagsArgs> tags;

    public Input<StudioTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * <p>The IAM role that Studio Users will assume when logging in to the Nimble Studio portal.</p>
     * 
     */
    @InputImport(name="userRoleArn", required=true)
      private final Input<String> userRoleArn;

    public Input<String> getUserRoleArn() {
        return this.userRoleArn;
    }

    public StudioArgs(
        Input<String> adminRoleArn,
        Input<String> displayName,
        @Nullable Input<StudioEncryptionConfigurationArgs> studioEncryptionConfiguration,
        @Nullable Input<String> studioName,
        @Nullable Input<StudioTagsArgs> tags,
        Input<String> userRoleArn) {
        this.adminRoleArn = Objects.requireNonNull(adminRoleArn, "expected parameter 'adminRoleArn' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.studioEncryptionConfiguration = studioEncryptionConfiguration;
        this.studioName = studioName;
        this.tags = tags;
        this.userRoleArn = Objects.requireNonNull(userRoleArn, "expected parameter 'userRoleArn' to be non-null");
    }

    private StudioArgs() {
        this.adminRoleArn = Input.empty();
        this.displayName = Input.empty();
        this.studioEncryptionConfiguration = Input.empty();
        this.studioName = Input.empty();
        this.tags = Input.empty();
        this.userRoleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> adminRoleArn;
        private Input<String> displayName;
        private @Nullable Input<StudioEncryptionConfigurationArgs> studioEncryptionConfiguration;
        private @Nullable Input<String> studioName;
        private @Nullable Input<StudioTagsArgs> tags;
        private Input<String> userRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminRoleArn = defaults.adminRoleArn;
    	      this.displayName = defaults.displayName;
    	      this.studioEncryptionConfiguration = defaults.studioEncryptionConfiguration;
    	      this.studioName = defaults.studioName;
    	      this.tags = defaults.tags;
    	      this.userRoleArn = defaults.userRoleArn;
        }

        public Builder setAdminRoleArn(Input<String> adminRoleArn) {
            this.adminRoleArn = Objects.requireNonNull(adminRoleArn);
            return this;
        }

        public Builder setAdminRoleArn(String adminRoleArn) {
            this.adminRoleArn = Input.of(Objects.requireNonNull(adminRoleArn));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setStudioEncryptionConfiguration(@Nullable Input<StudioEncryptionConfigurationArgs> studioEncryptionConfiguration) {
            this.studioEncryptionConfiguration = studioEncryptionConfiguration;
            return this;
        }

        public Builder setStudioEncryptionConfiguration(@Nullable StudioEncryptionConfigurationArgs studioEncryptionConfiguration) {
            this.studioEncryptionConfiguration = Input.ofNullable(studioEncryptionConfiguration);
            return this;
        }

        public Builder setStudioName(@Nullable Input<String> studioName) {
            this.studioName = studioName;
            return this;
        }

        public Builder setStudioName(@Nullable String studioName) {
            this.studioName = Input.ofNullable(studioName);
            return this;
        }

        public Builder setTags(@Nullable Input<StudioTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable StudioTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserRoleArn(Input<String> userRoleArn) {
            this.userRoleArn = Objects.requireNonNull(userRoleArn);
            return this;
        }

        public Builder setUserRoleArn(String userRoleArn) {
            this.userRoleArn = Input.of(Objects.requireNonNull(userRoleArn));
            return this;
        }
        public StudioArgs build() {
            return new StudioArgs(adminRoleArn, displayName, studioEncryptionConfiguration, studioName, tags, userRoleArn);
        }
    }
}
