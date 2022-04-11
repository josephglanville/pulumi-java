// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileState extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileState Empty = new UserProfileState();

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The ID of the associated Domain.
     * 
     */
    @Import(name="domainId")
      private final @Nullable Output<String> domainId;

    public Output<String> getDomainId() {
        return this.domainId == null ? Codegen.empty() : this.domainId;
    }

    /**
     * The ID of the user's profile in the Amazon Elastic File System (EFS) volume.
     * 
     */
    @Import(name="homeEfsFileSystemUid")
      private final @Nullable Output<String> homeEfsFileSystemUid;

    public Output<String> getHomeEfsFileSystemUid() {
        return this.homeEfsFileSystemUid == null ? Codegen.empty() : this.homeEfsFileSystemUid;
    }

    /**
     * A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Import(name="singleSignOnUserIdentifier")
      private final @Nullable Output<String> singleSignOnUserIdentifier;

    public Output<String> getSingleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier == null ? Codegen.empty() : this.singleSignOnUserIdentifier;
    }

    /**
     * The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Import(name="singleSignOnUserValue")
      private final @Nullable Output<String> singleSignOnUserValue;

    public Output<String> getSingleSignOnUserValue() {
        return this.singleSignOnUserValue == null ? Codegen.empty() : this.singleSignOnUserValue;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The name for the User Profile.
     * 
     */
    @Import(name="userProfileName")
      private final @Nullable Output<String> userProfileName;

    public Output<String> getUserProfileName() {
        return this.userProfileName == null ? Codegen.empty() : this.userProfileName;
    }

    /**
     * The user settings. See User Settings below.
     * 
     */
    @Import(name="userSettings")
      private final @Nullable Output<UserProfileUserSettingsGetArgs> userSettings;

    public Output<UserProfileUserSettingsGetArgs> getUserSettings() {
        return this.userSettings == null ? Codegen.empty() : this.userSettings;
    }

    public UserProfileState(
        @Nullable Output<String> arn,
        @Nullable Output<String> domainId,
        @Nullable Output<String> homeEfsFileSystemUid,
        @Nullable Output<String> singleSignOnUserIdentifier,
        @Nullable Output<String> singleSignOnUserValue,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> userProfileName,
        @Nullable Output<UserProfileUserSettingsGetArgs> userSettings) {
        this.arn = arn;
        this.domainId = domainId;
        this.homeEfsFileSystemUid = homeEfsFileSystemUid;
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
        this.singleSignOnUserValue = singleSignOnUserValue;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userProfileName = userProfileName;
        this.userSettings = userSettings;
    }

    private UserProfileState() {
        this.arn = Codegen.empty();
        this.domainId = Codegen.empty();
        this.homeEfsFileSystemUid = Codegen.empty();
        this.singleSignOnUserIdentifier = Codegen.empty();
        this.singleSignOnUserValue = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.userProfileName = Codegen.empty();
        this.userSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> domainId;
        private @Nullable Output<String> homeEfsFileSystemUid;
        private @Nullable Output<String> singleSignOnUserIdentifier;
        private @Nullable Output<String> singleSignOnUserValue;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> userProfileName;
        private @Nullable Output<UserProfileUserSettingsGetArgs> userSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainId = defaults.domainId;
    	      this.homeEfsFileSystemUid = defaults.homeEfsFileSystemUid;
    	      this.singleSignOnUserIdentifier = defaults.singleSignOnUserIdentifier;
    	      this.singleSignOnUserValue = defaults.singleSignOnUserValue;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userProfileName = defaults.userProfileName;
    	      this.userSettings = defaults.userSettings;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder domainId(@Nullable Output<String> domainId) {
            this.domainId = domainId;
            return this;
        }
        public Builder domainId(@Nullable String domainId) {
            this.domainId = Codegen.ofNullable(domainId);
            return this;
        }
        public Builder homeEfsFileSystemUid(@Nullable Output<String> homeEfsFileSystemUid) {
            this.homeEfsFileSystemUid = homeEfsFileSystemUid;
            return this;
        }
        public Builder homeEfsFileSystemUid(@Nullable String homeEfsFileSystemUid) {
            this.homeEfsFileSystemUid = Codegen.ofNullable(homeEfsFileSystemUid);
            return this;
        }
        public Builder singleSignOnUserIdentifier(@Nullable Output<String> singleSignOnUserIdentifier) {
            this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
            return this;
        }
        public Builder singleSignOnUserIdentifier(@Nullable String singleSignOnUserIdentifier) {
            this.singleSignOnUserIdentifier = Codegen.ofNullable(singleSignOnUserIdentifier);
            return this;
        }
        public Builder singleSignOnUserValue(@Nullable Output<String> singleSignOnUserValue) {
            this.singleSignOnUserValue = singleSignOnUserValue;
            return this;
        }
        public Builder singleSignOnUserValue(@Nullable String singleSignOnUserValue) {
            this.singleSignOnUserValue = Codegen.ofNullable(singleSignOnUserValue);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder userProfileName(@Nullable Output<String> userProfileName) {
            this.userProfileName = userProfileName;
            return this;
        }
        public Builder userProfileName(@Nullable String userProfileName) {
            this.userProfileName = Codegen.ofNullable(userProfileName);
            return this;
        }
        public Builder userSettings(@Nullable Output<UserProfileUserSettingsGetArgs> userSettings) {
            this.userSettings = userSettings;
            return this;
        }
        public Builder userSettings(@Nullable UserProfileUserSettingsGetArgs userSettings) {
            this.userSettings = Codegen.ofNullable(userSettings);
            return this;
        }        public UserProfileState build() {
            return new UserProfileState(arn, domainId, homeEfsFileSystemUid, singleSignOnUserIdentifier, singleSignOnUserValue, tags, tagsAll, userProfileName, userSettings);
        }
    }
}
