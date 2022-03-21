// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.DomainSharingSettingsNotebookOutputOption;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies options when sharing an Amazon SageMaker Studio notebook. These settings are specified as part of DefaultUserSettings when the CreateDomain API is called, and as part of UserSettings when the CreateUserProfile API is called.
 * 
 */
public final class DomainSharingSettings extends io.pulumi.resources.InvokeArgs {

    public static final DomainSharingSettings Empty = new DomainSharingSettings();

    /**
     * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
     * 
     */
    @Import(name="notebookOutputOption")
      private final @Nullable DomainSharingSettingsNotebookOutputOption notebookOutputOption;

    public Optional<DomainSharingSettingsNotebookOutputOption> getNotebookOutputOption() {
        return this.notebookOutputOption == null ? Optional.empty() : Optional.ofNullable(this.notebookOutputOption);
    }

    /**
     * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    @Import(name="s3KmsKeyId")
      private final @Nullable String s3KmsKeyId;

    public Optional<String> getS3KmsKeyId() {
        return this.s3KmsKeyId == null ? Optional.empty() : Optional.ofNullable(this.s3KmsKeyId);
    }

    /**
     * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to store the shared notebook snapshots.
     * 
     */
    @Import(name="s3OutputPath")
      private final @Nullable String s3OutputPath;

    public Optional<String> getS3OutputPath() {
        return this.s3OutputPath == null ? Optional.empty() : Optional.ofNullable(this.s3OutputPath);
    }

    public DomainSharingSettings(
        @Nullable DomainSharingSettingsNotebookOutputOption notebookOutputOption,
        @Nullable String s3KmsKeyId,
        @Nullable String s3OutputPath) {
        this.notebookOutputOption = notebookOutputOption;
        this.s3KmsKeyId = s3KmsKeyId;
        this.s3OutputPath = s3OutputPath;
    }

    private DomainSharingSettings() {
        this.notebookOutputOption = null;
        this.s3KmsKeyId = null;
        this.s3OutputPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainSharingSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DomainSharingSettingsNotebookOutputOption notebookOutputOption;
        private @Nullable String s3KmsKeyId;
        private @Nullable String s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainSharingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notebookOutputOption = defaults.notebookOutputOption;
    	      this.s3KmsKeyId = defaults.s3KmsKeyId;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder notebookOutputOption(@Nullable DomainSharingSettingsNotebookOutputOption notebookOutputOption) {
            this.notebookOutputOption = notebookOutputOption;
            return this;
        }
        public Builder s3KmsKeyId(@Nullable String s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }
        public Builder s3OutputPath(@Nullable String s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }        public DomainSharingSettings build() {
            return new DomainSharingSettings(notebookOutputOption, s3KmsKeyId, s3OutputPath);
        }
    }
}
