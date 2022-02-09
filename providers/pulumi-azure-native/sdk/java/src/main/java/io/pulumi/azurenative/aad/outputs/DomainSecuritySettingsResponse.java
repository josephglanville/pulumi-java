// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainSecuritySettingsResponse {
    private final @Nullable String kerberosArmoring;
    private final @Nullable String kerberosRc4Encryption;
    private final @Nullable String ntlmV1;
    private final @Nullable String syncKerberosPasswords;
    private final @Nullable String syncNtlmPasswords;
    private final @Nullable String syncOnPremPasswords;
    private final @Nullable String tlsV1;

    @OutputCustomType.Constructor({"kerberosArmoring","kerberosRc4Encryption","ntlmV1","syncKerberosPasswords","syncNtlmPasswords","syncOnPremPasswords","tlsV1"})
    private DomainSecuritySettingsResponse(
        @Nullable String kerberosArmoring,
        @Nullable String kerberosRc4Encryption,
        @Nullable String ntlmV1,
        @Nullable String syncKerberosPasswords,
        @Nullable String syncNtlmPasswords,
        @Nullable String syncOnPremPasswords,
        @Nullable String tlsV1) {
        this.kerberosArmoring = kerberosArmoring;
        this.kerberosRc4Encryption = kerberosRc4Encryption;
        this.ntlmV1 = ntlmV1;
        this.syncKerberosPasswords = syncKerberosPasswords;
        this.syncNtlmPasswords = syncNtlmPasswords;
        this.syncOnPremPasswords = syncOnPremPasswords;
        this.tlsV1 = tlsV1;
    }

    public Optional<String> getKerberosArmoring() {
        return Optional.ofNullable(this.kerberosArmoring);
    }
    public Optional<String> getKerberosRc4Encryption() {
        return Optional.ofNullable(this.kerberosRc4Encryption);
    }
    public Optional<String> getNtlmV1() {
        return Optional.ofNullable(this.ntlmV1);
    }
    public Optional<String> getSyncKerberosPasswords() {
        return Optional.ofNullable(this.syncKerberosPasswords);
    }
    public Optional<String> getSyncNtlmPasswords() {
        return Optional.ofNullable(this.syncNtlmPasswords);
    }
    public Optional<String> getSyncOnPremPasswords() {
        return Optional.ofNullable(this.syncOnPremPasswords);
    }
    public Optional<String> getTlsV1() {
        return Optional.ofNullable(this.tlsV1);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kerberosArmoring;
        private @Nullable String kerberosRc4Encryption;
        private @Nullable String ntlmV1;
        private @Nullable String syncKerberosPasswords;
        private @Nullable String syncNtlmPasswords;
        private @Nullable String syncOnPremPasswords;
        private @Nullable String tlsV1;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosArmoring = defaults.kerberosArmoring;
    	      this.kerberosRc4Encryption = defaults.kerberosRc4Encryption;
    	      this.ntlmV1 = defaults.ntlmV1;
    	      this.syncKerberosPasswords = defaults.syncKerberosPasswords;
    	      this.syncNtlmPasswords = defaults.syncNtlmPasswords;
    	      this.syncOnPremPasswords = defaults.syncOnPremPasswords;
    	      this.tlsV1 = defaults.tlsV1;
        }

        public Builder setKerberosArmoring(@Nullable String kerberosArmoring) {
            this.kerberosArmoring = kerberosArmoring;
            return this;
        }

        public Builder setKerberosRc4Encryption(@Nullable String kerberosRc4Encryption) {
            this.kerberosRc4Encryption = kerberosRc4Encryption;
            return this;
        }

        public Builder setNtlmV1(@Nullable String ntlmV1) {
            this.ntlmV1 = ntlmV1;
            return this;
        }

        public Builder setSyncKerberosPasswords(@Nullable String syncKerberosPasswords) {
            this.syncKerberosPasswords = syncKerberosPasswords;
            return this;
        }

        public Builder setSyncNtlmPasswords(@Nullable String syncNtlmPasswords) {
            this.syncNtlmPasswords = syncNtlmPasswords;
            return this;
        }

        public Builder setSyncOnPremPasswords(@Nullable String syncOnPremPasswords) {
            this.syncOnPremPasswords = syncOnPremPasswords;
            return this;
        }

        public Builder setTlsV1(@Nullable String tlsV1) {
            this.tlsV1 = tlsV1;
            return this;
        }

        public DomainSecuritySettingsResponse build() {
            return new DomainSecuritySettingsResponse(kerberosArmoring, kerberosRc4Encryption, ntlmV1, syncKerberosPasswords, syncNtlmPasswords, syncOnPremPasswords, tlsV1);
        }
    }
}
