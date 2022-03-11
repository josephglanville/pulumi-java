// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecSecretArgs Empty = new ServiceTaskSpecContainerSpecSecretArgs();

    @InputImport(name="fileGid")
      private final @Nullable Output<String> fileGid;

    public Output<String> getFileGid() {
        return this.fileGid == null ? Output.empty() : this.fileGid;
    }

    @InputImport(name="fileMode")
      private final @Nullable Output<Integer> fileMode;

    public Output<Integer> getFileMode() {
        return this.fileMode == null ? Output.empty() : this.fileMode;
    }

    @InputImport(name="fileName", required=true)
      private final Output<String> fileName;

    public Output<String> getFileName() {
        return this.fileName;
    }

    @InputImport(name="fileUid")
      private final @Nullable Output<String> fileUid;

    public Output<String> getFileUid() {
        return this.fileUid == null ? Output.empty() : this.fileUid;
    }

    @InputImport(name="secretId", required=true)
      private final Output<String> secretId;

    public Output<String> getSecretId() {
        return this.secretId;
    }

    @InputImport(name="secretName")
      private final @Nullable Output<String> secretName;

    public Output<String> getSecretName() {
        return this.secretName == null ? Output.empty() : this.secretName;
    }

    public ServiceTaskSpecContainerSpecSecretArgs(
        @Nullable Output<String> fileGid,
        @Nullable Output<Integer> fileMode,
        Output<String> fileName,
        @Nullable Output<String> fileUid,
        Output<String> secretId,
        @Nullable Output<String> secretName) {
        this.fileGid = fileGid;
        this.fileMode = fileMode;
        this.fileName = Objects.requireNonNull(fileName, "expected parameter 'fileName' to be non-null");
        this.fileUid = fileUid;
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
        this.secretName = secretName;
    }

    private ServiceTaskSpecContainerSpecSecretArgs() {
        this.fileGid = Output.empty();
        this.fileMode = Output.empty();
        this.fileName = Output.empty();
        this.fileUid = Output.empty();
        this.secretId = Output.empty();
        this.secretName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fileGid;
        private @Nullable Output<Integer> fileMode;
        private Output<String> fileName;
        private @Nullable Output<String> fileUid;
        private Output<String> secretId;
        private @Nullable Output<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileGid = defaults.fileGid;
    	      this.fileMode = defaults.fileMode;
    	      this.fileName = defaults.fileName;
    	      this.fileUid = defaults.fileUid;
    	      this.secretId = defaults.secretId;
    	      this.secretName = defaults.secretName;
        }

        public Builder fileGid(@Nullable Output<String> fileGid) {
            this.fileGid = fileGid;
            return this;
        }

        public Builder fileGid(@Nullable String fileGid) {
            this.fileGid = Output.ofNullable(fileGid);
            return this;
        }

        public Builder fileMode(@Nullable Output<Integer> fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        public Builder fileMode(@Nullable Integer fileMode) {
            this.fileMode = Output.ofNullable(fileMode);
            return this;
        }

        public Builder fileName(Output<String> fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = Output.of(Objects.requireNonNull(fileName));
            return this;
        }

        public Builder fileUid(@Nullable Output<String> fileUid) {
            this.fileUid = fileUid;
            return this;
        }

        public Builder fileUid(@Nullable String fileUid) {
            this.fileUid = Output.ofNullable(fileUid);
            return this;
        }

        public Builder secretId(Output<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder secretId(String secretId) {
            this.secretId = Output.of(Objects.requireNonNull(secretId));
            return this;
        }

        public Builder secretName(@Nullable Output<String> secretName) {
            this.secretName = secretName;
            return this;
        }

        public Builder secretName(@Nullable String secretName) {
            this.secretName = Output.ofNullable(secretName);
            return this;
        }
        public ServiceTaskSpecContainerSpecSecretArgs build() {
            return new ServiceTaskSpecContainerSpecSecretArgs(fileGid, fileMode, fileName, fileUid, secretId, secretName);
        }
    }
}
