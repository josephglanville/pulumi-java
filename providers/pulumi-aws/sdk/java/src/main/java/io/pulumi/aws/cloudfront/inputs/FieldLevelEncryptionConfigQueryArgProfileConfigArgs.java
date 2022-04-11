// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigArgs();

    /**
     * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level encryption query argument, fle-profile, is unknown.
     * 
     */
    @Import(name="forwardWhenQueryArgProfileIsUnknown", required=true)
      private final Output<Boolean> forwardWhenQueryArgProfileIsUnknown;

    public Output<Boolean> getForwardWhenQueryArgProfileIsUnknown() {
        return this.forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * Object that contains an attribute `items` that contains the list ofrofiles specified for query argument-profile mapping for field-level encryption. see Query Arg Profile.
     * 
     */
    @Import(name="queryArgProfiles")
      private final @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles;

    public Output<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> getQueryArgProfiles() {
        return this.queryArgProfiles == null ? Codegen.empty() : this.queryArgProfiles;
    }

    public FieldLevelEncryptionConfigQueryArgProfileConfigArgs(
        Output<Boolean> forwardWhenQueryArgProfileIsUnknown,
        @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles) {
        this.forwardWhenQueryArgProfileIsUnknown = Objects.requireNonNull(forwardWhenQueryArgProfileIsUnknown, "expected parameter 'forwardWhenQueryArgProfileIsUnknown' to be non-null");
        this.queryArgProfiles = queryArgProfiles;
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigArgs() {
        this.forwardWhenQueryArgProfileIsUnknown = Codegen.empty();
        this.queryArgProfiles = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> forwardWhenQueryArgProfileIsUnknown;
        private @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardWhenQueryArgProfileIsUnknown = defaults.forwardWhenQueryArgProfileIsUnknown;
    	      this.queryArgProfiles = defaults.queryArgProfiles;
        }

        public Builder forwardWhenQueryArgProfileIsUnknown(Output<Boolean> forwardWhenQueryArgProfileIsUnknown) {
            this.forwardWhenQueryArgProfileIsUnknown = Objects.requireNonNull(forwardWhenQueryArgProfileIsUnknown);
            return this;
        }
        public Builder forwardWhenQueryArgProfileIsUnknown(Boolean forwardWhenQueryArgProfileIsUnknown) {
            this.forwardWhenQueryArgProfileIsUnknown = Output.of(Objects.requireNonNull(forwardWhenQueryArgProfileIsUnknown));
            return this;
        }
        public Builder queryArgProfiles(@Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs> queryArgProfiles) {
            this.queryArgProfiles = queryArgProfiles;
            return this;
        }
        public Builder queryArgProfiles(@Nullable FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs queryArgProfiles) {
            this.queryArgProfiles = Codegen.ofNullable(queryArgProfiles);
            return this;
        }        public FieldLevelEncryptionConfigQueryArgProfileConfigArgs build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigArgs(forwardWhenQueryArgProfileIsUnknown, queryArgProfiles);
        }
    }
}
