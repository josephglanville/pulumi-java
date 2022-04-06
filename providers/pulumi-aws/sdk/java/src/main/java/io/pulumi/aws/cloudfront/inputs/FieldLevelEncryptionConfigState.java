// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionConfigState extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigState Empty = new FieldLevelEncryptionConfigState();

    /**
     * Internal value used by CloudFront to allow future updates to the Field Level Encryption Config.
     * 
     */
    @Import(name="callerReference")
      private final @Nullable Output<String> callerReference;

    public Output<String> getCallerReference() {
        return this.callerReference == null ? Output.empty() : this.callerReference;
    }

    /**
     * An optional comment about the Field Level Encryption Config.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    /**
     * Content Type Profile Config specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
     * 
     */
    @Import(name="contentTypeProfileConfig")
      private final @Nullable Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> contentTypeProfileConfig;

    public Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> getContentTypeProfileConfig() {
        return this.contentTypeProfileConfig == null ? Output.empty() : this.contentTypeProfileConfig;
    }

    /**
     * The current version of the Field Level Encryption Config. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Query Arg Profile Config that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
     * 
     */
    @Import(name="queryArgProfileConfig")
      private final @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> queryArgProfileConfig;

    public Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> getQueryArgProfileConfig() {
        return this.queryArgProfileConfig == null ? Output.empty() : this.queryArgProfileConfig;
    }

    public FieldLevelEncryptionConfigState(
        @Nullable Output<String> callerReference,
        @Nullable Output<String> comment,
        @Nullable Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> contentTypeProfileConfig,
        @Nullable Output<String> etag,
        @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> queryArgProfileConfig) {
        this.callerReference = callerReference;
        this.comment = comment;
        this.contentTypeProfileConfig = contentTypeProfileConfig;
        this.etag = etag;
        this.queryArgProfileConfig = queryArgProfileConfig;
    }

    private FieldLevelEncryptionConfigState() {
        this.callerReference = Output.empty();
        this.comment = Output.empty();
        this.contentTypeProfileConfig = Output.empty();
        this.etag = Output.empty();
        this.queryArgProfileConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> callerReference;
        private @Nullable Output<String> comment;
        private @Nullable Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> contentTypeProfileConfig;
        private @Nullable Output<String> etag;
        private @Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> queryArgProfileConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callerReference = defaults.callerReference;
    	      this.comment = defaults.comment;
    	      this.contentTypeProfileConfig = defaults.contentTypeProfileConfig;
    	      this.etag = defaults.etag;
    	      this.queryArgProfileConfig = defaults.queryArgProfileConfig;
        }

        public Builder callerReference(@Nullable Output<String> callerReference) {
            this.callerReference = callerReference;
            return this;
        }
        public Builder callerReference(@Nullable String callerReference) {
            this.callerReference = Output.ofNullable(callerReference);
            return this;
        }
        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }
        public Builder contentTypeProfileConfig(@Nullable Output<FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs> contentTypeProfileConfig) {
            this.contentTypeProfileConfig = contentTypeProfileConfig;
            return this;
        }
        public Builder contentTypeProfileConfig(@Nullable FieldLevelEncryptionConfigContentTypeProfileConfigGetArgs contentTypeProfileConfig) {
            this.contentTypeProfileConfig = Output.ofNullable(contentTypeProfileConfig);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }
        public Builder queryArgProfileConfig(@Nullable Output<FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs> queryArgProfileConfig) {
            this.queryArgProfileConfig = queryArgProfileConfig;
            return this;
        }
        public Builder queryArgProfileConfig(@Nullable FieldLevelEncryptionConfigQueryArgProfileConfigGetArgs queryArgProfileConfig) {
            this.queryArgProfileConfig = Output.ofNullable(queryArgProfileConfig);
            return this;
        }        public FieldLevelEncryptionConfigState build() {
            return new FieldLevelEncryptionConfigState(callerReference, comment, contentTypeProfileConfig, etag, queryArgProfileConfig);
        }
    }
}