// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationGatewayTrustedRootCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayTrustedRootCertificateArgs Empty = new ApplicationGatewayTrustedRootCertificateArgs();

    @InputImport(name="data")
    private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="keyVaultSecretId")
    private final @Nullable Input<String> keyVaultSecretId;

    public Input<String> getKeyVaultSecretId() {
        return this.keyVaultSecretId == null ? Input.empty() : this.keyVaultSecretId;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ApplicationGatewayTrustedRootCertificateArgs(
        @Nullable Input<String> data,
        @Nullable Input<String> id,
        @Nullable Input<String> keyVaultSecretId,
        @Nullable Input<String> name) {
        this.data = data;
        this.id = id;
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
    }

    private ApplicationGatewayTrustedRootCertificateArgs() {
        this.data = Input.empty();
        this.id = Input.empty();
        this.keyVaultSecretId = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayTrustedRootCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> data;
        private @Nullable Input<String> id;
        private @Nullable Input<String> keyVaultSecretId;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayTrustedRootCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        public Builder setData(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = Input.ofNullable(data);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKeyVaultSecretId(@Nullable Input<String> keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        public Builder setKeyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = Input.ofNullable(keyVaultSecretId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public ApplicationGatewayTrustedRootCertificateArgs build() {
            return new ApplicationGatewayTrustedRootCertificateArgs(data, id, keyVaultSecretId, name);
        }
    }
}
