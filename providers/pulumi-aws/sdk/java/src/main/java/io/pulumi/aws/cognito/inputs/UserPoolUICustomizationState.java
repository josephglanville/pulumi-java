// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolUICustomizationState extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolUICustomizationState Empty = new UserPoolUICustomizationState();

    /**
     * The client ID for the client app. Defaults to `ALL`. If `ALL` is specified, the `css` and/or `image_file` settings will be used for every client that has no UI customization set previously.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Codegen.empty() : this.clientId;
    }

    /**
     * The creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
     * 
     */
    @Import(name="creationDate")
      private final @Nullable Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate == null ? Codegen.empty() : this.creationDate;
    }

    /**
     * The CSS values in the UI customization, provided as a String. At least one of `css` or `image_file` is required.
     * 
     */
    @Import(name="css")
      private final @Nullable Output<String> css;

    public Output<String> getCss() {
        return this.css == null ? Codegen.empty() : this.css;
    }

    /**
     * The CSS version number.
     * 
     */
    @Import(name="cssVersion")
      private final @Nullable Output<String> cssVersion;

    public Output<String> getCssVersion() {
        return this.cssVersion == null ? Codegen.empty() : this.cssVersion;
    }

    /**
     * The uploaded logo image for the UI customization, provided as a base64-encoded String. Drift detection is not possible for this argument. At least one of `css` or `image_file` is required.
     * 
     */
    @Import(name="imageFile")
      private final @Nullable Output<String> imageFile;

    public Output<String> getImageFile() {
        return this.imageFile == null ? Codegen.empty() : this.imageFile;
    }

    /**
     * The logo image URL for the UI customization.
     * 
     */
    @Import(name="imageUrl")
      private final @Nullable Output<String> imageUrl;

    public Output<String> getImageUrl() {
        return this.imageUrl == null ? Codegen.empty() : this.imageUrl;
    }

    /**
     * The last-modified date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
     * 
     */
    @Import(name="lastModifiedDate")
      private final @Nullable Output<String> lastModifiedDate;

    public Output<String> getLastModifiedDate() {
        return this.lastModifiedDate == null ? Codegen.empty() : this.lastModifiedDate;
    }

    /**
     * The user pool ID for the user pool.
     * 
     */
    @Import(name="userPoolId")
      private final @Nullable Output<String> userPoolId;

    public Output<String> getUserPoolId() {
        return this.userPoolId == null ? Codegen.empty() : this.userPoolId;
    }

    public UserPoolUICustomizationState(
        @Nullable Output<String> clientId,
        @Nullable Output<String> creationDate,
        @Nullable Output<String> css,
        @Nullable Output<String> cssVersion,
        @Nullable Output<String> imageFile,
        @Nullable Output<String> imageUrl,
        @Nullable Output<String> lastModifiedDate,
        @Nullable Output<String> userPoolId) {
        this.clientId = clientId;
        this.creationDate = creationDate;
        this.css = css;
        this.cssVersion = cssVersion;
        this.imageFile = imageFile;
        this.imageUrl = imageUrl;
        this.lastModifiedDate = lastModifiedDate;
        this.userPoolId = userPoolId;
    }

    private UserPoolUICustomizationState() {
        this.clientId = Codegen.empty();
        this.creationDate = Codegen.empty();
        this.css = Codegen.empty();
        this.cssVersion = Codegen.empty();
        this.imageFile = Codegen.empty();
        this.imageUrl = Codegen.empty();
        this.lastModifiedDate = Codegen.empty();
        this.userPoolId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolUICustomizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> creationDate;
        private @Nullable Output<String> css;
        private @Nullable Output<String> cssVersion;
        private @Nullable Output<String> imageFile;
        private @Nullable Output<String> imageUrl;
        private @Nullable Output<String> lastModifiedDate;
        private @Nullable Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolUICustomizationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.creationDate = defaults.creationDate;
    	      this.css = defaults.css;
    	      this.cssVersion = defaults.cssVersion;
    	      this.imageFile = defaults.imageFile;
    	      this.imageUrl = defaults.imageUrl;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Codegen.ofNullable(clientId);
            return this;
        }
        public Builder creationDate(@Nullable Output<String> creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = Codegen.ofNullable(creationDate);
            return this;
        }
        public Builder css(@Nullable Output<String> css) {
            this.css = css;
            return this;
        }
        public Builder css(@Nullable String css) {
            this.css = Codegen.ofNullable(css);
            return this;
        }
        public Builder cssVersion(@Nullable Output<String> cssVersion) {
            this.cssVersion = cssVersion;
            return this;
        }
        public Builder cssVersion(@Nullable String cssVersion) {
            this.cssVersion = Codegen.ofNullable(cssVersion);
            return this;
        }
        public Builder imageFile(@Nullable Output<String> imageFile) {
            this.imageFile = imageFile;
            return this;
        }
        public Builder imageFile(@Nullable String imageFile) {
            this.imageFile = Codegen.ofNullable(imageFile);
            return this;
        }
        public Builder imageUrl(@Nullable Output<String> imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public Builder imageUrl(@Nullable String imageUrl) {
            this.imageUrl = Codegen.ofNullable(imageUrl);
            return this;
        }
        public Builder lastModifiedDate(@Nullable Output<String> lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }
        public Builder lastModifiedDate(@Nullable String lastModifiedDate) {
            this.lastModifiedDate = Codegen.ofNullable(lastModifiedDate);
            return this;
        }
        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public Builder userPoolId(@Nullable String userPoolId) {
            this.userPoolId = Codegen.ofNullable(userPoolId);
            return this;
        }        public UserPoolUICustomizationState build() {
            return new UserPoolUICustomizationState(clientId, creationDate, css, cssVersion, imageFile, imageUrl, lastModifiedDate, userPoolId);
        }
    }
}
