// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.azurenative.aad.enums.KerberosArmoring;
import io.pulumi.azurenative.aad.enums.KerberosRc4Encryption;
import io.pulumi.azurenative.aad.enums.NtlmV1;
import io.pulumi.azurenative.aad.enums.SyncKerberosPasswords;
import io.pulumi.azurenative.aad.enums.SyncNtlmPasswords;
import io.pulumi.azurenative.aad.enums.SyncOnPremPasswords;
import io.pulumi.azurenative.aad.enums.TlsV1;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Domain Security Settings
 * 
 */
public final class DomainSecuritySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainSecuritySettingsArgs Empty = new DomainSecuritySettingsArgs();

    /**
     * A flag to determine whether or not KerberosArmoring is enabled or disabled.
     * 
     */
    @Import(name="kerberosArmoring")
      private final @Nullable Output<Either<String,KerberosArmoring>> kerberosArmoring;

    public Output<Either<String,KerberosArmoring>> getKerberosArmoring() {
        return this.kerberosArmoring == null ? Output.empty() : this.kerberosArmoring;
    }

    /**
     * A flag to determine whether or not KerberosRc4Encryption is enabled or disabled.
     * 
     */
    @Import(name="kerberosRc4Encryption")
      private final @Nullable Output<Either<String,KerberosRc4Encryption>> kerberosRc4Encryption;

    public Output<Either<String,KerberosRc4Encryption>> getKerberosRc4Encryption() {
        return this.kerberosRc4Encryption == null ? Output.empty() : this.kerberosRc4Encryption;
    }

    /**
     * A flag to determine whether or not NtlmV1 is enabled or disabled.
     * 
     */
    @Import(name="ntlmV1")
      private final @Nullable Output<Either<String,NtlmV1>> ntlmV1;

    public Output<Either<String,NtlmV1>> getNtlmV1() {
        return this.ntlmV1 == null ? Output.empty() : this.ntlmV1;
    }

    /**
     * A flag to determine whether or not SyncKerberosPasswords is enabled or disabled.
     * 
     */
    @Import(name="syncKerberosPasswords")
      private final @Nullable Output<Either<String,SyncKerberosPasswords>> syncKerberosPasswords;

    public Output<Either<String,SyncKerberosPasswords>> getSyncKerberosPasswords() {
        return this.syncKerberosPasswords == null ? Output.empty() : this.syncKerberosPasswords;
    }

    /**
     * A flag to determine whether or not SyncNtlmPasswords is enabled or disabled.
     * 
     */
    @Import(name="syncNtlmPasswords")
      private final @Nullable Output<Either<String,SyncNtlmPasswords>> syncNtlmPasswords;

    public Output<Either<String,SyncNtlmPasswords>> getSyncNtlmPasswords() {
        return this.syncNtlmPasswords == null ? Output.empty() : this.syncNtlmPasswords;
    }

    /**
     * A flag to determine whether or not SyncOnPremPasswords is enabled or disabled.
     * 
     */
    @Import(name="syncOnPremPasswords")
      private final @Nullable Output<Either<String,SyncOnPremPasswords>> syncOnPremPasswords;

    public Output<Either<String,SyncOnPremPasswords>> getSyncOnPremPasswords() {
        return this.syncOnPremPasswords == null ? Output.empty() : this.syncOnPremPasswords;
    }

    /**
     * A flag to determine whether or not TlsV1 is enabled or disabled.
     * 
     */
    @Import(name="tlsV1")
      private final @Nullable Output<Either<String,TlsV1>> tlsV1;

    public Output<Either<String,TlsV1>> getTlsV1() {
        return this.tlsV1 == null ? Output.empty() : this.tlsV1;
    }

    public DomainSecuritySettingsArgs(
        @Nullable Output<Either<String,KerberosArmoring>> kerberosArmoring,
        @Nullable Output<Either<String,KerberosRc4Encryption>> kerberosRc4Encryption,
        @Nullable Output<Either<String,NtlmV1>> ntlmV1,
        @Nullable Output<Either<String,SyncKerberosPasswords>> syncKerberosPasswords,
        @Nullable Output<Either<String,SyncNtlmPasswords>> syncNtlmPasswords,
        @Nullable Output<Either<String,SyncOnPremPasswords>> syncOnPremPasswords,
        @Nullable Output<Either<String,TlsV1>> tlsV1) {
        this.kerberosArmoring = kerberosArmoring == null ? Output.ofLeft("Disabled") : kerberosArmoring;
        this.kerberosRc4Encryption = kerberosRc4Encryption == null ? Output.ofLeft("Enabled") : kerberosRc4Encryption;
        this.ntlmV1 = ntlmV1 == null ? Output.ofLeft("Enabled") : ntlmV1;
        this.syncKerberosPasswords = syncKerberosPasswords == null ? Output.ofLeft("Enabled") : syncKerberosPasswords;
        this.syncNtlmPasswords = syncNtlmPasswords == null ? Output.ofLeft("Enabled") : syncNtlmPasswords;
        this.syncOnPremPasswords = syncOnPremPasswords == null ? Output.ofLeft("Enabled") : syncOnPremPasswords;
        this.tlsV1 = tlsV1 == null ? Output.ofLeft("Enabled") : tlsV1;
    }

    private DomainSecuritySettingsArgs() {
        this.kerberosArmoring = Output.empty();
        this.kerberosRc4Encryption = Output.empty();
        this.ntlmV1 = Output.empty();
        this.syncKerberosPasswords = Output.empty();
        this.syncNtlmPasswords = Output.empty();
        this.syncOnPremPasswords = Output.empty();
        this.tlsV1 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSecuritySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,KerberosArmoring>> kerberosArmoring;
        private @Nullable Output<Either<String,KerberosRc4Encryption>> kerberosRc4Encryption;
        private @Nullable Output<Either<String,NtlmV1>> ntlmV1;
        private @Nullable Output<Either<String,SyncKerberosPasswords>> syncKerberosPasswords;
        private @Nullable Output<Either<String,SyncNtlmPasswords>> syncNtlmPasswords;
        private @Nullable Output<Either<String,SyncOnPremPasswords>> syncOnPremPasswords;
        private @Nullable Output<Either<String,TlsV1>> tlsV1;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSecuritySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kerberosArmoring = defaults.kerberosArmoring;
    	      this.kerberosRc4Encryption = defaults.kerberosRc4Encryption;
    	      this.ntlmV1 = defaults.ntlmV1;
    	      this.syncKerberosPasswords = defaults.syncKerberosPasswords;
    	      this.syncNtlmPasswords = defaults.syncNtlmPasswords;
    	      this.syncOnPremPasswords = defaults.syncOnPremPasswords;
    	      this.tlsV1 = defaults.tlsV1;
        }

        public Builder kerberosArmoring(@Nullable Output<Either<String,KerberosArmoring>> kerberosArmoring) {
            this.kerberosArmoring = kerberosArmoring;
            return this;
        }
        public Builder kerberosArmoring(@Nullable Either<String,KerberosArmoring> kerberosArmoring) {
            this.kerberosArmoring = Output.ofNullable(kerberosArmoring);
            return this;
        }
        public Builder kerberosRc4Encryption(@Nullable Output<Either<String,KerberosRc4Encryption>> kerberosRc4Encryption) {
            this.kerberosRc4Encryption = kerberosRc4Encryption;
            return this;
        }
        public Builder kerberosRc4Encryption(@Nullable Either<String,KerberosRc4Encryption> kerberosRc4Encryption) {
            this.kerberosRc4Encryption = Output.ofNullable(kerberosRc4Encryption);
            return this;
        }
        public Builder ntlmV1(@Nullable Output<Either<String,NtlmV1>> ntlmV1) {
            this.ntlmV1 = ntlmV1;
            return this;
        }
        public Builder ntlmV1(@Nullable Either<String,NtlmV1> ntlmV1) {
            this.ntlmV1 = Output.ofNullable(ntlmV1);
            return this;
        }
        public Builder syncKerberosPasswords(@Nullable Output<Either<String,SyncKerberosPasswords>> syncKerberosPasswords) {
            this.syncKerberosPasswords = syncKerberosPasswords;
            return this;
        }
        public Builder syncKerberosPasswords(@Nullable Either<String,SyncKerberosPasswords> syncKerberosPasswords) {
            this.syncKerberosPasswords = Output.ofNullable(syncKerberosPasswords);
            return this;
        }
        public Builder syncNtlmPasswords(@Nullable Output<Either<String,SyncNtlmPasswords>> syncNtlmPasswords) {
            this.syncNtlmPasswords = syncNtlmPasswords;
            return this;
        }
        public Builder syncNtlmPasswords(@Nullable Either<String,SyncNtlmPasswords> syncNtlmPasswords) {
            this.syncNtlmPasswords = Output.ofNullable(syncNtlmPasswords);
            return this;
        }
        public Builder syncOnPremPasswords(@Nullable Output<Either<String,SyncOnPremPasswords>> syncOnPremPasswords) {
            this.syncOnPremPasswords = syncOnPremPasswords;
            return this;
        }
        public Builder syncOnPremPasswords(@Nullable Either<String,SyncOnPremPasswords> syncOnPremPasswords) {
            this.syncOnPremPasswords = Output.ofNullable(syncOnPremPasswords);
            return this;
        }
        public Builder tlsV1(@Nullable Output<Either<String,TlsV1>> tlsV1) {
            this.tlsV1 = tlsV1;
            return this;
        }
        public Builder tlsV1(@Nullable Either<String,TlsV1> tlsV1) {
            this.tlsV1 = Output.ofNullable(tlsV1);
            return this;
        }        public DomainSecuritySettingsArgs build() {
            return new DomainSecuritySettingsArgs(kerberosArmoring, kerberosRc4Encryption, ntlmV1, syncKerberosPasswords, syncNtlmPasswords, syncOnPremPasswords, tlsV1);
        }
    }
}
