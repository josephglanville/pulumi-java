// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;


public final class FieldLevelEncryptionConfigContentTypeProfileConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigContentTypeProfileConfigArgs Empty = new FieldLevelEncryptionConfigContentTypeProfileConfigArgs();

    /**
     * Object that contains an attribute `items` that contains the list of configurations for a field-level encryption content type-profile. See Content Type Profile.
     * 
     */
    @Import(name="contentTypeProfiles", required=true)
      private final Output<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs> contentTypeProfiles;

    public Output<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs> getContentTypeProfiles() {
        return this.contentTypeProfiles;
    }

    /**
     * specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown.
     * 
     */
    @Import(name="forwardWhenContentTypeIsUnknown", required=true)
      private final Output<Boolean> forwardWhenContentTypeIsUnknown;

    public Output<Boolean> getForwardWhenContentTypeIsUnknown() {
        return this.forwardWhenContentTypeIsUnknown;
    }

    public FieldLevelEncryptionConfigContentTypeProfileConfigArgs(
        Output<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs> contentTypeProfiles,
        Output<Boolean> forwardWhenContentTypeIsUnknown) {
        this.contentTypeProfiles = Objects.requireNonNull(contentTypeProfiles, "expected parameter 'contentTypeProfiles' to be non-null");
        this.forwardWhenContentTypeIsUnknown = Objects.requireNonNull(forwardWhenContentTypeIsUnknown, "expected parameter 'forwardWhenContentTypeIsUnknown' to be non-null");
    }

    private FieldLevelEncryptionConfigContentTypeProfileConfigArgs() {
        this.contentTypeProfiles = Codegen.empty();
        this.forwardWhenContentTypeIsUnknown = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs> contentTypeProfiles;
        private Output<Boolean> forwardWhenContentTypeIsUnknown;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypeProfiles = defaults.contentTypeProfiles;
    	      this.forwardWhenContentTypeIsUnknown = defaults.forwardWhenContentTypeIsUnknown;
        }

        public Builder contentTypeProfiles(Output<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs> contentTypeProfiles) {
            this.contentTypeProfiles = Objects.requireNonNull(contentTypeProfiles);
            return this;
        }
        public Builder contentTypeProfiles(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs contentTypeProfiles) {
            this.contentTypeProfiles = Output.of(Objects.requireNonNull(contentTypeProfiles));
            return this;
        }
        public Builder forwardWhenContentTypeIsUnknown(Output<Boolean> forwardWhenContentTypeIsUnknown) {
            this.forwardWhenContentTypeIsUnknown = Objects.requireNonNull(forwardWhenContentTypeIsUnknown);
            return this;
        }
        public Builder forwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
            this.forwardWhenContentTypeIsUnknown = Output.of(Objects.requireNonNull(forwardWhenContentTypeIsUnknown));
            return this;
        }        public FieldLevelEncryptionConfigContentTypeProfileConfigArgs build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigArgs(contentTypeProfiles, forwardWhenContentTypeIsUnknown);
        }
    }
}
