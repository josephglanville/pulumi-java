// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerUpload {
    private final @Nullable String content;
    private final @Nullable String contentBase64;
    private final @Nullable Boolean executable;
    private final String file;
    private final @Nullable String source;
    private final @Nullable String sourceHash;

    @CustomType.Constructor
    private ContainerUpload(
        @CustomType.Parameter("content") @Nullable String content,
        @CustomType.Parameter("contentBase64") @Nullable String contentBase64,
        @CustomType.Parameter("executable") @Nullable Boolean executable,
        @CustomType.Parameter("file") String file,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("sourceHash") @Nullable String sourceHash) {
        this.content = content;
        this.contentBase64 = contentBase64;
        this.executable = executable;
        this.file = file;
        this.source = source;
        this.sourceHash = sourceHash;
    }

    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    public Optional<String> getContentBase64() {
        return Optional.ofNullable(this.contentBase64);
    }
    public Optional<Boolean> getExecutable() {
        return Optional.ofNullable(this.executable);
    }
    public String getFile() {
        return this.file;
    }
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    public Optional<String> getSourceHash() {
        return Optional.ofNullable(this.sourceHash);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerUpload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentBase64;
        private @Nullable Boolean executable;
        private String file;
        private @Nullable String source;
        private @Nullable String sourceHash;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentBase64 = defaults.contentBase64;
    	      this.executable = defaults.executable;
    	      this.file = defaults.file;
    	      this.source = defaults.source;
    	      this.sourceHash = defaults.sourceHash;
        }

        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        public Builder contentBase64(@Nullable String contentBase64) {
            this.contentBase64 = contentBase64;
            return this;
        }
        public Builder executable(@Nullable Boolean executable) {
            this.executable = executable;
            return this;
        }
        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder sourceHash(@Nullable String sourceHash) {
            this.sourceHash = sourceHash;
            return this;
        }        public ContainerUpload build() {
            return new ContainerUpload(content, contentBase64, executable, file, source, sourceHash);
        }
    }
}