// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AsymmetricEncryptedSecretArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageRepositoryCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRepositoryCredentialArgs Empty = new ImageRepositoryCredentialArgs();

    @InputImport(name="imageRepositoryUrl", required=true)
    private final Input<String> imageRepositoryUrl;

    public Input<String> getImageRepositoryUrl() {
        return this.imageRepositoryUrl;
    }

    @InputImport(name="password")
    private final @Nullable Input<AsymmetricEncryptedSecretArgs> password;

    public Input<AsymmetricEncryptedSecretArgs> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="userName", required=true)
    private final Input<String> userName;

    public Input<String> getUserName() {
        return this.userName;
    }

    public ImageRepositoryCredentialArgs(
        Input<String> imageRepositoryUrl,
        @Nullable Input<AsymmetricEncryptedSecretArgs> password,
        Input<String> userName) {
        this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl, "expected parameter 'imageRepositoryUrl' to be non-null");
        this.password = password;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private ImageRepositoryCredentialArgs() {
        this.imageRepositoryUrl = Input.empty();
        this.password = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRepositoryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> imageRepositoryUrl;
        private @Nullable Input<AsymmetricEncryptedSecretArgs> password;
        private Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRepositoryCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageRepositoryUrl = defaults.imageRepositoryUrl;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder setImageRepositoryUrl(Input<String> imageRepositoryUrl) {
            this.imageRepositoryUrl = Objects.requireNonNull(imageRepositoryUrl);
            return this;
        }

        public Builder setImageRepositoryUrl(String imageRepositoryUrl) {
            this.imageRepositoryUrl = Input.of(Objects.requireNonNull(imageRepositoryUrl));
            return this;
        }

        public Builder setPassword(@Nullable Input<AsymmetricEncryptedSecretArgs> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable AsymmetricEncryptedSecretArgs password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setUserName(Input<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }

        public ImageRepositoryCredentialArgs build() {
            return new ImageRepositoryCredentialArgs(imageRepositoryUrl, password, userName);
        }
    }
}
