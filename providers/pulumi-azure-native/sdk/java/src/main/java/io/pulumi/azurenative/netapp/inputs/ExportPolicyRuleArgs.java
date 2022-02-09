// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExportPolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportPolicyRuleArgs Empty = new ExportPolicyRuleArgs();

    @InputImport(name="allowedClients")
    private final @Nullable Input<String> allowedClients;

    public Input<String> getAllowedClients() {
        return this.allowedClients == null ? Input.empty() : this.allowedClients;
    }

    @InputImport(name="cifs")
    private final @Nullable Input<Boolean> cifs;

    public Input<Boolean> getCifs() {
        return this.cifs == null ? Input.empty() : this.cifs;
    }

    @InputImport(name="hasRootAccess")
    private final @Nullable Input<Boolean> hasRootAccess;

    public Input<Boolean> getHasRootAccess() {
        return this.hasRootAccess == null ? Input.empty() : this.hasRootAccess;
    }

    @InputImport(name="kerberos5ReadOnly")
    private final @Nullable Input<Boolean> kerberos5ReadOnly;

    public Input<Boolean> getKerberos5ReadOnly() {
        return this.kerberos5ReadOnly == null ? Input.empty() : this.kerberos5ReadOnly;
    }

    @InputImport(name="kerberos5ReadWrite")
    private final @Nullable Input<Boolean> kerberos5ReadWrite;

    public Input<Boolean> getKerberos5ReadWrite() {
        return this.kerberos5ReadWrite == null ? Input.empty() : this.kerberos5ReadWrite;
    }

    @InputImport(name="kerberos5iReadOnly")
    private final @Nullable Input<Boolean> kerberos5iReadOnly;

    public Input<Boolean> getKerberos5iReadOnly() {
        return this.kerberos5iReadOnly == null ? Input.empty() : this.kerberos5iReadOnly;
    }

    @InputImport(name="kerberos5iReadWrite")
    private final @Nullable Input<Boolean> kerberos5iReadWrite;

    public Input<Boolean> getKerberos5iReadWrite() {
        return this.kerberos5iReadWrite == null ? Input.empty() : this.kerberos5iReadWrite;
    }

    @InputImport(name="kerberos5pReadOnly")
    private final @Nullable Input<Boolean> kerberos5pReadOnly;

    public Input<Boolean> getKerberos5pReadOnly() {
        return this.kerberos5pReadOnly == null ? Input.empty() : this.kerberos5pReadOnly;
    }

    @InputImport(name="kerberos5pReadWrite")
    private final @Nullable Input<Boolean> kerberos5pReadWrite;

    public Input<Boolean> getKerberos5pReadWrite() {
        return this.kerberos5pReadWrite == null ? Input.empty() : this.kerberos5pReadWrite;
    }

    @InputImport(name="nfsv3")
    private final @Nullable Input<Boolean> nfsv3;

    public Input<Boolean> getNfsv3() {
        return this.nfsv3 == null ? Input.empty() : this.nfsv3;
    }

    @InputImport(name="nfsv41")
    private final @Nullable Input<Boolean> nfsv41;

    public Input<Boolean> getNfsv41() {
        return this.nfsv41 == null ? Input.empty() : this.nfsv41;
    }

    @InputImport(name="ruleIndex")
    private final @Nullable Input<Integer> ruleIndex;

    public Input<Integer> getRuleIndex() {
        return this.ruleIndex == null ? Input.empty() : this.ruleIndex;
    }

    @InputImport(name="unixReadOnly")
    private final @Nullable Input<Boolean> unixReadOnly;

    public Input<Boolean> getUnixReadOnly() {
        return this.unixReadOnly == null ? Input.empty() : this.unixReadOnly;
    }

    @InputImport(name="unixReadWrite")
    private final @Nullable Input<Boolean> unixReadWrite;

    public Input<Boolean> getUnixReadWrite() {
        return this.unixReadWrite == null ? Input.empty() : this.unixReadWrite;
    }

    public ExportPolicyRuleArgs(
        @Nullable Input<String> allowedClients,
        @Nullable Input<Boolean> cifs,
        @Nullable Input<Boolean> hasRootAccess,
        @Nullable Input<Boolean> kerberos5ReadOnly,
        @Nullable Input<Boolean> kerberos5ReadWrite,
        @Nullable Input<Boolean> kerberos5iReadOnly,
        @Nullable Input<Boolean> kerberos5iReadWrite,
        @Nullable Input<Boolean> kerberos5pReadOnly,
        @Nullable Input<Boolean> kerberos5pReadWrite,
        @Nullable Input<Boolean> nfsv3,
        @Nullable Input<Boolean> nfsv41,
        @Nullable Input<Integer> ruleIndex,
        @Nullable Input<Boolean> unixReadOnly,
        @Nullable Input<Boolean> unixReadWrite) {
        this.allowedClients = allowedClients;
        this.cifs = cifs;
        this.hasRootAccess = hasRootAccess == null ? Input.ofNullable(true) : hasRootAccess;
        this.kerberos5ReadOnly = kerberos5ReadOnly == null ? Input.ofNullable(false) : kerberos5ReadOnly;
        this.kerberos5ReadWrite = kerberos5ReadWrite == null ? Input.ofNullable(false) : kerberos5ReadWrite;
        this.kerberos5iReadOnly = kerberos5iReadOnly == null ? Input.ofNullable(false) : kerberos5iReadOnly;
        this.kerberos5iReadWrite = kerberos5iReadWrite == null ? Input.ofNullable(false) : kerberos5iReadWrite;
        this.kerberos5pReadOnly = kerberos5pReadOnly == null ? Input.ofNullable(false) : kerberos5pReadOnly;
        this.kerberos5pReadWrite = kerberos5pReadWrite == null ? Input.ofNullable(false) : kerberos5pReadWrite;
        this.nfsv3 = nfsv3;
        this.nfsv41 = nfsv41;
        this.ruleIndex = ruleIndex;
        this.unixReadOnly = unixReadOnly;
        this.unixReadWrite = unixReadWrite;
    }

    private ExportPolicyRuleArgs() {
        this.allowedClients = Input.empty();
        this.cifs = Input.empty();
        this.hasRootAccess = Input.empty();
        this.kerberos5ReadOnly = Input.empty();
        this.kerberos5ReadWrite = Input.empty();
        this.kerberos5iReadOnly = Input.empty();
        this.kerberos5iReadWrite = Input.empty();
        this.kerberos5pReadOnly = Input.empty();
        this.kerberos5pReadWrite = Input.empty();
        this.nfsv3 = Input.empty();
        this.nfsv41 = Input.empty();
        this.ruleIndex = Input.empty();
        this.unixReadOnly = Input.empty();
        this.unixReadWrite = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> allowedClients;
        private @Nullable Input<Boolean> cifs;
        private @Nullable Input<Boolean> hasRootAccess;
        private @Nullable Input<Boolean> kerberos5ReadOnly;
        private @Nullable Input<Boolean> kerberos5ReadWrite;
        private @Nullable Input<Boolean> kerberos5iReadOnly;
        private @Nullable Input<Boolean> kerberos5iReadWrite;
        private @Nullable Input<Boolean> kerberos5pReadOnly;
        private @Nullable Input<Boolean> kerberos5pReadWrite;
        private @Nullable Input<Boolean> nfsv3;
        private @Nullable Input<Boolean> nfsv41;
        private @Nullable Input<Integer> ruleIndex;
        private @Nullable Input<Boolean> unixReadOnly;
        private @Nullable Input<Boolean> unixReadWrite;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportPolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClients = defaults.allowedClients;
    	      this.cifs = defaults.cifs;
    	      this.hasRootAccess = defaults.hasRootAccess;
    	      this.kerberos5ReadOnly = defaults.kerberos5ReadOnly;
    	      this.kerberos5ReadWrite = defaults.kerberos5ReadWrite;
    	      this.kerberos5iReadOnly = defaults.kerberos5iReadOnly;
    	      this.kerberos5iReadWrite = defaults.kerberos5iReadWrite;
    	      this.kerberos5pReadOnly = defaults.kerberos5pReadOnly;
    	      this.kerberos5pReadWrite = defaults.kerberos5pReadWrite;
    	      this.nfsv3 = defaults.nfsv3;
    	      this.nfsv41 = defaults.nfsv41;
    	      this.ruleIndex = defaults.ruleIndex;
    	      this.unixReadOnly = defaults.unixReadOnly;
    	      this.unixReadWrite = defaults.unixReadWrite;
        }

        public Builder setAllowedClients(@Nullable Input<String> allowedClients) {
            this.allowedClients = allowedClients;
            return this;
        }

        public Builder setAllowedClients(@Nullable String allowedClients) {
            this.allowedClients = Input.ofNullable(allowedClients);
            return this;
        }

        public Builder setCifs(@Nullable Input<Boolean> cifs) {
            this.cifs = cifs;
            return this;
        }

        public Builder setCifs(@Nullable Boolean cifs) {
            this.cifs = Input.ofNullable(cifs);
            return this;
        }

        public Builder setHasRootAccess(@Nullable Input<Boolean> hasRootAccess) {
            this.hasRootAccess = hasRootAccess;
            return this;
        }

        public Builder setHasRootAccess(@Nullable Boolean hasRootAccess) {
            this.hasRootAccess = Input.ofNullable(hasRootAccess);
            return this;
        }

        public Builder setKerberos5ReadOnly(@Nullable Input<Boolean> kerberos5ReadOnly) {
            this.kerberos5ReadOnly = kerberos5ReadOnly;
            return this;
        }

        public Builder setKerberos5ReadOnly(@Nullable Boolean kerberos5ReadOnly) {
            this.kerberos5ReadOnly = Input.ofNullable(kerberos5ReadOnly);
            return this;
        }

        public Builder setKerberos5ReadWrite(@Nullable Input<Boolean> kerberos5ReadWrite) {
            this.kerberos5ReadWrite = kerberos5ReadWrite;
            return this;
        }

        public Builder setKerberos5ReadWrite(@Nullable Boolean kerberos5ReadWrite) {
            this.kerberos5ReadWrite = Input.ofNullable(kerberos5ReadWrite);
            return this;
        }

        public Builder setKerberos5iReadOnly(@Nullable Input<Boolean> kerberos5iReadOnly) {
            this.kerberos5iReadOnly = kerberos5iReadOnly;
            return this;
        }

        public Builder setKerberos5iReadOnly(@Nullable Boolean kerberos5iReadOnly) {
            this.kerberos5iReadOnly = Input.ofNullable(kerberos5iReadOnly);
            return this;
        }

        public Builder setKerberos5iReadWrite(@Nullable Input<Boolean> kerberos5iReadWrite) {
            this.kerberos5iReadWrite = kerberos5iReadWrite;
            return this;
        }

        public Builder setKerberos5iReadWrite(@Nullable Boolean kerberos5iReadWrite) {
            this.kerberos5iReadWrite = Input.ofNullable(kerberos5iReadWrite);
            return this;
        }

        public Builder setKerberos5pReadOnly(@Nullable Input<Boolean> kerberos5pReadOnly) {
            this.kerberos5pReadOnly = kerberos5pReadOnly;
            return this;
        }

        public Builder setKerberos5pReadOnly(@Nullable Boolean kerberos5pReadOnly) {
            this.kerberos5pReadOnly = Input.ofNullable(kerberos5pReadOnly);
            return this;
        }

        public Builder setKerberos5pReadWrite(@Nullable Input<Boolean> kerberos5pReadWrite) {
            this.kerberos5pReadWrite = kerberos5pReadWrite;
            return this;
        }

        public Builder setKerberos5pReadWrite(@Nullable Boolean kerberos5pReadWrite) {
            this.kerberos5pReadWrite = Input.ofNullable(kerberos5pReadWrite);
            return this;
        }

        public Builder setNfsv3(@Nullable Input<Boolean> nfsv3) {
            this.nfsv3 = nfsv3;
            return this;
        }

        public Builder setNfsv3(@Nullable Boolean nfsv3) {
            this.nfsv3 = Input.ofNullable(nfsv3);
            return this;
        }

        public Builder setNfsv41(@Nullable Input<Boolean> nfsv41) {
            this.nfsv41 = nfsv41;
            return this;
        }

        public Builder setNfsv41(@Nullable Boolean nfsv41) {
            this.nfsv41 = Input.ofNullable(nfsv41);
            return this;
        }

        public Builder setRuleIndex(@Nullable Input<Integer> ruleIndex) {
            this.ruleIndex = ruleIndex;
            return this;
        }

        public Builder setRuleIndex(@Nullable Integer ruleIndex) {
            this.ruleIndex = Input.ofNullable(ruleIndex);
            return this;
        }

        public Builder setUnixReadOnly(@Nullable Input<Boolean> unixReadOnly) {
            this.unixReadOnly = unixReadOnly;
            return this;
        }

        public Builder setUnixReadOnly(@Nullable Boolean unixReadOnly) {
            this.unixReadOnly = Input.ofNullable(unixReadOnly);
            return this;
        }

        public Builder setUnixReadWrite(@Nullable Input<Boolean> unixReadWrite) {
            this.unixReadWrite = unixReadWrite;
            return this;
        }

        public Builder setUnixReadWrite(@Nullable Boolean unixReadWrite) {
            this.unixReadWrite = Input.ofNullable(unixReadWrite);
            return this;
        }

        public ExportPolicyRuleArgs build() {
            return new ExportPolicyRuleArgs(allowedClients, cifs, hasRootAccess, kerberos5ReadOnly, kerberos5ReadWrite, kerberos5iReadOnly, kerberos5iReadWrite, kerberos5pReadOnly, kerberos5pReadWrite, nfsv3, nfsv41, ruleIndex, unixReadOnly, unixReadWrite);
        }
    }
}
