// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Image repository credential.
 * 
 */
public final class ImageRepositoryCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRepositoryCredentialArgs Empty = new ImageRepositoryCredentialArgs();

    /**
     * Image repository url (e.g.: mcr.microsoft.com).
     * 
     */
    @Import(name="imageRepositoryUrl", required=true)
      private final Output<String> imageRepositoryUrl;

    public Output<String> getImageRepositoryUrl() {
        return this.imageRepositoryUrl;
    }

    /**
     * Repository user password.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<AsymmetricEncryptedSecretArgs> password;

    public Output<AsymmetricEncryptedSecretArgs> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Repository user name.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    public ImageRepositoryCredentialArgs(
        Output<String> imageRepositoryUrl,
        @Nullable Output<AsymmetricEncryptedSecretArgs> password,
        Output<String> userName) {
        this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl, "expected parameter 'imageRepositoryUrl' to be non-null");
        this.password = password;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ImageRepositoryCredentialArgs() {
        this.imageRepositoryUrl = Output.empty();
        this.password = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRepositoryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> imageRepositoryUrl;
        private @Nullable Output<AsymmetricEncryptedSecretArgs> password;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRepositoryCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageRepositoryUrl = defaults.imageRepositoryUrl;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder imageRepositoryUrl(Output<String> imageRepositoryUrl) {
            this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl);
            return this;
        }
        public Builder imageRepositoryUrl(String imageRepositoryUrl) {
            this.imageRepositoryUrl = Output.of(Objects.requireNonNull(imageRepositoryUrl));
            return this;
        }
        public Builder password(@Nullable Output<AsymmetricEncryptedSecretArgs> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable AsymmetricEncryptedSecretArgs password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public ImageRepositoryCredentialArgs build() {
            return new ImageRepositoryCredentialArgs(imageRepositoryUrl, password, userName);
        }
    }
}
