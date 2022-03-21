// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigKeyUsageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigKeyUsageGetArgs Empty = new AuthorityConfigX509ConfigKeyUsageGetArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="baseKeyUsage", required=true)
      private final Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;

    public Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> getBaseKeyUsage() {
        return this.baseKeyUsage;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @Import(name="extendedKeyUsage", required=true)
      private final Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;

    public Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> getExtendedKeyUsage() {
        return this.extendedKeyUsage;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
      private final @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

    public Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Output.empty() : this.unknownExtendedKeyUsages;
    }

    public AuthorityConfigX509ConfigKeyUsageGetArgs(
        Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage,
        Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage,
        @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage, "expected parameter 'baseKeyUsage' to be non-null");
        this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage, "expected parameter 'extendedKeyUsage' to be non-null");
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private AuthorityConfigX509ConfigKeyUsageGetArgs() {
        this.baseKeyUsage = Output.empty();
        this.extendedKeyUsage = Output.empty();
        this.unknownExtendedKeyUsages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigKeyUsageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage;
        private Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage;
        private @Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigKeyUsageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder baseKeyUsage(Output<AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs> baseKeyUsage) {
            this.baseKeyUsage = Objects.requireNonNull(baseKeyUsage);
            return this;
        }
        public Builder baseKeyUsage(AuthorityConfigX509ConfigKeyUsageBaseKeyUsageGetArgs baseKeyUsage) {
            this.baseKeyUsage = Output.of(Objects.requireNonNull(baseKeyUsage));
            return this;
        }
        public Builder extendedKeyUsage(Output<AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs> extendedKeyUsage) {
            this.extendedKeyUsage = Objects.requireNonNull(extendedKeyUsage);
            return this;
        }
        public Builder extendedKeyUsage(AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageGetArgs extendedKeyUsage) {
            this.extendedKeyUsage = Output.of(Objects.requireNonNull(extendedKeyUsage));
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public Builder unknownExtendedKeyUsages(@Nullable List<AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Output.ofNullable(unknownExtendedKeyUsages);
            return this;
        }
        public Builder unknownExtendedKeyUsages(AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageGetArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }        public AuthorityConfigX509ConfigKeyUsageGetArgs build() {
            return new AuthorityConfigX509ConfigKeyUsageGetArgs(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
