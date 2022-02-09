// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.azurenative.aad.enums.ExternalAccess;
import io.pulumi.azurenative.aad.enums.Ldaps;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LdapsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LdapsSettingsArgs Empty = new LdapsSettingsArgs();

    @InputImport(name="externalAccess")
    private final @Nullable Input<Either<String,ExternalAccess>> externalAccess;

    public Input<Either<String,ExternalAccess>> getExternalAccess() {
        return this.externalAccess == null ? Input.empty() : this.externalAccess;
    }

    @InputImport(name="ldaps")
    private final @Nullable Input<Either<String,Ldaps>> ldaps;

    public Input<Either<String,Ldaps>> getLdaps() {
        return this.ldaps == null ? Input.empty() : this.ldaps;
    }

    @InputImport(name="pfxCertificate")
    private final @Nullable Input<String> pfxCertificate;

    public Input<String> getPfxCertificate() {
        return this.pfxCertificate == null ? Input.empty() : this.pfxCertificate;
    }

    @InputImport(name="pfxCertificatePassword")
    private final @Nullable Input<String> pfxCertificatePassword;

    public Input<String> getPfxCertificatePassword() {
        return this.pfxCertificatePassword == null ? Input.empty() : this.pfxCertificatePassword;
    }

    public LdapsSettingsArgs(
        @Nullable Input<Either<String,ExternalAccess>> externalAccess,
        @Nullable Input<Either<String,Ldaps>> ldaps,
        @Nullable Input<String> pfxCertificate,
        @Nullable Input<String> pfxCertificatePassword) {
        this.externalAccess = externalAccess == null ? Input.ofLeft("Disabled") : externalAccess;
        this.ldaps = ldaps == null ? Input.ofLeft("Disabled") : ldaps;
        this.pfxCertificate = pfxCertificate;
        this.pfxCertificatePassword = pfxCertificatePassword;
    }

    private LdapsSettingsArgs() {
        this.externalAccess = Input.empty();
        this.ldaps = Input.empty();
        this.pfxCertificate = Input.empty();
        this.pfxCertificatePassword = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LdapsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ExternalAccess>> externalAccess;
        private @Nullable Input<Either<String,Ldaps>> ldaps;
        private @Nullable Input<String> pfxCertificate;
        private @Nullable Input<String> pfxCertificatePassword;

        public Builder() {
    	      // Empty
        }

        public Builder(LdapsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalAccess = defaults.externalAccess;
    	      this.ldaps = defaults.ldaps;
    	      this.pfxCertificate = defaults.pfxCertificate;
    	      this.pfxCertificatePassword = defaults.pfxCertificatePassword;
        }

        public Builder setExternalAccess(@Nullable Input<Either<String,ExternalAccess>> externalAccess) {
            this.externalAccess = externalAccess;
            return this;
        }

        public Builder setExternalAccess(@Nullable Either<String,ExternalAccess> externalAccess) {
            this.externalAccess = Input.ofNullable(externalAccess);
            return this;
        }

        public Builder setLdaps(@Nullable Input<Either<String,Ldaps>> ldaps) {
            this.ldaps = ldaps;
            return this;
        }

        public Builder setLdaps(@Nullable Either<String,Ldaps> ldaps) {
            this.ldaps = Input.ofNullable(ldaps);
            return this;
        }

        public Builder setPfxCertificate(@Nullable Input<String> pfxCertificate) {
            this.pfxCertificate = pfxCertificate;
            return this;
        }

        public Builder setPfxCertificate(@Nullable String pfxCertificate) {
            this.pfxCertificate = Input.ofNullable(pfxCertificate);
            return this;
        }

        public Builder setPfxCertificatePassword(@Nullable Input<String> pfxCertificatePassword) {
            this.pfxCertificatePassword = pfxCertificatePassword;
            return this;
        }

        public Builder setPfxCertificatePassword(@Nullable String pfxCertificatePassword) {
            this.pfxCertificatePassword = Input.ofNullable(pfxCertificatePassword);
            return this;
        }

        public LdapsSettingsArgs build() {
            return new LdapsSettingsArgs(externalAccess, ldaps, pfxCertificate, pfxCertificatePassword);
        }
    }
}
