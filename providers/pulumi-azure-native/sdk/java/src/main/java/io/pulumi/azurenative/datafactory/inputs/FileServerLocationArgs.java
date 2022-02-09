// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileServerLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileServerLocationArgs Empty = new FileServerLocationArgs();

    @InputImport(name="fileName")
    private final @Nullable Input<Object> fileName;

    public Input<Object> getFileName() {
        return this.fileName == null ? Input.empty() : this.fileName;
    }

    @InputImport(name="folderPath")
    private final @Nullable Input<Object> folderPath;

    public Input<Object> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public FileServerLocationArgs(
        @Nullable Input<Object> fileName,
        @Nullable Input<Object> folderPath,
        Input<String> type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FileServerLocationArgs() {
        this.fileName = Input.empty();
        this.folderPath = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> fileName;
        private @Nullable Input<Object> folderPath;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Input<Object> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = Input.ofNullable(fileName);
            return this;
        }

        public Builder setFolderPath(@Nullable Input<Object> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public FileServerLocationArgs build() {
            return new FileServerLocationArgs(fileName, folderPath, type);
        }
    }
}
